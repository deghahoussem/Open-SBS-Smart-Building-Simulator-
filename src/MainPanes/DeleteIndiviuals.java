package MainPanes;

import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import application.App_Nodes_Actions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DeleteIndiviuals extends Tab {

	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	private BorderPane mainpane;
	private Button Delete;
	private CheckBoxTreeItem<String> Liste_Of_delete_Selection;
	public FileTxtManagmentGIS getFileTxtManagmentGIS() {
		return FileTxtManagmentGIS;
	}

	public String[] getWords() {
		return words;
	}

	public BorderPane getMainpane() {
		return mainpane;
	}

	public Button getDelete() {
		return Delete;
	}

	public CheckBoxTreeItem<String> getListe_Of_delete_Selection() {
		return Liste_Of_delete_Selection;
	}

	public TreeView getTree() {
		return tree;
	}

	TreeView tree;

	public DeleteIndiviuals(App_Nodes_Actions App_Nodes_Actions) {
		// TODO Auto-generated constructor stub

		super();
		setText(words[194]);
		mainpane = new BorderPane();

		Text logo = new Text(words[194]);
		logo.setId("logo");
		File f1 = new File("icons//delete.png");
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
		// -----------------------------------------------------------
		HBox h2 = new HBox();
		h2.setSpacing(20);
		h2.setPadding(new Insets(10));

		Text t = new Text(words[198]);
		t.setId("TextBig");
		Delete = new Button(words[197]);
		f1 = new File("icons//delete.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage1 = new ImageView();
		selectedImage1.setImage(i);
		selectedImage1.setFitHeight(25);
		selectedImage1.setFitWidth(25);
     Delete.setOnAction(App_Nodes_Actions);
		Delete.setGraphic(selectedImage1);
		Liste_Of_delete_Selection = new CheckBoxTreeItem<String>("View Source Files");

		tree = new TreeView(Liste_Of_delete_Selection);
		tree.setCellFactory(CheckBoxTreeCell.<String> forTreeView());
		tree.setRoot(Liste_Of_delete_Selection);

		
		Liste_Of_delete_Selection.setExpanded(true);
		tree.setEditable(true);
		tree.setShowRoot(true);
		//tree.setPrefSize(500, 500);
		tree.setPrefWidth(450);
		h2.getChildren().addAll(t,tree,Delete);
		//h2.setAlignment(Pos.CENTER);

		mainpane.setCenter(h2);
		setContent(mainpane);
	}

}
