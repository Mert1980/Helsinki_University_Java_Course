/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.ArrayList;

/**
 *
 * @author mertdemirok
 */
public class AssetControl {

    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;

    public AssetControl() {
        this.airplanes = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public void addAirplane(Airplane airplane) {
        this.airplanes.add(airplane);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public Airplane getAirplane(String id) {
        for (Airplane airplane : airplanes) {
            if (airplane.getId().equals(id)) {
                return airplane;
            }
        }
        return null;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

}
