package controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Learning purposes only

public class Main extends Application
{
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Main.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		stage.setTitle("Resizable Program");
		stage.setScene(scene);
		stage.show();
	}
}
