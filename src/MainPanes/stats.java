package MainPanes;

import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class stats extends Tab {

	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	private BorderPane mainpane;

	private BorderPane mainpane_Main_Main;
	private Text Normal;
	private Text passive;
	private Text active;
	private Text ica_bems;


	public stats() {
		// TODO Auto-generated constructor stub

		super();
		setText(words[196]);
		mainpane = new BorderPane();
	    setText(words[202]);

		Text logo = new Text(words[202]);
		logo.setId("logo");
		File f1 = new File("icons//Stats-icon.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(50);
		selectedImage14.setFitWidth(50);

		HBox h = new HBox();
		h.setSpacing(10);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(logo, selectedImage14);
		h.setId("Toplogo");
		mainpane.setTop(h);
		h.setPadding(new Insets(5));
		// --------------------------------------------

		HBox hbox_Bottom = new HBox();hbox_Bottom.setSpacing(88);hbox_Bottom.setPadding(new Insets(30));
		HBox h1 = new HBox();
		 f1 = new File("icons//r1.png");
		 i = new Image(f1.toURI().toString());
		final ImageView selectedImage1 = new ImageView();
		selectedImage1.setImage(i);
		selectedImage1.setFitHeight(25);
		selectedImage1.setFitWidth(25);
		Normal  = new Text("00:00");
		h1.getChildren().addAll(selectedImage1,Normal);
		//--------------------
		HBox h2 = new HBox();
		 f1 = new File("icons//y1.png");
		 i = new Image(f1.toURI().toString());
		final ImageView selectedImage2 = new ImageView();
		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(25);
		selectedImage2.setFitWidth(25);
		passive  = new Text("00.00 DA");
		h2.getChildren().addAll(selectedImage2,passive);
		//--------------------
		HBox h3 = new HBox();
		 f1 = new File("icons//b1.png");
		 i = new Image(f1.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(25);
		selectedImage3.setFitWidth(25);
		active  = new Text("00.00 ~");
		h3.getChildren().addAll(selectedImage3,active);

		//--------------------
		HBox h4 = new HBox();
		f1 = new File("icons//g1.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage4 = new ImageView();
		selectedImage4.setImage(i);
		selectedImage4.setFitHeight(25);
		selectedImage4.setFitWidth(25);
		ica_bems = new Text("00.00 ~");
		h4.getChildren().addAll(selectedImage4, ica_bems);

		h1.setSpacing(10);
		h2.setSpacing(10);
		h3.setSpacing(10);
		h4.setSpacing(10);
		hbox_Bottom.setAlignment(Pos.CENTER);
		hbox_Bottom.getChildren().addAll(h1 ,h2 ,h3, h4);
			mainpane.setBottom(hbox_Bottom);
		setContent(mainpane);
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

	public BorderPane getMainpane_Main_Main() {
		return mainpane_Main_Main;
	}

	public Text getNormal() {
		return Normal;
	}

	public Text getpassive() {
		return passive;
	}

	public Text getactive() {
		return active;
	}

	public Text getica_bems() {
		return ica_bems;
	}



}
