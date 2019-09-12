package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import org.drools.lang.DRLExpressions.neg_operator_key_return;

import DataManagment.FileTxtManagmentGIS;
import application.App_Nodes_Actions;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class setmaps extends Tab {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth()+100;
	double height = screenSize.getHeight();
	FileTxtManagmentGIS FileTxtManagmentGIS;
	String[] words;
	private BorderPane mainpane;
	private Button Button_Map1;
	private Button Button_Map2;
	private Button Button_Map3;
    public void setAction(App_Nodes_Actions App_Nodes_Actions){
    	 Button_Map1.setOnAction(App_Nodes_Actions);
    	 Button_Map2.setOnAction(App_Nodes_Actions);
    	 Button_Map3.setOnAction(App_Nodes_Actions);
}
	public setmaps() {
		super();
		mainpane = new BorderPane();

		FileTxtManagmentGIS = new FileTxtManagmentGIS();
		words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
		Text logo = new Text(words[11]);
		logo.setId("logo");
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();

		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(60);
		selectedImage14.setFitWidth(70);
		HBox h = new HBox();
		h.setSpacing(10);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(logo, selectedImage14);
		h.setId("Toplogo");
		VBox V = new VBox();
		V.setSpacing(10);
		V.setAlignment(Pos.CENTER);

		Text t1 = new Text(words[43]);
		t1.setId("Text");
		Button_Map1 = new Button();
		f1 = new File("Maps//map1.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage6 = new ImageView();
		selectedImage6.setImage(i);
		selectedImage6.setFitHeight(height/3);
		selectedImage6.setFitWidth(width/3);
		Button_Map1.setGraphic(selectedImage6);

		Text t2 = new Text(words[44]);
		t2.setId("Text");
		Button_Map2 = new Button();
		f1 = new File("Maps//map2.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage = new ImageView();
		selectedImage.setImage(i);
		selectedImage.setFitHeight(height/3);
		selectedImage.setFitWidth(width/3);
		Button_Map2.setGraphic(selectedImage);

		Text t3 = new Text(words[45]);
		t3.setId("Text");
		Button_Map3 = new Button();
		f1 = new File("Maps//map3.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(height/3);
		selectedImage3.setFitWidth(width/3);
		Button_Map3.setGraphic(selectedImage3);

		V.getChildren().addAll(t1, Button_Map1, t2, Button_Map2, t3, Button_Map3);
        V.setAlignment(Pos.CENTER); 
      
       
		mainpane.setTop(h);
		mainpane.setCenter(V);
		mainpane.setPrefSize(width/3*2, height);
		this.setText(words[46]);
		 ScrollPane s=    new ScrollPane(mainpane);
		
		this.setContent(s);
	}

	public Dimension getScreenSize() {
		return screenSize;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public FileTxtManagmentGIS getFileTxtManagmentGIS() {
		return FileTxtManagmentGIS;
	}

	public String[] getWords() {
		return words;
	}

	public BorderPane getMainpane() {
		return mainpane;
	}

	public Button getButton_Map1() {
		return Button_Map1;
	}

	public Button getButton_Map2() {
		return Button_Map2;
	}

	public Button getButton_Map3() {
		return Button_Map3;
	}
}
