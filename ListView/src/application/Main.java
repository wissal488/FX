package application;
	
import java.awt.Button;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			VBox root = new VBox();
			root.setSpacing(10);
			root.setPadding(new Insets(15, 20, 10, 10));
			
			Scene scene = new Scene(root,400,400);
			ObservableList<String> jours=
					FXCollections.observableArrayList("Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche");
		ListView<String>lvJours=new ListView<String>(jours);
		lvJours.setPrefSize(200, 150);
		
		
		Text rep = new Text();
		
		Text titre = new Text("les jours");
		
		MultipleSelectionModel<String> lvSelModel=lvJours.getSelectionModel();
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> selected, String oldVal, String newVal) {
				// TODO Auto-generated method stub
				rep.setText("Vous avez choisi: "+oldVal);
				
			}
		});
		
		root.getChildren().addAll(titre,lvJours,rep);
		
		
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
