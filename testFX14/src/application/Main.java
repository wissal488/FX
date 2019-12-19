package application;
	


import java.awt.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Circle btn = new Circle(200,200,100);
			btn.setFill(Color.DARKORANGE);
			//root.getChildren().add(btn);
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Notre App");
			primaryStage.setScene(scene);
			primaryStage.show();
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.setTop(btn);
			javafx.scene.shape.Rectangle r=new javafx.scene.shape.Rectangle();
			r.setFill(Color.AQUA);
	
			root.setBottom(r);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
