package LeftPane;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import DataManagment.FileTxtManagmentGIS;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextArea;
public class LeftPane extends BorderPane{
 private Accordion accordion ;
 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();

	private ListView<String> list = new ListView<String>();


	private TextArea TextArea = new TextArea();

	public TextArea getTextArea() {
		return TextArea;
	}
	public void setTextArea(TextArea textArea) {
		TextArea = textArea;

	}
	public LeftPane(){
		super();
		FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
		String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
		accordion= new Accordion();
		Button  b ;
		File f1 = new File("icons/homewones.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage2 = new ImageView();
		b = new Button(words[47]);
		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(25);
		selectedImage2.setFitWidth(25);
		b.setGraphic(selectedImage2);
		b.setPrefWidth(width/6);
		setTop(b);
	//	setCenter(accordion);
		TextArea.setPrefSize(width/6, height/2);
		setCenter(TextArea);
	}
	public Accordion getAccordion() {
		return accordion;
	}
	public Dimension getScreenSize() {
		return screenSize;
	}


}
