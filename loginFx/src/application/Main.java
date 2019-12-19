package application;
	


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			root.setVgap(10);
			root.setHgap(10);
			
			root.setAlignment(Pos.CENTER);
			Scene scene = new Scene(root,400,400);
			Text titre =new Text("Welcome");
			titre.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			
			Label lblNom = new Label("Login");
			TextField txtNom = new TextField();
			
			Label lblMpas = new Label("Password");
			PasswordField pass = new PasswordField();
			
			javafx.scene.control.Button btnOk = new javafx.scene.control.Button("Done");
			
			root.add(titre, 0, 0,2,1);
			root.add(lblNom, 0,1);
			root.add(txtNom, 1,1);
			root.add(lblMpas, 0,2);
			root.add(pass, 1, 2);
			
			HBox hbtn = new HBox();
			hbtn.setAlignment(Pos.CENTER);
			hbtn.getChildren().add(btnOk);
			root.add(hbtn, 1, 3);
			final Text msg=new Text();
			root.add(msg, 1, 4);
			btnOk.setOnAction(event ->{msg.setText("Good morning" +txtNom.getText());});
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Login user");
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
