package application;
	
import java.awt.Menu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root=new BorderPane();
			MenuBar menu=new MenuBar();
			Scene scene =new Scene(root,300,300,Color.WHITE);
			javafx.scene.control.Menu menufic=new javafx.scene.control.Menu("Fichier");
			MenuItem nvItem=new MenuItem("Nouveau");
			MenuItem svItem=new MenuItem("Enregistrer");
			MenuItem qvItem=new MenuItem("Quitter");
			SeparatorMenuItem sp=new SeparatorMenuItem();
			
			javafx.scene.control.Menu menuPrint=new javafx.scene.control.Menu("Imprimer");
			MenuItem toFileItm=new MenuItem("Fichier");
			MenuItem toPrintItm=new MenuItem("Impriment");
			menuPrint.getItems().addAll(toFileItm, toPrintItm);
			menufic.getItems().addAll(nvItem, svItem,menuPrint,sp,qvItem);
			qvItem.setOnAction(ActionEvent ->Platform.exit());
			menu.getMenus().add(menufic);
			root.setTop(menu);
			primaryStage.setTitle("Les menus");
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
