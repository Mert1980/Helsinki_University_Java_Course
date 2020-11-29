/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;

/**
 *
 * @author mertdemirok
 */
public class FlightControl {

    private AssetControl assets;

    public FlightControl(AssetControl assets) {
        this.assets = assets;
    }

    public void printAirplanes() {
        for (Airplane airplane : assets.getAirplanes()) {
            System.out.println(airplane);
        }
    }

    public void printAirplaneDetails(String id) {
        for (Airplane airplane : assets.getAirplanes()) {
            if (airplane.getId().equals(id)) {
                System.out.println(airplane);
                break;
            }
        }
    }

    public void printFlights() {
        for (Flight flight : assets.getFlights()) {
            System.out.println(flight);
        }
    }

}
