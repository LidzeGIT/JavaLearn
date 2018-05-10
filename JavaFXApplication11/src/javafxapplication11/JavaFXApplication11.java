/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author student
 */
public class JavaFXApplication11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        Label lbl = new Label("CSS is cool!");
        
        ObservableList pchData = FXCollections.observableArrayList(
                new PieChart.Data("Data 1", 30),
                new PieChart.Data("Data 2", 10),
                new PieChart.Data("Date 3", 20)
        );
        
        
        
        Button btn2 = new Button("Add Date");
        btn2.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                pchData.add(new PieChart.Data("Data" + (pchData.size()+1), new Random().nextInt(30) + 10));
            }
        });
        
        Button btn3 = new Button("Del");
        btn3.setOnMouseClicked((MouseEvent event)->{
            pchData.remove(new Random().nextInt(pchData.size()));
        });
        
        PieChart pch = new PieChart(pchData);
        
        Button btn4 = new Button("Rat");
        btn4.setOnAction((ActionEvent event) -> {
            Animation anim = new Transition() {
                {
                    setCycleDuration(Duration.seconds(5));
                }
                @Override
                protected void interpolate(double frac) {
                    pch.setRotate(360 * frac);
                }
            };
            anim.play();
    });
        
        FlowPane root = new FlowPane();
        
        root.getChildren().add(btn);
        root.getChildren().add(lbl);
        root.getChildren().add(pch);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        
        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add(JavaFXApplication11.class.getResource("CascadeSS.css").toExternalForm());
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
