/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author mertdemirok
 */
public class Flight {

    private Airplane airplane;
    private String departureId;
    private String arrivalId;

    public Flight(Airplane airplane, String departureId, String arrivalId) {
        this.airplane = airplane;
        this.departureId = departureId;
        this.arrivalId = arrivalId;
    }

    public String getAirplaneId() {
        return airplane.getId();
    }

    public String getDepartureId() {
        return departureId;
    }

    public String getArrivalId() {
        return arrivalId;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append(airplane.toString())
                .append(" (")
                .append(departureId)
                .append("-")
                .append(arrivalId)
                .append(")");
        return text.toString();
    }

}
