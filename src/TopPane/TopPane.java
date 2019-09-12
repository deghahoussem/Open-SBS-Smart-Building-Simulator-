package TopPane;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import GuiComnonets.switchButton;
import application.App_Nodes_Actions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class TopPane extends Pane {

	FileTxtManagmentGIS FileTxtManagmentGIS;
	String[] words;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();


	private MenuItem new_Simulator;
	private MenuItem save_Simulator;
	private MenuItem load_Simulator;
	private MenuItem load_Senario;
	private MenuItem exit_Simulator;
	
	private MenuItem SetMap;
	
	private MenuItem Create_ind;
	private MenuItem Detele_ind;
	private MenuItem Edit_ind;
	private MenuItem Shlow_ind;
	private MenuItem import_sinario;
	private MenuItem create_senario;
	private MenuItem ececute_senario;
	private MenuItem show_senario_result;
	private MenuItem Turn_on_RulesEngen;
	private MenuItem Turn_off_RulesEngen;
	private MenuItem Edit_RulesEngen;
	private MenuItem Create_rule_RulesEngen;
	private MenuItem Detele_rules_RulesEngen;
	private MenuItem About_GIS;
	private MenuItem About_DzSoft;

	

	public void setActions(App_Nodes_Actions App_Nodes_Actions){
	
		//About_GIS_Button.setOnAction(App_Nodes_Actions);
	//	show_Ontology.setOnAction(App_Nodes_Actions);

		 new_Simulator.setOnAction(App_Nodes_Actions);
		 save_Simulator.setOnAction(App_Nodes_Actions);
		 load_Simulator.setOnAction(App_Nodes_Actions);
		 load_Senario.setOnAction(App_Nodes_Actions);
		 exit_Simulator.setOnAction(App_Nodes_Actions);
		 SetMap.setOnAction(App_Nodes_Actions);
		 Create_ind.setOnAction(App_Nodes_Actions);
		 Detele_ind.setOnAction(App_Nodes_Actions);
		 Edit_ind.setOnAction(App_Nodes_Actions);
		 Shlow_ind.setOnAction(App_Nodes_Actions);
		 import_sinario.setOnAction(App_Nodes_Actions);
		 create_senario.setOnAction(App_Nodes_Actions);
		 ececute_senario.setOnAction(App_Nodes_Actions);
		 show_senario_result.setOnAction(App_Nodes_Actions);
		 Turn_on_RulesEngen.setOnAction(App_Nodes_Actions);
		 Turn_off_RulesEngen.setOnAction(App_Nodes_Actions);
		 Edit_RulesEngen.setOnAction(App_Nodes_Actions);
		 Create_rule_RulesEngen.setOnAction(App_Nodes_Actions);
		 Detele_rules_RulesEngen.setOnAction(App_Nodes_Actions);
		 About_GIS.setOnAction(App_Nodes_Actions);
		 About_DzSoft.setOnAction(App_Nodes_Actions);
		
	}
	
	
	
	
	public TopPane() {
		super();
		FileTxtManagmentGIS = new FileTxtManagmentGIS();
		words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
		Label label2 = new Label(words[32]);
		MenuBar menuBar = new MenuBar();

		menuBar.setPrefHeight(25);
		Menu File_Menu = new Menu("  " + words[0] + "  ");
		new_Simulator = new MenuItem(words[6]);
		save_Simulator = new MenuItem(words[7]);
		load_Simulator = new MenuItem(words[8]);
		load_Senario = new MenuItem("Import Scenario");
		exit_Simulator = new MenuItem(words[9]);
		File_Menu.getItems().addAll(new_Simulator, save_Simulator, load_Simulator,load_Senario, exit_Simulator);

		Menu Individuals_Menu = new Menu("  " + words[1] + "  ");
		SetMap = new MenuItem(words[11]);
		Create_ind = new MenuItem(words[12]);
		Detele_ind = new MenuItem(words[13]);
		Edit_ind = new MenuItem(words[14]);
		Shlow_ind = new MenuItem(words[15]);
		Individuals_Menu.getItems().addAll(SetMap, Create_ind, Detele_ind, Edit_ind, Shlow_ind);

		Menu Simulator_Menu = new Menu("  " + words[2] + "  ");
		import_sinario = new MenuItem(words[17]);
		create_senario = new MenuItem(words[18]);
		ececute_senario = new MenuItem(words[19]);
		show_senario_result = new MenuItem(words[20]);
		Simulator_Menu.getItems().addAll(import_sinario, create_senario, ececute_senario, show_senario_result);

		Menu RulesEngen_Menu = new Menu("  " + words[3] + "  ");
		Turn_on_RulesEngen = new MenuItem(words[22]);
		Turn_off_RulesEngen = new MenuItem(words[23]);
		Edit_RulesEngen = new MenuItem(words[24]);
		Create_rule_RulesEngen = new MenuItem(words[25]);
		Detele_rules_RulesEngen = new MenuItem(words[26]);
		RulesEngen_Menu.getItems().addAll(Turn_on_RulesEngen, Turn_off_RulesEngen, Edit_RulesEngen,
				Create_rule_RulesEngen, Detele_rules_RulesEngen);

		Menu Help_Menu = new Menu("  " + words[4] + "  ");
		About_GIS = new MenuItem(words[28]);
		;
		About_DzSoft = new MenuItem(words[29]);
		;
		Help_Menu.getItems().addAll(About_GIS, About_DzSoft);
		menuBar.getMenus().addAll(File_Menu, Individuals_Menu, Simulator_Menu, RulesEngen_Menu, Help_Menu);

		// --------------------------------------------------------------------------
		File f1 = new File("icons/home.png");
		Image i = new Image(f1.toURI().toString());
		
		

			
		//--------------------------------------------------------

	
	// About_GIS_Button.setId("Button_Top");
	 //show_Ontology.setId("Button_Top");

	
		setId("topPane");
		menuBar.setPrefWidth(width-395);
		getChildren().add(menuBar);
	
	}

	public FileTxtManagmentGIS getFileTxtManagmentGIS() {
		return FileTxtManagmentGIS;
	}

	public String[] getWords() {
		return words;
	}

	public Dimension getScreenSize() {
		return screenSize;
	}

	public MenuItem getNew_Simulator() {
		return new_Simulator;
	}

	public MenuItem getSave_Simulator() {
		return save_Simulator;
	}

	public MenuItem getLoad_Simulator() {
		return load_Simulator;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	public MenuItem getLoad_Senario() {
		return load_Senario;
	}
	public void setLoad_Senario(MenuItem load_Senario) {
		this.load_Senario = load_Senario;
	}
public void setFileTxtManagmentGIS(FileTxtManagmentGIS fileTxtManagmentGIS) {
		FileTxtManagmentGIS = fileTxtManagmentGIS;
	}
	public void setWords(String[] words) {
		this.words = words;
	}
	public void setScreenSize(Dimension screenSize) {
		this.screenSize = screenSize;
	}
	public void setNew_Simulator(MenuItem new_Simulator) {
		this.new_Simulator = new_Simulator;
	}
	public void setSave_Simulator(MenuItem save_Simulator) {
		this.save_Simulator = save_Simulator;
	}
	public void setLoad_Simulator(MenuItem load_Simulator) {
		this.load_Simulator = load_Simulator;
	}
	public void setExit_Simulator(MenuItem exit_Simulator) {
		this.exit_Simulator = exit_Simulator;
	}
	public void setSetMap(MenuItem setMap) {
		SetMap = setMap;
	}
	public void setCreate_ind(MenuItem create_ind) {
		Create_ind = create_ind;
	}
	public void setDetele_ind(MenuItem detele_ind) {
		Detele_ind = detele_ind;
	}
	public void setEdit_ind(MenuItem edit_ind) {
		Edit_ind = edit_ind;
	}
	public void setShlow_ind(MenuItem shlow_ind) {
		Shlow_ind = shlow_ind;
	}
	public void setImport_sinario(MenuItem import_sinario) {
		this.import_sinario = import_sinario;
	}
	public void setCreate_senario(MenuItem create_senario) {
		this.create_senario = create_senario;
	}
	public void setEcecute_senario(MenuItem ececute_senario) {
		this.ececute_senario = ececute_senario;
	}
	public void setTurn_on_RulesEngen(MenuItem turn_on_RulesEngen) {
		Turn_on_RulesEngen = turn_on_RulesEngen;
	}
	public void setTurn_off_RulesEngen(MenuItem turn_off_RulesEngen) {
		Turn_off_RulesEngen = turn_off_RulesEngen;
	}
	public void setEdit_RulesEngen(MenuItem edit_RulesEngen) {
		Edit_RulesEngen = edit_RulesEngen;
	}
	public void setCreate_rule_RulesEngen(MenuItem create_rule_RulesEngen) {
		Create_rule_RulesEngen = create_rule_RulesEngen;
	}
	public void setDetele_rules_RulesEngen(MenuItem detele_rules_RulesEngen) {
		Detele_rules_RulesEngen = detele_rules_RulesEngen;
	}
	public void setAbout_GIS(MenuItem about_GIS) {
		About_GIS = about_GIS;
	}
	public void setAbout_DzSoft(MenuItem about_DzSoft) {
		About_DzSoft = about_DzSoft;
	}

	public MenuItem getExit_Simulator() {
		return exit_Simulator;
	}

	public MenuItem getSetMap() {
		return SetMap;
	}

	public MenuItem getCreate_ind() {
		return Create_ind;

	}
	

	public MenuItem getDetele_ind() {
		return Detele_ind;
	}

	public MenuItem getEdit_ind() {
		return Edit_ind;
	}

	public MenuItem getShlow_ind() {
		return Shlow_ind;
	}

	public MenuItem getImport_sinario() {
		return import_sinario;
	}

	public MenuItem getCreate_senario() {
		return create_senario;
	}

	public MenuItem getEcecute_senario() {
		return ececute_senario;
	}

	public MenuItem getShow_senario_result() {
		return show_senario_result;
	}

	public MenuItem getTurn_on_RulesEngen() {
		return Turn_on_RulesEngen;
	}

	public MenuItem getTurn_off_RulesEngen() {
		return Turn_off_RulesEngen;
	}

	public MenuItem getEdit_RulesEngen() {
		return Edit_RulesEngen;
	}

	public MenuItem getCreate_rule_RulesEngen() {
		return Create_rule_RulesEngen;
	}

	public MenuItem getDetele_rules_RulesEngen() {
		return Detele_rules_RulesEngen;
	}

	public MenuItem getAbout_GIS() {
		return About_GIS;
	}

	public MenuItem getAbout_DzSoft() {
		return About_DzSoft;
	}



}
