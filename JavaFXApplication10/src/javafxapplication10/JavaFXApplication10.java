
package javafxapplication10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaFXApplication10 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Say 'Hello!");
        TextField txt=new TextField();
        Label lbl= new Label();
                btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                if("".equals(txt.getText()))
                    lbl.setText("Hello World!");
                else
                    lbl.setText("Hello " + txt.getText());
                
            }
        });
        
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.add(btn, 0, 0);
        root.add(txt, 1, 0);
        root.add(lbl, 1, 1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
