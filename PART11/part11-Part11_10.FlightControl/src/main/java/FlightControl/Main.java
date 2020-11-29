package FlightControl;

import FlightControl.logic.AssetControl;
import FlightControl.ui.UserInterface;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssetControl assetControl = new AssetControl();
        
        UserInterface ui = new UserInterface(scanner, assetControl);
        
        ui.start(scanner);
    }
}
