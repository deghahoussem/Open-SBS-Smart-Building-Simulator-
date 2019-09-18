package application;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.protege.owl.portability.query.LiteralValue;
import org.protege.owl.portability.query.Result;
import org.protege.owl.portability.query.ResultException;

import DataManagment.FileTxtManagmentGIS;
import GIS.Ontology.*;
import GIS.Ontology.OntologyIndividuals;
import GIS.Ontology.OutPutIindividual;
import GuiComnonets.Actors;
import GuiComnonets.DynamicTableView;
import GuiComnonets.Light;
import GuiComnonets.NormalDevice;
import GuiComnonets.OtherOutPutIindividual;
import GuiComnonets.Zone;
import MainPanes.ActivityActor;
import MainPanes.ScenarioItems;
import MainPanes.ScenarioItems.ListeOfMovingclass;
import RulesEngenGIS.Rule_Result_Model;
import RulesEngenGIS.RulesEngenGIS;
import RulesEngenGIS.SWRL_Rule_Graph;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import edu.stanford.smi.protegex.owl.model.OWLObjectProperty;
import eu.hansolo.enzo.notification.Notification;
import eu.hansolo.enzo.notification.Notification.Notifier;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class App_Nodes_Actions implements EventHandler {
	public static Main Application;
	String text = "";
	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	Save_Import_Ontology Save_Import_Ontology;

	public App_Nodes_Actions(Main Application) {
		this.Application = Application;
		Save_Import_Ontology = new Save_Import_Ontology(Application);
	}

	public boolean TabExist(Tab t) {
		for (int i = 0; i < Application.getMainPane().getMainPane().getTabs().size(); i++) {
			if (Application.getMainPane().getMainPane().getTabs().get(i).equals(t))
				return true;
		}
		return false;
	}

	public void handle(Event event) {

		if (event.getSource() == Application.getRightPane().getSetmap()
				|| event.getSource() == Application.getTopPane().getSetMap()) {

			if (TabExist(Application.getMainPane().getSetmaps())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSetmaps());
			} else {
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSetmaps());

			}

		} else
		// ------------------------------------- Map 1
		// -------------------------------------
		if (Application.getMainPane().getSetmaps().getButton_Map1() == event.getSource()) {

			Notifier.INSTANCE.notifyInfo("Information", words[187]);
			/*
			 * Notification info = new Notification("Title", "Info-Message");
			 *
			 * // Show the custom notification Notifier.INSTANCE.notify(info);
			 *
			 * // Show a predefined Warning notification /*
			 * Notifier.INSTANCE.notifyWarning("This is a warning", null);
			 *
			 *
			 * Notifier.INSTANCE.notifySuccess("Success", null);
			 *
			 * Notifier.INSTANCE.notifyInfo("Information", null);
			 *
			 * Notifier.INSTANCE.notifyError("Error", null);
			 *
			 * Notifier.INSTANCE.notifyWarning("Warning", null);
			 */

			Application.RestSystem();
			Application.getMainPane().getSimulator().SetMapImage("map1");
			Application.setAppMap("map1");
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());
			}

			Zone bedroom = new Zone(words[50], "bedroom-icon");
			Zone livingroom = new Zone(words[51], "TV");
			Zone bathroom = new Zone(words[52], "Shower-stall-icon");
			Zone kitchen = new Zone(words[53], "Grilled_Steak_PNG_Clipart");
			Zone diningroom = new Zone(words[54], "Photo_4_285_4");
			Zone room = new Zone(words[56], "waiting_room_icon");
			Zone patio = new Zone(words[59], "basic3-083_dashed_box_drop_zone-512");
			Zone hall = new Zone(words[55], "basic3-083_dashed_box_drop_zone-512");

			int x = 0;

			Text bedroom_Txt = new Text(words[50]);
			bedroom_Txt.setLayoutX(257 + x);
			bedroom_Txt.setLayoutY(443);
			Text livingroom_Txt = new Text(words[51]);
			livingroom_Txt.setLayoutX(337 + x);
			livingroom_Txt.setLayoutY(200);
			Text bathroom_Txt = new Text(words[52]);
			bathroom_Txt.setLayoutX(500 + x);
			bathroom_Txt.setLayoutY(453);
			Text kitchen_Txt = new Text(words[53]);
			kitchen_Txt.setLayoutX(730 + x);
			kitchen_Txt.setLayoutY(182);
			Text diningroom_Txt = new Text(words[54]);
			diningroom_Txt.setLayoutX(513 + x);
			diningroom_Txt.setLayoutY(178);
			Text room_Txt = new Text(words[56]);
			room_Txt.setLayoutX(100 + x);
			room_Txt.setLayoutY(100);
			Text patio_Txt = new Text(words[59]);
			patio_Txt.setLayoutX(100 + x);
			patio_Txt.setLayoutY(240);
			Text hall_Txt = new Text(words[55]);
			hall_Txt.setLayoutX(800 + x);
			hall_Txt.setLayoutY(409);

			Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren().addAll(bedroom_Txt,
					livingroom_Txt, bathroom_Txt, kitchen_Txt, diningroom_Txt, room_Txt, patio_Txt, hall_Txt);

			// ----------------------------------------------------------------------------
			/**
			 * Task<Integer> task = new Task<Integer>() { protected Integer call() throws
			 * Exception {
			 *
			 * return 0; } }; new Thread(task).start();
			 */
			Task<Integer> task = new Task<Integer>() {
				protected Integer call() throws Exception {
					// //System.out.println(Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone());
					// ****************************************************************************************************************************
					Application.getOntologyIndividualsModel().CreateIndividual(bedroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getBedroom(), bedroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							bedroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"357-343");
					// --------------------------------------------------------------
					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							bedroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");

					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					// --------------------------------------------------------------

					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							bedroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getLevingRoom(),
							livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							livingroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"437-168");

					Application.getOntologyIndividualsModel().CreateIndividual(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getBathroom(), bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							bathroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"690-393");

					Application.getOntologyIndividualsModel().CreateIndividual(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getKitchen(), kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							kitchen_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"729-152");

					Application.getOntologyIndividualsModel().CreateIndividual(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getDenningRoom(),
							diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							diningroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"603-168");

					Application.getOntologyIndividualsModel().CreateIndividual(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(room_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getRoom(), room);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(room_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							room_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(room_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"220-85");

					Application.getOntologyIndividualsModel().CreateIndividual(
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							room);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(room_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							room);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(room_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							room_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(patio_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPatio(), patio);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(patio_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							patio_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(patio_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"230-179");

					Application.getOntologyIndividualsModel().CreateIndividual(
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							patio);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(patio_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							patio);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(patio_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							patio_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(hall_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getHall(), hall);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(hall_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							hall_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(hall_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"820-319");

					Application.getOntologyIndividualsModel().CreateIndividual(
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							hall);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(hall_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							hall);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(hall_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							hall_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					return 0;
				}
			};
			new Thread(task).start();

			// ----------------------------------------------------------------------------

			Application.getLeftPane().getAccordion().getPanes().addAll(bathroom, bedroom, livingroom, kitchen,
					diningroom, room, patio, hall);

		} else if (Application.getMainPane().getSetmaps().getButton_Map2() == event.getSource()) {
			Application.RestSystem();
			Application.setAppMap("map2");
			Application.getMainPane().getSimulator().SetMapImage("map2");
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());

			}
			Notifier.INSTANCE.notifyInfo("Information", words[187]);
			Zone bedroom1 = new Zone(words[50], "bedroom-icon");
			Zone bedroom2 = new Zone(words[50], "bedroom-icon");
			Zone kidsroom = new Zone(words[50], "my-documents-icon");
			Zone livingroom = new Zone(words[51], "TV");
			Zone bathroom = new Zone(words[52], "Shower-stall-icon");
			Zone kitchen = new Zone(words[53], "Grilled_Steak_PNG_Clipart");
			Zone diningroom = new Zone(words[54], "Photo_4_285_4");
			int x = 100;
			Text bedroom_Txt1 = new Text(words[50] + "1");
			bedroom_Txt1.setLayoutX(657 + x);
			bedroom_Txt1.setLayoutY(343);
			Text bedroom_Txt2 = new Text(words[50] + "2");
			bedroom_Txt2.setLayoutX(657 + x);
			bedroom_Txt2.setLayoutY(140);
			Text livingroom_Txt = new Text(words[51]);
			livingroom_Txt.setLayoutX(180 + x);
			livingroom_Txt.setLayoutY(168);
			Text bathroom_Txt = new Text(words[52]);
			bathroom_Txt.setLayoutX(379 + x);
			bathroom_Txt.setLayoutY(120);
			Text kitchen_Txt = new Text(words[53]);
			kitchen_Txt.setLayoutX(379 + x);
			kitchen_Txt.setLayoutY(350);
			Text diningroom_Txt = new Text(words[54]);
			diningroom_Txt.setLayoutX(220 + x);
			diningroom_Txt.setLayoutY(400);

			Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren().addAll(bedroom_Txt1,
					bedroom_Txt2, livingroom_Txt, bathroom_Txt, kitchen_Txt, diningroom_Txt);
			// ----------------------------------------------------------------------------

			Task<Integer> task = new Task<Integer>() {
				protected Integer call() throws Exception {
					Application.getOntologyIndividualsModel().CreateIndividual(bedroom_Txt1.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), bedroom1);

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt1.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							bedroom_Txt1.getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt1.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"657-343");

					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							bedroom1);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt1.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							bedroom1);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt1.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt1.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(bedroom_Txt2.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), bedroom2);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt2.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							bedroom_Txt2.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bedroom_Txt2.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"657-140");

					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							bedroom2);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt2.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							bedroom2);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bedroom_Txt2.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bedroom_Txt2.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							livingroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"180-168");

					Application.getOntologyIndividualsModel().CreateIndividual(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							livingroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(livingroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							livingroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							bathroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"379-120");

					Application.getOntologyIndividualsModel().CreateIndividual(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							bathroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(bathroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							bathroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							kitchen_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"379-350");

					Application.getOntologyIndividualsModel().CreateIndividual(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							kitchen);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(kitchen_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							kitchen_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					Application.getOntologyIndividualsModel().CreateIndividual(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone(), diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_Name(),
							diningroom_Txt.getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY(),
							"220-400");

					Application.getOntologyIndividualsModel().CreateIndividual(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentLight(),
							diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"50");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentLight().getBrowserText());

					Application.getOntologyIndividualsModel().CreateIndividual(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironmentTemperature(),
							diningroom);
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getEnvironment_Values(),
							"25");
					Application.getOntologyIndividualsModel().AddOWLObjectProperty(diningroom_Txt.getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceHasEnvironment(),
							diningroom_Txt.getText() + Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getEnvironmentTemperature().getBrowserText());

					// ****************************************************************************************************************************

					return 0;
				}
			};
			new Thread(task).start();
			// ----------------------------------------------------------------------------

			Application.getLeftPane().getAccordion().getPanes().addAll(bathroom, bedroom1, bedroom2, livingroom,
					kitchen, diningroom);

		} else if (Application.getMainPane().getSetmaps().getButton_Map3() == event.getSource()) {
			Notifier.INSTANCE.notifyInfo("Information", words[187]);
			Application.RestSystem();
			Application.setAppMap("map3");
			Application.getMainPane().getSimulator().SetMapImage("map3");
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());

			}

		} else if (event.getSource() == Application.getTopPane().getExit_Simulator()) {
			System.exit(0);

		} // ------------------------------------------ create individual Button
			// in top Pane
			// -----------------------------------------------------------------
		else if (event.getSource() == Application.getTopPane().getCreate_ind()
				|| event.getSource() == Application.getRightPane().getCreate_indv()) {

			if (TabExist(Application.getMainPane().getCreateIndividual())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateIndividual());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateIndividual());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getCreateIndividual());

			}
		}
		// ----------------------------------------------------------------------------------------------
		else if (event.getSource() == Application.getRightPane().getDetele_indv()
				|| event.getSource() == Application.getTopPane().getDetele_ind()) {

			if (TabExist(Application.getMainPane().getDeleteIndiviuals())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getDeleteIndiviuals());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getDeleteIndiviuals());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getDeleteIndiviuals());

			}
			Application.getMainPane().getDeleteIndiviuals().getListe_Of_delete_Selection().getChildren().remove(0,
					Application.getMainPane().getDeleteIndiviuals().getListe_Of_delete_Selection().getChildren()
							.size());
			int i = 0;
			while (i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size()) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);
				List<String> l = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());
				// System.out.println("no = " + OntologyIndividuals.getOntologyIndividualsId());
				for (int j = 0; j < l.size(); j++) {

					if (l.get(j).equals("Devices") || l.get(j).equals("Actors")) {
						// System.out.println("thing = " +
						// OntologyIndividuals.getOntologyIndividualsId());
						final CheckBoxTreeItem<String> checkBoxTreeItem = new CheckBoxTreeItem<String>(
								OntologyIndividuals.getOntologyIndividualsId());

						File f1 = new File("icons//" + OntologyIndividuals.getOWLIndividualRDFType() + ".png");
						Image ii = new Image(f1.toURI().toString());
						ImageView selectedImage = new ImageView();
						selectedImage.setImage(ii);
						selectedImage.setFitHeight(25);
						selectedImage.setFitWidth(25);
						checkBoxTreeItem.setGraphic(selectedImage);
						Application.getMainPane().getDeleteIndiviuals().getListe_Of_delete_Selection().getChildren()
								.add(checkBoxTreeItem);
					}
				}

				i = i + 1;
			}

		}

		// --------------------------------------------------------------------------------------------------------------------

		else if (event.getSource() == Application.getTopPane().getEdit_ind()
				|| event.getSource() == Application.getRightPane().getEdit_indv()) {

			if (TabExist(Application.getMainPane().getEditindividuals())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getEditindividuals());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getEditindividuals());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getEditindividuals());

			}
		}
		// --------------------------------------------------------------------------------------------------------------------

		else if (event.getSource() == Application.getTopPane().getShlow_ind()
				|| event.getSource() == Application.getRightPane().getShow_indv()) {

			if (TabExist(Application.getMainPane().getShowindividiuals())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getShowindividiuals());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getShowindividiuals());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getShowindividiuals());

			}
		}
		// --------------------------------------------------------------------------------------------------------------------

		else if (event.getSource() == Application.getRightPane().getStop_sim()) {
			Application.getStart_Stop_Result_Senactio().Stop();

		}

		// --------------------------------------------------------------------------------
		else if (event.getSource() == Application.getMainPane().getDeleteIndiviuals().getDelete()) {

			for (int i = 0; i < Application.getMainPane().getDeleteIndiviuals().getListe_Of_delete_Selection()
					.getChildren().size(); i++) {

				final CheckBoxTreeItem<String> checkBoxTreeItem = (CheckBoxTreeItem<String>) Application.getMainPane()
						.getDeleteIndiviuals().getListe_Of_delete_Selection().getChildren().get(i);

				if (checkBoxTreeItem.isSelected()) {
					Application.getOntologyIndividualsModel().DeteleIndividual(checkBoxTreeItem.getValue().toString());
				}

			}

		}

		// ---------------------------------------------------------------------------------------------------------
		else // ---------------- create actors MenuItems
				// ----------------------------
		if (event.getSource() == Application.getMainPane().getCreateIndividual().getFamily()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getGrandmother()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getFather()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getGrandfather()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getMother()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getSister()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getBroher()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getDogs()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCats()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getMissionRobot()) {
			MenuItem MenuItem = (MenuItem) event.getSource();
			Application.getMainPane().getCreateIndividual().setCraetePaneActors(MenuItem.getText());

			try {
				Application.getMainPane().getCreateIndividual().getShooseZones().getItems().remove(0,
						Application.getMainPane().getCreateIndividual().getShooseZones().getItems().size());

			} catch (Exception e) {

			}

			int i = 0;
			while (i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size()) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);
				// List<String> s
				// =Application.getOntologyIndividualsModel().getOntologyModelGIS().getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());
				List<String> l23 = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l23, "Zone")) {
					Application.getMainPane().getCreateIndividual().getShooseZones().getItems()
							.add(OntologyIndividuals.getOntologyIndividualsId());
				}
				i += 1;

			}

		} else // --------------------- create devic menu// items--------------------

		// this create a device in left menu and she add button to it

		if (event.getSource() == Application.getMainPane().getCreateIndividual().getElectricity_Generator()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getGas_turbine()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getSolar_Panels()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getWindmills()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCDPlayer()
				//// ---------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getHairDryer()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getHairIron()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getMicrowaveOven()
				// --------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCentralVacuumCleaner()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getRoboticVacuumCleaner()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getThorWashingMachine()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getVacuumCleaner()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getWashingMachine()
				// -----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getElectricityCounter()
				// ------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getDishwasher()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getElectricWaterBoiler()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getOven()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getRefrigerators()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getStove()
				// -----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getLightss()
				// -----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getPhone()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getTelevision()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getDesktop()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getPrinter()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getBlender()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCoffeeMmachine()

				// -----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getHub()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getRouter()
				// -----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCamera()
				// ----------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getLight_sensors()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getMovingSensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getRainSensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getSmokeSensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getTemperatureSensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getWindSensor()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCO2_Sensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getEnergy_Metering_Sensor()

				|| event.getSource() == Application.getMainPane().getCreateIndividual().getNoise_Sensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getProximity_Sensor()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getRFID_Tag_Sensor()

				// ----------------()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getSwitchess()
				// ----------()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCooling()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getAirConditioner()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getAtticFan()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getCeilingFan()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getWindowFan()
				// ---------------
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getHeating()
				|| event.getSource() == Application.getMainPane().getCreateIndividual().getPatioHeater()) {
			MenuItem MenuItem = (MenuItem) event.getSource();
			try {

				Application.getMainPane().getCreateIndividual().getDevicezone().getItems().remove(0,
						Application.getMainPane().getCreateIndividual().getDevicezone().getItems().size());

			} catch (Exception e) {

			}
			Application.getMainPane().getCreateIndividual().setCreateDevice(MenuItem.getText());

			int i = 0;
			while (i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size()) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);

				List<String> l2 = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l2, "Zone")) {
					Application.getMainPane().getCreateIndividual().getDevicezone().getItems()
							.add(OntologyIndividuals.getOntologyIndividualsId());
				}

				i += 1;
			}
			;
			Application.getMainPane().getCreateIndividual().getDevicename()
					.setText(Application.getMainPane().getCreateIndividual().getTypeofcreateind());

		} else // ---------------- create device
				// ---------------------------------------------------------------------------
				// -----------------------------------
		if (event.getSource() == Application.getMainPane().getCreateIndividual().getCreate_device()) {

			String deviceName = Application.getMainPane().getCreateIndividual().getDevicename().getText();
			String device_consuming = Application.getMainPane().getCreateIndividual().getDevice_consuming().getText();
			String device_protocol = Application.getMainPane().getCreateIndividual().getDevice_protocol().getText();
			String device_State = Application.getMainPane().getCreateIndividual().getDevicestat().getValue().toString();
			String davice_vall = Application.getMainPane().getCreateIndividual().getDevice_values().getText();
			String device_zone = Application.getMainPane().getCreateIndividual().getDevicezone().getValue().toString();

			Notifier.INSTANCE.notifySuccess("Success", words[188] + " : " + deviceName);
			OntologyIndividuals OntologyIndividuals = null;

			//
			String Pos = null;

			for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {

				OntologyIndividuals = Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i);

				List<String> l23 = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l23, "Zone")
						&& OntologyIndividuals.getOntologyIndividualsId().equals(device_zone)) {

					Pos = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
							OntologyIndividuals.getOntologyIndividualsId(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY());

					break;
				}

			}

			//

			List<String> l2 = Application.getOntologyIndividualsModel().getOntologyModelGIS()
					.getSuperClasses(Application.getMainPane().getCreateIndividual().getTypeofcreateind());

			if (TestExistingSuperCclass(l2, "DeviceConsumeEnergy")) {

				NormalDevice NormalDevice = new NormalDevice(deviceName,
						Application.getMainPane().getCreateIndividual().getTypeofcreateind(), Pos, 50, 50, Application);

				// NormalDevice.MakeAction(device_State, "");
				Application.getOntologyIndividualsModel()
						.CreateIndividual(deviceName,
								Application.getOntologyIndividualsModel().getOntologyModelGIS().getOWLNamedClass(
										Application.getMainPane().getCreateIndividual().getTypeofcreateind()),
								NormalDevice);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State(),
						device_State);
				// .ln("the evice is craeted");
				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(NormalDevice.getDeviceobject());

			}
			/**
			 * --------------------------------- the prodection devices
			 * -------------------------------------------------
			 */

			//

			else if (TestExistingSuperCclass(l2, "Green_Energy")) {
				NormalDevice NormalDevice = new NormalDevice(deviceName,
						Application.getMainPane().getCreateIndividual().getTypeofcreateind(), Pos, 50, 50, Application);

				NormalDevice.MakeAction(device_State, "");
				Application.getOntologyIndividualsModel()
						.CreateIndividual(deviceName,
								Application.getOntologyIndividualsModel().getOntologyModelGIS().getOWLNamedClass(
										Application.getMainPane().getCreateIndividual().getTypeofcreateind()),
								NormalDevice);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State(),
						device_State);

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(NormalDevice.getDeviceobject());

				int x = Integer.valueOf(davice_vall) + Application.getGreen_energy_vall();

				Application.setGreen_energy_vall(x);

				Application.getRightPane().getSystem_Counters().getGreen_energy_vall().setText("" + x);
				int nb = Integer.valueOf(
						Application.getRightPane().getSystem_Counters().getGreen_energy_Number_devices().getText());
				Application.getRightPane().getSystem_Counters().getGreen_energy_Number_devices().setText("" + nb + 1);

				Application.getRightPane().getSystem_Counters().getGreen_energy_Number_devices().setText("" + (nb + 1));

			} else if (Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals(Application
					.getOntologyIndividualsModel().getOntologyModelGIS().getGas_turbine().getBrowserText())) {

				NormalDevice NormalDevice = new NormalDevice(deviceName,
						Application.getMainPane().getCreateIndividual().getTypeofcreateind(), Pos, 50, 50, Application);

				NormalDevice.MakeAction(device_State, "");

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(NormalDevice.getDeviceobject());

				Application.getOntologyIndividualsModel().CreateIndividual(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getGas_turbine(), NormalDevice);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State(),
						device_State);

			} else if (Application.getMainPane().getCreateIndividual().getTypeofcreateind()

					.equals(Application.getOntologyIndividualsModel().getOntologyModelGIS().getElectricity_Generator()
							.getBrowserText())) {

				NormalDevice NormalDevice = new NormalDevice(deviceName,
						Application.getMainPane().getCreateIndividual().getTypeofcreateind(), Pos, 50, 50, Application);

				NormalDevice.MakeAction(device_State, "");

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(NormalDevice.getDeviceobject());

				Application.getOntologyIndividualsModel().CreateIndividual(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getElectricity_Generator(),
						NormalDevice);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State(),
						device_State);

			}
			// --------------------------------------------------------------------------------------------------------------
			Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_Name(), deviceName);

			Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_Watts_Consuming(),
					device_consuming);

			Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_Protocol(),
					device_protocol);

			Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(deviceName,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_Values(), davice_vall);

			Application.getOntologyIndividualsModel().AddOWLObjectProperty(device_zone,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlace_HasAppliance(),
					deviceName);

			Application.getOntologyIndividualsModel().AddOWLObjectProperty(deviceName,
					Application.getOntologyIndividualsModel().getOntologyModelGIS().getAppliance_LocateInPlace(),
					OntologyIndividuals.getOntologyIndividualsId());

			if (device_State.equals("on")) {
				Application.setNeed_of_All_devices_consumation(
						Application.getNeed_of_All_devices_consumation() + Integer.valueOf(device_consuming));
			}
			// ******************************************************* Create
			// Actor
			// *************************************************************************************

		} else if (event.getSource() == Application.getMainPane().getCreateIndividual().getButton_CreatActor()) {

			String name = Application.getMainPane().getCreateIndividual().getFirst_Name_of_ind_txf().getText();
			String birthday = Application.getMainPane().getCreateIndividual().getBirthday_of_ind_txf().getValue()
					.toString();
			String email = Application.getMainPane().getCreateIndividual().getEmail_of_ind_txf().getText();
			String phone_number = Application.getMainPane().getCreateIndividual().getPhone_of_ind_txf().getText();
			String sex = Application.getMainPane().getCreateIndividual().getSex_of_ind_txf().getValue().toString();
			String state = Application.getMainPane().getCreateIndividual().getState_of_ind_txf().getValue().toString();
			String Ownerzone = Application.getMainPane().getCreateIndividual().getShooseZones().getValue().toString();

			Notifier.INSTANCE.notifySuccess("Success", words[189] + " : " + name);

			String Pos = null;

			for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);

				OntologyIndividuals = Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i);

				List<String> l23 = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l23, "Zone")
						&& OntologyIndividuals.getOntologyIndividualsId().equals(Ownerzone)) {

					Pos = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
							OntologyIndividuals.getOntologyIndividualsId(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getZone_VectoreXY());

					break;
				}

			}
			// .ln("name = " + name);

			if (Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Grandmother")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Grandfather")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Mother")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Father")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Sister")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Brother")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Family")

			) {

				Actors Humans = new Actors(name, Application.getMainPane().getCreateIndividual().getTypeofcreateind(),
						Pos, 40, 80);
				Application.getOntologyIndividualsModel()
						.CreateIndividual(name, Application.getOntologyIndividualsModel().getOntologyModelGIS()
								.getOWLNamedClass(Application.getMainPane().getCreateIndividual().getTypeofcreateind()),
								Humans);

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_First_Name(), name);

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Last_Name(),
						Application.getMainPane().getCreateIndividual().getTypeofcreateind());

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Birthday(), birthday);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Email(), email);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Phone_Number(),
						phone_number);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Gender(), sex);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHasState(), state);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(Ownerzone,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceOwnBy(), name);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_LocateInPlace(),
						Ownerzone);

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(Humans.getHumanobject());

				for (int i = 0; i < Application.getMainPane().getCreateIndividual().getActivity_Vbox().getChildren()
						.size(); i++) {
					ActivityActor ActivityActor = (MainPanes.ActivityActor) Application.getMainPane()
							.getCreateIndividual().getActivity_Vbox().getChildren().get(i);

					Application.getOntologyIndividualsModel().CreateIndividual(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity(), Humans);

					Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Has_Activity(),
							ActivityActor.getActivity_Name().getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Name(),
							ActivityActor.getActivity_Name().getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Description(),
							ActivityActor.getActivity_descreption().getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Type(),
							ActivityActor.getActivity_type().getValue().toString());

					SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");
					Date now = new Date();
					String strDate = sdfDate.format(now);

					Application.getOntologyIndividualsModel().CreateIndividual("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime(),
							new OtherOutPutIindividual());

					String time = ActivityActor.getCheckInDatePicker().getValue().toString() + "|"

							+ ActivityActor.getMin().getValue().toString();
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime_Second(), time);

					Application.getOntologyIndividualsModel()
							.AddOWLObjectProperty(ActivityActor.getActivity_Name().getText(), Application
									.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_HasBeginTime(),
									"Time" + i + "|" + strDate);

					Application.getOntologyIndividualsModel().CreateIndividual(
							"Action-" + ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTurn_On_Action(),
							new OtherOutPutIindividual());

					Application.getOntologyIndividualsModel().AddOWLObjectProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Has_Actions(),
							"Action-" + ActivityActor.getActivity_Name().getText());

					for (int z = 0; z < ActivityActor.getRootItem().getChildren().size(); z++) {
						try {
							CheckBoxTreeItem<String> checkBoxTreeItem = (CheckBoxTreeItem<String>) ActivityActor
									.getRootItem().getChildren().get(z);

							if (checkBoxTreeItem.isSelected()) {

								Application.getOntologyIndividualsModel()
										.AddOWLObjectProperty("Action-" + ActivityActor.getActivity_Name().getText(),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getAction_EffectIn_Device(),
												checkBoxTreeItem.getValue().toString());
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}

				// **********************************************************************************************************************************************

			} else if (Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Cats")
					|| Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("Dogs")) {
				Actors pets = new Actors(name, Application.getMainPane().getCreateIndividual().getTypeofcreateind(),
						Pos, 50, 50);
				Application.getOntologyIndividualsModel().CreateIndividual(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getPets(), pets);

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Last_Name(),
						Application.getMainPane().getCreateIndividual().getTypeofcreateind());

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_First_Name(), name);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Birthday(), birthday);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Email(), email);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Phone_Number(),
						phone_number);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Gender(), sex);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHasState(), state);
				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceOwnBy(), Ownerzone);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_LocateInPlace(),
						Ownerzone);

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(pets.getHumanobject());

				for (int i = 0; i < Application.getMainPane().getCreateIndividual().getActivity_Vbox().getChildren()
						.size(); i++) {
					ActivityActor ActivityActor = (MainPanes.ActivityActor) Application.getMainPane()
							.getCreateIndividual().getActivity_Vbox().getChildren().get(i);
					Application.getOntologyIndividualsModel().CreateIndividual(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity(), pets);

					Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Has_Activity(),
							ActivityActor.getActivity_Name().getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Name(),
							ActivityActor.getActivity_Name().getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Description(),
							ActivityActor.getActivity_descreption().getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Type(),
							ActivityActor.getActivity_type().getValue().toString());

					SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");
					Date now = new Date();
					String strDate = sdfDate.format(now);

					Application.getOntologyIndividualsModel().CreateIndividual("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime(),
							new OtherOutPutIindividual());

					String time = ActivityActor.getCheckInDatePicker().getValue().toString() + "|"
							+ ActivityActor.getHours().getValue().toString() + "|"
							+ ActivityActor.getMin().getValue().toString();
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime_Second(), time);

					Application.getOntologyIndividualsModel()
							.AddOWLObjectProperty(ActivityActor.getActivity_Name().getText(), Application
									.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_HasBeginTime(),
									"Time" + i + "|" + strDate);

					Application.getOntologyIndividualsModel().CreateIndividual(
							"Action-" + ActivityActor.getActivity_Name(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTurn_On_Action(),
							new OtherOutPutIindividual());

					Application.getOntologyIndividualsModel()
							.AddOWLObjectProperty(ActivityActor.getActivity_Name().getText(), Application
									.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Has_Actions(),
									"Action-" + ActivityActor.getActivity_Name());

					for (int z = 0; z < ActivityActor.getRootItem().getChildren().size(); z++) {
						try {
							CheckBoxTreeItem<String> checkBoxTreeItem = (CheckBoxTreeItem<String>) ActivityActor
									.getRootItem().getChildren().get(z);

							if (checkBoxTreeItem.isSelected()) {

								Application.getOntologyIndividualsModel()
										.AddOWLObjectProperty("Action-" + ActivityActor.getActivity_Name(),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getAction_EffectIn_Device(),
												checkBoxTreeItem.getValue().toString());
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
				// ****************************************************************************************************************************************

			} else if (Application.getMainPane().getCreateIndividual().getTypeofcreateind().equals("missionRobot")) {
				Actors Robot = new Actors(name, Application.getMainPane().getCreateIndividual().getTypeofcreateind(),
						Pos, 50, 50);
				Application.getOntologyIndividualsModel().CreateIndividual(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getRobot(), Robot);

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Last_Name(),
						Application.getMainPane().getCreateIndividual().getTypeofcreateind());

				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_First_Name(), name);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Birthday(), birthday);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Email(), email);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Phone_Number(),
						phone_number);
				Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Gender(), sex);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHasState(), state);
				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getPlaceOwnBy(), Ownerzone);

				Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
						Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_LocateInPlace(),
						Ownerzone);

				Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
						.add(Robot.getHumanobject());

				for (int i = 0; i < Application.getMainPane().getCreateIndividual().getActivity_Vbox().getChildren()
						.size(); i++) {
					ActivityActor ActivityActor = (MainPanes.ActivityActor) Application.getMainPane()
							.getCreateIndividual().getActivity_Vbox().getChildren().get(i);
					Application.getOntologyIndividualsModel().CreateIndividual(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity(), Robot);

					Application.getOntologyIndividualsModel().AddOWLObjectProperty(name,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Has_Activity(),
							ActivityActor.getActivity_Name().getText());

					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Name(),
							ActivityActor.getActivity_Name().getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Description(),
							ActivityActor.getActivity_descreption().getText());
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty(
							ActivityActor.getActivity_Name().getText(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Type(),
							ActivityActor.getActivity_type().getValue().toString());

					SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd|HH:mm:ss");
					Date now = new Date();
					String strDate = sdfDate.format(now);

					Application.getOntologyIndividualsModel().CreateIndividual("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime(),
							new OtherOutPutIindividual());

					String time = ActivityActor.getCheckInDatePicker().getValue().toString() + "|"
							+ ActivityActor.getHours().getValue().toString() + "|"
							+ ActivityActor.getMin().getValue().toString();
					Application.getOntologyIndividualsModel().AddOWLDatatypeProperty("Time" + i + "|" + strDate,
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTime_Second(), time);

					Application.getOntologyIndividualsModel()
							.AddOWLObjectProperty(ActivityActor.getActivity_Name().getText(), Application
									.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_HasBeginTime(),
									"Time" + i + "|" + strDate);

					Application.getOntologyIndividualsModel().CreateIndividual(
							"Action-" + ActivityActor.getActivity_Name(),
							Application.getOntologyIndividualsModel().getOntologyModelGIS().getTurn_On_Action(),
							new OtherOutPutIindividual());

					Application.getOntologyIndividualsModel()
							.AddOWLObjectProperty(ActivityActor.getActivity_Name().getText(), Application
									.getOntologyIndividualsModel().getOntologyModelGIS().getActivity_Has_Actions(),
									"Action-" + ActivityActor.getActivity_Name());

					for (int z = 0; z < ActivityActor.getRootItem().getChildren().size(); z++) {
						try {
							CheckBoxTreeItem<String> checkBoxTreeItem = (CheckBoxTreeItem<String>) ActivityActor
									.getRootItem().getChildren().get(z);

							if (checkBoxTreeItem.isSelected()) {

								Application.getOntologyIndividualsModel()
										.AddOWLObjectProperty("Action-" + ActivityActor.getActivity_Name(),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getAction_EffectIn_Device(),
												checkBoxTreeItem.getValue().toString());
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
			}

			/**
			 * *****************************************************************
			 * ***************************************************************** **********
			 */
		} else // --------------- add activitys to vbos
				// ----------------------------------------
		if (event.getSource() == Application.getMainPane().getCreateIndividual().getAddActivity()) {
			ActivityActor ActivityActor = new ActivityActor();
			int i = 0;
			while (i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size()) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);
				List<String> l = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l, "DeviceConsumeEnergy")) {

					final CheckBoxTreeItem<String> checkBoxTreeItem = new CheckBoxTreeItem<String>(
							OntologyIndividuals.getOntologyIndividualsId());

					File f1 = new File("icons//" + OntologyIndividuals.getOWLIndividualRDFType() + ".png");
					Image ii = new Image(f1.toURI().toString());
					ImageView selectedImage = new ImageView();
					selectedImage.setImage(ii);
					selectedImage.setFitHeight(25);
					selectedImage.setFitWidth(25);
					checkBoxTreeItem.setGraphic(selectedImage);
					ActivityActor.getRootItem().getChildren().add(checkBoxTreeItem);
				}

				i = i + 1;
			}
			;

			Application.getMainPane().getCreateIndividual().getActivity_Vbox().getChildren().add(ActivityActor);

			// *************************************************** show
			// simulator
			// **********************************************************************
		} else if (event.getSource() == Application.getRightPane().getAbout_GIS_Button()) {
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());
			}

		} else
		// ============================================================================================================================
		if (event.getSource() == Application.getRightPane().getCreate_sin()
				|| event.getSource() == Application.getTopPane().getCreate_senario()) {
			if (TabExist(Application.getMainPane().getCreateScenario())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getCreateScenario());
			}
		} else // **************************************************************************************************************************
		if (event.getSource() == Application.getMainPane().getCreateScenario().getAddScenario()) {
			ScenarioItems ScenarioItems = new ScenarioItems(Application,
					Application.getMainPane().getCreateScenario().getListeOfScenario());
			for (int z = 0; z < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); z++) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(z);
				List<String> l = Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				for (int j = 0; j < l.size(); j++) {

					if (l.get(j) != null && l.get(j).equals("Devices")) {
						final CheckBoxTreeItem<String> checkBoxTreeItem = new CheckBoxTreeItem<String>(
								OntologyIndividuals.getOntologyIndividualsId());

						File f1 = new File("icons//" + OntologyIndividuals.getOWLIndividualRDFType() + ".png");
						Image ii = new Image(f1.toURI().toString());
						ImageView selectedImage = new ImageView();
						selectedImage.setImage(ii);
						selectedImage.setFitHeight(25);
						selectedImage.setFitWidth(25);
						checkBoxTreeItem.setGraphic(selectedImage);

						ScenarioItems.getListeOfTurnOn().getChildren().add(checkBoxTreeItem);

						final CheckBoxTreeItem<String> checkBoxTreeItem2 = new CheckBoxTreeItem<String>(
								OntologyIndividuals.getOntologyIndividualsId());

						f1 = new File("icons//" + OntologyIndividuals.getOWLIndividualRDFType() + ".png");
						ii = new Image(f1.toURI().toString());
						ImageView selectedImage2 = new ImageView();
						selectedImage2.setImage(ii);
						selectedImage2.setFitHeight(25);
						selectedImage2.setFitWidth(25);
						checkBoxTreeItem2.setGraphic(selectedImage2);

						ScenarioItems.getListeOfTurnOff().getChildren().add(checkBoxTreeItem2);
						// ScenarioItems.setPrefSize(500, 700);
						ScenarioItems.setMaxSize(500, 700);
					}

				}
			}
			Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren().add(ScenarioItems);

		} else
		// *********************************************************************************************************************
		if (event.getSource() == Application.getRightPane().getDelete_sin()) {
			if (TabExist(Application.getMainPane().getCreateScenario())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getCreateScenario());
			}
			try {

				Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren().remove(0,
						Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren().size());
			} catch (Exception e) {

			}
		} else
		// *********************************************************************************************************************
		if (event.getSource() == Application.getRightPane().getSelect_sin()) {
			if (TabExist(Application.getMainPane().getCreateScenario())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getCreateScenario());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getCreateScenario());
			}
			try {
				for (int i = 0; i < Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren()
						.size(); i++) {
					ScenarioItems ScenarioItems = (ScenarioItems) Application.getMainPane().getCreateScenario()
							.getListeOfScenario().getChildren().get(i);
					ScenarioItems.getIsSelected().setSelected(true);
				}

			} catch (Exception e) {

			}
		}

		else
		// *********************************************************************************************************************
		if (event.getSource() == Application.getRightPane().getStats_sim()) {
			if (TabExist(Application.getMainPane().getStats())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getStats());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getStats());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getStats());
			}
			/*
			 * String[] scenario = { "scenario 1", "scenario 2", "scenario 3", "scenario 4",
			 * "scenario 5", "scenario 6", "scenario 7" }; CategoryAxis xAxis = new
			 * CategoryAxis();
			 * xAxis.setCategories(FXCollections.<String>observableArrayList(scenario));
			 * NumberAxis yAxis = new NumberAxis("Energy Consumption Level", 0.0d, 15000d,
			 * 1000.0d); ObservableList<BarChart.Series> barChartData =
			 * FXCollections.observableArrayList(
			 *
			 * new BarChart.Series("Normal energy consumption",
			 * FXCollections.observableArrayList( new BarChart.Data(scenario[0], 10524), new
			 * BarChart.Data(scenario[1], 13666), new BarChart.Data(scenario[2], 13981), new
			 * BarChart.Data(scenario[3], 10684), new BarChart.Data(scenario[4], 10229), new
			 * BarChart.Data(scenario[5], 9853), new BarChart.Data(scenario[6], 9022))),
			 *
			 * new BarChart.Series("under control our ontology-based system",
			 * FXCollections.observableArrayList( new BarChart.Data(scenario[0], 8385), new
			 * BarChart.Data(scenario[1], 9111), new BarChart.Data(scenario[2], 10297), new
			 * BarChart.Data(scenario[3], 6693), new BarChart.Data(scenario[4], 7646), new
			 * BarChart.Data(scenario[5], 6093), new BarChart.Data(scenario[6], 6021)))
			 *
			 *
			 * );
			 *
			 * BarChart chart = new BarChart(xAxis, yAxis, barChartData, 25.0d);
			 * chart.setAnimated(true); //chart.setCache(true); chart.setCenterShape(true);
			 *
			 * Application.getMainPane().getStats().getMainpane().setCenter(chart);
			 */
			/*
			 * //---------------------------------------------------------------------------
			 * --------
			 */
			XYChart.Series<Number, Number> scenario1;
			XYChart.Series<Number, Number> scenario2;
			XYChart.Series<Number, Number> scenario3;
			XYChart.Series<Number, Number> scenario4;
			NumberAxis xAxis;

			AreaChart<Number, Number> lc;
			xAxis = new NumberAxis(0, Application.getSimulation_Model_Layers().getSimulation_Results().get(0)
					.getEnergy_Consumption_Of_Devices().size() - 1, 1);
			final NumberAxis yAxis = new NumberAxis(0, 1200, 50);
			lc = new AreaChart<Number, Number>(xAxis, yAxis); // setup chart
			lc.setCreateSymbols(true);

			lc.setAnimated(true);
			lc.setLegendVisible(true);
			xAxis.setLabel("Time");
			xAxis.setForceZeroInRange(true);
			yAxis.setLabel("values");
			yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis, " Waat ", null));

			scenario1 = new XYChart.Series<Number, Number>();
			scenario1.setName("scenario 1");

			scenario2 = new XYChart.Series<Number, Number>();
			scenario2.setName("scenario 2");

			scenario3 = new XYChart.Series<Number, Number>();
			scenario3.setName("scenario 3");

			scenario4 = new XYChart.Series<Number, Number>();
			scenario4.setName("scenario 4");

			lc.getData().add(scenario1);

			lc.getData().add(scenario2);
			lc.getData().add(scenario3);
			lc.getData().add(scenario4);

			int x11 = 0;
			// ---------------------------------------------------------------------------
			/*
			 * float red = 0f; float blue = 0f; float green = 0; float yellow = 0; Random
			 * rand = new Random(); for (int i = 0; i < 24; i++) {
			 *
			 * int random = 0;
			 *
			 * int x1 = rand.nextInt(1000); red += x1; Normation_energy.getData().add(new
			 * XYChart.Data<Number, Number>(i, x1));
			 *
			 * if (random == 0) {
			 *
			 * int x2 = rand.nextInt(x1 + 1); if (x1 / x2 > 2) { blue += x2;
			 * active.getData().add(new XYChart.Data<Number, Number>(i, x2)); } else { blue
			 * += x1 - 20; active.getData().add(new XYChart.Data<Number, Number>(i, x1 -
			 * 20));
			 *
			 * }
			 *
			 * int x3 = rand.nextInt(x2 + 1); green += x3 + 200; ICABEMS.getData().add(new
			 * XYChart.Data<Number, Number>(i, x3 + 200));
			 *
			 * int x4 = rand.nextInt(x1 + 1); if (x4 >= x3) { Passive.getData().add(new
			 * XYChart.Data<Number, Number>(i, x4)); yellow += x4; } else {
			 * Passive.getData().add(new XYChart.Data<Number, Number>(i, x1)); yellow += x1;
			 * } random = rand.nextInt(24); x11 = x1; } else { random = random - 1; red =
			 * x11; blue = x11; yellow = x11; green = x11; } }
			 *
			 */
			float red = 0f;
			float blue = 0f;
			float green = 0;
			float yellow = 0;

			for (int i = 1; i < Application.getSimulation_Model_Layers().getSimulation_Results().get(0)
					.getEnergy_Consumption_Of_Devices().size(); i++) {

				scenario1.getData().add(new XYChart.Data<Number, Number>(i - 1, Application.getSimulation_Model_Layers()
						.getSimulation_Results().get(0).getEnergy_Consumption_Of_Devices().get(i)));
				red += Application.getSimulation_Model_Layers().getSimulation_Results().get(0)
						.getEnergy_Consumption_Of_Devices().get(i);

				scenario2.getData().add(new XYChart.Data<Number, Number>(i - 1, Application.getSimulation_Model_Layers()
						.getSimulation_Results().get(1).getEnergy_Consumption_Of_Devices().get(i)));
				yellow += Application.getSimulation_Model_Layers().getSimulation_Results().get(1)
						.getEnergy_Consumption_Of_Devices().get(i);

				scenario3.getData().add(new XYChart.Data<Number, Number>(i - 1, Application.getSimulation_Model_Layers()
						.getSimulation_Results().get(2).getEnergy_Consumption_Of_Devices().get(i)));
				blue += Application.getSimulation_Model_Layers().getSimulation_Results().get(2)
						.getEnergy_Consumption_Of_Devices().get(i);

				scenario4.getData().add(new XYChart.Data<Number, Number>(i - 1, Application.getSimulation_Model_Layers()
						.getSimulation_Results().get(3).getEnergy_Consumption_Of_Devices().get(i)));
				green += Application.getSimulation_Model_Layers().getSimulation_Results().get(3)
						.getEnergy_Consumption_Of_Devices().get(i);

			}

			Application.getMainPane().getStats().getNormal().setText(+red + " KW");

			Application.getMainPane().getStats().getpassive().setText(blue + " KW");

			Application.getMainPane().getStats().getactive().setText(yellow + " KW");

			Application.getMainPane().getStats().getica_bems().setText(green + " KW");

			Application.getMainPane().getStats().getMainpane().setCenter(lc);

			Application.getRightPane().getSystem_Counters().getGreen_energy_vall().setText(red + "");
			Application.getRightPane().getSystem_Counters().getGreen_energy_Number_devices().setText(red + "");
			Application.getRightPane().getSystem_Counters().getTimeSystem().setText(red + "");

			// private Text Green_energy_vall; // private Text
			// Green_energy_Number_devices; // // private Text contaminated_Energy_vall; //
			// private Text contaminated_Energy_number_devices;

			// private Text weather_sun_ligt;

			// private Text TimeSystem;

		} else
		// *********************************************************************************************************************
		if (event.getSource() == Application.getRightPane().getStart_sim()
				|| event.getSource() == Application.getTopPane().getEcecute_senario()) {

			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());
			}

			try {

				Application.getStart_Stop_Result_Senactio().Start();
				// getSimulator

			} catch (Exception e) {

			}
			// --------------------------------------------------------------------------------------------------------------------
		} else if (event.getSource() == Application.getTopPane().getNew_Simulator()) {
			try {
				Application.RestSystem();
				Application.stop();

				Application.getPrimaryStage().close();

				Application.stop();
				// Application.start(new Stage());

				Main m = new Main();
				m.start(new Stage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// **********************************************************************************
		// *************************************************** save senario //
		// **********************************************************************************
		else if (event.getSource() == Application.getTopPane().getSave_Simulator()) {

			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Save");

			File file = fileChooser.showSaveDialog(Application.getPrimaryStage());

			FileTxtManagmentGIS.creat_file(file.getAbsoluteFile().toString() + ".txt");
			FileTxtManagmentGIS.creat_file(file.getAbsoluteFile().toString() + "Scenario.txt");

			List<String> StrFile;
			StrFile = new ArrayList<String>();
			// -----------------------------------------------------------------------
			// -------------------------------------------------------------------------

			StrFile.add("<Map> <" + Application.getAppMap() + "> <" + Application.getAppMap() + ".png>");

			for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
				OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
						.getOntologyIndividuals().get(i);

				String Individual = new String();
				Individual += "<Class> <" + OntologyIndividuals.getOWLIndividualRDFType() + "> " + "<"
						+ OntologyIndividuals.getOntologyIndividualsId() + "> ";
				for (int o = 0; o < OntologyIndividuals.getOWLDatatypeProperty().size(); o++) {

					Individual += " <DataTypeProperty> <"
							+ OntologyIndividuals.getOWLDatatypeProperty().get(o).getOWLDatatypePropertyType() + ">";
					Individual += " <"
							+ OntologyIndividuals.getOWLDatatypeProperty().get(o).getOWLDatatypePropertyValues() + ">";
				}

				for (int o = 0; o < OntologyIndividuals.getOWLObjectProperty().size(); o++) {

					Individual += " <ObjectProperty> <"
							+ OntologyIndividuals.getOWLObjectProperty().get(o).getType().getBrowserText() + "> <" +

							OntologyIndividuals.getOWLObjectProperty().get(o).getDomain() + ">";
					Individual += " <" + OntologyIndividuals.getOWLObjectProperty().get(o).getRange() + ">";
				}

				StrFile.add(Individual);
			}

			FileTxtManagmentGIS.Write_in_file(file.getAbsoluteFile().toString() + ".txt", StrFile);

			List<String> StrSinario;
			StrSinario = new ArrayList<String>();

			String StrSinarioLine = "";
			for (int i = 0; i < Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren()
					.size(); i++) {

				ScenarioItems ScenarioItems = (ScenarioItems) Application.getMainPane().getCreateScenario()
						.getListeOfScenario().getChildren().get(i);

				StrSinarioLine = "<" + i + "> " + "<Scenario> " + "<Senario Selection> " + "<"
						+ ScenarioItems.getIsSelected().isSelected() + "> " + "<Grid Energy> " + "<"
						+ ScenarioItems.getEnergy_Grid_Source().isSelected() + "> " + "<Sun Light> " + "<"
						+ Integer.valueOf((int) ScenarioItems.getOpacityLevelLight().getValue()) + "> "
						+ "<Temperature> " + "<"
						+ Integer.valueOf((int) ScenarioItems.getOpacityLevelTempr().getValue()) + "> " + "<Time> "
						+ "<" + Integer.valueOf((int) ScenarioItems.getOpacityLevelDuration().getValue()) + "> ";

				StrSinario.add(StrSinarioLine);

				StrSinarioLine = "<Turn_Off_Action> ";

				for (int j = 0; j < ScenarioItems.getListeOfTurnOff().getChildren().size(); j++) {

					final CheckBoxTreeItem<String> checkBoxTreeItem2 = (CheckBoxTreeItem<String>) ScenarioItems
							.getListeOfTurnOff().getChildren().get(j);
					if (checkBoxTreeItem2.isSelected()) {
						StrSinarioLine += "<" + checkBoxTreeItem2.getValue() + "> ";
					}
				}

				StrSinario.add(StrSinarioLine);

				StrSinarioLine = "<Turn_On_Action> ";
				for (int j = 0; j < ScenarioItems.getListeOfTurnOn().getChildren().size(); j++) {

					final CheckBoxTreeItem<String> checkBoxTreeItem2 = (CheckBoxTreeItem<String>) ScenarioItems
							.getListeOfTurnOn().getChildren().get(j);
					if (checkBoxTreeItem2.isSelected()) {
						StrSinarioLine += "<" + checkBoxTreeItem2.getValue() + "> ";
					}
				}

				StrSinario.add(StrSinarioLine);

				for (int j = 0; j < ScenarioItems.getListeOfMoving().getChildren().size(); j++) {
					StrSinarioLine = "<Moving-Actions> ";
					ScenarioItems.ListeOfMovingclass ListeOfMovingclass = (ScenarioItems.ListeOfMovingclass) ScenarioItems
							.getListeOfMoving().getChildren().get(j);
					StrSinarioLine += "<Actor> " + "<" + ListeOfMovingclass.getActor().getValue() + "> ";
					StrSinarioLine += "<Zone> " + "<" + ListeOfMovingclass.getZones().getValue() + "> ";
					StrSinarioLine += "<Activity> " + "<" + ListeOfMovingclass.getActivitys().getValue() + "> ";

					StrSinario.add(StrSinarioLine);
				}

				for (int j = 0; j < ScenarioItems.getListeOfProperty().getChildren().size(); j++) {
					StrSinarioLine = "<Property-Change> ";

					ScenarioItems.ListeOfOWLDataTypeProperty ListeOfOWLDataTypeProperty = (ScenarioItems.ListeOfOWLDataTypeProperty) ScenarioItems
							.getListeOfProperty().getChildren().get(j);

					StrSinarioLine += "<Property> " + "<" + ListeOfOWLDataTypeProperty.getPropertyList().getValue()
							+ "> ";
					StrSinarioLine += "<Propertyval> " + "<" + ListeOfOWLDataTypeProperty.getPropertyval().getText()
							+ "> ";
					StrSinarioLine += "<Individual> " + "<" + ListeOfOWLDataTypeProperty.getIndList().getValue() + "> ";

					StrSinario.add(StrSinarioLine);
				}

				for (int j = 0; j < ScenarioItems.getListeOfRemoveObjectProperty().getChildren().size(); j++) {
					StrSinarioLine = "<Remove-ObjectProperty> ";

					ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty = (ScenarioItems.ListeOfOWLObjectProperty) ScenarioItems
							.getListeOfRemoveObjectProperty().getChildren().get(j);

					StrSinarioLine += "<ObjectProperty> " + "<"
							+ ListeOfOWLObjectProperty.getObjectProperty().getValue() + "> ";
					StrSinarioLine += "<Domain> " + "<" + ListeOfOWLObjectProperty.getDomain().getValue() + "> ";
					StrSinarioLine += "<Rang> " + "<" + ListeOfOWLObjectProperty.getRang().getValue() + "> ";

					StrSinario.add(StrSinarioLine);
				}

				for (int j = 0; j < ScenarioItems.getListeOfObjectProperty().getChildren().size(); j++) {
					StrSinarioLine = "<Add-ObjectProperty> ";

					ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty = (ScenarioItems.ListeOfOWLObjectProperty) ScenarioItems
							.getListeOfObjectProperty().getChildren().get(j);

					StrSinarioLine += "<ObjectProperty> " + "<"
							+ ListeOfOWLObjectProperty.getObjectProperty().getValue() + "> ";
					StrSinarioLine += "<Domain> " + "<" + ListeOfOWLObjectProperty.getDomain().getValue() + "> ";
					StrSinarioLine += "<Rang> " + "<" + ListeOfOWLObjectProperty.getRang().getValue() + "> ";

					StrSinario.add(StrSinarioLine);
				}

				FileTxtManagmentGIS.Write_in_file(file.getAbsoluteFile().toString() + "Scenario.txt", StrSinario);

			}

			// ======================================================== Import File of
			// Simulation :) ======================================================

			// ********************************************************** import
			// senario
			// **********************************************************************************
		} else if (event.getSource() == Application.getTopPane().getLoad_Simulator()) {
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());
			}

			Save_Import_Ontology.Import_Smart_Home_Model();

		} else if (event.getSource() == Application.getTopPane().getLoad_Senario()) {
			if (TabExist(Application.getMainPane().getSimulator())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSimulator());
				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSimulator());
			}

			Save_Import_Ontology.import_Secnario(Application);

		}

		if (event.getSource() == Application.getRightPane().getShowOnto()) {

			if (TabExist(Application.getMainPane().getShowOntology())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getShowOntology());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getShowOntology());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getShowOntology());

			}

			// Application.getSimulation_Model_Layers().getSimulation_Models().get(0).desplay_ontology(Application.getMainPane().getShowOntology().getTextArea());

			Application.getOntologyIndividualsModel()
					.desplay_ontology(Application.getMainPane().getShowOntology().getTextArea());
			// ==================================================================================================================
		}
		if (event.getSource() == Application.getRightPane().getEditRules()) {

			if (TabExist(Application.getMainPane().getSWRLtab())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSWRLtab());
			} else {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getSWRLtab());

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getSWRLtab());

			}

			// Application.getSimulation_Model_Layers().getSimulation_Models().get(0).desplay_ontology(Application.getMainPane().getShowOntology().getTextArea());

			Application.getOntologyIndividualsModel()
					.desplay_ontology(Application.getMainPane().getShowOntology().getTextArea());

		}
		// ========================== Edit Ontology Tab
		// ============================================================

		else if (event.getSource() == Application.getRightPane().getEdditeOnto()) {

			if (TabExist(Application.getMainPane().getEditOntology())) {
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getEditOntology());

			} else {

				Application.getMainPane().getMainPane().getTabs().add(Application.getMainPane().getEditOntology());
				// System.out.println("---------------------------------- 1 ");
				Application.getMainPane().getEditOntology().getClassList().getItems().removeAll();
				// System.out.println("---------------------------------- 2 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getOWLNamedClass_OpenSBSList().size(); i++) {

					Application.getMainPane().getEditOntology().getClassList().getItems()
							.add(Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getOWLNamedClass_OpenSBSList().get(i).getBrowserText());
				}
				// System.out.println("---------------------------------- 3 ");
				Application.getMainPane().getEditOntology().getIndList().getItems().removeAll();
				// System.out.println("---------------------------------- 4 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
					Application.getMainPane().getEditOntology().getIndList().getItems().add(Application
							.getOntologyIndividualsModel().getOntologyIndividuals().get(i).getOntologyIndividualsId());
				}
				// System.out.println("---------------------------------- 5 ");
				Application.getMainPane().getEditOntology().getPropertyList().getItems().removeAll();
				// System.out.println("---------------------------------- 6 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getOWLDatatypeProperty_OpenSBSList().size(); i++) {
					Application.getMainPane().getEditOntology().getPropertyList().getItems()
							.add(Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getOWLDatatypeProperty_OpenSBSList().get(i).getBrowserText());
				}
				// System.out.println("---------------------------------- 7 ");
				Application.getMainPane().getEditOntology().getObecjtPropertyList().getItems().removeAll();
				// System.out.println("---------------------------------- 8 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyModelGIS()
						.getOWLObjectProperty_OpenSBSList().size(); i++) {
					Application.getMainPane().getEditOntology().getObecjtPropertyList().getItems()
							.add(Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getOWLObjectProperty_OpenSBSList().get(i).getBrowserText());
				}
				// System.out.println("---------------------------------- 9 ");
				Application.getMainPane().getEditOntology().getRang().getItems().removeAll();
				// System.out.println("---------------------------------- 10 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
					Application.getMainPane().getEditOntology().getRang().getItems().add(Application
							.getOntologyIndividualsModel().getOntologyIndividuals().get(i).getOntologyIndividualsId());
				}
				// System.out.println("---------------------------------- 11 ");
				Application.getMainPane().getEditOntology().getDomain().getItems().removeAll();
				// System.out.println("---------------------------------- 12 ");
				for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
					Application.getMainPane().getEditOntology().getDomain().getItems().add(Application
							.getOntologyIndividualsModel().getOntologyIndividuals().get(i).getOntologyIndividualsId());
				}
				// System.out.println("---------------------------------- 13 ");
				Application.getMainPane().getMainPane().getSelectionModel()
						.select(Application.getMainPane().getEditOntology());
				// System.out.println("---------------------------------- 14 ");
			}

			// ================================= Create new Ontology Individual
			// ===================

		} else if (event.getSource() == Application.getMainPane().getEditOntology().getCreateind()) {
			OtherOutPutIindividual OtherOutPutIindividual = new OtherOutPutIindividual();

			Application.getOntologyIndividualsModel().CreateIndividual(
					Application.getMainPane().getEditOntology().getIndName().getText().toString(),
					Application.getOntologyIndividualsModel().getOntologyModelGIS()
							.getOWLNamedClass(Application.getMainPane().getEditOntology().getClassList().getValue()),
					OtherOutPutIindividual);

			Notifier.INSTANCE.notifySuccess("Success", "The individual: \n "
					+ Application.getMainPane().getEditOntology().getClassList().getValue() + "Has Been Created");

			Application.getMainPane().getEditOntology().getIndList().getItems()
					.add(Application.getMainPane().getEditOntology().getIndName().getText().toString());
			Application.getMainPane().getEditOntology().getDomain().getItems()
					.add(Application.getMainPane().getEditOntology().getIndName().getText().toString());
			Application.getMainPane().getEditOntology().getRang().getItems()
					.add(Application.getMainPane().getEditOntology().getIndName().getText().toString());
			// ================================= Create new Ontology property
			// ===================

		} else if (event.getSource() == Application.getMainPane().getEditOntology().getCreatepro()) {

			for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {

				if (Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i).getOntologyIndividualsId()
						.equals(Application.getMainPane().getEditOntology().getIndList().getValue().toString())) {

					Application.getOntologyIndividualsModel()
							.AddOWLDatatypeProperty(
									Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
											.getOntologyIndividualsId(),
									Application.getOntologyIndividualsModel().getOntologyModelGIS()
											.getOWLDatatypeProperty_OpenSBSList(Application.getMainPane()
													.getEditOntology().getPropertyList().getValue()),
									Application.getMainPane().getEditOntology().getPropertyval().getText());
					break;

				}

			}
			Notifier.INSTANCE.notifySuccess("Success", "The DatatypeProperty: \n "
					+ Application.getMainPane().getEditOntology().getPropertyName().getText() + "Has Been Created");

		}
		// ================================= Create new Ontology ObjectProperty
		// ===================

		else if (event.getSource() == Application.getMainPane().getEditOntology().getCreateobj()) {

			for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {

				if (Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i).getOntologyIndividualsId()
						.equals(Application.getMainPane().getEditOntology().getRang().getValue().toString())) {

					for (int j = 0; j < Application.getOntologyIndividualsModel().getOntologyIndividuals()
							.size(); j++) {

						if (Application.getOntologyIndividualsModel().getOntologyIndividuals().get(j)
								.getOntologyIndividualsId().equals(Application.getMainPane().getEditOntology()
										.getDomain().getValue().toString())) {

							Application.getOntologyIndividualsModel().AddOWLObjectProperty(
									Application.getOntologyIndividualsModel().getOntologyIndividuals().get(j)
											.getOntologyIndividualsId(),
									Application.getOntologyIndividualsModel().getOntologyModelGIS()
											.getOWLObjectProperty_OpenSBSList(Application.getMainPane()
													.getEditOntology().getObecjtPropertyList().getValue().toString()),
									Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
											.getOntologyIndividualsId());

							break;

						}

					}

				}

			}
			Notifier.INSTANCE.notifySuccess("Success",
					"The ObecjtProperty: \n "
							+ Application.getMainPane().getEditOntology().getObecjtPropertyName().getText()
							+ "Has Been Created");

		} // ==========================================================================================================
			// --------------------------- show dataset
			// --------------------------------------------
			// ==========================================================================================================
		else if (event.getSource() == Application.getRightPane().getShow_dataset()) {

			Task<Integer> task = new Task<Integer>() {
				protected Integer call() throws Exception {
					text = Application.getDataset();
					

					Platform.runLater(new Runnable() {
						public void run() {
							try {
								Application.getRightPane().getSystem_Counters().getProgressBar().setProgress(0.);
								TextArea DynamicTableView = new TextArea();
								DynamicTableView.setPrefSize(900, 600);
								Application.getRightPane().getSystem_Counters().getProgressBar().setProgress(0.5);
								
								Tab t = new Tab("DynamicTableView");
								t.setContent(DynamicTableView);
								Application.getRightPane().getSystem_Counters().getProgressBar().setProgress(0.7);
								
								DynamicTableView.appendText(text);
								
								Application.getMainPane().getMainPane().getTabs().add(t);
								Application.getRightPane().getSystem_Counters().getProgressBar().setProgress(1.);
								
							} catch (Exception e) {

							}
						}
					});

					return null;
				}

			};

			Thread T = new Thread(task);
			T.start();
			// ==========================================================================================================
			// --------------------------- save dataset
			// --------------------------------------------
			// ==========================================================================================================

		} else if (event.getSource() == Application.getRightPane().getExport_dataset()) {

		}

		// ==========================================================================================================
		// ------------------------------------------------ run swrl rules
		// ----------------
		// ==========================================================================================================
		else if (event.getSource() == Application.getMainPane().getSWRLtab().getRun()) {
			System.out.println("------------------------------------------");
			List<String> Items = new ArrayList<String>();
			Items.add(Application.getMainPane().getSWRLtab().getRuleName().getText());
			Items.add(Application.getMainPane().getSWRLtab().getRuleText().getText());
			Application.getMainPane().getSWRLtab().getDynamicTableView_Added().addItems(Items);

			RulesEngenGIS RulesEngenGIS = new RulesEngenGIS(Application.getOntologyIndividualsModel());
			Rule_Result_Model Rule_Result_Model = new Rule_Result_Model();

			SWRL_Rule_Graph SWRL_Rule_Graph = RulesEngenGIS.Build_Rule_Graph(
					Application.getMainPane().getSWRLtab().getRuleText().getText(), Rule_Result_Model);

			/// System.out.println(
			// " Rule_Result_Model.getVariable_Nmaes().size() = " +
			/// Rule_Result_Model.getVariable_Nmaes().size());
			// System.out.println(" SWRL_Rule_Graph.getRule_Result_Model = "
			// + SWRL_Rule_Graph.getRule_Result_Model().getVariable_Nmaes().size());

			// ======================================================================

			DynamicTableView DynamicTableView_Result = new DynamicTableView();
			DynamicTableView_Result.getTableView().setPrefSize(400, 200);
			DynamicTableView_Result.getTableView().setMinHeight(200);

			System.out.println("=========  Column  1 ========");
			List<String> Column = new ArrayList<String>();
			for (int i = 0; i < Rule_Result_Model.getVariable_Nmaes_Final().size(); i++) {
				Column.add(Rule_Result_Model.getVariable_Nmaes_Final().get(i));
				System.out.println(Rule_Result_Model.getVariable_Nmaes_Final().get(i));
			}
			System.out.println("=========  Column  2 ========");
			for (int i = 0; i < Rule_Result_Model.getOther_Variable_Nmaes_Final().size(); i++) {
				Column.add(Rule_Result_Model.getOther_Variable_Nmaes_Final().get(i).toString());
				System.out.println(Rule_Result_Model.getVariable_Nmaes_Final().get(i));

			}

			DynamicTableView_Result.SetColumns(Column);

			int max = getMaxOfResult(Rule_Result_Model);
			// System.out.println("max ="+max);

			for (int i = 0; i < Rule_Result_Model.getAction_list().size(); i++) {
				System.out.println("==========================");
				for (int j = 0; j < Rule_Result_Model.getAction_list().get(i).size(); j++) {
					System.out.print(Rule_Result_Model.getAction_list().get(i).get(j) + " | ");
				}
			}

			for (int i = 0; i < max; i++) {

				List<String> data = new ArrayList<String>();

				for (int jj = 0; jj < Rule_Result_Model.getOntologyIndividuals_Variables_final().size(); jj++) {
					try {
						// System.out.println("Rule_Result_Model.getOntologyIndividuals_Variables().get(jj)
						// = "+Rule_Result_Model.getOntologyIndividuals_Variables().get(jj).size());
						// System.out.println("jj = "+jj + " | i ="+i);
						data.add(Rule_Result_Model.getOntologyIndividuals_Variables_final().get(jj).get(i)
								.getOntologyIndividualsId());

					} catch (Exception e) {
						data.add("-");
					}

				}

				for (int jj = 0; jj < Rule_Result_Model.getOther_Variables_List_Final().size(); jj++) {
					try {
						// System.out.println("Rule_Result_Model.getOntologyIndividuals_Variables().get(jj)
						// = "+Rule_Result_Model.getOntologyIndividuals_Variables().get(jj).size());
						// System.out.println("jj = "+jj + " | i ="+i);
						data.add(Rule_Result_Model.getOther_Variables_List_Final().get(jj).get(i).toString());

					} catch (Exception e) {
						data.add("-");
					}

				}

				DynamicTableView_Result.addItems(data);

				Application.getMainPane().getSWRLtab().getTable().setCenter(DynamicTableView_Result.getTableView());

				// System.out.println("------------------------------------------");

			}

		}

	}

	public int getMaxOfResult(Rule_Result_Model Rule_Result_Model) {

		int x = 0;
		int max = 0;
		for (int i = 0; i < Rule_Result_Model.getOntologyIndividuals_Variables().size(); i++) {

			x = Rule_Result_Model.getOntologyIndividuals_Variables().get(i).size();
			if (x > max) {
				max = x;
			}

		}
		return max;
	}

	public boolean TestExistingSuperCclass(List<String> l, String c) {
		for (int i = 0; i < l.size(); i++) {
			if (c.equals(l.get(i))) {
				return true;
			}
		}
		return false;
	}

	public int[] getPosition(String pos) {

		int x[] = new int[2];
		int i = 0;
		String xpos = "";
		while (pos.charAt(i) != '-') {
			xpos += pos.charAt(i);
			i++;
			// .println("i++i++i++ =" + i);
			// .println("xpos =" + xpos);
		}
		// .print(xpos);
		String ypos = "";
		i++;
		while (i < pos.length()) {
			ypos += pos.charAt(i);
			i++;
		}

		// .print(ypos);
		x[0] = Integer.valueOf(xpos);
		x[1] = Integer.valueOf(ypos);

		// .println(x[0]);
		// .print(x[1]);
		return x;
	}

	public String[] spilt(String s) {
		List<String> l = new ArrayList<String>();
		String s1 = "";
		int i = 0;
		while (i < s.length()) {

			if (s.charAt(i) == '<') {
				s1 = "<";
				i += 1;
			} else if (s.charAt(i) == '>') {
				s1 += ">";
				i += 2;
				l.add(s1);
			} else {
				s1 += s.charAt(i);
				i += 1;
			}
		}

		String result[] = new String[l.size()];

		for (int j = 0; j < l.size(); j++) {
			result[j] = l.get(j).toString();
		}
		return result;

	}

}
