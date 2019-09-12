package MainPanes;

import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import application.App_Nodes_Actions;
import application.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CreateScenario extends Tab{
	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	private   BorderPane mainpane;
	  private  Button addScenario ;
	  private   VBox ListeOfScenario;

	  private Main Application;



	public CreateScenario( Main Application) {

        super();

        this.Application = Application;
        setText(words[173]);
         mainpane = new BorderPane();

		Text logo = new Text(words[173]);
		logo.setId("logo");
		File f1 = new File("icons//create_sin.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(50);
		selectedImage14.setFitWidth(50);

		addScenario = new Button();
		addScenario.setGraphic(selectedImage14);
		addScenario.setId("addScenario");
		HBox h = new HBox();
		h.setSpacing(10);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(logo, addScenario);
		h.setId("Toplogo");
		mainpane.setTop(h);
	    h.setPadding(new Insets(5));
		ListeOfScenario = new VBox();
		mainpane.setCenter(new ScrollPane(ListeOfScenario));
		ListeOfScenario.setPadding(new Insets(10));
		ListeOfScenario.setSpacing(10);
		ListeOfScenario.setId("Activity_Vbox");

		setContent(mainpane);

	}
	 public void SetAction(App_Nodes_Actions App_Nodes_Actions){
		 addScenario.setOnAction(App_Nodes_Actions);
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

	public Button getAddScenario() {
		return addScenario;
	}

	public VBox getListeOfScenario() {
		return ListeOfScenario;
	}
}
