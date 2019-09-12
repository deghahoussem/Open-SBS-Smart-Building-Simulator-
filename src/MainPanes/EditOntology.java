package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import application.App_Nodes_Actions;
import application.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class EditOntology extends Tab {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	FileTxtManagmentGIS FileTxtManagmentGIS;
	String[] words;
	private BorderPane mainpane;
	Button createind;

	private ChoiceBox<String> ClassList ;
	private TextField IndName;


private	Button createpro;
private	ChoiceBox<String> propertyList;
private TextField propertyName;
private TextField propertyval;
private	ChoiceBox<String> IndList;


private ChoiceBox<String> ObecjtPropertyList ;
private TextField ObecjtPropertyName;
private ChoiceBox<String> Rang;
private ChoiceBox<String> Domain ;

	Button createobj;
	public EditOntology(App_Nodes_Actions App_Nodes_Actions) {
		super();


		mainpane = new BorderPane();

		FileTxtManagmentGIS = new FileTxtManagmentGIS();
		words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
		Text logo = new Text("Edit Ontology");
		logo.setId("logo");
		File f1 = new File("icons/sparql.png");
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
		V.setSpacing(5);
		V.setAlignment(Pos.CENTER);
//============= Create Ind from class pane ===================
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		f1 = new File("icons/class.png");
		i = new Image(f1.toURI().toString());
		ImageView clas = new ImageView();
		clas.setImage(i);
		clas.setFitHeight(40);
		clas.setFitWidth(40);
		Text t1 = new Text("Create Individual");
		Text t2 = new Text("Select Class : ");
		ClassList = new ChoiceBox<String>();
		Text t3 = new Text("Ind ID :");
		IndName = new TextField();
		createind = new Button("Create");
		createind.setOnAction(App_Nodes_Actions);
		pane.add(clas, 0, 0);
		pane.add(t1, 1, 0);
		pane.add(t2, 1, 1);
		pane.add(ClassList, 2, 1);
		pane.add(t3, 3, 1);
		pane.add(IndName, 4, 1);
		pane.add(createind, 5, 1);
		Separator separator1 = new Separator();
		pane.setAlignment(Pos.TOP_CENTER);
		//pane.setPadding(new Insets(5));

// ============ Create Datatype Property to individual ======================
		GridPane pane2 = new GridPane();
		pane2.setHgap(10);
		pane2.setVgap(10);
		f1 = new File("icons/property.png");
		i = new Image(f1.toURI().toString());
		ImageView property = new ImageView();
		property.setImage(i);
		property.setFitHeight(40);
		property.setFitWidth(40);
		Text t12 = new Text("Create DataTypeProperty");
		Text t22 = new Text("Select DataTypeProperty : ");
		 propertyList = new ChoiceBox<String>();
		Text t32 = new Text("Property ID :");
	    propertyName = new TextField();
		Text t42 = new Text("Property Val :");
		 propertyval = new TextField();
		Text t52 = new Text("Select Ind :");
	     IndList = new ChoiceBox<String>();
		createpro = new Button("Create");
		createpro.setOnAction(App_Nodes_Actions);
		pane2.add(property, 0, 0);
		pane2.add(t12, 1, 0);
		pane2.add(t22, 1, 1);	
		pane2.add(propertyList, 2, 1);
		
		pane2.add(t32, 1, 2);
		pane2.add(propertyName, 2, 2);	
	
		pane2.add(t42, 1, 3);	
		pane2.add(propertyval,2, 3);
		
		pane2.add(t52,1, 4);
		pane2.add(IndList, 2, 4);
		pane2.add(createpro, 3,5);
		Separator separator2 = new Separator();
		pane2.setAlignment(Pos.TOP_CENTER);
		//pane2.setPadding(new Insets(5));

// =========== Crteat Object Propety to Individual =========

		GridPane pane3 = new GridPane();
		pane3.setHgap(10);
		pane3.setVgap(10);
		f1 = new File("icons/relation.png");
		i = new Image(f1.toURI().toString());
		ImageView Rlation = new ImageView();
		Rlation.setImage(i);
		Rlation.setFitHeight(40);
		Rlation.setFitWidth(40);
		Text t13 = new Text("Create ObecjtProperty");

		Text t23 = new Text("Select ObecjtProperty : ");
	    ObecjtPropertyList = new ChoiceBox<String>();

		Text t33 = new Text("ObecjtProperty ID :");
		 ObecjtPropertyName = new TextField();

		Text t43 = new Text("Rang :");
	    Rang = new ChoiceBox<String>();

		Text t53 = new Text("Domain :");
		 Domain = new ChoiceBox<String>();

		createobj = new Button("Create");

		createobj.setOnAction(App_Nodes_Actions);
		pane3.add(Rlation, 0, 0);
		pane3.add(t13, 1, 0);
		pane3.add(t23, 1, 1);
		pane3.add(ObecjtPropertyList, 2, 1);
		
		pane3.add(t33, 1, 2);
		pane3.add(ObecjtPropertyName, 2,2);
		
		pane3.add(t53, 1, 3);
		pane3.add(Domain, 2, 3);
		pane3.add(t43, 1, 4);
		pane3.add(Rang, 2, 4);
		pane3.add(createobj, 3, 5);
		Separator separator3 = new Separator();
		pane3.setAlignment(Pos.TOP_CENTER);
	//	pane3.setPadding(new Insets(5));

		V.getChildren().addAll(pane, separator1,pane2,separator2,pane3,separator3);
		V.setAlignment(Pos.TOP_LEFT);

		mainpane.setTop(h);
		mainpane.setCenter(V);
		mainpane.setPrefSize(width / 5 * 3.9, height);
		this.setText("Edit Ontology");
		ScrollPane s = new ScrollPane(mainpane);

		this.setContent(s);
	}

	public Button getCreateind() {
		return createind;
	}
	public void setCreateind(Button createind) {
		this.createind = createind;
	}
	public ChoiceBox<String> getClassList() {
		return ClassList;
	}
	public void setClassList(ChoiceBox<String> classList) {
		ClassList = classList;
	}
	public TextField getIndName() {
		return IndName;
	}
	public Dimension getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(Dimension screenSize) {
		this.screenSize = screenSize;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public FileTxtManagmentGIS getFileTxtManagmentGIS() {
		return FileTxtManagmentGIS;
	}
	public void setFileTxtManagmentGIS(FileTxtManagmentGIS fileTxtManagmentGIS) {
		FileTxtManagmentGIS = fileTxtManagmentGIS;
	}
	public String[] getWords() {
		return words;
	}
	public void setWords(String[] words) {
		this.words = words;
	}
	public ChoiceBox<String> getObecjtPropertyList() {
		return ObecjtPropertyList;
	}
	public void setObecjtPropertyList(ChoiceBox<String> obecjtPropertyList) {
		ObecjtPropertyList = obecjtPropertyList;
	}
	public TextField getObecjtPropertyName() {
		return ObecjtPropertyName;
	}
	public void setObecjtPropertyName(TextField obecjtPropertyName) {
		ObecjtPropertyName = obecjtPropertyName;
	}
	public ChoiceBox<String> getRang() {
		return Rang;
	}
	public void setRang(ChoiceBox<String> rang) {
		Rang = rang;
	}
	public ChoiceBox<String> getDomain() {
		return Domain;
	}
	public void setDomain(ChoiceBox<String> domain) {
		Domain = domain;
	}
	public void setIndName(TextField indName) {
		IndName = indName;
	}
	public BorderPane getMainpane() {
		return mainpane;
	}
	public void setMainpane(BorderPane mainpane) {
		this.mainpane = mainpane;
	}
	public Button getCreatepro() {
		return createpro;
	}
	public void setCreatepro(Button createpro) {
		this.createpro = createpro;
	}
	public ChoiceBox<String> getPropertyList() {
		return propertyList;
	}
	public void setPropertyList(ChoiceBox<String> propertyList) {
		this.propertyList = propertyList;
	}
	public TextField getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(TextField propertyName) {
		this.propertyName = propertyName;
	}
	public TextField getPropertyval() {
		return propertyval;
	}
	public void setPropertyval(TextField propertyval) {
		this.propertyval = propertyval;
	}
	public ChoiceBox<String> getIndList() {
		return IndList;
	}
	public void setIndList(ChoiceBox<String> indList) {
		IndList = indList;
	}
	public Button getCreateobj() {
		return createobj;
	}
	public void setCreateobj(Button createobj) {
		this.createobj = createobj;
	}
}
