package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;
import GIS.Ontology.OntologyIndividuals;
import application.Main;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ScenarioItems extends GridPane {

	public CheckBox getIsSelected() {
		return IsSelected;
	}

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");

	private VBox ListeOfMoving;

	private Button AddMoving;
	private CheckBoxTreeItem<String> ListeOfTurnOn;
	private CheckBoxTreeItem<String> ListeOfTurnOff;

	private List<CheckBoxTreeItem<String>> ListeOfTurnOnliste;
	private List<CheckBoxTreeItem<String>> ListeOfTurnOffliste;

	private GridPane ListeOfOptions;

	private Slider opacityLevelLight;
	private Slider opacityLevelTempr;
	private Slider opacityLevelDuration;
	private Main Main;
	private CheckBox IsSelected;
	private CheckBox Energy_Grid_Source;

	VBox listeOfObjectProperty;
	VBox listeOfRemoveObjectProperty;
	VBox listeOfProperty;

	public CheckBox getEnergy_Grid_Source() {
		return Energy_Grid_Source;
	}

	public ScenarioItems(Main Main, VBox ListeOfSecnario) {

		ListeOfTurnOnliste = new ArrayList<CheckBoxTreeItem<String>>();
		ListeOfTurnOffliste = new ArrayList<CheckBoxTreeItem<String>>();

		this.Main = Main;
		setPadding(new Insets(10));
		setHgap(5);
		setVgap(10);
		setAlignment(Pos.TOP_CENTER);
		// ***************************************************************
		Text t = new Text(words[177]);
		t.setId("TextBig");
		;
		ListeOfMoving = new VBox();
		// ListeOfMoving.setPrefHeight(height / 4);
		ListeOfMoving.setId("Activity_Vbox");

		File f1 = new File("icons//3-512.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(30);
		selectedImage14.setFitWidth(30);
		f1 = new File("icons//add.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage1 = new ImageView();
		selectedImage1.setImage(i);
		selectedImage1.setFitHeight(10);
		selectedImage1.setFitWidth(10);
		AddMoving = new Button();
		AddMoving.setGraphic(selectedImage1);
		HBox h1 = new HBox();
		h1.setPadding(new Insets(5));
		h1.setSpacing(5);
		h1.getChildren().addAll(selectedImage14, t, AddMoving);
		AddMoving.setOnAction(a -> {
			ListeOfMovingclass ListeOfMovingclass = new ListeOfMovingclass();

			for (int z = 0; z < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); z++) {
				OntologyIndividuals OntologyIndividuals = Main.getOntologyIndividualsModel().getOntologyIndividuals()
						.get(z);
				List<String> l = Main.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				List<String> l23 = Main.getOntologyIndividualsModel().getOntologyModelGIS()
						.getSuperClasses(OntologyIndividuals.getOWLIndividualRDFType());

				if (TestExistingSuperCclass(l23, "Zone")) {

					ListeOfMovingclass.getZones().getItems().add(OntologyIndividuals.getOntologyIndividualsId());
				} else {
					for (int j = 0; j < l.size(); j++) {

						if (l.get(j) != null && l.get(j).equals("Actors")) {
							ListeOfMovingclass.getActor().getItems()
									.add(OntologyIndividuals.getOntologyIndividualsId());

						}

					}
				}
			}
			// Main

			ListeOfMoving.getChildren().add(ListeOfMovingclass);
		});
		// **************************************************************
		Text t1 = new Text(words[178]);
		t1.setId("TextBig");
		ListeOfTurnOn = new CheckBoxTreeItem<String>(words[180]);

		TreeView tree = new TreeView(ListeOfTurnOn);
		tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
		tree.setRoot(ListeOfTurnOn);
		ListeOfTurnOn.setExpanded(true);
		tree.setEditable(true);
		tree.setShowRoot(true);
		tree.setId("Activity_Vbox");
		tree.setPrefHeight(200);
		tree.setPrefWidth(290);
		f1 = new File("icons//on2.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage2 = new ImageView();
		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(30);
		selectedImage2.setFitWidth(30);

		HBox h2 = new HBox();
		h2.setPadding(new Insets(5));
		h2.setSpacing(5);
		h2.getChildren().addAll(selectedImage2, t1);
		// *************************************************************************************d
		Text t3 = new Text(words[179]);
		t3.setId("TextBig");
		ListeOfTurnOff = new CheckBoxTreeItem<String>(words[180]);

		TreeView tree2 = new TreeView(ListeOfTurnOff);
		tree2.setCellFactory(CheckBoxTreeCell.<String>forTreeView());
		tree2.setRoot(ListeOfTurnOff);
		ListeOfTurnOn.setExpanded(true);
		tree2.setEditable(true);
		tree2.setShowRoot(true);
		tree2.setId("Activity_Vbox");
		tree2.setPrefWidth(290);

		f1 = new File("icons//off2.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(30);
		selectedImage3.setFitWidth(30);

		HBox h22 = new HBox();
		h22.setPadding(new Insets(5));
		h22.setSpacing(5);
		h22.getChildren().addAll(selectedImage3, t3);
		// ****************************************************************************************

		Text Light = new Text(words[181] + " : ");
		Light.setId("TextBig");
		tree2.setPrefHeight(200);
		f1 = new File("icons//Sunny.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage4 = new ImageView();
		selectedImage4.setImage(i);
		selectedImage4.setFitHeight(30);
		selectedImage4.setFitWidth(30);
		HBox h4 = new HBox();
		h4.setSpacing(5);
		h4.getChildren().addAll(selectedImage4, Light);
		opacityLevelLight = new Slider(0, 100, 50);
		opacityLevelLight.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				Light.setText(words[181] + " : " + String.format("%.2f", new_val));

			}
		});

		// *************************************************************************************

		Text tem = new Text(words[182]);
		tem.setId("TextBig");

		f1 = new File("icons//TemperatureSensor.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage5 = new ImageView();
		selectedImage5.setImage(i);
		selectedImage5.setFitHeight(30);
		selectedImage5.setFitWidth(30);
		HBox h5 = new HBox();
		h5.setSpacing(5);
		h5.getChildren().addAll(selectedImage5, tem);
		opacityLevelTempr = new Slider(-40, 60, 30);
		opacityLevelTempr.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				tem.setText(words[182] + " : " + String.format("%.2f", new_val) + "�");

			}
		});
		// *****************************************************************************************
		Text time = new Text(words[183]);
		time.setId("TextBig");

		f1 = new File("icons//chronometer.png");
		i = new Image(f1.toURI().toString());
		final ImageView selectedImage6 = new ImageView();
		selectedImage6.setImage(i);
		selectedImage6.setFitHeight(30);
		selectedImage6.setFitWidth(30);
		HBox h6 = new HBox();
		h6.setSpacing(5);
		h6.getChildren().addAll(selectedImage6, time);
		opacityLevelDuration = new Slider(10, 100, 15);
		opacityLevelDuration.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				time.setText(words[183] + " : " + String.format("%.2f", new_val) + " s");

			}
		});
		// *****************************************************************************************

		ListeOfMoving.setSpacing(3);

		f1 = new File("icons//bobines-video-icon.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView = new ImageView();
		ImageView.setImage(i);
		ImageView.setFitHeight(25);
		ImageView.setFitWidth(25);
		IsSelected = new CheckBox();
		IsSelected.setGraphic(ImageView);
		IsSelected.setAlignment(Pos.CENTER_LEFT);
		HBox h7 = new HBox();
		h7.setSpacing(5);
		Text t8 = new Text(words[184]);
		t8.setId("TextBig");

		f1 = new File("icons//delete.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView2 = new ImageView();
		ImageView2.setImage(i);
		ImageView2.setFitHeight(10);
		ImageView2.setFitWidth(10);
		Button remove = new Button();
		remove.setGraphic(ImageView2);

		f1 = new File("icons//energy-funchhtiongraphic-EN.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView3 = new ImageView();
		ImageView3.setImage(i);
		ImageView3.setFitHeight(25);
		ImageView3.setFitWidth(25);
		Energy_Grid_Source = new CheckBox(words[185]);
		Energy_Grid_Source.setGraphic(ImageView3);

		h7.getChildren().addAll(IsSelected, t8, remove);
		remove.setOnAction(a -> {
			ListeOfSecnario.getChildren().remove(this);
		});

		add(h7, 1, 0);
		add(new Separator(), 0, 0);
		add(Energy_Grid_Source, 2, 0);
		add(h1, 0, 1);
		h7.setAlignment(Pos.CENTER);
		ScrollPane ScrollPane1 = new ScrollPane(ListeOfMoving);
		ScrollPane1.setMinWidth(300);
		ScrollPane1.setMaxWidth(300);
		add(ScrollPane1, 0, 2);

		add(h2, 1, 1);
		add(new ScrollPane(tree), 1, 2);

		add(h22, 2, 1);
		add(new ScrollPane(tree2), 2, 2);

		VBox vx = new VBox();

		setPadding(new Insets(5));
		setId("Activity_Vbox");

		vx.getChildren().addAll(h4, opacityLevelLight, h5, opacityLevelTempr, h6, opacityLevelDuration);
		vx.setSpacing(5);

		add(h4, 0, 3);
		add(opacityLevelLight, 0, 4);

		add(h5, 1, 3);
		add(opacityLevelTempr, 1, 4);

		add(h6, 2, 3);
		add(opacityLevelDuration, 2, 4);
		
		opacityLevelLight.setMaxWidth(250);
		opacityLevelTempr.setMaxWidth(250);
		opacityLevelDuration.setMaxWidth(250);

		// ============================================================================================

		HBox h = new HBox();
		h.setSpacing(10);

		f1 = new File("icons//property.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView4 = new ImageView();
		ImageView4.setImage(i);
		ImageView4.setFitHeight(25);
		ImageView4.setFitWidth(25);
		Text t4 = new Text("Edit DataTypeProperty :");
		Button editroperty = new Button("add");
		h.getChildren().addAll(ImageView4, t4, editroperty);

		listeOfProperty = new VBox();
		listeOfProperty.setSpacing(5);

		add(h, 0, 5);

		ScrollPane ScrollPane2 = new ScrollPane(listeOfProperty);

		ScrollPane2.setMinWidth(300);
		ScrollPane2.setMaxWidth(300);
		ScrollPane2.setMinHeight(150);

		add(ScrollPane2, 0, 6);

		editroperty.setOnAction(a -> {
			ListeOfOWLDataTypeProperty ListeOfOWLDataTypeProperty = new ListeOfOWLDataTypeProperty();

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); ii++) {
				ListeOfOWLDataTypeProperty.IndList.getItems().add(
						Main.getOntologyIndividualsModel().getOntologyIndividuals().get(ii).getOntologyIndividualsId());
			}

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyModelGIS()
					.getOWLDatatypeProperty_OpenSBSList().size(); ii++) {
				ListeOfOWLDataTypeProperty.propertyList.getItems().add(Main.getOntologyIndividualsModel()
						.getOntologyModelGIS().getOWLDatatypeProperty_OpenSBSList().get(ii).getBrowserText());
			}

			listeOfProperty.getChildren().add(ListeOfOWLDataTypeProperty);

		});

		// ============================================================================================

		HBox h8 = new HBox();
		h8.setSpacing(10);

		f1 = new File("icons//relation.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView5 = new ImageView();
		ImageView5.setImage(i);
		ImageView5.setFitHeight(25);
		ImageView5.setFitWidth(25);
		Text t5 = new Text("Add ObjectProperty :");
		Button editObjectroperty = new Button("add");
		h8.getChildren().addAll(ImageView5, t5, editObjectroperty);

		listeOfObjectProperty = new VBox();
		listeOfObjectProperty.setSpacing(5);

		add(h8, 1, 5);

		ScrollPane ScrollPane3 = new ScrollPane(listeOfObjectProperty);

		ScrollPane3.setMinWidth(300);
		ScrollPane3.setMinHeight(150);
		ScrollPane3.setMaxWidth(300);

		add(ScrollPane3, 1, 6);

		editObjectroperty.setOnAction(a -> {

			ListeOfOWLObjectProperty ListeOfOWLObjectProperty = new ListeOfOWLObjectProperty();

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyModelGIS()
					.getOWLObjectProperty_OpenSBSList().size(); ii++) {
				ListeOfOWLObjectProperty.ObjectProperty.getItems().add(Main.getOntologyIndividualsModel()
						.getOntologyModelGIS().getOWLObjectProperty_OpenSBSList().get(ii).getBrowserText());
			}

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); ii++) {
				ListeOfOWLObjectProperty.Domain.getItems().add(
						Main.getOntologyIndividualsModel().getOntologyIndividuals().get(ii).getOntologyIndividualsId());
			}

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); ii++) {
				ListeOfOWLObjectProperty.Rang.getItems().add(
						Main.getOntologyIndividualsModel().getOntologyIndividuals().get(ii).getOntologyIndividualsId());
			}
			listeOfObjectProperty.getChildren().add(ListeOfOWLObjectProperty);

		});

		// ============================================================================================
		// ============================================================================================

		HBox h9 = new HBox();
		h9.setSpacing(10);

		f1 = new File("icons//relation.png");
		i = new Image(f1.toURI().toString());
		ImageView ImageView6 = new ImageView();
		ImageView6.setImage(i);
		ImageView6.setFitHeight(25);
		ImageView6.setFitWidth(25);
		Text t6 = new Text("Remove ObjectProperty :");
		Button removeObjectroperty = new Button("add");
		h9.getChildren().addAll(ImageView6, t6, removeObjectroperty);

		listeOfRemoveObjectProperty = new VBox();
		listeOfRemoveObjectProperty.setSpacing(5);

		add(h9, 2, 5);

		ScrollPane ScrollPane4 = new ScrollPane(listeOfRemoveObjectProperty);

		ScrollPane4.setMinWidth(300);
		ScrollPane4.setMinHeight(150);

		add(ScrollPane4, 2, 6);

		removeObjectroperty.setOnAction(a -> {

			ListeOfOWLObjectProperty ListeOfOWLObjectProperty = new ListeOfOWLObjectProperty();

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyModelGIS()
					.getOWLObjectProperty_OpenSBSList().size(); ii++) {
				ListeOfOWLObjectProperty.ObjectProperty.getItems().add(Main.getOntologyIndividualsModel()
						.getOntologyModelGIS().getOWLObjectProperty_OpenSBSList().get(ii).getBrowserText());
			}

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); ii++) {
				ListeOfOWLObjectProperty.Domain.getItems().add(
						Main.getOntologyIndividualsModel().getOntologyIndividuals().get(ii).getOntologyIndividualsId());
			}

			for (int ii = 0; ii < Main.getOntologyIndividualsModel().getOntologyIndividuals().size(); ii++) {
				ListeOfOWLObjectProperty.Rang.getItems().add(
						Main.getOntologyIndividualsModel().getOntologyIndividuals().get(ii).getOntologyIndividualsId());
			}

			listeOfRemoveObjectProperty.getChildren().add(ListeOfOWLObjectProperty);

		});

		
		// ============================================================================================

	}

	public List<CheckBoxTreeItem<String>> ListeOfTurnOffliste() {
		return ListeOfTurnOnliste;
	}

	public void setListeOfTurnOnliste(List<CheckBoxTreeItem<String>> listeOfTurnOnliste) {
		ListeOfTurnOnliste = listeOfTurnOnliste;
	}

	public List<CheckBoxTreeItem<String>> getListeOfTurnOffliste() {
		return ListeOfTurnOffliste;
	}

	public void setListeOfTurnOffliste(List<CheckBoxTreeItem<String>> listeOfTurnOffliste) {
		ListeOfTurnOffliste = listeOfTurnOffliste;
	}

	public List<CheckBoxTreeItem<String>> getListeOfTurnOnliste() {
		return ListeOfTurnOnliste;
	}

	public VBox getListeOfRemoveObjectProperty() {
		return listeOfRemoveObjectProperty;
	}

	public void setListeOfRemoveObjectProperty(VBox listeOfRemoveObjectProperty) {
		this.listeOfRemoveObjectProperty = listeOfRemoveObjectProperty;
	}

	public ListeOfOWLObjectProperty CreatListeOfOWLObjectProperty() {
		return new ListeOfOWLObjectProperty();
	}

	public class ListeOfOWLObjectProperty extends GridPane {
		private ChoiceBox ObjectProperty;
		private ChoiceBox Rang;
		private ChoiceBox Domain;

		public ChoiceBox getObjectProperty() {
			return ObjectProperty;
		}

		public void setObjectProperty(ChoiceBox objectProperty) {
			ObjectProperty = objectProperty;
		}

		public ChoiceBox getRang() {
			return Rang;
		}

		public void setRang(ChoiceBox rang) {
			Rang = rang;
		}

		public ChoiceBox getDomain() {
			return Domain;
		}

		public void setDomain(ChoiceBox domain) {
			Domain = domain;
		}

		public ListeOfOWLObjectProperty() {

			setPadding(new Insets(5));
			setId("Activity_Vbox");
			Text t22 = new Text("ObjectProperty : ");
			ObjectProperty = new ChoiceBox<String>();
			Text t42 = new Text("Rang :");
			Rang = new ChoiceBox();
			Text t52 = new Text("Domain :");
			Domain = new ChoiceBox<String>();
			setVgap(5);
			setHgap(5);
			add(t22, 0, 0);
			add(ObjectProperty, 1, 0);
			add(t52, 0, 1);
			add(Domain, 1, 1);
			add(t42, 0, 2);
			add(Rang, 1, 2);

			

			ObjectProperty.setMaxWidth(170);
			Domain.setMaxWidth(170);
			Rang.setMaxWidth(170);

			// Activity_Vbox

			// TODO Auto-generated constructor stub
		}
	}

	public ListeOfOWLDataTypeProperty CreatListeOfOWLDataTypeProperty() {
		return new ListeOfOWLDataTypeProperty();
	}

	public class ListeOfOWLDataTypeProperty extends GridPane {
		private ChoiceBox propertyList;
		private TextField propertyval;
		private ChoiceBox IndList;

		public ChoiceBox getPropertyList() {
			return propertyList;
		}

		public void setPropertyList(ChoiceBox propertyList) {
			this.propertyList = propertyList;
		}

		public TextField getPropertyval() {
			return propertyval;
		}

		public void setPropertyval(TextField propertyval) {
			this.propertyval = propertyval;
		}

		public ChoiceBox getIndList() {
			return IndList;
		}

		public void setIndList(ChoiceBox indList) {
			IndList = indList;
		}

		public ListeOfOWLDataTypeProperty() {

			setPadding(new Insets(5));
			setId("Activity_Vbox");
			Text t22 = new Text("Property : ");
			propertyList = new ChoiceBox<String>();
			Text t42 = new Text("Val :");
			propertyval = new TextField();
			Text t52 = new Text("Individual :");
			IndList = new ChoiceBox<String>();
			setVgap(5);
			setHgap(5);
			add(t22, 0, 0);
			add(propertyList, 1, 0);
			add(t42, 0, 1);
			add(propertyval, 1, 1);
			add(t52, 0, 2);
			add(IndList, 1, 2);

			
			propertyList.setMaxWidth(210);
			propertyval.setMaxWidth(210);
			IndList.setMaxWidth(210);

			// Activity_Vbox

			// TODO Auto-generated constructor stub
		}
	}

	public ListeOfMovingclass CreatListeOfMovingclass() {
		return new ListeOfMovingclass();
	}

	public class ListeOfMovingclass extends GridPane {
		private ChoiceBox<String> Actor;
		private ChoiceBox<String> Zones;
		private ChoiceBox<String> Activitys;

		public ListeOfMovingclass() {
			setPadding(new Insets(3));
			setHgap(3);
			setVgap(3);

			File f1 = new File("icons//3-512.png");
			Image i = new Image(f1.toURI().toString());
			final ImageView selectedImage14 = new ImageView();
			selectedImage14.setImage(i);
			selectedImage14.setFitHeight(30);
			selectedImage14.setFitWidth(30);
			Text t1 = new Text(words[174]);
			Actor = new ChoiceBox<String>();
			Text t2 = new Text(words[175]);
			Zones = new ChoiceBox<String>();
			Text t3 = new Text(words[176]);
			Activitys = new ChoiceBox<String>();

			Actor.setOnAction(a -> {
				// Main.getOntologyIndividualsModel().ShowOWLObjectProperty(Actor.getValue().toString());

				try {
					while (true) {
						Activitys.getItems().remove(0);
					}
				} catch (Exception e) {

				}

				OntologyIndividuals OntologyIndividuals = Main.getOntologyIndividualsModel()
						.GetOntologyIndividuals(Actor.getValue().toString());

				if (OntologyIndividuals != null) {
					for (int j = 0; j < OntologyIndividuals.getOWLObjectProperty().size(); j++) {

						if (OntologyIndividuals.getOWLObjectProperty().get(j).getType().getBrowserText()
								.equals(Main.getOntologyIndividualsModel().getOntologyModelGIS().getHuman_Has_Activity()
										.getBrowserText())) {
							Activitys.getItems()
									.add(OntologyIndividuals.getOWLObjectProperty().get(j).getRange().toString());
						}
					}
				}
			});

			t1.setId("TextBig");
			t2.setId("TextBig");
			t3.setId("TextBig");
			setId("Activity_Vbox");
			this.add(selectedImage14, 0, 0);
			this.add(new Separator(), 1, 0);
			this.add(t1, 0, 1);
			this.add(Actor, 1, 1);
			this.add(t2, 0, 2);
			this.add(Zones, 1, 2);
			this.add(t3, 0, 3);
			this.add(Activitys, 1, 3);

			Actor.setMaxWidth(220);
			Zones.setMaxWidth(220);
			Activitys.setMaxWidth(220);
			
			Actor.setMinWidth(220);
			Zones.setMinWidth(220);
			Activitys.setMinWidth(220);

		}

		public ChoiceBox<String> getActor() {
			return Actor;
		}

		public ChoiceBox<String> getZones() {
			return Zones;
		}

		public ChoiceBox<String> getActivitys() {
			return Activitys;
		}
	}

	public boolean TestExistingSuperCclass(List<String> l, String c) {
		for (int i = 0; i < l.size(); i++) {
			if (c.equals(l.get(i))) {
				return true;
			}
		}
		return false;
	}

	public Dimension getScreenSize() {
		return screenSize;
	}

	public FileTxtManagmentGIS getFileTxtManagmentGIS() {
		return FileTxtManagmentGIS;
	}

	public String[] getWords() {
		return words;
	}

	public VBox getListeOfMoving() {
		return ListeOfMoving;
	}

	public Button getAddMoving() {
		return AddMoving;
	}

	public CheckBoxTreeItem<String> getListeOfTurnOn() {
		return ListeOfTurnOn;
	}

	public CheckBoxTreeItem<String> getListeOfTurnOff() {
		return ListeOfTurnOff;
	}

	public GridPane getListeOfOptions() {
		return ListeOfOptions;
	}

	public Slider getOpacityLevelLight() {
		return opacityLevelLight;
	}

	public Slider getOpacityLevelTempr() {
		return opacityLevelTempr;
	}

	public Slider getOpacityLevelDuration() {
		return opacityLevelDuration;
	}

	public Main getMain() {
		return Main;
	}

	public VBox getListeOfObjectProperty() {
		return listeOfObjectProperty;
	}

	public void setListeOfObjectProperty(VBox listeOfObjectProperty) {
		this.listeOfObjectProperty = listeOfObjectProperty;
	}

	public void setlisteOfRemoveObjectProperty(VBox listeOfRemoveObjectProperty) {
		this.listeOfRemoveObjectProperty = listeOfRemoveObjectProperty;
	}

	public VBox getListeOfProperty() {
		return listeOfProperty;
	}

	public void setListeOfProperty(VBox listeOfProperty) {
		this.listeOfProperty = listeOfProperty;
	}

	public void setScreenSize(Dimension screenSize) {
		this.screenSize = screenSize;
	}

	public void setFileTxtManagmentGIS(FileTxtManagmentGIS fileTxtManagmentGIS) {
		FileTxtManagmentGIS = fileTxtManagmentGIS;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public void setListeOfMoving(VBox listeOfMoving) {
		ListeOfMoving = listeOfMoving;
	}

	public void setAddMoving(Button addMoving) {
		AddMoving = addMoving;
	}

	public void setListeOfTurnOn(CheckBoxTreeItem<String> listeOfTurnOn) {
		ListeOfTurnOn = listeOfTurnOn;
	}

	public void setListeOfTurnOff(CheckBoxTreeItem<String> listeOfTurnOff) {
		ListeOfTurnOff = listeOfTurnOff;
	}

	public void setListeOfOptions(GridPane listeOfOptions) {
		ListeOfOptions = listeOfOptions;
	}

	public void setOpacityLevelLight(Slider opacityLevelLight) {
		this.opacityLevelLight = opacityLevelLight;
	}

	public void setOpacityLevelTempr(Slider opacityLevelTempr) {
		this.opacityLevelTempr = opacityLevelTempr;
	}

	public void setOpacityLevelDuration(Slider opacityLevelDuration) {
		this.opacityLevelDuration = opacityLevelDuration;
	}

	public void setMain(Main main) {
		Main = main;
	}

	public void setIsSelected(CheckBox isSelected) {
		IsSelected = isSelected;
	}

	public void setEnergy_Grid_Source(CheckBox energy_Grid_Source) {
		Energy_Grid_Source = energy_Grid_Source;
	}
}
