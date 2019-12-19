package application;
	

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
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
			Text titre =new Text("Laissez un message");
			titre.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			
			Label lblNom = new Label("Name: ");
			TextField txtNom = new TextField();
			
			Label lblMsg = new Label("Message:");
			TextArea msgtext=new TextArea();
			
			javafx.scene.control.Button btnOk = new javafx.scene.control.Button("Envoyer");
			javafx.scene.control.Button btncancel = new javafx.scene.control.Button("Effacer");
			
			root.add(titre, 0, 0,2,1);
			root.add(lblNom, 0,1);
			root.add(txtNom, 1,1);
			root.add(lblMsg, 0,2);
			root.add(msgtext, 1, 3);
	
		msgtext.setPromptText("entrer votre message");
			//root.getChildren().add(msgtext);
			HBox hbtn = new HBox();
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(btnOk);
			HBox hbtn2 = new HBox();
			hbtn2.setAlignment(Pos.BOTTOM_LEFT);
			hbtn2.getChildren().add(btncancel);
			root.add(hbtn, 1, 4);
			root.add(hbtn2, 0, 4);
			final Text msg=new Text();
			root.add(msg, 1, 4);
			btnOk.setOnAction(event ->{msg.setText("Good morning " +txtNom.getText());});
			btncancel.setOnAction(event -> {msg.setText("");});
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
