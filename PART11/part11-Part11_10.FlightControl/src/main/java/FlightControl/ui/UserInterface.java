/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.logic.AssetControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.Scanner;

/**
 *
 * @author mertdemirok
 */
public class UserInterface {

    private Scanner scanner;
    private AssetControl assets;

    public UserInterface(Scanner scanner, AssetControl assets) {
        this.scanner = scanner;
        this.assets = assets;
    }

    public void start(Scanner scanner) {
        System.out.println("Airport Asset Control");
        startAssetControl(scanner);
        System.out.println("Flight Control");
        startFlightControl(scanner);

    }

    public void startAssetControl(Scanner scanner) {
        while (true) {

            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            String input = scanner.nextLine();

            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                addAirplane(scanner);
            }

            if (input.equals("2")) {
                addFlight(scanner);
            }

        }
    }

    public void addAirplane(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();

        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());

        this.assets.addAirplane(new Airplane(id, capacity));
    }

    public void addFlight(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();
        Airplane airplane = assets.getAirplane(id);

        System.out.print("Give the departure airport id: ");
        String departureId = scanner.nextLine();

        System.out.print("Give the target airport id: ");
        String arrivalId = scanner.nextLine();

        this.assets.addFlight(new Flight(airplane, departureId, arrivalId));
    }

    public void startFlightControl(Scanner scanner) {
        while (true) {

            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String input = scanner.nextLine();

            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                printAirplanes();
            }

            if (input.equals("2")) {
                printFlights();
            }

            if (input.equals("3")) {
                printAirplaneDetails(scanner);
            }

        }
    }

    public void printAirplanes() {
        for (Airplane airplane : assets.getAirplanes()) {
            System.out.println(airplane);
        }
    }

    public void printFlights() {
        for (Flight flight : assets.getFlights()) {
            System.out.println(flight);
        }
    }

    public void printAirplaneDetails(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = scanner.nextLine();

        System.out.println(assets.getAirplane(id));
    }

}
