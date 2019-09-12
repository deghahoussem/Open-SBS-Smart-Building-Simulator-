package MainPanes;

import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class editindividuals extends Tab{
	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	private   BorderPane mainpane; 
	
	private BorderPane mainpane_Main_Main;
	private Button Edit;
	private ChoiceBox<String> List_of_things_edit;
 
	public editindividuals() {
		// TODO Auto-generated constructor stub
		
		 super();
	     setText(words[195]);
	      mainpane = new BorderPane();
	  
			Text logo = new Text(words[195]);
			logo.setId("logo");
			File f1 = new File("icons//edit-icon.png");
			Image i = new Image(f1.toURI().toString());
			final ImageView selectedImage14 = new ImageView();
			selectedImage14.setImage(i);
			selectedImage14.setFitHeight(50);
			selectedImage14.setFitWidth(50);
			
		
			HBox h = new HBox();
			h.setSpacing(10);
			h.setAlignment(Pos.CENTER);
			h.getChildren().addAll(logo,selectedImage14);
			h.setId("Toplogo");
			mainpane.setTop(h);
		    h.setPadding(new Insets(5));
			//----------------------------------------------------------------
		    HBox h2 = new HBox();
			h2.setSpacing(20);
			h2.setPadding(new Insets(10));

			Text t = new Text(words[199]);
			t.setId("TextBig");
			Edit = new Button(words[200]);
			f1 = new File("icons//edit-icon.png");
			i = new Image(f1.toURI().toString());
			final ImageView selectedImage1 = new ImageView();
			selectedImage1.setImage(i);
			selectedImage1.setFitHeight(25);
			selectedImage1.setFitWidth(25);

			Edit.setGraphic(selectedImage1);
			List_of_things_edit = new	 ChoiceBox<String>();
			
			List_of_things_edit.setPrefWidth(450);
			h2.getChildren().addAll(t,List_of_things_edit,Edit);
			//h2.setAlignment(Pos.CENTER);

			mainpane_Main_Main = new BorderPane();
			mainpane_Main_Main.setTop(h2);
			mainpane.setCenter(mainpane_Main_Main);
		
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

	public Button getEdit() {
		return Edit;
	}

	public ChoiceBox<String> getList_of_things_edit() {
		return List_of_things_edit;
	}
}
