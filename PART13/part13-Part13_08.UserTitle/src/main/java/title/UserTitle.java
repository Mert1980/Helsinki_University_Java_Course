package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parameters params = getParameters();
        String title = params.getNamed().getOrDefault("title", "No Title");
        
        window.setTitle(title);
        window.show();
    }
    
    


}
