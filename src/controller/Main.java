package controller;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//Learning purposes only
//Getting program to adjust button text correctly, cross platform.

public class Main extends Application
{
	@FXML private Button button;
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{	
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Main.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root, (0.25 * width), (0.25 * height));
		
		stage.setTitle("Resizable Program");
		stage.setScene(scene);
		stage.show();
		
	}
}
