/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase manager;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.manager = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.contains("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                manager.add(name, latinName);

            } else if (command.contains("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                manager.addObservation(name);

            } else if (command.contains("All")) {
                for (Bird bird : manager.getBirds()) {
                    System.out.println(bird);
                }

            } else if (command.contains("One")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                for (Bird bird : manager.getBirds()) {
                    if (bird.getName().contains(name)) {
                        System.out.println(bird);
                    }
                }

            } else if (command.contains("Quit")) {
                break;
            }
        }
    }
}
