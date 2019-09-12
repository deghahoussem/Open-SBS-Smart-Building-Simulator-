package GIS.Ontology;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;
import GuiComnonets.Actors;
import GuiComnonets.NormalDevice;
import GuiComnonets.Zone;
import MainPanes.ScenarioItems;
import application.Main;
import eu.hansolo.enzo.notification.Notification.Notifier;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import MainPanes.ScenarioItems.ListeOfMovingclass;
public class Save_Import_Ontology {
	Main Application;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();

	public Save_Import_Ontology(Main Application) {
		this.Application = Application;
		// TODO Auto-generated constructor stub
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

	public boolean TestExistingSuperCclass(List<String> l, String c) {
		for (int i = 0; i < l.size(); i++) {
			if (c.equals(l.get(i))) {
				return true;
			}
		}
		return false;
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

	public boolean TabExist(Tab t) {
		for (int i = 0; i < Application.getMainPane().getMainPane().getTabs().size(); i++) {
			if (Application.getMainPane().getMainPane().getTabs().get(i).equals(t))
				return true;
		}
		return false;
	}



	public boolean import_Secnario(Main Application) {
		try {

			Task<Integer> task = new Task<Integer>() {
				protected Integer call() throws Exception {
					Platform.runLater(new Runnable() {
						public void run() {
							try {

								if (TabExist(Application.getMainPane().getCreateScenario())) {
									Application.getMainPane().getMainPane().getSelectionModel()
											.select(Application.getMainPane().getCreateScenario());
								} else {
									Application.getMainPane().getMainPane().getSelectionModel()
											.select(Application.getMainPane().getCreateScenario());
									Application.getMainPane().getMainPane().getTabs()
											.add(Application.getMainPane().getCreateScenario());
								}

								FileChooser fileChooser = new FileChooser();
								fileChooser.setTitle("open File");

								File file = fileChooser.showOpenDialog(Application.getPrimaryStage());

								String[] StrFile2 = FileTxtManagmentGIS.Read_from_file(file.getAbsoluteFile().toString()

								);

								ScenarioItems ScenarioItems = null;

								for (int i = 0; i < StrFile2.length; i++) {

									// ***********************************************************************************************
									String line[] = spilt(StrFile2[i]);
									System.out.println(i + "	" + StrFile2[i]);

									if (line[1].equals("<Scenario>")) {

										Application.getRightPane().getSystem_Counters().getProgressBar()
												.setProgress(Application.getRightPane().getSystem_Counters()
														.getProgressBar().getProgress() + 0.05);

										ScenarioItems = new ScenarioItems(Application,
												Application.getMainPane().getCreateScenario().getListeOfScenario());

										for (int z = 0; z < Application.getOntologyIndividualsModel()
												.getOntologyIndividuals().size(); z++) {
											OntologyIndividuals OntologyIndividuals = Application
													.getOntologyIndividualsModel().getOntologyIndividuals().get(z);
											List<String> l = Application.getOntologyIndividualsModel()
													.getOntologyModelGIS()
													.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

											for (int j = 0; j < l.size(); j++) {

												if (l.get(j) != null && l.get(j).equals("Devices")) {
													final CheckBoxTreeItem<String> checkBoxTreeItem = new CheckBoxTreeItem<String>(
															OntologyIndividuals.getOntologyIndividualsId());

													File f1 = new File("icons//"
															+ OntologyIndividuals.getOWLIndividualRDFType() + ".png");
													Image ii = new Image(f1.toURI().toString());
													ImageView selectedImage = new ImageView();
													selectedImage.setImage(ii);
													selectedImage.setFitHeight(25);
													selectedImage.setFitWidth(25);
													checkBoxTreeItem.setGraphic(selectedImage);

													ScenarioItems.getListeOfTurnOn().getChildren()
															.add(checkBoxTreeItem);
													ScenarioItems.getListeOfTurnOnliste().add(checkBoxTreeItem);

													final CheckBoxTreeItem<String> checkBoxTreeItem2 = new CheckBoxTreeItem<String>(
															OntologyIndividuals.getOntologyIndividualsId());

													f1 = new File("icons//"
															+ OntologyIndividuals.getOWLIndividualRDFType() + ".png");
													ii = new Image(f1.toURI().toString());
													ImageView selectedImage2 = new ImageView();
													selectedImage2.setImage(ii);
													selectedImage2.setFitHeight(25);
													selectedImage2.setFitWidth(25);
													checkBoxTreeItem2.setGraphic(selectedImage2);

													ScenarioItems.getListeOfTurnOff().getChildren()
															.add(checkBoxTreeItem2);
													ScenarioItems.getListeOfTurnOffliste().add(checkBoxTreeItem2);
													ScenarioItems.setPrefSize(Application.width * 2 / 3,

															Application.height * 2 / 3);
												}

											}
										}

										if (line[3].equals("<true>")) {
											ScenarioItems.getIsSelected().setSelected(true);
										} else {
											ScenarioItems.getIsSelected().setSelected(false);
										}

										if (line[5].equals("<true>")) {
											ScenarioItems.getEnergy_Grid_Source().setSelected(true);
										} else {
											ScenarioItems.getEnergy_Grid_Source().setSelected(false);
										}


										ScenarioItems.getOpacityLevelLight()
												.setValue(Integer.valueOf(line[7].substring(1, line[7].length() - 1)));
										ScenarioItems.getOpacityLevelTempr()
												.setValue(Integer.valueOf(line[9].substring(1, line[9].length() - 1)));
										ScenarioItems.getOpacityLevelDuration().setValue(
												Integer.valueOf(line[11].substring(1, line[11].length() - 1)));

										Application.getMainPane().getCreateScenario().getListeOfScenario().getChildren()
												.add(ScenarioItems);

									} else if (line[0].equals("<Turn_Off_Action>")) {

										int id = 1;

										System.out.println(
												"-----------------------------------------------------------------------------------------");

										for (int j = 0; j < ScenarioItems.getListeOfTurnOffliste().size()
												&& id < line.length; j++) {


											if (id < line.length && ScenarioItems.getListeOfTurnOffliste().get(j)
													.getValue().equals(line[id].substring(1, line[id].length() - 1))) {

												ScenarioItems.getListeOfTurnOffliste().get(j).setSelected(true);
												id += 1;

											}
										}
									} else if (line[0].equals("<Turn_On_Action>")) {

										int id = 1;

										System.out.println(
												"-----------------------------------------------------------------------------------------");

										for (int j = 0; j < ScenarioItems.getListeOfTurnOnliste().size()
												&& id < line.length; j++) {


											if (id < line.length && ScenarioItems.getListeOfTurnOnliste().get(j)
													.getValue().equals(line[id].substring(1, line[id].length() - 1))) {

												ScenarioItems.getListeOfTurnOnliste().get(j).setSelected(true);
												id += 1;

											}
										}
									}else if(line[0].equals("<Moving-Actions>")) {
										ScenarioItems.ListeOfMovingclass ListeOfMovingclass = 	ScenarioItems.CreatListeOfMovingclass();

										ListeOfMovingclass.getActor().getItems().add(line[2].substring(1, line[2].length() - 1));
										ListeOfMovingclass.getZones().getItems().add(line[4].substring(1, line[4].length() - 1));
										ListeOfMovingclass.getActivitys().getItems().add(line[6].substring(1, line[6].length() - 1));


									ListeOfMovingclass.getActor().setValue(line[2].substring(1, line[2].length() - 1));
										ListeOfMovingclass.getZones().setValue(line[4].substring(1, line[4].length() - 1));
										ListeOfMovingclass.getActivitys().setValue(line[6].substring(1, line[6].length() - 1));
										ScenarioItems.getListeOfMoving().getChildren().add(ListeOfMovingclass);

									}else if(line[0].equals("<Property-Change>")) {
										ScenarioItems.ListeOfOWLDataTypeProperty ListeOfOWLDataTypeProperty =  ScenarioItems.CreatListeOfOWLDataTypeProperty();
										ListeOfOWLDataTypeProperty.getPropertyList().getItems().add(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLDataTypeProperty.getPropertyval().setText(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLDataTypeProperty.getIndList().getItems().add(line[6].substring(1, line[6].length() - 1));

										ListeOfOWLDataTypeProperty.getPropertyList().setValue(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLDataTypeProperty.getPropertyval().setText(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLDataTypeProperty.getIndList().setValue(line[6].substring(1, line[6].length() - 1));


										ScenarioItems.getListeOfProperty().getChildren().add(ListeOfOWLDataTypeProperty);
									}else if(line[0].equals("<Remove-ObjectProperty>")){
										ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty =  ScenarioItems.CreatListeOfOWLObjectProperty();
										ListeOfOWLObjectProperty.getObjectProperty().getItems().add(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLObjectProperty.getDomain().getItems().add(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLObjectProperty.getRang().getItems().add(line[6].substring(1, line[6].length() - 1));
										ScenarioItems.getListeOfRemoveObjectProperty().getChildren().add(ListeOfOWLObjectProperty);

										ListeOfOWLObjectProperty.getObjectProperty().setValue(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLObjectProperty.getDomain().setValue(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLObjectProperty.getRang().setValue(line[6].substring(1, line[6].length() - 1));

									}else if(line[0].equals("<Add-ObjectProperty>")) {
										ScenarioItems.ListeOfOWLObjectProperty ListeOfOWLObjectProperty =  ScenarioItems.CreatListeOfOWLObjectProperty();
										ListeOfOWLObjectProperty.getObjectProperty().getItems().add(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLObjectProperty.getDomain().getItems().add(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLObjectProperty.getRang().getItems().add(line[6].substring(1, line[6].length() - 1));
										ScenarioItems.getListeOfObjectProperty().getChildren().add(ListeOfOWLObjectProperty);

										ListeOfOWLObjectProperty.getObjectProperty().setValue(line[2].substring(1, line[2].length() - 1));
										ListeOfOWLObjectProperty.getDomain().setValue(line[4].substring(1, line[4].length() - 1));
										ListeOfOWLObjectProperty.getRang().setValue(line[6].substring(1, line[6].length() - 1));

									}

//***************************************************************************************





//***************************************************************************************

								}


							} catch (Exception e) {
								Notifier.INSTANCE.notifyError("errer", e.getMessage());
								e.printStackTrace();
							}
						}
					});
					/*
					 * try { this.notifyAll(); } catch (Exception e) { // TODO Auto-generated catch
					 * block e.printStackTrace(); }
					 */
					return 0;
				}
			};
			new Thread(task).start();

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean Import_Smart_Home_Model() {

		try {

			Task<Integer> task = new Task<Integer>() {
				protected Integer call() throws Exception {
					Platform.runLater(new Runnable() {
						public void run() {
							try {
								if (TabExist(Application.getMainPane().getSimulator())) {
									Application.getMainPane().getMainPane().getSelectionModel()
											.select(Application.getMainPane().getSimulator());
								} else {
									Application.getMainPane().getMainPane().getSelectionModel()
											.select(Application.getMainPane().getSimulator());
									Application.getMainPane().getMainPane().getTabs()
											.add(Application.getMainPane().getSimulator());
								}


								FileChooser fileChooser = new FileChooser();
								fileChooser.setTitle("open File");

								File file = fileChooser.showOpenDialog(Application.getPrimaryStage());

								// FileTxtManagmentGIS.creat_file(file.getAbsoluteFile().toString());

								String[] StrFile = FileTxtManagmentGIS
										.Read_from_file(file.getAbsoluteFile().toString());

								Application.getRightPane().getSystem_Counters().getProgressBar().setProgress(0.f);

								for (int i = 0; i < StrFile.length; i++) {

									Application.getRightPane().getSystem_Counters().getProgressBar()
											.setProgress(Application.getRightPane().getSystem_Counters()
													.getProgressBar().getProgress() + 0.05);

									String line[] = spilt(StrFile[i]);

									// ////system.out.println(i + " = i " + line[1] + " | " + StrFile.length);

									List<String> SuperClasses = Application.getOntologyIndividualsModel()
											.getOntologyModelGIS()
											.getSuperClasses(line[1].substring(1, line[1].length() - 1));

									// ----------------------------------------------------------------------------------------------------------------
									if (line[0].equals("<Map>")) {
										Application.RestSystem();
										Application.getMainPane().getSimulator()
												.SetMapImage(line[1].substring(1, line[1].length() - 1));
										Application.setAppMap(line[1].substring(1, line[1].length() - 1));


										// ----------------------------------------------------------------------------------------------------------------

									} else if (TestExistingSuperCclass(SuperClasses, "Zone"))

									{

										// system.out.println("========> " + line[1]);
										Zone Zone = new Zone(line[2].substring(1, line[2].length() - 1),
												line[2].substring(1, line[2].length() - 1));

										Application.getLeftPane().getAccordion().getPanes().addAll(Zone);

										Application.getOntologyIndividualsModel().CreateIndividual(
												line[2].substring(1, line[2].length() - 1),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getOWLNamedClass(line[1].substring(1, line[1].length() - 1)),
												Zone);

										for (int p = 3; p < line.length; p++) {
											if (line[p].equals("<DataTypeProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLDatatypeProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLDatatypeProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 2].substring(1, line[p + 2].length() - 1)
																		.toString());

											} else if (line[p].equals("<ObjectProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLObjectProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLObjectProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 3].substring(1, line[p + 3].length() - 1)
																		.toString());

											} else if (line[p].equals("<Zone_VectoreXY>")) {

												// //system.out.println("===============================> " + line[p +
												// 1]);
												Text hall_Txt = new Text(line[2].substring(1, line[2].length() - 1));
												hall_Txt.setLayoutX(getPosition(
														line[p + 1].substring(1, line[p + 1].length() - 1))[0]);
												hall_Txt.setLayoutY(getPosition(
														line[p + 1].substring(1, line[p + 1].length() - 1))[1]);

												Application.getMainPane().getSimulator().getMainSimulatorPane()
														.getChildren().add(hall_Txt);

											}
										}

									}

									else if (TestExistingSuperCclass(SuperClasses, "Devices")) {

										// system.out.println("Devices==== " + line[1] + "====> " + line[2] + " " + i);

										String deviceName = line[2].substring(1, line[2].length() - 1);
										String device_State = line[5].substring(1, line[5].length() - 1);
										String davice_vall = line[17].substring(1, line[17].length() - 1);
										String device_zone = line[20].substring(1, line[20].length() - 1);

										String Pos = null;

										for (int j = 0; j < line.length; j++) {

											if (line[j].equals("<Appliance_LocateInPlace>")) {

												Pos = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
														line[j + 2].substring(1, line[j + 2].length() - 1),
														Application.getOntologyIndividualsModel().getOntologyModelGIS()
																.getZone_VectoreXY());
												break;
											}

										}

										Application.getOntologyIndividualsModel()
												.AddOWLObjectProperty(
														deviceName, Application.getOntologyIndividualsModel()
																.getOntologyModelGIS().getPlace_HasAppliance(),
														deviceName);

										NormalDevice NormalDevice = new NormalDevice(deviceName,
												line[1].substring(1, line[1].length() - 1), Pos, 50, 50, Application);
										NormalDevice.MakeAction(device_State, "");

										Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
												.add(NormalDevice.getDeviceobject());

										Application.getOntologyIndividualsModel().CreateIndividual(deviceName,
												Application.getOntologyIndividualsModel().getOntologyModelGIS()

														.getOWLNamedClass(line[1].substring(1, line[1].length() - 1)),
												NormalDevice);

										// -------------------------------------------------------------------------------------
										List<String> l2 = Application.getOntologyIndividualsModel()
												.getOntologyModelGIS()
												.getSuperClasses(line[2].substring(1, line[2].length() - 1));

										for (int l = 0; l < l2.size(); l++) {

											if (l2.get(l).equals("DeviceProductEnergy")) {
												int x = Integer.valueOf(davice_vall)
														+ Application.getGreen_energy_vall();

												Application.setGreen_energy_vall(x);

												Application.getRightPane().getSystem_Counters().getGreen_energy_vall()
														.setText("" + x);
												int nb = Integer.valueOf(Application.getRightPane().getSystem_Counters()
														.getGreen_energy_Number_devices().getText());
												Application.getRightPane().getSystem_Counters()
														.getGreen_energy_Number_devices().setText("" + nb + 1);

												int nb2 = Integer
														.valueOf(Application.getRightPane().getSystem_Counters()
																.getContaminated_Energy_number_devices().getText());
												Application.getRightPane().getSystem_Counters()
														.getGreen_energy_Number_devices().setText("" + (nb2 + 1));
												break;
											}

										}

										for (int p = 3; p < line.length; p++) {
											if (line[p].equals("<DataTypeProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLDatatypeProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLDatatypeProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 2].substring(1, line[p + 2].length() - 1)
																		.toString());

											} else if (line[p].equals("<ObjectProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLObjectProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLObjectProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 3].substring(1, line[p + 3].length() - 1)
																		.toString());

											}
										}

									}
									// ---------------------------------------------------------------------------------------------------------------------------------
									else if (TestExistingSuperCclass(SuperClasses, "Actors")) {

										// system.out.println(line[1].substring(1, line[1].length() - 1) + "---------
										// ");
										String Pos = null;
										for (int j = 0; j < line.length; j++) {

											if (line[j].equals("<Human_LocateInPlace>")) {

												Pos = Application.getOntologyIndividualsModel().GetOWLDatatypeProperty(
														line[j + 2].substring(1, line[j + 2].length() - 1),
														Application.getOntologyIndividualsModel().getOntologyModelGIS()
																.getZone_VectoreXY());

												break;
											}

										}
										// ------------------------------------------------------------------------------------------------
										List<String> l2 = Application.getOntologyIndividualsModel()
												.getOntologyModelGIS()
												.getSuperClasses(line[1].substring(1, line[1].length() - 1));

										Actors Actors = null;

										if (TestExistingSuperCclass(l2, "NonHuman")) {

											Actors = new Actors(line[2].substring(1, line[2].length() - 1),
													line[1].substring(1, line[1].length() - 1), Pos, 40, 40);

										} else {
											Actors = new Actors(line[2].substring(1, line[2].length() - 1),
													line[1].substring(1, line[1].length() - 1), Pos, 50, 50);

										}
										Application.getOntologyIndividualsModel().CreateIndividual(
												line[2].substring(1, line[2].length() - 1),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getOWLNamedClass(line[1].substring(1, line[1].length() - 1)),
												Actors);

										Application.getMainPane().getSimulator().getMainSimulatorPane().getChildren()
												.add(Actors.getHumanobject());

										for (int p = 3; p < line.length; p++) {
											if (line[p].equals("<DataTypeProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLDatatypeProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLDatatypeProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 2].substring(1, line[p + 2].length() - 1)
																		.toString());

											} else if (line[p].equals("<ObjectProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLObjectProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLObjectProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 3].substring(1, line[p + 3].length() - 1)
																		.toString());

											}
										}
										// load other indeviduals ==============
									} else {

										Application.getOntologyIndividualsModel().CreateIndividual(
												line[2].substring(1, line[2].length() - 1),
												Application.getOntologyIndividualsModel().getOntologyModelGIS()
														.getOWLNamedClass(line[1].substring(1, line[1].length() - 1)),
												null);
										for (int p = 3; p < line.length; p++) {
											if (line[p].equals("<DataTypeProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLDatatypeProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLDatatypeProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 2].substring(1, line[p + 2].length() - 1)
																		.toString());

											} else if (line[p].equals("<ObjectProperty>")) {
												Application.getOntologyIndividualsModel()
														.AddOWLObjectProperty(
																line[2].substring(1, line[2].length() - 1),
																Application.getOntologyIndividualsModel()
																		.getOntologyModelGIS()
																		.getOWLObjectProperty_OpenSBSList(
																				line[p + 1]
																						.substring(1,
																								line[p + 1].length()
																										- 1)
																						.toString()),
																line[p + 3].substring(1, line[p + 3].length() - 1)
																		.toString());

											}
										}

									}

								}
								Notifier.INSTANCE.notifySuccess("Success", "The File Has Been Uploaded with Success ");
								// =======================================================================================================================

								// =======================================================================================================================

							} catch (Exception e) {

							}
						}
					});
					/*
					 * try { this.notifyAll(); } catch (Exception e) { // TODO Auto-generated catch
					 * block e.printStackTrace(); }
					 */
					return 0;
				}
			};
			new Thread(task).start();

			return true;
		} catch (Exception e) {
			return false;
		}

		// ==========================

		// =======================

	}

}
