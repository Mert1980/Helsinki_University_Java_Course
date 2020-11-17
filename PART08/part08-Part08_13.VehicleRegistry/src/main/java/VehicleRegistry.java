
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate)) {
            return false;
        }

        owners.put(licensePlate, owner);

        return true;
    }

    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }

        owners.remove(licensePlate);

        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();

        for (String owner : owners.values()) {
            if (printed.contains(owner)) {
                continue;
            }

            System.out.println(owner);
            printed.add(owner);
        }
    }

}
