package RightPane;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;

import DataManagment.FileTxtManagmentGIS;
import GuiComnonets.switchButton;
import application.App_Nodes_Actions;
import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import eu.hansolo.tilesfx.Tile.SkinType;
import eu.hansolo.tilesfx.skins.BarChartItem;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Stop;

public class RightPane extends BorderPane {

	String[] words;

	FileTxtManagmentGIS FileTxtManagmentGIS;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	 Accordion accordion;
	
	private System_Counters System_Counters;
	

	private Button Setmap;
	VBox SetMap_v2 = new VBox();
	
	private Button create_ind;
	private Button detele_indv;
	private Button edit_indv;
	private Button show_indv;
	VBox ind_v4 = new VBox();
	
	private Button create_sin;
	private Button delete_sin;
	private Button select_sin;
	VBox sin_v9 = new VBox();
	
	private switchButton ToggleSwitch;
	VBox Activate_ICABEMS_v9 = new VBox();
	
	private Button start_sim;
	private Button stop_sim;
	private Button stats_sim;
	VBox Simulation_v11 = new VBox();
	VBox other_results_Func ;
	private Button show_dataset;
	
	private Button export_dataset;
	
	private Button Settings;
	private Button About_GIS_Button;
	private Button show_Ontology;
	VBox Setting_v13 = new VBox();
	
	private Button ShowOnto;
	private Button EdditeOnto;
	private Button EditRules;
	VBox Onto_v777 = new VBox();
	
	private Tile  barChartTile;
	   	private BarChartItem    barChartItem1;
	    private BarChartItem    barChartItem2;
	    private BarChartItem    barChartItem3;
	    private BarChartItem    barChartItem4;
	    private BarChartItem    barChartItem5;
    private static final    Random RND = new Random();
    private static final    double TILE_WIDTH  = 150;
    private static final    double TILE_HEIGHT = 150;
    App_Nodes_Actions App_Nodes_Actions;
    
	public RightPane(App_Nodes_Actions App_Nodes_Actions) {
		super();
		this.App_Nodes_Actions = App_Nodes_Actions ;
		words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
		
		accordion = new Accordion();
	
		Build_Map_Right_Pane();
		Build_Ind_Right_Pane();
		Build_Scienario_RIght_Pane();
		
		//--------------------------------------------------------------------------
		System_Counters = new System_Counters();
		System_Counters.setPrefHeight(3);

		TitledPane System_CountersTitledPane = new TitledPane("", System_Counters);
		System_CountersTitledPane.setPadding(new Insets(2, 2, 2, 2));
		File ff = new File("icons//home.png");
		Image ii = new Image(ff.toURI().toString());
		final ImageView selectedImage1f = new ImageView();
		selectedImage1f.setImage(ii);
		selectedImage1f.setFitHeight(25);
		selectedImage1f.setFitWidth(25);
		 HBox h = new HBox();h.setSpacing(5);h.getChildren().addAll(SetMap_v2,Activate_ICABEMS_v9);
		System_CountersTitledPane.setGraphic(h);
	//---------------------------------------------------------------------	
		
		Buid_Siulation_Right_Pane();
		Build_Setting_Right_Pane();
		
		TitledPane Ind_Right_PanePane = new TitledPane("",null);
		Ind_Right_PanePane.setPadding(new Insets(2, 2, 2, 2));

		Ind_Right_PanePane.setGraphic(ind_v4);
		
//--------------------------------------------------------------------------------------
	
		TitledPane Scienario_RIght_Pane = new TitledPane("",null);
		Scienario_RIght_Pane.setPadding(new Insets(2, 2, 2, 2));
		 HBox h2 = new HBox();h2.setSpacing(5);h2.getChildren().addAll(sin_v9,Simulation_v11);
			
		Scienario_RIght_Pane.setGraphic(h2);
		
		// --------------------------------------------------------------------------
		Build_Onto_Right_Pane();

		TitledPane Siulation_Right_Pane = new TitledPane("",other_results_Func);
		Siulation_Right_Pane.setPadding(new Insets(2, 2, 2, 2));
		 
		 HBox h3 = new HBox();h3.setSpacing(5);h3.getChildren().addAll(Setting_v13,Onto_v777);
			
		Siulation_Right_Pane.setGraphic(h3);
		
		//---------------------------------------------------------------------------
	
		
		//-------------------------------------------------------
		
		Build_Bar_Chart_TIle();
		TitledPane Bar_Chart_TIle = new TitledPane("",null);
		Bar_Chart_TIle.setPadding(new Insets(2, 2, 2, 2));
			
//	Bar_Chart_TIle.setPrefSize(300, 100);
	//	Bar_Chart_TIle.setMinSize(300, 100);
		Bar_Chart_TIle.setGraphic(barChartTile);
	
		
		//------------------------------------------
	
		
		accordion.getPanes().add(System_CountersTitledPane);
		accordion.getPanes().add(Ind_Right_PanePane);
		accordion.getPanes().add(Scienario_RIght_Pane);
		accordion.getPanes().add(Siulation_Right_Pane);
	
		
		accordion.getPanes().add(Bar_Chart_TIle);
		
		setTop(accordion);
		setBottom(System_Counters.getProgressBar());

		Setmap.setOnAction(App_Nodes_Actions);
		create_ind.setOnAction(App_Nodes_Actions);
		detele_indv.setOnAction(App_Nodes_Actions);
		edit_indv.setOnAction(App_Nodes_Actions);
		show_indv.setOnAction(App_Nodes_Actions);
		create_sin.setOnAction(App_Nodes_Actions);
		
		start_sim.setOnAction(App_Nodes_Actions);
		stop_sim.setOnAction(App_Nodes_Actions);
		stats_sim.setOnAction(App_Nodes_Actions);
		Settings.setOnAction(App_Nodes_Actions);
		 EdditeOnto.setOnAction(App_Nodes_Actions);
		 ShowOnto.setOnAction(App_Nodes_Actions);
		 EditRules.setOnAction(App_Nodes_Actions);
		 
		 show_dataset.setOnAction(App_Nodes_Actions);
		 export_dataset.setOnAction(App_Nodes_Actions);
		
		 Setmap.setId("Button_Top");
		 create_ind.setId("Button_Top");
		 detele_indv .setId("Button_Top");
		 edit_indv .setId("Button_Top");
		 show_indv.setId("Button_Top");
		 create_sin.setId("Button_Top");
		
		 start_sim.setId("Button_Top");
		 stop_sim.setId("Button_Top");
		 stats_sim.setId("Button_Top");
		 Settings.setId("Button_Top");
	}

	public void Build_Map_Right_Pane() {
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
		
	    final ImageView selectedImage = new ImageView();
		Setmap = new Button(words[11]);
		Setmap.setContentDisplay(ContentDisplay.TOP);

		selectedImage.setImage(i);
		selectedImage.setFitHeight(25);
		selectedImage.setFitWidth(25);
		Setmap.setGraphic(selectedImage);
    	GridPane layout = new GridPane();
		layout.add(Setmap, 0, 0);
		Label label = new Label(words[31]);
		label.getStyleClass().add("ribbonLabel");
		layout.setPadding(new Insets(6, 1, 6, 1));
		layout.setGridLinesVisible(false);

    	VBox v = new VBox();
		v.getChildren().add(label);
		v.setVgrow(label, Priority.ALWAYS);
		v.setAlignment(Pos.BOTTOM_CENTER);
		v.setStyle("-fx-padding: 5 0 0 0");
		layout.add(v, 0, 2, 4, 1);
	
		SetMap_v2.setId("toolbarContainer");
		SetMap_v2.setSpacing(3);
		SetMap_v2.setAlignment(Pos.CENTER);
		SetMap_v2.getChildren().add(layout);
		SetMap_v2.getStyleClass().add("toolbarContainer");
	}
	public void Build_Ind_Right_Pane() {
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
		
		f1 = new File("icons/add.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage2 = new ImageView();
		create_ind = new Button(words[12]);
		create_ind.setContentDisplay(ContentDisplay.TOP);

		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(25);
		selectedImage2.setFitWidth(25);
		create_ind.setGraphic(selectedImage2);

		f1 = new File("icons/delete.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		detele_indv = new Button(words[13]);
		detele_indv.setContentDisplay(ContentDisplay.TOP);

		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(25);
		selectedImage3.setFitWidth(25);
		detele_indv.setGraphic(selectedImage3);

		f1 = new File("icons/edit-icon.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage4 = new ImageView();
		edit_indv = new Button(words[14]);
		edit_indv.setContentDisplay(ContentDisplay.TOP);

		selectedImage4.setImage(i);
		selectedImage4.setFitHeight(25);
		selectedImage4.setFitWidth(25);
		edit_indv.setGraphic(selectedImage4);


		f1 = new File("icons/search-icon.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage5 = new ImageView();
		show_indv = new Button(words[15]);
		show_indv.setContentDisplay(ContentDisplay.TOP);

		selectedImage5.setImage(i);
		selectedImage5.setFitHeight(25);
		selectedImage5.setFitWidth(25);
		show_indv.setGraphic(selectedImage5);


    	GridPane layout2 = new GridPane();
		layout2.add(create_ind, 0, 0);
		layout2.add(detele_indv, 1, 0);
		layout2.add(edit_indv, 2, 0);
		layout2.add(show_indv,3, 0);
		layout2.setHgap(7);


		Label label2 = new Label(words[32]);
		label2.getStyleClass().add("ribbonLabel");
		layout2.setPadding(new Insets(6, 1, 6, 1));
		layout2.setGridLinesVisible(false);
		layout2.setHgap(7);
    	VBox v3 = new VBox();
		v3.getChildren().add(label2);
		v3.setVgrow(label2, Priority.ALWAYS);
		v3.setAlignment(Pos.BOTTOM_CENTER);
		v3.setStyle("-fx-padding: 5 0 0 0");
		layout2.add(v3, 0, 2, 4, 1);
		
		ind_v4.setId("toolbarContainer");
		ind_v4.setSpacing(3);
		ind_v4.setAlignment(Pos.CENTER);
		ind_v4.getChildren().add(layout2);
		ind_v4.getStyleClass().add("toolbarContainer");
	}
	public void Build_Scienario_RIght_Pane() {
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
	
		f1 = new File("icons/create_sin.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage6 = new ImageView();
		create_sin = new Button(words[12]);
		create_sin.setContentDisplay(ContentDisplay.TOP);
		selectedImage6.setImage(i);
		selectedImage6.setFitHeight(25);
		selectedImage6.setFitWidth(25);
		create_sin.setGraphic(selectedImage6);

	
	    GridPane layout3 = new GridPane();
    //	layout3.setPadding(new Insets(5,0, 0, 0));
    	layout3.setAlignment(Pos.CENTER);
		layout3.add(create_sin, 0, 0);
	
		layout3.setHgap(7);
	    Label label3 = new Label(words[33]);
		label3.getStyleClass().add("ribbonLabel");
		layout3.setPadding(new Insets(6, 1, 6, 1));
		layout3.setGridLinesVisible(false);
		layout3.setHgap(7);
    	VBox v6 = new VBox();
		v6.getChildren().add(label3);

		v6.setVgrow(label3, Priority.ALWAYS);
		v6.setAlignment(Pos.BOTTOM_CENTER);
		v6.setStyle("-fx-padding: 5 0 0 0");
		layout3.add(v6, 0, 2, 4, 1);
		
		sin_v9.setId("toolbarContainer");
		sin_v9.setSpacing(3);
		sin_v9.setAlignment(Pos.CENTER);
		sin_v9.getChildren().add(layout3);
		sin_v9.getStyleClass().add("toolbarContainer");
		//----------------------------------------------------------------------------
		 ToggleSwitch = new switchButton();
     	GridPane layout4 = new GridPane();
    	layout4.setAlignment(Pos.CENTER);
		layout4.add(ToggleSwitch, 1, 0);
		layout4.setHgap(7);
		layout4.setVgap(2.5);
		
	
		layout4.setPadding(new Insets(6, 1, 0, 1));
		layout4.setGridLinesVisible(false);
		layout4.setHgap(7);

    	VBox v8 = new VBox();
	
		v8.setVgrow(label3, Priority.ALWAYS);
		v8.setAlignment(Pos.BOTTOM_CENTER);
		v8.setStyle("-fx-padding: 5 0 0 0");
		layout4.add(v8, 0, 2, 4, 1);
		
		Activate_ICABEMS_v9.setId("toolbarContainer");
		Activate_ICABEMS_v9.setSpacing(3);
		Activate_ICABEMS_v9.setAlignment(Pos.CENTER);
		Activate_ICABEMS_v9.getChildren().add(layout4);
		Activate_ICABEMS_v9.getStyleClass().add("toolbarContainer");
	
	}
	public void Buid_Siulation_Right_Pane() {
		Label label2 = new Label(words[32]);
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
	
		f1 = new File("icons/Start-icon.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage10 = new ImageView();
		start_sim = new Button(words[37]);
		start_sim.setContentDisplay(ContentDisplay.TOP);
		selectedImage10.setImage(i);
		selectedImage10.setFitHeight(30);
		selectedImage10.setFitWidth(30);
		start_sim.setGraphic(selectedImage10);

		f1 = new File("icons/Pause-icon.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage11 = new ImageView();
		stop_sim = new Button(words[38]);
		stop_sim.setContentDisplay(ContentDisplay.TOP);
		selectedImage11.setImage(i);
		selectedImage11.setFitHeight(30);
		selectedImage11.setFitWidth(30);
		stop_sim.setGraphic(selectedImage11);


		f1 = new File("icons/Stats-icon.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage12 = new ImageView();
		stats_sim = new Button(words[39]);
		stats_sim.setContentDisplay(ContentDisplay.TOP);
		selectedImage12.setImage(i);
		selectedImage12.setFitHeight(30);
		selectedImage12.setFitWidth(30);
		stats_sim.setGraphic(selectedImage12);


    	GridPane layout5 = new GridPane();
		layout5.add(start_sim, 0, 0);
		layout5.add(stop_sim, 1, 0);
		layout5.add(stats_sim, 2, 0);
		layout5.setHgap(7);
		layout5.setVgap(7);
		layout5.setAlignment(Pos.BOTTOM_CENTER);

		Label label5 = new Label(words[36]);
		label5.getStyleClass().add("ribbonLabel");
		layout5.setPadding(new Insets(6, 1, 6, 1));
		layout5.setGridLinesVisible(false);
		layout5.setHgap(7);
    	VBox v10 = new VBox();
		v10.getChildren().add(label5);
		v10.setVgrow(label2, Priority.ALWAYS);
		v10.setAlignment(Pos.BOTTOM_CENTER);
		v10.setStyle("-fx-padding: 5 0 0 0");
		layout5.add(v10, 0, 2, 4, 1);
		
		Simulation_v11.setId("toolbarContainer");
		Simulation_v11.setSpacing(3);
		Simulation_v11.setAlignment(Pos.CENTER);
		Simulation_v11.getChildren().add(layout5);
		Simulation_v11.getStyleClass().add("toolbarContainer");
		
		other_results_Func = new VBox();
		other_results_Func.setAlignment(Pos.TOP_LEFT);
		other_results_Func.setPadding(new Insets(10));
		other_results_Func.setSpacing(5);
		
		HBox h_result_1 = new HBox();
		h_result_1.setAlignment(Pos.TOP_LEFT);
		h_result_1.setPadding(new Insets(10));
		h_result_1.setSpacing(5);
		
		f1 = new File("icons/jj.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage13 = new ImageView();
		show_dataset = new Button("show dataset");
		show_dataset.setContentDisplay(ContentDisplay.TOP);
		selectedImage13.setImage(i);
		selectedImage13.setFitHeight(30);
		selectedImage13.setFitWidth(30);
		show_dataset.setGraphic(selectedImage13);
		
		f1 = new File("icons/save.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage14= new ImageView();
		export_dataset = new Button("export dataset");
		export_dataset.setContentDisplay(ContentDisplay.TOP);
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(30);
		selectedImage14.setFitWidth(30);
		export_dataset.setGraphic(selectedImage14);
		
		h_result_1.getChildren().add(show_dataset);
		h_result_1.getChildren().add(export_dataset);
		
		other_results_Func.getChildren().add(h_result_1);
	
		
	}
	public void Build_Setting_Right_Pane() {
	
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
	
		f1 = new File("icons/sim.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage13 = new ImageView();
		Settings = new Button();
		Settings.setContentDisplay(ContentDisplay.RIGHT);
		selectedImage13.setImage(i);
		selectedImage13.setFitHeight(35);
		selectedImage13.setFitWidth(35);
		Settings.setGraphic(selectedImage13);

    	GridPane layout6 = new GridPane();
		layout6.add(Settings, 1, 0);
		layout6.setVgap(2);

		layout6.setAlignment(Pos.CENTER);

		Label label6 = new Label(words[40]);
		label6.getStyleClass().add("ribbonLabel");
		layout6.setPadding(new Insets(6, 1, 6, 1));
		layout6.setGridLinesVisible(false);

    	VBox v12 = new VBox();
		v12.getChildren().add(label6);
		v12.setVgrow(label6, Priority.ALWAYS);
		v12.setAlignment(Pos.BOTTOM_CENTER);
		v12.setStyle("-fx-padding: 5 0 0 0");
		layout6.add(v12, 0, 2, 4, 1);
	
		Setting_v13.setId("toolbarContainer");
		Setting_v13.setSpacing(3);
		Setting_v13.setAlignment(Pos.CENTER);
		Setting_v13.getChildren().add(layout6);
		Setting_v13.getStyleClass().add("toolbarContainer");
	}
	public void Build_Onto_Right_Pane() {
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
	
		f1 = new File("icons/icon5.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();
	    ShowOnto = new Button("Show");
	    ShowOnto.setContentDisplay(ContentDisplay.TOP);
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(25);
		selectedImage14.setFitWidth(25);
		ShowOnto.setGraphic(selectedImage14);

		f1 = new File("icons/sparql.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage15 = new ImageView();
		EdditeOnto = new Button("Edite");
		EdditeOnto.setContentDisplay(ContentDisplay.TOP);
		selectedImage15.setImage(i);
		selectedImage15.setFitHeight(25);
		selectedImage15.setFitWidth(25);
		EdditeOnto.setGraphic(selectedImage15);

		f1 = new File("icons/icon_systemintegration.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage16 = new ImageView();
		EditRules = new Button("Rules");
		EditRules.setContentDisplay(ContentDisplay.TOP);
		selectedImage16.setImage(i);
		selectedImage16.setFitHeight(25);
		selectedImage16.setFitWidth(25);

		EditRules.setGraphic(selectedImage16);
	    GridPane layou7 = new GridPane();
    //	layout3.setPadding(new Insets(5,0, 0, 0));
    	layou7.setAlignment(Pos.CENTER);
		layou7.add(ShowOnto, 0, 0);
		layou7.add(EdditeOnto, 1, 0);
		layou7.add(EditRules, 2, 0);
		layou7.setHgap(7);
	    Label label7 = new Label("Ontology");
		label7.getStyleClass().add("ribbonLabel");
		layou7.setPadding(new Insets(6, 1, 6, 1));
		layou7.setGridLinesVisible(false);
		layou7.setHgap(7);
    	VBox v77 = new VBox();
		v77.getChildren().add(label7);

		v77.setVgrow(label7, Priority.ALWAYS);
		v77.setAlignment(Pos.BOTTOM_CENTER);
		v77.setStyle("-fx-padding: 5 0 0 0");
		layou7.add(v77, 0, 2, 4, 1);
		
		Onto_v777.setId("toolbarContainer");
		Onto_v777.setSpacing(3);
		Onto_v777.setAlignment(Pos.CENTER);
		Onto_v777.getChildren().add(layou7);
		Onto_v777.getStyleClass().add("toolbarContainer");

	}
	public void Build_Bar_Chart_TIle() {
		
	    barChartItem1 = new BarChartItem("Ontology Classes", App_Nodes_Actions.Application.getOntologyIndividualsModel().getOntologyModelGIS().getOWLNamedClass_OpenSBSList().size(), Tile.BLUE);
        barChartItem2 = new BarChartItem("Data-Type-Properties", App_Nodes_Actions.Application.getOntologyIndividualsModel().getOntologyModelGIS().getOWLDatatypeProperty_OpenSBSList().size(), Tile.RED);
        barChartItem3 = new BarChartItem("Object-Properties", App_Nodes_Actions.Application.getOntologyIndividualsModel().getOntologyModelGIS().getOWLObjectProperty_OpenSBSList().size(), Tile.GREEN);
        barChartItem4 = new BarChartItem("Number of Indivudials",  App_Nodes_Actions.Application.getOntologyIndividualsModel().getOntologyIndividuals().size(), Tile.ORANGE);
        barChartItem5 = new BarChartItem("Load Progress", 80, Tile.ORANGE);

   
        barChartTile = TileBuilder.create()
                .skinType(SkinType.BAR_CHART) 
                .barChartItems(barChartItem1, barChartItem2, barChartItem3, barChartItem4)
                .decimals(0)
                .title("Smart Building Ontology Stats")
                .text("")
                .build();
        barChartTile.setPrefSize(300, 225);
        
        	}
	
	public System_Counters getSystem_Counters() {
		return System_Counters;
	}

	public VBox getSetMap_v2() {
		return SetMap_v2;
	}
	public void setSetMap_v2(VBox setMap_v2) {
		SetMap_v2 = setMap_v2;
	}
	public Button getShowOnto() {
		return ShowOnto;
	}
	public void setShowOnto(Button showOnto) {
		ShowOnto = showOnto;
	}
	public void setShow_Ontology(Button show_Ontology) {
		this.show_Ontology = show_Ontology;
	}
	public Button getEdditeOnto() {
		return EdditeOnto;
	}
	public void setEdditeOnto(Button edditeOnto) {
		EdditeOnto = edditeOnto;
	}
	public Button getDetele_indv() {
		return detele_indv;
	}
	public void setDetele_indv(Button detele_indv) {
		this.detele_indv = detele_indv;
	}
	public Button getEditRules() {
		return EditRules;
	}
	public void setEditRules(Button editRules) {
		EditRules = editRules;
	}
	public void setSetmap(Button setmap) {
		Setmap = setmap;
	}
	public void setCreate_ind(Button create_ind) {
		this.create_ind = create_ind;
	}
	public void setEdit_indv(Button edit_indv) {
		this.edit_indv = edit_indv;
	}
	public void setShow_indv(Button show_indv) {
		this.show_indv = show_indv;
	}
	public void setCreate_sin(Button create_sin) {
		this.create_sin = create_sin;
	}
	public void setDelete_sin(Button delete_sin) {
		this.delete_sin = delete_sin;
	}
	public void setSelect_sin(Button select_sin) {
		this.select_sin = select_sin;
	}
	public void setToggleSwitch(switchButton toggleSwitch) {
		ToggleSwitch = toggleSwitch;
	}
	public void setStart_sim(Button start_sim) {
		this.start_sim = start_sim;
	}
	public void setStop_sim(Button stop_sim) {
		this.stop_sim = stop_sim;
	}
	public Button getCreate_indv() {
		return create_ind;
	}
	public void setStats_sim(Button stats_sim) {
		this.stats_sim = stats_sim;
	}
	public void setSettings(Button settings) {
		Settings = settings;
	}
	public void setAbout_GIS_Button(Button about_GIS_Button) {
		About_GIS_Button = about_GIS_Button;
	}

	public Button getSetmap() {
		return Setmap;
	}



	public Accordion getAccordion() {
		return accordion;
	}

	public void setAccordion(Accordion accordion) {
		this.accordion = accordion;
	}

	public Button getEdit_indv() {
		return edit_indv;
	}
	public Button getShow_indv() {
		return show_indv;
	}
	public Button getCreate_sin() {
		return create_sin;
	}

	public Button getDelete_sin() {
		return delete_sin;
	}

	public Button getSelect_sin() {
		return select_sin;
	}

	public switchButton getToggleSwitch() {
		return ToggleSwitch;
	}

	public Button getStart_sim() {
		return start_sim;
	}

	public Button getStop_sim() {
		return stop_sim;
	}
	public Button getShow_dataset() {
		return show_dataset;
	}

	public Button getExport_dataset() {
		return export_dataset;
	}

	public void setShow_dataset(Button show_dataset) {
		this.show_dataset = show_dataset;
	}

	public void setExport_dataset(Button export_dataset) {
		this.export_dataset = export_dataset;
	}

	public Button getStats_sim() {
		return stats_sim;
	}

	public Button getSettings() {
		return Settings;
	}

	public Button getAbout_GIS_Button() {
		return About_GIS_Button;
	}

	public Button getShow_Ontology() {
		return show_Ontology;
	}

}
