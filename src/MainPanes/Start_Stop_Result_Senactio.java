package MainPanes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;
import GIS.Ontology.OWLObjectPropertyGIS;
import GIS.Ontology.OntologyIndividuals;
import GIS.Ontology.Simulation_Model_Layers;
import GIS.Ontology.Simulation_Model_Layers.Simulation_Results;
import GuiComnonets.DynamicTableView;
import application.Main;
import edu.stanford.smi.protegex.owl.model.OWLObjectProperty;
import eu.hansolo.enzo.notification.Notification.Notifier;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.scene.control.Tab;

public class Start_Stop_Result_Senactio {
	Main Application;
	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	Thread T;

	public Start_Stop_Result_Senactio(Main Application) {
		this.Application = Application;

		/**
		 * private int need_of_All_devices_consumation = 0; private int
		 * Green_energy_vall = 0; private int contaminated_Energy_vall = 0; private int
		 * weather_sun_ligt = 0; private int TimeSystem = 0; private int Cost = 0 ;
		 *
		 *
		 * private Text Green_energy_vall; private Text Green_energy_Number_devices;
		 * private Text contaminated_Energy_vall; private Text
		 * contaminated_Energy_number_devices; private Text weather_sun_ligt; private
		 * Text TimeSystem; private Text bills;
		 */
		// TODO Auto-generated constructor stub
	}

	public String get_title_siulation_dataset() {
		String instance_Dataset = new String();

		for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
			for (int j = 0; j < Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLDatatypeProperty().size(); j++) {
				instance_Dataset += (Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
						.getOWLDatatypeProperty().get(j).getOWLDatatypePropertyType())+"  ,  ";
			}
/*
			for (int j = 0; j < Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLObjectProperty().size(); j++) {
				instance_Dataset += ( Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLObjectProperty().get(j).getType().getName().toString())+"  ,  ";
			}*/
		}
		instance_Dataset += "\n";
		return instance_Dataset;
	}
	public String get_Instant_siulation_dataset() {

		String instance_Dataset = new String();

		for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals().size(); i++) {
			for (int j = 0; j < Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLDatatypeProperty().size(); j++) {
				instance_Dataset += (Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
						.getOWLDatatypeProperty().get(j).getOWLDatatypePropertyValues())+ "  ,  ";
			}
/*
			for (int j = 0; j < Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLObjectProperty().size(); j++) {
				instance_Dataset +=( Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
					.getOWLObjectProperty().get(j).getType().getName()+"("+ Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
							.getOWLObjectProperty().get(j).getDomain()+","+Application.getOntologyIndividualsModel().getOntologyIndividuals().get(i)
									.getOWLObjectProperty().get(j).getRange()+")")+"  ,  ";
			}*/
		}
		instance_Dataset += "\n";
		return instance_Dataset;

	}

	public boolean rest() {

		try {

			while (Application.getSimulation_Model_Layers().getSimulation_Models().size() > 1) {
				Application.getSimulation_Model_Layers().getSimulation_Models().remove(0);
			}

			Application.getMainPane().getSimulator().getMain_Panes()[1].setCenter(null);
			Application.getMainPane().getSimulator().getMain_Panes()[2].setCenter(null);

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public void Stop() {
		T.stop();

		Application.getChart_stats().Stop();
	}

	public void Start() {
		// ***************************************************************************************************************
		Task<Integer> task = new Task<Integer>() {
			protected Integer call() throws Exception {

				// block of resetning simmulation paramaters
				try {

					while (Application.getSimulation_Model_Layers().getSimulation_Models().size() >= 1) {
						Application.getSimulation_Model_Layers().getSimulation_Models().remove(0);
					}

					// Application.getMainPane().getSimulator().getMain_Panes()[1].setCenter(null);
					// Application.getMainPane().getSimulator().getMain_Panes()[2].setCenter(null);
				} catch (Exception e) {

				}

				int need_of_All_devices_consumation = 0;
				int Green_energy_vall = 0;
				// ---------------------------------------------

				/**
				 * calcule the int need_of_All_devices_consumation = 0; int Green_energy_vall =
				 * 0;
				 */
				try {
					// add a copy of the loaded model in layers of siulation

					Application.getSimulation_Model_Layers().getSimulation_Models()
							.add(Application.getOntologyIndividualsModel()); // normal sinario 1
					Application.getSimulation_Model_Layers().getSimulation_Models()
							.add(Application.getOntologyIndividualsModel()); // sinario 4
					Application.getSimulation_Model_Layers().getSimulation_Models()
							.add(Application.getOntologyIndividualsModel()); // sinario 4
					Application.getSimulation_Model_Layers().getSimulation_Models()
							.add(Application.getOntologyIndividualsModel()); // sinario 4

					DynamicTableView DynamicTableView = new DynamicTableView();

					Platform.runLater(new Runnable() {
						public void run() {
							try {
								List<String> columns = new ArrayList<String>();
								columns.add("Scenario ID");
								columns.add("Time");
								columns.add("Appliances On");
								columns.add("Appliances Off");
								columns.add("Places");
								columns.add("Actor(Actiityes)");
								columns.add("Chnanged Property");
								columns.add("Removed Property");
								columns.add("Added Objecy-Property");
								columns.add("Energy Consumption");

								DynamicTableView.SetColumns(columns);
								DynamicTableView.getTableView().setPrefSize(700, 600);

								Application.getMainPane().getSimulator().getMain_Panes()[2]
										.setCenter(DynamicTableView.getTableView());

							} catch (Exception e) {

							}
						}
					});

					// Notifier.INSTANCE.notifySuccess("Information", "starting the simulation");
					// *****************************************************************************************************************************
// *****************************************************************************************************************************

					need_of_All_devices_consumation = 0;
					Green_energy_vall = 0;

// **************************************  in this step we willl calculate the energy of + - ***************************************************************************************
// *****************************************************************************************************************************

					try {
						for (int i = 0; i < Application.getOntologyIndividualsModel().getOntologyIndividuals()
								.size(); i++) {
							OntologyIndividuals OntologyIndividuals = Application.getOntologyIndividualsModel()
									.getOntologyIndividuals().get(i);

							List<String> l = Application.getOntologyIndividualsModel().getOntologyModelGIS()
									.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

							if (TestExistingSuperCclass(l, "DeviceConsumeEnergy")) {

								String stat = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
										OntologyIndividuals.getOntologyIndividualsId(),
										Application.getOntologyIndividualsModel().getOntologyModelGIS()
												.getDevices_State());

								if (stat.equals("on")) {
									need_of_All_devices_consumation = need_of_All_devices_consumation + Integer
											.valueOf(Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
													OntologyIndividuals.getOntologyIndividualsId(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getDevices_Watts_Consuming()))
											.intValue();
								}
							} else if (TestExistingSuperCclass(l, "Green_Energy")) {

								String stat = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
										OntologyIndividuals.getOntologyIndividualsId(),
										Application.getOntologyIndividualsModel().getOntologyModelGIS()
												.getDevices_State());
								if (stat.equals("on")) {
									Green_energy_vall = Green_energy_vall + Integer
											.valueOf(
													Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getOntologyIndividualsModel()
																	.getOntologyModelGIS().getDevices_Values()))
											.intValue();

								}
							} else if (TestExistingSuperCclass(l, "contaminated_Energy")) {

								String stat = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
										OntologyIndividuals.getOntologyIndividualsId(),
										Application.getOntologyIndividualsModel().getOntologyModelGIS()
												.getDevices_State());
								if (stat.equals("on")) {

									Application.setAvaileble_energy(Application.getAvaileble_energy() + Integer
											.valueOf(
													Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getOntologyIndividualsModel()
																	.getOntologyModelGIS().getDevices_Values()))
											.intValue());

								}
							}

						}
					} catch (Exception e) {

					}

// *****************************************************************************************************************************
// *****************************************************************************************************************************
// *****************************************************************************************************************************
// *****************************************************************************************************************************
					need_of_All_devices_consumation = need_of_All_devices_consumation / 60; // why / 60 this ???
					Green_energy_vall = Green_energy_vall / 60; // why / 60 this ??? ==> the simulation is paramatred by
																// minute 50 kw/h = /60/min

					// System.out.println("Green_energy_vall = " + Green_energy_vall);
					// System.out.println("need_of_All_devices_consumation = " +
					// need_of_All_devices_consumation);

					for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Results()
							.size(); id++) {
						Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
								.getGreen_Energy_Sources().add(Green_energy_vall + 0f);

						Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
								.getEnergy_Consumption_Of_Devices().add(need_of_All_devices_consumation + 0f);

						Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
								.getContaminated_Energy().add(Application.getAvaileble_energy());

					}

					Application.setNeed_of_All_devices_consumation(need_of_All_devices_consumation);
					Application.setGreen_energy_vall(Green_energy_vall);

					Application.getRightPane().getSystem_Counters().getGreen_energy_vall()
							.setText(Green_energy_vall + "");
					Application.getRightPane().getSystem_Counters().getContaminated_Energy_vall().setText("00");
					Application.getRightPane().getSystem_Counters().getBills().setText("0");
					Application.getRightPane().getSystem_Counters().getTimeSystem().setText("00");
					Application.setCost(0f);
					Application.setTimeSystem(0);
					Application.getChart_stats().Start();
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************
					// ******************************************************************************************************************************

					// ----------------------- set all senario and run run unn <3
					// ------------------------

					for (int i = 0; i < Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren()
							.size(); i++) {

						ScenarioItems ScenarioItems = (ScenarioItems) Application.getMainPane().getCreateScenario()
								.getListeOfScenario().getChildren().get(i);

						List<String> Items = new ArrayList<String>();
						Items.add("S-ID: " + i);
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");
						Items.add(" ");

						if (ScenarioItems.getIsSelected().isSelected()) {

							// ******************************************************************************************************************************
							// ********************************************************* set property
							// ****************************************************

							for (int k = 0; k < ScenarioItems.getListeOfProperty().getChildren().size(); k++) {
								ScenarioItems.ListeOfOWLDataTypeProperty ListeOfOWLDataTypeProperty = (ScenarioItems.ListeOfOWLDataTypeProperty) ScenarioItems
										.getListeOfProperty().getChildren().get(k);
								for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
										.size(); id++) {
									Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.SetOWLDatatypeProperty(
													ListeOfOWLDataTypeProperty.getIndList().getValue().toString(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getOWLDatatypeProperty_OpenSBSList(
																	ListeOfOWLDataTypeProperty.getPropertyList()
																			.getValue().toString()),
													ListeOfOWLDataTypeProperty.getPropertyval().getText());
								}

								Items.set(6, ListeOfOWLDataTypeProperty.getIndList().getValue().toString() + "("
										+ ListeOfOWLDataTypeProperty.getPropertyList().getValue().toString() + "|"
										+ ListeOfOWLDataTypeProperty.getPropertyval().getText() + "), " + Items.get(6));
							}
//---------------------------------------------------------------------------------------------------------------------------------
							// ******************************************************************************************************************************
							// *********************************************************ListeOfRemoveObjectProperty
							// ****************************************************

							for (int k = 0; k < ScenarioItems.getListeOfRemoveObjectProperty().getChildren()
									.size(); k++) {
								ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty = (ScenarioItems.ListeOfOWLObjectProperty) ScenarioItems
										.getListeOfObjectProperty().getChildren().get(k);

								for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
										.size(); id++) {
									Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.AddOWLObjectProperty(
													ListeOfOWLObjectProperty.getDomain().getValue().toString(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getOWLObjectProperty_OpenSBSList(ListeOfOWLObjectProperty
																	.getObjectProperty().getValue().toString()),
													ListeOfOWLObjectProperty.getRang().getValue().toString());
								}

								Items.set(7,
										ListeOfOWLObjectProperty.getObjectProperty().getValue().toString() + "("
												+ ListeOfOWLObjectProperty.getDomain().getValue().toString() + "|"
												+ ListeOfOWLObjectProperty.getRang().getValue().toString() + "), "
												+ Items.get(7));

							}
//---------------------------------------------------------------------------------------------------------------------------------	// ******************************************************************************************************************************
							// *********************************************************ListeOfObjectProperty
							// ****************************************************

							for (int k = 0; k < ScenarioItems.getListeOfObjectProperty().getChildren().size(); k++) {
								ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty = (ScenarioItems.ListeOfOWLObjectProperty) ScenarioItems
										.getListeOfObjectProperty().getChildren().get(k);
								for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
										.size(); id++) {
									Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.DeteleOWLObjectProperty(
													ListeOfOWLObjectProperty.getDomain().getValue().toString(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getOWLObjectProperty_OpenSBSList(ListeOfOWLObjectProperty
																	.getObjectProperty().getValue().toString()),
													ListeOfOWLObjectProperty.getRang().getValue().toString());
								}

								Items.set(8,
										ListeOfOWLObjectProperty.getObjectProperty().getValue().toString() + "("
												+ ListeOfOWLObjectProperty.getDomain().getValue().toString() + "|"
												+ ListeOfOWLObjectProperty.getRang().getValue().toString() + "), "
												+ Items.get(8));

							}

							// ******************************************************************************************************************************************
							// ******************************************************************************************************************************************
							// ********************************* ListeOfTurnOff
							// *********************************************************************************************************
							for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
									.size(); id++) {

								for (int j = 0; j < ScenarioItems.getListeOfTurnOff().getChildren().size(); j++) {
									CheckBoxTreeItem<String> checkBoxTreeItemOFF = (CheckBoxTreeItem<String>) ScenarioItems
											.getListeOfTurnOff().getChildren().get(j);

									if (checkBoxTreeItemOFF.isSelected() == true) {

										for (int k = 0; k < Application.getSimulation_Model_Layers()

												.getSimulation_Models().get(id).getOntologyIndividuals().size(); k++) {
											OntologyIndividuals OntologyIndividuals = Application
													.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.getOntologyIndividuals().get(k);

											if (OntologyIndividuals.getOntologyIndividualsId()

													.equals(checkBoxTreeItemOFF.getValue().toString())) {

												Items.set(3, OntologyIndividuals.getOntologyIndividualsId() + ", "
														+ Items.get(3));

												String state = Application.getSimulation_Model_Layers()
														.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																OntologyIndividuals.getOntologyIndividualsId(),
																Application.getSimulation_Model_Layers()
																		.getSimulation_Models().get(id)
																		.getOntologyModelGIS().getDevices_State());
												System.out.println(
														"00+  " + OntologyIndividuals.getOntologyIndividualsId()
																+ " |==> " + state);

												if (state.equals("on")) {

													List<String> l = Application.getSimulation_Model_Layers()
															.getSimulation_Models().get(id).getOntologyModelGIS()
															.getSuperClasses(
																	OntologyIndividuals.getOWLIndividualRDFType());

													if (TestExistingSuperCclass(l, "DeviceConsumeEnergy")) {
														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"off");
														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Watts_Consuming());

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getEnergy_Consumption_Of_Devices()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getEnergy_Consumption_Of_Devices().get(0)
																		- (Integer.valueOf(kwh).intValue() / 60));

														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("off",
																	"");

													} else if (TestExistingSuperCclass(l, "Green_Energy")) {

														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"off");
														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("off",
																	"");
														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Values());

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getGreen_Energy_Sources()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getGreen_Energy_Sources().get(0)
																		- (Integer.valueOf(kwh).intValue() / 60));

													} else if (TestExistingSuperCclass(l, "contaminated_Energy")) {

														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"off");
														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("off",
																	"");
														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Values());

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getContaminated_Energy()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getContaminated_Energy().get(0)
																		- (Integer.valueOf(kwh).intValue() / 60)

																);

													}

													break;
												}

											}

										}

									}
								}
							}
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//*************************************************************** ListeOfTurnOn **********************************************
//*************************************************************************************************************************************

							for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
									.size(); id++) {

								for (int j = 0; j < ScenarioItems.getListeOfTurnOn().getChildren().size(); j++) {

									CheckBoxTreeItem<String> checkBoxTreeItemOn = (CheckBoxTreeItem<String>) ScenarioItems
											.getListeOfTurnOn().getChildren().get(j);

									if (checkBoxTreeItemOn.isSelected() == true) {

										for (int k = 0; k < Application.getSimulation_Model_Layers()
												.getSimulation_Models().get(id).getOntologyIndividuals().size(); k++) {

											OntologyIndividuals OntologyIndividuals = Application
													.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.getOntologyIndividuals().get(k);

											if (OntologyIndividuals.getOntologyIndividualsId()

													.equals(checkBoxTreeItemOn.getValue().toString())) {

												String state = Application.getSimulation_Model_Layers()
														.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																OntologyIndividuals.getOntologyIndividualsId(),
																Application.getSimulation_Model_Layers()
																		.getSimulation_Models().get(id)
																		.getOntologyModelGIS().getDevices_State());

												Items.set(2, OntologyIndividuals.getOntologyIndividualsId() + ", "
														+ Items.get(2));

												System.out
														.println("1-  " + OntologyIndividuals.getOntologyIndividualsId()
																+ " |==> " + state);

												if (state.equals("off")) {

													List<String> l = Application.getSimulation_Model_Layers()
															.getSimulation_Models().get(id).getOntologyModelGIS()
															.getSuperClasses(
																	OntologyIndividuals.getOWLIndividualRDFType());

													if (TestExistingSuperCclass(l, "DeviceConsumeEnergy")) {

														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Watts_Consuming());
														if (!ScenarioItems.getEnergy_Grid_Source().isSelected()) {
															Float x = Application.getSimulation_Model_Layers()
																	.getSimulation_Results().get(id)
																	.getContaminated_Energy().get(0)
																	- (Float.valueOf(kwh) / 60);
															if (x >= 0) {
																Application.getSimulation_Model_Layers()
																		.getSimulation_Models().get(id)
																		.SetOWLDatatypeProperty(
																				OntologyIndividuals
																						.getOntologyIndividualsId(),
																				Application.getSimulation_Model_Layers()
																						.getSimulation_Models().get(id)
																						.getOntologyModelGIS()
																						.getDevices_State(),
																				"on");
																Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getEnergy_Consumption_Of_Devices()
																		.set(0, Application.getSimulation_Model_Layers()
																				.getSimulation_Results().get(id)
																				.getEnergy_Consumption_Of_Devices()
																				.get(0)
																				+ (Integer.valueOf(kwh).intValue()
																						/ 60));
																Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getContaminated_Energy().set(0, x);
																if (id == 0)
																	OntologyIndividuals.getOutPutIindividual()
																			.MakeAction("on", "");

															} else {

																Platform.runLater(new Runnable() {
																	public void run() {
																		try {
																			Notifier.INSTANCE.notifyWarning("Warning",
																					" The Energy Sources is Not Enoghth to run this Device : \n"
																							+ OntologyIndividuals
																									.getOntologyIndividualsId());

																		} catch (Exception e) {

																		}
																	}
																});

															}
														} else {
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.SetOWLDatatypeProperty(
																			OntologyIndividuals
																					.getOntologyIndividualsId(),
																			Application.getSimulation_Model_Layers()
																					.getSimulation_Models().get(id)
																					.getOntologyModelGIS()
																					.getDevices_State(),
																			"on");
															System.out.println("2-  "
																	+ OntologyIndividuals.getOntologyIndividualsId()
																	+ " |==> "
																	+ Application.getSimulation_Model_Layers()
																			.getSimulation_Models().get(id)
																			.GetOWLDatatypeProperty(
																					OntologyIndividuals
																							.getOntologyIndividualsId(),
																					Application
																							.getSimulation_Model_Layers()
																							.getSimulation_Models()
																							.get(id)
																							.getOntologyModelGIS()
																							.getDevices_State()));

															Application.getSimulation_Model_Layers()
																	.getSimulation_Results().get(id)
																	.getEnergy_Consumption_Of_Devices()
																	.set(0, Application.getSimulation_Model_Layers()
																			.getSimulation_Results().get(id)
																			.getEnergy_Consumption_Of_Devices().get(0)
																			+ (Integer.valueOf(kwh).intValue() / 60));

															if (id == 0)
																OntologyIndividuals.getOutPutIindividual()
																		.MakeAction("on", "");
														}
														// ----------------------------------------------------------------------------------------------

													} else if (TestExistingSuperCclass(l, "Green_Energy")) {

														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"on");
														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("on",
																	"");
														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Values());

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getGreen_Energy_Sources()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getGreen_Energy_Sources().get(0)
																		- (Integer.valueOf(kwh).intValue() / 60));

													} else if (TestExistingSuperCclass(l, "contaminated_Energy")) {
														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"on");
														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("on",
																	"");
														String kwh = Application.getSimulation_Model_Layers()
																.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																		OntologyIndividuals.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_Values());

														Application
																.setAvaileble_energy(Application.getAvaileble_energy()
																		+ Integer.valueOf(kwh).intValue());

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getContaminated_Energy()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getContaminated_Energy().get(0)
																		+ (Integer.valueOf(kwh).intValue() / 60)

																);

													}

												}

											} // end if test if this ontology indevidual
										}
									}
								}
							}
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//*************************************************************************************************************************************
//**************************************************************** ListeOfMoving  ***************************************************
//*************************************************************************************************************************************

							for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
									.size(); id++) {

								for (int f = 0; f < ScenarioItems.getListeOfMoving().getChildren().size(); f++) {

									ScenarioItems.ListeOfMovingclass ListeOfMovingclass = (MainPanes.ScenarioItems.ListeOfMovingclass) ScenarioItems
											.getListeOfMoving().getChildren().get(f);

									String Pos = "";

									OntologyIndividuals OntologyIndividualszone = Application
											.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.GetOntologyIndividuals(
													ListeOfMovingclass.getZones().getValue().toString());

									Pos = Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.GetOWLDatatypeProperty(OntologyIndividualszone.getOntologyIndividualsId(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getZone_VectoreXY());

									OntologyIndividuals OntologyIndividuals = Application.getSimulation_Model_Layers()
											.getSimulation_Models().get(id).GetOntologyIndividuals(
													ListeOfMovingclass.getActor().getValue().toString());

									if (id == 0)
										OntologyIndividuals.getOutPutIindividual().MakeAction("move", Pos);

									Items.set(4,
											ListeOfMovingclass.getZones().getValue().toString() + ", " + Items.get(4));
									Items.set(5,
											ListeOfMovingclass.getActor().getValue().toString() + "("
													+ ListeOfMovingclass.getActivitys().getValue().toString() + "),"
													+ Items.get(5));

									List<String> l = Application.getSimulation_Model_Layers().getSimulation_Models()
											.get(id).getOntologyModelGIS()
											.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

									System.out.print("here we go");
									System.out.print("l.size() = " + l.size());

									for (int h = 0; h < l.size(); h++) {

										if ((l.get(h).equals("Human")) || (l.get(h).equals("Group"))) {
											System.out.print("here we go");
											List<OWLObjectPropertyGIS> LoationZone = Application
													.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.GetOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace());

											Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.DeteleOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace(),

															LoationZone.get(0).getRange());

											Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.AddOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace(),
															ListeOfMovingclass.getZones().getValue().toString());

											List<OWLObjectPropertyGIS> Action = Application.getSimulation_Model_Layers()
													.getSimulation_Models().get(id).GetOWLObjectProperty(
															ListeOfMovingclass.getActivitys().getValue().toString(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getActivity_Has_Actions());

											List<OWLObjectPropertyGIS> DevicesON = Application
													.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.GetOWLObjectProperty(Action.get(0).getRange(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getAction_EffectIn_Device());
											System.out.println("DevicesON = " + DevicesON.size());
											for (int k2 = 0; k2 < DevicesON.size(); k2++) {

												OntologyIndividuals OntologyIndividuals2 = Application
														.getSimulation_Model_Layers().getSimulation_Models().get(id)
														.GetOntologyIndividuals(

																DevicesON.get(k2).getRange());

												if (id == 0)
													OntologyIndividuals2.getOutPutIindividual().MakeAction("on", "");
												String state = Application.getSimulation_Model_Layers()
														.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																OntologyIndividuals2.getOntologyIndividualsId(),
																Application.getSimulation_Model_Layers()
																		.getSimulation_Models().get(id)
																		.getOntologyModelGIS().getDevices_State());

												if (state.equals("off")) {

													String kwh = Application.getSimulation_Model_Layers()
															.getSimulation_Models().get(id).GetOWLDatatypeProperty(
																	OntologyIndividuals2.getOntologyIndividualsId(),
																	Application.getSimulation_Model_Layers()
																			.getSimulation_Models().get(id)
																			.getOntologyModelGIS()
																			.getDevices_Watts_Consuming());
													if (!ScenarioItems.getEnergy_Grid_Source().isSelected()) {

														Float x = Application.getNeed_of_All_devices_consumation()
																+ Float.valueOf(kwh);
														if (x < Application.getAvaileble_energy()) {

															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.SetOWLDatatypeProperty(
																			OntologyIndividuals2
																					.getOntologyIndividualsId(),
																			Application.getSimulation_Model_Layers()
																					.getSimulation_Models().get(id)
																					.getOntologyModelGIS()
																					.getDevices_State(),
																			"on");
															Application.getSimulation_Model_Layers()
																	.getSimulation_Results().get(id)
																	.getEnergy_Consumption_Of_Devices()
																	.set(0, Application.getSimulation_Model_Layers()
																			.getSimulation_Results().get(id)
																			.getEnergy_Consumption_Of_Devices().get(0)
																			+ Integer.valueOf(kwh).intValue());

															if (id == 0)
																OntologyIndividuals.getOutPutIindividual()
																		.MakeAction("on", "");

														} else {
														}
													} else {
														Application.getSimulation_Model_Layers().getSimulation_Models()
																.get(id).SetOWLDatatypeProperty(
																		OntologyIndividuals2.getOntologyIndividualsId(),
																		Application.getSimulation_Model_Layers()
																				.getSimulation_Models().get(id)
																				.getOntologyModelGIS()
																				.getDevices_State(),
																		"on");

														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(id).getEnergy_Consumption_Of_Devices()
																.set(0, Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(id)
																		.getEnergy_Consumption_Of_Devices().get(0)
																		+ Integer.valueOf(kwh).intValue());

														if (id == 0)
															OntologyIndividuals.getOutPutIindividual().MakeAction("on",
																	"");

													}

												}
											}

										} else if (l.get(h) != null && l.get(h).equals("NonHuman")) {

											List<OWLObjectPropertyGIS> LoationZone = Application
													.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.GetOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace());

											Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.DeteleOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace(),
															LoationZone.get(0).getRange());

											Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
													.AddOWLObjectProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getSimulation_Model_Layers()
																	.getSimulation_Models().get(id)
																	.getOntologyModelGIS().getHuman_LocateInPlace(),
															ListeOfMovingclass.getZones().getValue().toString());

											if (id == 0)
												OntologyIndividuals.getOutPutIindividual().MakeAction("move", Pos);

											System.out.println("Poooooooooooooooozzzzz = " + Pos);

										}

									}
								}
							}
//***************************************************************************************************************************************							
							// TODO start fixing from here
							// -------------------------------------------------------------------------------------
							
							Application.setDataset(Application.getDataset()+get_title_siulation_dataset() );
							// ------------------------------------------------------------------------------------
							update_energy_Cnsumption_and_Production();

							int totalTime = (int) ScenarioItems.getOpacityLevelDuration().getValue(); // in

							// System.out.println("totalTime : " + totalTime);
							int time = 1;// nanoseconds
							Items.set(1, "" + time);
							while (totalTime > 0) {
								
								Application.setDataset(Application.getDataset()+get_Instant_siulation_dataset() );
								// System.out.println("totalTime : " + totalTime);
								for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Models()
										.size(); id++) {

									if (Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
											.getGreen_Energy_Sources().get(0) != null) {
										/*
										 * Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
										 * .getGreen_Energy_Sources()
										 * .add(Application.getSimulation_Model_Layers().getSimulation_Results()
										 * .get(id).getGreen_Energy_Sources().get(0));
										 * 
										 * Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
										 * .getEnergy_Consumption_Of_Devices()
										 * .add(Application.getSimulation_Model_Layers().getSimulation_Results()
										 * .get(id).getEnergy_Consumption_Of_Devices().get(0));
										 * 
										 * Application.getRightPane().getSystem_Counters().getContaminated_Energy_vall()
										 * .setText( Application.getSimulation_Model_Layers().getSimulation_Results()
										 * .get(0).getEnergy_Consumption_Of_Devices().get(0) + "");
										 * 
										 * Float Cost = (float) (Application.getSimulation_Model_Layers()
										 * .getSimulation_Results().get(id).getBill() +
										 * ((Application.getSimulation_Model_Layers().getSimulation_Results()
										 * .get(id).getBill() * 4.179) / 125)); Application.setCost(Cost);
										 * Application.getRightPane().getSystem_Counters().getBills().setText(Cost +
										 * "");
										 * 
										 * Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
										 * .setBill(Cost);
										 */
									} else {
										Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
												.getGreen_Energy_Sources()
												.add(Application.getSimulation_Model_Layers().getSimulation_Results()
														.get(id).getGreen_Energy_Sources()
														.get(Application.getSimulation_Model_Layers()
																.getSimulation_Results().get(id)
																.getGreen_Energy_Sources().size())
														+ Application.getSimulation_Model_Layers()
																.getSimulation_Results().get(id)
																.getGreen_Energy_Sources().get(0));

										Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
												.getEnergy_Consumption_Of_Devices()
												.add(Application.getSimulation_Model_Layers().getSimulation_Results()
														.get(id).getEnergy_Consumption_Of_Devices()
														.get(Application.getSimulation_Model_Layers()
																.getSimulation_Results().get(id)
																.getEnergy_Consumption_Of_Devices().size())
														+ Application.getSimulation_Model_Layers()
																.getSimulation_Results().get(id)
																.getEnergy_Consumption_Of_Devices().get(0));

										Application.getRightPane().getSystem_Counters().getContaminated_Energy_vall()
												.setText(
														Application.getSimulation_Model_Layers().getSimulation_Results()
																.get(0).getEnergy_Consumption_Of_Devices()
																.get(Application.getSimulation_Model_Layers()
																		.getSimulation_Results().get(0)
																		.getEnergy_Consumption_Of_Devices().size())
																+ "");

										Float Cost = (float) (Application.getSimulation_Model_Layers()
												.getSimulation_Results().get(id).getBill()
												+ ((Application.getSimulation_Model_Layers().getSimulation_Results()
														.get(id).getBill() * 4.179) / 125));
										// Application.setCost(Cost);
										// Application.getRightPane().getSystem_Counters().getBills().setText(Cost +
										// "");

										Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
												.setBill(Cost);
									}
								}

								Float Cost = (float) (Application.getCost()
										+ ((Application.getContaminated_Energy_vall() * 4.179) / 125));
								Application.setCost(Cost);
								Application.getRightPane().getSystem_Counters().getBills().setText(Cost + "");

								Application.getRightPane().getSystem_Counters().getWeather_sun_ligt()
										.setText(ScenarioItems.getOpacityLevelLight().getValue() + "");

								Application.getRightPane().getSystem_Counters().getWeather_tempiratur()
										.setText(ScenarioItems.getOpacityLevelTempr().getValue() + "");

								Application.setTimeSystem(Application.getTimeSystem() + 1);

								Application.getRightPane().getSystem_Counters().getTimeSystem().setText(Integer.valueOf(
										Application.getRightPane().getSystem_Counters().getTimeSystem().getText())
										+ Application.getTimeSystem() + "");

								totalTime = totalTime - 1;

								time += 1;
								Items.set(1, "" + time);
								Items.set(9, "" + Application.getSimulation_Model_Layers().getSimulation_Results()
										.get(0).getEnergy_Consumption_Of_Devices().get(0));
								Platform.runLater(new Runnable() {
									public void run() {
										try {

											DynamicTableView.addItems(Items);

										} catch (Exception e) {

										}
									}
								});

								try {

									Thread.sleep(250);
								} catch (Exception e) {
									Application.getChart_stats().Stop();

								}
							}
							update_energy_Cnsumption_and_Production();
						}
					}

					// Notifier.INSTANCE.notifySuccess("Information", "end of the simulation");

					Application.getChart_stats().Stop();
				} catch (Exception e) {
					Application.getChart_stats().Stop();
					System.out.println(e.getMessage());
				}
				return 0;

			}
		};

		T = new Thread(task);
		T.start();

	}

	public boolean TestExistingSuperCclass(List<String> l, String c) {
		for (int i = 0; i < l.size(); i++) {
			if (c.equals(l.get(i))) {
				return true;
			}
		}
		return false;
	}

	public void update_energy_Cnsumption_and_Production() {

		int need_of_All_devices_consumation = 0;
		int Green_energy_vall = 0;
		int contaminated_Energy = 0;

		try {
			for (int id = 0; id < Application.getSimulation_Model_Layers().getSimulation_Results().size(); id++) {

				Application.getSimulation_Model_Layers().getSimulation_Results().get(id).getContaminated_Energy().set(0,
						0f);

				for (int i = 0; i < Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
						.getOntologyIndividuals().size(); i++) {

					OntologyIndividuals OntologyIndividuals = Application.getSimulation_Model_Layers()
							.getSimulation_Models().get(id).getOntologyIndividuals().get(i);

					List<String> l = Application.getOntologyIndividualsModel().getOntologyModelGIS()
							.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

					if (TestExistingSuperCclass(l, "DeviceConsumeEnergy")) {

						String stat = Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
								.GetOWLDatatypeProperty(OntologyIndividuals.getOntologyIndividualsId(), Application
										.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State());

						if (stat.equals("on")) {
							need_of_All_devices_consumation = need_of_All_devices_consumation + Integer
									.valueOf(Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
											.GetOWLDatatypeProperty(OntologyIndividuals.getOntologyIndividualsId(),
													Application.getOntologyIndividualsModel().getOntologyModelGIS()
															.getDevices_Watts_Consuming()))
									.intValue();
						}
					} else if (TestExistingSuperCclass(l, "Green_Energy")) {

						String stat = Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
								.GetOWLDatatypeProperty(OntologyIndividuals.getOntologyIndividualsId(), Application
										.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State());
						if (stat.equals("on")) {
							Green_energy_vall = Green_energy_vall
									+ Integer
											.valueOf(Application.getSimulation_Model_Layers().getSimulation_Models()
													.get(id).GetOWLDatatypeProperty(
															OntologyIndividuals.getOntologyIndividualsId(),
															Application.getOntologyIndividualsModel()
																	.getOntologyModelGIS().getDevices_Values()))
											.intValue();

						}
					} else if (TestExistingSuperCclass(l, "contaminated_Energy")) {

						String stat = Application.getSimulation_Model_Layers().getSimulation_Models().get(id)
								.GetOWLDatatypeProperty(OntologyIndividuals.getOntologyIndividualsId(), Application
										.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_State());
						if (stat.equals("on")) {

							contaminated_Energy += Float.valueOf(Application.getSimulation_Model_Layers()
									.getSimulation_Models().get(id)
									.GetOWLDatatypeProperty(OntologyIndividuals.getOntologyIndividualsId(), Application
											.getOntologyIndividualsModel().getOntologyModelGIS().getDevices_Values()));
						}
					}

				}

				need_of_All_devices_consumation = need_of_All_devices_consumation / 60;
				Green_energy_vall = Green_energy_vall / 60;
				Application.getSimulation_Model_Layers().getSimulation_Results().get(id).getGreen_Energy_Sources()
						.set(0, Green_energy_vall + 0f);

				Application.getSimulation_Model_Layers().getSimulation_Results().get(id)
						.getEnergy_Consumption_Of_Devices().set(0, need_of_All_devices_consumation + 0f);
				Application.getSimulation_Model_Layers().getSimulation_Results().get(id).getContaminated_Energy().set(0,
						contaminated_Energy + 0f);

				need_of_All_devices_consumation = 0;
				Green_energy_vall = 0;
				contaminated_Energy = 0;
			}
		} catch (Exception e) {

		}

		// *****************************************************************************************************************************

	}

}
