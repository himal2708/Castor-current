/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.castor;

import org.onlab.packet.IpAddress;
import org.onlab.packet.MacAddress;
import org.onosproject.net.intent.Key;
import org.onosproject.net.intent.MultiPointToSinglePointIntent;
import org.onosproject.net.intent.PointToPointIntent;

import java.util.Map;
import java.util.Set;

/**
 * Interface to access Castor Distributed Store
 */
public interface CastorStore {

    /**
     *Returns list of all peers including the route servers.
     *
     * @return list of Peer
     */
    Set<Peer> getAllPeers();

    /**
     * Store a Peer.
     */
    void storePeer(Peer peer);

    /**
     * Get the Route Servers.
     */
    Set<Peer> getServers();

    /**
     * Store a Route Server.
     */
    void storeServer(Peer peer);

    /**
     * Returns the list of added BGP Peers.
     *
     * @return List of Peer
     */
    Set<Peer> getCustomers();

    /**
     * Store a Customer
     */
    void storeCustomer(Peer peer);

    /**
     * Returns the map of currently known mac addresses from ARP.
     *
     * @return map of IP address to Mac
     */
    Map<IpAddress, MacAddress> getAddressMap();

    /**
     * Sets the mapping from IP address to Mac.
     *
     * @param ip IP Address
     * @param mac MAC Address
     */
    void setAddressMap(IpAddress ip, MacAddress mac);

    Map<Key,PointToPointIntent> getPeerIntents();

    void storePeerIntent(Key key, PointToPointIntent intent);

    Map<String, MultiPointToSinglePointIntent> getLayer2Intents();

    void storeLayer2Intent(String key, MultiPointToSinglePointIntent intent);

    Map<String, String> getCustomersMap();

    void removeCustomer(Peer peer);

    void removePeerIntent(Key key);

    void removeLayer2Intent(String key);
}
