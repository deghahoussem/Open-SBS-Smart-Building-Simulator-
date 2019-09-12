package application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import MainPanes.Start_Stop_Result_Senactio;
import ButtomPane.ButtomPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import DataManagment.*;
import GuiComnonets.OtherOutPutIindividual;
import GuiComnonets.switchButton;
import LeftPane.LeftPane;
import MainPanes.MainPane;
import MainPanes.chart_stats;
import RightPane.RightPane;
import TopPane.TopPane;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import eu.hansolo.enzo.notification.Notification.Notifier;
import GIS.Ontology.*;

public class Main extends Application {
	private String Dataset;
	private String AppMap;
	private Simulation_Model_Layers Simulation_Model_Layers;
	private int need_of_All_devices_consumation = 0;
	private int Green_energy_vall = 0;
	private int contaminated_Energy_vall = 0;
	private int TimeSystem = 0;
	private Float Cost = (float) 0;

	private chart_stats chart_stats;
	private Start_Stop_Result_Senactio Start_Stop_Result_Senactio;
	private Float Availeble_energy = (float) 0;

	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public double width = screenSize.getWidth();
	public double height = screenSize.getHeight();
	FileTxtManagmentGIS FileTxtManagmentGIS;
	String[] words;

	private TopPane TopPane;
	private ButtomPane buttomPane;
	private LeftPane leftPane;
	private RightPane rightPane;
	private MainPane mainPane;
	private OntologyIndividualsModel OntologyIndividualsModel;
	App_Nodes_Actions App_Nodes_Actions;

	public Float getAvaileble_energy() {
		return Availeble_energy;
	}

	public String getAppMap() {
		return AppMap;
	}

	public void setAppMap(String appMap) {
		AppMap = appMap;
	}

	public void setAvaileble_energy(Float availeble_energy) {
		Availeble_energy = availeble_energy;
	}

	public void Turn_On_Off(String id, String onoff) {
		String val = OntologyIndividualsModel.GetOWLDatatypeProperty(id,
				OntologyIndividualsModel.getOntologyModelGIS().getDevices_Watts_Consuming());
		String stat = OntologyIndividualsModel.GetOWLDatatypeProperty(id,
				OntologyIndividualsModel.getOntologyModelGIS().getDevices_State());
		System.out.println("idFind = " + id + " | val cons = " + val + "  | state real = " + stat);
		if (!onoff.equals(stat)) {
			if (onoff.equals("on")) {
				need_of_All_devices_consumation = need_of_All_devices_consumation + Integer.valueOf(val);
				OntologyIndividualsModel.SetOWLDatatypeProperty(id,
						OntologyIndividualsModel.getOntologyModelGIS().getDevices_State(), onoff);
			} else {
				need_of_All_devices_consumation = need_of_All_devices_consumation - Integer.valueOf(val);

				OntologyIndividualsModel.SetOWLDatatypeProperty(id,
						OntologyIndividualsModel.getOntologyModelGIS().getDevices_State(), onoff);
			}

			if (onoff.equals("on")) {
				String type = OntologyIndividualsModel.GetOntologyIndividuals(id).getOWLIndividualRDFType();
				if (type.equals("Windmills") || type.equals("Solar_Panels")) {
					String val2 = OntologyIndividualsModel.GetOWLDatatypeProperty(id,
							OntologyIndividualsModel.getOntologyModelGIS().getDevices_Values());

					Green_energy_vall = Green_energy_vall + Integer.valueOf(val2);

				}
			} else {
				String type = OntologyIndividualsModel.GetOntologyIndividuals(id).getOWLIndividualRDFType();
				if (type.equals("Windmills") || type.equals("Solar_Panels")) {
					String val2 = OntologyIndividualsModel.GetOWLDatatypeProperty(id,
							OntologyIndividualsModel.getOntologyModelGIS().getDevices_Values());

					Green_energy_vall = Green_energy_vall - Integer.valueOf(val2);

				}
			}
		}

	}

	public Start_Stop_Result_Senactio getStart_Stop_Result_Senactio() {
		return Start_Stop_Result_Senactio;
	}

	public chart_stats getChart_stats() {
		return chart_stats;
	}

	public void setCost(Float cost2) {
		Cost = (float) cost2;
	}

	public Float getCost() {
		return Cost;
	}

	public void RestSystem() {

		OntologyIndividualsModel = new OntologyIndividualsModel();
		getLeftPane().getAccordion().getPanes().remove(0, getLeftPane().getAccordion().getPanes().size());

		// --------------------------------------------------------------------------------------------------

	};

	private Stage primaryStage;

	public void start(Stage primaryStage) {
		try {
			
			Dataset = new String();
			Notifier.setNotificationOwner(primaryStage);
			OntologyIndividualsModel = new OntologyIndividualsModel();
			Simulation_Model_Layers = new Simulation_Model_Layers();
			chart_stats = new chart_stats(Simulation_Model_Layers);

			FileTxtManagmentGIS = new FileTxtManagmentGIS();
			words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
			BorderPane root = new BorderPane();
			App_Nodes_Actions = new App_Nodes_Actions(this);
			
			TopPane = new TopPane();
			buttomPane = new ButtomPane();
			buttomPane.setId("buttomPane");
			// buttomPane.setPrefHeight(25);
			leftPane = new LeftPane();
			leftPane.setId("leftPane");
			leftPane.setPrefWidth(width / 6);
			rightPane = new RightPane(App_Nodes_Actions);
			rightPane.setId("rightPane");
			rightPane.setPrefWidth(width / 6);
			rightPane.setMaxHeight(height-200);
			mainPane = new MainPane(width, height, App_Nodes_Actions, this);
			mainPane.setId("mainPane");
			TopPane.setActions(new App_Nodes_Actions(this));
			mainPane.getSetmaps().setAction(new App_Nodes_Actions(this));
			mainPane.getCreateIndividual().SetAction(new App_Nodes_Actions(this));
			mainPane.getCreateScenario().SetAction(App_Nodes_Actions);
		
			Start_Stop_Result_Senactio = new Start_Stop_Result_Senactio(this);
			
			
			TopPane.setPrefWidth(width-220);
			mainPane.setTop(TopPane);	//root.setTop(TopPane); 
		//	root.setLeft(chart_statsPane);
			root.setRight(rightPane);
			root.setCenter(mainPane);
			root.setMinHeight(700);
			root.setBottom(buttomPane);
			Scene scene = new Scene(root, width - 40, height-60 );
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			primaryStage.setScene(scene);
			primaryStage.getIcons().addAll(new Image(new File("icons//logo_home.png").toURI().toString()));
			primaryStage.show();
		//	primaryStage.setMaxHeight( height-200 );
			//primaryStage.setMaxWidth(width - 40);
			primaryStage.setResizable(false);
			primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {

				public void handle(WindowEvent event) {
					System.exit(0);

				}
			});
			this.primaryStage = primaryStage;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getDataset() {
		return Dataset;
	}

	public void setDataset(String dataset) {
		Dataset = dataset;
	}

	public Simulation_Model_Layers getSimulation_Model_Layers() {
		return Simulation_Model_Layers;
	}

	public void setSimulation_Model_Layers(Simulation_Model_Layers simulation_Model_Layers) {
		Simulation_Model_Layers = simulation_Model_Layers;
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
	
		launch(args);
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

	public TopPane getTopPane() {
		return TopPane;
	}

	public ButtomPane getButtomPane() {
		return buttomPane;
	}

	public LeftPane getLeftPane() {
		return leftPane;
	}

	public RightPane getRightPane() {
		return rightPane;
	}

	public MainPane getMainPane() {
		return mainPane;
	}

	public App_Nodes_Actions getApp_Nodes_Actions() {
		return App_Nodes_Actions;
	}

	public void setNeed_of_All_devices_consumation(int need_of_All_devices_consumation) {
		this.need_of_All_devices_consumation = need_of_All_devices_consumation;
	}

	public int getNeed_of_All_devices_consumation() {
		return need_of_All_devices_consumation;
	}

	public OntologyIndividualsModel getOntologyIndividualsModel() {
		return OntologyIndividualsModel;
	}

	public void setGreen_energy_vall(int green_energy_vall) {
		Green_energy_vall = green_energy_vall;
	}

	public void setContaminated_Energy_vall(int contaminated_Energy_vall) {
		this.contaminated_Energy_vall = contaminated_Energy_vall;
	}

	public void setTimeSystem(int timeSystem) {
		TimeSystem = timeSystem;
	}



	public int getGreen_energy_vall() {
		return Green_energy_vall;
	}

	public int getContaminated_Energy_vall() {
		return contaminated_Energy_vall;
	}

	public int getTimeSystem() {
		return TimeSystem;
	}

}
