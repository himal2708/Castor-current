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

/**
 * Service Interface for Connectivity Manager.
 */
public interface ConnectivityManagerService {

    /**
     *Returns list of all peers including the route servers.
     *
     * @return list of Peer
     */
    //List<Peer> getAllPeers();

    /**
     * Returns the list of added BGP Peers.
     *
     * @return List of Peer
     */
    //List<Peer> getCustomers();

    /**
     * Returns the map of currently known mac addresses from ARP.
     *
     * @return map of IP address to Mac
     */
    //Map<IpAddress, MacAddress> getAddressMap();

    /**
     * Returns the mapping of the name of the peers to their IP addresses as strings.
     *
     * @return name to IP address
     */
    //Map<String, String> getCustomersMap();

    /**
     * Sets the mapping from IP address to Mac.
     *
     * @param ip IP Address
     * @param mac MAC Address
     */
    //void setAddressMap(IpAddress ip, MacAddress mac);

    /**
     * Start to add the initial config by adding route servers.
     *
     * @param peer The Route Server
     */
    void start(Peer peer);

    /**
     * Sets up connectivity of the peer being added.
     * This will set up the connectivity between the Peer and the Route Servers.
     *
     * @param peer The Peer to be added.
     */
    void setUpConnectivity(Peer peer);

    /**
     * Provisions the layer two flows for the Peer.
     *
     * @param peer The Peer for which layer 2 is to be configured.
     */
    void setUpL2(Peer peer);

    /**
     * Deletes a BGP Peer.
     * This will delete all the flow entries corresponding to the Peer and update the other ones.
     *
     * @param peer The Peer to be deleted.
     */
    void deletePeer(Peer peer);

}
