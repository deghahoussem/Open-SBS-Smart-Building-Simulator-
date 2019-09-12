package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import DataManagment.FileTxtManagmentGIS;
import Ontology.OWLNamedClass_OpenSBS;
import application.App_Nodes_Actions;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CreateIndividual extends Tab {

	private BorderPane mainpane;
	private BorderPane CeneterPane;

	private Menu Listeoftypes;
	private Menu Actors;
	private Menu Group;
	private MenuItem Family;
	private Menu Individ;
	private Menu Human;
	private MenuItem grandmother;
	private MenuItem grandfather;
	private MenuItem mother;
	private MenuItem father;
	private MenuItem sister;
	private MenuItem broher;
	private Menu NonHuman;
	private Menu Pets;
	private MenuItem Dogs;
	private MenuItem Cats;
	private Menu Robot;
	private MenuItem missionRobot;
	private Menu Devices;
	private Menu DeviceConsumeEnergy;
	private Menu AudioAndVideo;
	private Menu BodyCare;
	private Menu CleaningDevices;
	private Menu Counters;
	private Menu KetchinDevices;
	private Menu Lights;
	private Menu Media;

	private MenuItem Desktop;
	private MenuItem Printer;
	private Menu NetworkCoordinations;
	private Menu Security;
	private Menu Sensors;
	private Menu Switches;
	private Menu WeatherDevices;
	private Menu DeviceProductEnergy;
	private Menu contaminated_Energy;
	private MenuItem Electricity_Generator;
	private MenuItem gas_turbine;
	private Menu Green_Energy;
	private MenuItem Solar_Panels;
	private MenuItem Windmills;

	private MenuItem CDPlayer;
	//// ---------
	private MenuItem HairDryer;
	private MenuItem HairIron;
	private MenuItem MicrowaveOven;
	// --------------
	private MenuItem CentralVacuumCleaner;
	private MenuItem RoboticVacuumCleaner;
	private MenuItem ThorWashingMachine;
	private MenuItem VacuumCleaner;
	private MenuItem WashingMachine;
	// -----------------
	private MenuItem ElectricityCounter;
	// ------------
	private MenuItem Dishwasher;
	private MenuItem ElectricWaterBoiler;
	private MenuItem Oven;
	private MenuItem Refrigerators;
	private MenuItem Stove;

	private MenuItem Blender;
	private MenuItem CoffeeMmachine;

	// -----------------
	private MenuItem Lightss;
	// -----------------
	private MenuItem phone;
	private MenuItem television;
	// -----------------
	private MenuItem Hub;
	private MenuItem Router;
	// -----------------
	private MenuItem Camera;
	// ----------------
	private MenuItem Light_sensors;
	private MenuItem MovingSensor;
	private MenuItem RainSensor;
	private MenuItem SmokeSensor;
	private MenuItem TemperatureSensor;
	private MenuItem WindSensor;

	private MenuItem CO2_Sensor;
	private MenuItem Energy_Metering_Sensor;
	private MenuItem Noise_Sensor;
	private MenuItem Proximity_Sensor;
	private MenuItem RFID_Tag_Sensor;

	// ----------------;
	private MenuItem Switchess;
	// ----------;
	private Menu Cooling;
	private MenuItem AirConditioner;
	private MenuItem AtticFan;
	private MenuItem CeilingFan;
	private MenuItem WindowFan;
	// ---------------
	private Menu Heating;
	private MenuItem PatioHeater;

	private BorderPane PaneofMenu;

	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();

	private String Typeofcreateind;

	private GridPane CreateDevice;
	private TextField devicename;
	private TextField device_consuming;
	private TextField device_protocol;
	private ChoiceBox<String> devicestat;
	private TextField device_values;
	private ChoiceBox<String> devicezone;
	private Button create_device;
	private ImageView selectedImage_CreatDevices;

	private GridPane CreatActor;
	private Text Txt_CreatActor;
	private ImageView selectedImage_CreatActor;
	private TextField First_Name_of_ind_txf;
	private DatePicker birthday_of_ind_txf;
	private TextField email_of_ind_txf;
	private TextField phone_of_ind_txf;
	private ChoiceBox<String> sex_of_ind_txf;
	private ChoiceBox<String> state_of_ind_txf;
	private ChoiceBox<String> shooseZones;
	private VBox Activity_Vbox;
	private Button AddActivity;
	private Button Button_CreatActor;
	// = new DatePicker();

	public void SetAction(App_Nodes_Actions App_Nodes_Actions) {
		create_device.setOnAction(App_Nodes_Actions);
		Family.setOnAction(App_Nodes_Actions);
		grandmother.setOnAction(App_Nodes_Actions);
		grandfather.setOnAction(App_Nodes_Actions);
		mother.setOnAction(App_Nodes_Actions);
		father.setOnAction(App_Nodes_Actions);
		sister.setOnAction(App_Nodes_Actions);
		broher.setOnAction(App_Nodes_Actions);
		Dogs.setOnAction(App_Nodes_Actions);
		Cats.setOnAction(App_Nodes_Actions);
		missionRobot.setOnAction(App_Nodes_Actions);

		AddActivity.setOnAction(App_Nodes_Actions);
		Button_CreatActor.setOnAction(App_Nodes_Actions);
		// -------------------
		Electricity_Generator.setOnAction(App_Nodes_Actions);
		gas_turbine.setOnAction(App_Nodes_Actions);
		Solar_Panels.setOnAction(App_Nodes_Actions);
		Windmills.setOnAction(App_Nodes_Actions);

		CDPlayer.setOnAction(App_Nodes_Actions);
		//// ---------
		HairDryer.setOnAction(App_Nodes_Actions);
		HairIron.setOnAction(App_Nodes_Actions);
		MicrowaveOven.setOnAction(App_Nodes_Actions);
		// --------------
		CentralVacuumCleaner.setOnAction(App_Nodes_Actions);
		RoboticVacuumCleaner.setOnAction(App_Nodes_Actions);
		ThorWashingMachine.setOnAction(App_Nodes_Actions);
		VacuumCleaner.setOnAction(App_Nodes_Actions);
		WashingMachine.setOnAction(App_Nodes_Actions);
		// -----------------
		ElectricityCounter.setOnAction(App_Nodes_Actions);
		// ------------
		Dishwasher.setOnAction(App_Nodes_Actions);
		ElectricWaterBoiler.setOnAction(App_Nodes_Actions);
		Oven.setOnAction(App_Nodes_Actions);
		Refrigerators.setOnAction(App_Nodes_Actions);
		Stove.setOnAction(App_Nodes_Actions);
		Blender.setOnAction(App_Nodes_Actions);
		 CoffeeMmachine .setOnAction(App_Nodes_Actions);

		// -----------------
		Lightss.setOnAction(App_Nodes_Actions);
		// -----------------
		phone.setOnAction(App_Nodes_Actions);
		television.setOnAction(App_Nodes_Actions);
		Desktop.setOnAction(App_Nodes_Actions);
		Printer.setOnAction(App_Nodes_Actions);
		// -----------------
		Hub.setOnAction(App_Nodes_Actions);
		Router.setOnAction(App_Nodes_Actions);
		// -----------------
		Camera.setOnAction(App_Nodes_Actions);
		// ----------------
		Light_sensors.setOnAction(App_Nodes_Actions);
		MovingSensor.setOnAction(App_Nodes_Actions);
		RainSensor.setOnAction(App_Nodes_Actions);
		SmokeSensor.setOnAction(App_Nodes_Actions);
		TemperatureSensor.setOnAction(App_Nodes_Actions);
		WindSensor.setOnAction(App_Nodes_Actions);

		CO2_Sensor.setOnAction(App_Nodes_Actions);
		Energy_Metering_Sensor.setOnAction(App_Nodes_Actions);
		Noise_Sensor.setOnAction(App_Nodes_Actions);
		Proximity_Sensor.setOnAction(App_Nodes_Actions);
		RFID_Tag_Sensor.setOnAction(App_Nodes_Actions);

		// ----------------.setOnAction(App_Nodes_Actions);
		Switchess.setOnAction(App_Nodes_Actions);
		// ----------.setOnAction(App_Nodes_Actions);
		Cooling.setOnAction(App_Nodes_Actions);
		AirConditioner.setOnAction(App_Nodes_Actions);
		AtticFan.setOnAction(App_Nodes_Actions);
		CeilingFan.setOnAction(App_Nodes_Actions);
		WindowFan.setOnAction(App_Nodes_Actions);
		// ---------------
		Heating.setOnAction(App_Nodes_Actions);
		PatioHeater.setOnAction(App_Nodes_Actions);

	}

	public MenuItem getBlender() {
		return Blender;
	}

	public void setBlender(MenuItem blender) {
		Blender = blender;
	}

	public MenuItem getCoffeeMmachine() {
		return CoffeeMmachine;
	}

	public void setCoffeeMmachine(MenuItem coffeeMmachine) {
		CoffeeMmachine = coffeeMmachine;
	}

	public void setDesktop(MenuItem desktop) {
		Desktop = desktop;
	}

	public MenuItem getCO2_Sensor() {
		return CO2_Sensor;
	}

	public void setCO2_Sensor(MenuItem cO2_Sensor) {
		CO2_Sensor = cO2_Sensor;
	}

	public MenuItem getEnergy_Metering_Sensor() {
		return Energy_Metering_Sensor;
	}

	public void setEnergy_Metering_Sensor(MenuItem energy_Metering_Sensor) {
		Energy_Metering_Sensor = energy_Metering_Sensor;
	}

	public MenuItem getNoise_Sensor() {
		return Noise_Sensor;
	}

	public void setNoise_Sensor(MenuItem noise_Sensor) {
		Noise_Sensor = noise_Sensor;
	}

	public MenuItem getProximity_Sensor() {
		return Proximity_Sensor;
	}

	public void setProximity_Sensor(MenuItem proximity_Sensor) {
		Proximity_Sensor = proximity_Sensor;
	}

	public MenuItem getRFID_Tag_Sensor() {
		return RFID_Tag_Sensor;
	}

	public void setRFID_Tag_Sensor(MenuItem rFID_Tag_Sensor) {
		RFID_Tag_Sensor = rFID_Tag_Sensor;
	}

	public void setMainpane(BorderPane mainpane) {
		this.mainpane = mainpane;
	}

	public void setCeneterPane(BorderPane ceneterPane) {
		CeneterPane = ceneterPane;
	}

	public void setListeoftypes(Menu listeoftypes) {
		Listeoftypes = listeoftypes;
	}

	public void setActors(Menu actors) {
		Actors = actors;
	}

	public void setGroup(Menu group) {
		Group = group;
	}

	public void setFamily(MenuItem family) {
		Family = family;
	}

	public void setIndivid(Menu individ) {
		Individ = individ;
	}

	public void setHuman(Menu human) {
		Human = human;
	}

	public void setGrandmother(MenuItem grandmother) {
		this.grandmother = grandmother;
	}

	public void setGrandfather(MenuItem grandfather) {
		this.grandfather = grandfather;
	}

	public void setMother(MenuItem mother) {
		this.mother = mother;
	}

	public void setFather(MenuItem father) {
		this.father = father;
	}

	public void setSister(MenuItem sister) {
		this.sister = sister;
	}

	public void setBroher(MenuItem broher) {
		this.broher = broher;
	}

	public void setNonHuman(Menu nonHuman) {
		NonHuman = nonHuman;
	}

	public void setPets(Menu pets) {
		Pets = pets;
	}

	public void setDogs(MenuItem dogs) {
		Dogs = dogs;
	}

	public void setCats(MenuItem cats) {
		Cats = cats;
	}

	public void setRobot(Menu robot) {
		Robot = robot;
	}

	public void setMissionRobot(MenuItem missionRobot) {
		this.missionRobot = missionRobot;
	}

	public void setDevices(Menu devices) {
		Devices = devices;
	}

	public void setDeviceConsumeEnergy(Menu deviceConsumeEnergy) {
		DeviceConsumeEnergy = deviceConsumeEnergy;
	}

	public void setAudioAndVideo(Menu audioAndVideo) {
		AudioAndVideo = audioAndVideo;
	}

	public void setBodyCare(Menu bodyCare) {
		BodyCare = bodyCare;
	}

	public void setCleaningDevices(Menu cleaningDevices) {
		CleaningDevices = cleaningDevices;
	}

	public void setCounters(Menu counters) {
		Counters = counters;
	}

	public void setKetchinDevices(Menu ketchinDevices) {
		KetchinDevices = ketchinDevices;
	}

	public void setLights(Menu lights) {
		Lights = lights;
	}

	public void setMedia(Menu media) {
		Media = media;
	}

	public void setNetworkCoordinations(Menu networkCoordinations) {
		NetworkCoordinations = networkCoordinations;
	}

	public void setSecurity(Menu security) {
		Security = security;
	}

	public void setSensors(Menu sensors) {
		Sensors = sensors;
	}

	public void setSwitches(Menu switches) {
		Switches = switches;
	}

	public void setWeatherDevices(Menu weatherDevices) {
		WeatherDevices = weatherDevices;
	}

	public void setDeviceProductEnergy(Menu deviceProductEnergy) {
		DeviceProductEnergy = deviceProductEnergy;
	}

	public void setContaminated_Energy(Menu contaminated_Energy) {
		this.contaminated_Energy = contaminated_Energy;
	}

	public void setElectricity_Generator(MenuItem electricity_Generator) {
		Electricity_Generator = electricity_Generator;
	}

	public void setGas_turbine(MenuItem gas_turbine) {
		this.gas_turbine = gas_turbine;
	}

	public void setGreen_Energy(Menu green_Energy) {
		Green_Energy = green_Energy;
	}

	public void setSolar_Panels(MenuItem solar_Panels) {
		Solar_Panels = solar_Panels;
	}

	public void setWindmills(MenuItem windmills) {
		Windmills = windmills;
	}

	public void setCDPlayer(MenuItem cDPlayer) {
		CDPlayer = cDPlayer;
	}

	public void setHairDryer(MenuItem hairDryer) {
		HairDryer = hairDryer;
	}

	public void setHairIron(MenuItem hairIron) {
		HairIron = hairIron;
	}

	public void setMicrowaveOven(MenuItem microwaveOven) {
		MicrowaveOven = microwaveOven;
	}

	public void setCentralVacuumCleaner(MenuItem centralVacuumCleaner) {
		CentralVacuumCleaner = centralVacuumCleaner;
	}

	public void setRoboticVacuumCleaner(MenuItem roboticVacuumCleaner) {
		RoboticVacuumCleaner = roboticVacuumCleaner;
	}

	public void setThorWashingMachine(MenuItem thorWashingMachine) {
		ThorWashingMachine = thorWashingMachine;
	}

	public void setVacuumCleaner(MenuItem vacuumCleaner) {
		VacuumCleaner = vacuumCleaner;
	}

	public void setWashingMachine(MenuItem washingMachine) {
		WashingMachine = washingMachine;
	}

	public void setElectricityCounter(MenuItem electricityCounter) {
		ElectricityCounter = electricityCounter;
	}

	public void setDishwasher(MenuItem dishwasher) {
		Dishwasher = dishwasher;
	}

	public void setElectricWaterBoiler(MenuItem electricWaterBoiler) {
		ElectricWaterBoiler = electricWaterBoiler;
	}

	public void setOven(MenuItem oven) {
		Oven = oven;
	}

	public void setRefrigerators(MenuItem refrigerators) {
		Refrigerators = refrigerators;
	}

	public void setStove(MenuItem stove) {
		Stove = stove;
	}

	public void setLightss(MenuItem lightss) {
		Lightss = lightss;
	}

	public void setPhone(MenuItem phone) {
		this.phone = phone;
	}

	public void setTelevision(MenuItem television) {
		this.television = television;
	}

	public void setHub(MenuItem hub) {
		Hub = hub;
	}

	public void setRouter(MenuItem router) {
		Router = router;
	}

	public void setCamera(MenuItem camera) {
		Camera = camera;
	}

	public void setLight_sensors(MenuItem light_sensors) {
		Light_sensors = light_sensors;
	}

	public void setMovingSensor(MenuItem movingSensor) {
		MovingSensor = movingSensor;
	}

	public void setRainSensor(MenuItem rainSensor) {
		RainSensor = rainSensor;
	}

	public void setSmokeSensor(MenuItem smokeSensor) {
		SmokeSensor = smokeSensor;
	}

	public void setTemperatureSensor(MenuItem temperatureSensor) {
		TemperatureSensor = temperatureSensor;
	}

	public void setWindSensor(MenuItem windSensor) {
		WindSensor = windSensor;
	}

	public void setSwitchess(MenuItem switchess) {
		Switchess = switchess;
	}

	public void setCooling(Menu cooling) {
		Cooling = cooling;
	}

	public void setAirConditioner(MenuItem airConditioner) {
		AirConditioner = airConditioner;
	}

	public void setAtticFan(MenuItem atticFan) {
		AtticFan = atticFan;
	}

	public void setCeilingFan(MenuItem ceilingFan) {
		CeilingFan = ceilingFan;
	}

	public void setWindowFan(MenuItem windowFan) {
		WindowFan = windowFan;
	}

	public void setHeating(Menu heating) {
		Heating = heating;
	}

	public void setPatioHeater(MenuItem patioHeater) {
		PatioHeater = patioHeater;
	}

	public void setPaneofMenu(BorderPane paneofMenu) {
		PaneofMenu = paneofMenu;
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

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setTypeofcreateind(String typeofcreateind) {
		Typeofcreateind = typeofcreateind;
	}

	public void setCreateDevice(GridPane createDevice) {
		CreateDevice = createDevice;
	}

	public void setDevicename(TextField devicename) {
		this.devicename = devicename;
	}

	public void setDevice_consuming(TextField device_consuming) {
		this.device_consuming = device_consuming;
	}

	public void setDevice_protocol(TextField device_protocol) {
		this.device_protocol = device_protocol;
	}

	public void setDevicestat(ChoiceBox<String> devicestat) {
		this.devicestat = devicestat;
	}

	public void setDevice_values(TextField device_values) {
		this.device_values = device_values;
	}

	public void setDevicezone(ChoiceBox<String> devicezone) {
		this.devicezone = devicezone;
	}

	public void setCreate_device(Button create_device) {
		this.create_device = create_device;
	}

	public void setSelectedImage_CreatDevices(ImageView selectedImage_CreatDevices) {
		this.selectedImage_CreatDevices = selectedImage_CreatDevices;
	}

	public void setCreatActor(GridPane creatActor) {
		CreatActor = creatActor;
	}

	public void setTxt_CreatActor(Text txt_CreatActor) {
		Txt_CreatActor = txt_CreatActor;
	}

	public void setSelectedImage_CreatActor(ImageView selectedImage_CreatActor) {
		this.selectedImage_CreatActor = selectedImage_CreatActor;
	}

	public void setFirst_Name_of_ind_txf(TextField first_Name_of_ind_txf) {
		First_Name_of_ind_txf = first_Name_of_ind_txf;
	}

	public void setBirthday_of_ind_txf(DatePicker birthday_of_ind_txf) {
		this.birthday_of_ind_txf = birthday_of_ind_txf;
	}

	public void setEmail_of_ind_txf(TextField email_of_ind_txf) {
		this.email_of_ind_txf = email_of_ind_txf;
	}

	public void setPhone_of_ind_txf(TextField phone_of_ind_txf) {
		this.phone_of_ind_txf = phone_of_ind_txf;
	}

	public void setSex_of_ind_txf(ChoiceBox<String> sex_of_ind_txf) {
		this.sex_of_ind_txf = sex_of_ind_txf;
	}

	public void setState_of_ind_txf(ChoiceBox<String> state_of_ind_txf) {
		this.state_of_ind_txf = state_of_ind_txf;
	}

	public void setShooseZones(ChoiceBox<String> shooseZones) {
		this.shooseZones = shooseZones;
	}

	public void setActivity_Vbox(VBox activity_Vbox) {
		Activity_Vbox = activity_Vbox;
	}

	public void setAddActivity(Button addActivity) {
		AddActivity = addActivity;
	}

	public void setButton_CreatActor(Button button_CreatActor) {
		Button_CreatActor = button_CreatActor;
	}

	public ImageView getSelectedImage_CreatDevices() {
		return selectedImage_CreatDevices;
	}

	public GridPane CreateCreateDevice(String TypeActor) {
		CreateDevice = new GridPane();
		CreateDevice.setHgap(8);
		CreateDevice.setVgap(8);
		CreateDevice.setAlignment(Pos.CENTER);
		Text t1 = new Text(words[116]);
		devicename = new TextField();
		Text t2 = new Text(words[117]);
		device_consuming = new TextField();
		Text t3 = new Text(words[118]);
		device_protocol = new TextField();
		Text t4 = new Text(words[119]);
		devicestat = new ChoiceBox<String>();
		Text t5 = new Text(words[120]);
		device_values = new TextField();
		Text t6 = new Text(words[121]);
		devicezone = new ChoiceBox<String>();

		t1.setId("TextBig");
		t2.setId("TextBig");
		t3.setId("TextBig");
		t4.setId("TextBig");
		t5.setId("TextBig");
		t6.setId("TextBig");

		File f1 = new File("icons//" + "yes" + ".png");
		Image i = new Image(f1.toURI().toString());
		ImageView selectedImage = new ImageView();
		selectedImage.setImage(i);
		selectedImage.setFitHeight(25);
		selectedImage.setFitWidth(25);
		create_device = new Button(words[106]);
		create_device.setGraphic(selectedImage);

		f1 = new File("icons//" + TypeActor + ".png");
		i = new Image(f1.toURI().toString());
		selectedImage_CreatDevices = new ImageView();
		selectedImage_CreatDevices.setImage(i);
		selectedImage_CreatDevices.setFitHeight(200);
		selectedImage_CreatDevices.setFitWidth(200);
		CreateDevice.add(t1, 0, 0);
		CreateDevice.add(devicename, 1, 0);

		CreateDevice.add(t2, 0, 1);
		CreateDevice.add(device_consuming, 1, 1);

		CreateDevice.add(t3, 0, 2);
		CreateDevice.add(device_protocol, 1, 2);

		CreateDevice.add(t4, 0, 3);
		CreateDevice.add(devicestat, 1, 3);
		devicestat.getItems().addAll("on", "off");

		CreateDevice.add(t5, 0, 4);
		CreateDevice.add(device_values, 1, 4);

		CreateDevice.add(t6, 0, 5);
		CreateDevice.add(devicezone, 1, 5);

		CreateDevice.add(create_device, 1, 6);

		CreateDevice.add(selectedImage_CreatDevices, 2, 0);

		CreateDevice.setRowSpan(selectedImage_CreatDevices, 5);
		CreateDevice.setHalignment(t1, HPos.RIGHT);
		CreateDevice.setHalignment(t2, HPos.RIGHT);
		CreateDevice.setHalignment(t3, HPos.RIGHT);
		CreateDevice.setHalignment(t4, HPos.RIGHT);
		CreateDevice.setHalignment(t5, HPos.RIGHT);
		CreateDevice.setHalignment(t6, HPos.RIGHT);

		return CreateDevice;
	}

	public GridPane CraetePaneActors(String TypeActor) {
		Typeofcreateind = TypeActor;
		CreatActor = new GridPane();
		CreatActor.setHgap(8);
		CreatActor.setVgap(8);

		CreatActor.setPadding(new Insets(10));

		Txt_CreatActor = new Text(words[105] + " " + TypeActor + " : ");
		Txt_CreatActor.setId("TextBig");
		First_Name_of_ind_txf = new TextField();

		Text t11 = new Text("Bithday : ");
		birthday_of_ind_txf = new DatePicker();

		Text t21 = new Text("Email : ");
		email_of_ind_txf = new TextField();

		Text t31 = new Text("Phone Number : ");
		phone_of_ind_txf = new TextField();

		Text t41 = new Text("sex : ");
		sex_of_ind_txf = new ChoiceBox<String>();

		Text t5 = new Text("State : ");
		state_of_ind_txf = new ChoiceBox<String>();

		sex_of_ind_txf.getItems().add("male");
		sex_of_ind_txf.getItems().add("female");

		state_of_ind_txf.getItems().add("Boredom");
		state_of_ind_txf.getItems().add("Joyfulness");
		state_of_ind_txf.getItems().add("Restlessness");
		state_of_ind_txf.getItems().add("Disgust");
		state_of_ind_txf.getItems().add("Surprise");
		state_of_ind_txf.getItems().add("Sadness");
		state_of_ind_txf.getItems().add("Worry");
		state_of_ind_txf.getItems().add("Fear");

		File f1 = new File("icons//" + TypeActor + ".png");
		Image i = new Image(f1.toURI().toString());
		selectedImage_CreatActor = new ImageView();
		selectedImage_CreatActor.setImage(i);
		selectedImage_CreatActor.setFitHeight(200);
		// selectedImage_CreatActor.setFitWidth(200);

		f1 = new File("icons//" + "yes" + ".png");
		i = new Image(f1.toURI().toString());
		ImageView selectedImage = new ImageView();
		selectedImage.setImage(i);
		selectedImage.setFitHeight(25);
		selectedImage.setFitWidth(25);
		Button_CreatActor = new Button(words[106]);
		Button_CreatActor.setGraphic(selectedImage);

		Text t2 = new Text(words[107] + " : ");
		t2.setId("TextBig");
		shooseZones = new ChoiceBox<String>();
		CreatActor.setAlignment(Pos.CENTER);
		CreatActor.add(Txt_CreatActor, 0, 0);
		CreatActor.add(First_Name_of_ind_txf, 1, 0);

		CreatActor.add(t11, 0, 1);
		CreatActor.add(birthday_of_ind_txf, 1, 1);
		CreatActor.add(t21, 0, 2);
		CreatActor.add(email_of_ind_txf, 1, 2);
		CreatActor.add(t31, 0, 3);
		CreatActor.add(phone_of_ind_txf, 1, 3);
		CreatActor.add(t41, 2, 0);
		CreatActor.add(sex_of_ind_txf, 3, 0);

		CreatActor.add(t5, 2, 1);
		CreatActor.add(state_of_ind_txf, 3, 1);

		CreatActor.setHalignment(t11, HPos.RIGHT);
		CreatActor.setHalignment(t21, HPos.RIGHT);
		CreatActor.setHalignment(t31, HPos.RIGHT);
		CreatActor.setHalignment(t41, HPos.RIGHT);
		CreatActor.setHalignment(t5, HPos.RIGHT);

		t11.setId("TextBig");
		t21.setId("TextBig");
		t31.setId("TextBig");
		t41.setId("TextBig");
		t5.setId("TextBig");

		CreatActor.add(selectedImage_CreatActor, 5, 0);
		CreatActor.add(Button_CreatActor, 5, 6);
		CreatActor.add(t2, 2, 2);
		CreatActor.add(shooseZones, 3, 2);

		Activity_Vbox = new VBox();

		Activity_Vbox.setSpacing(15);
		// Activity_Vbox.setId("Activity_Vbox");
		Activity_Vbox.setPadding(new Insets(10));
		Text t3 = new Text(words[108]);
		CreatActor.add(t3, 0, 4);
		t3.setId("TextBig");
		Activity_Vbox.setMaxWidth(width / 3.2);
		ScrollPane s = new ScrollPane(Activity_Vbox);
		s.setMaxWidth(width / 3);
		s.setMaxHeight(200);
		CreatActor.add(s, 1, 4);

		f1 = new File("icons//" + "add" + ".png");
		i = new Image(f1.toURI().toString());
		ImageView selectedImage2 = new ImageView();
		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(25);
		selectedImage2.setFitWidth(25);
		AddActivity = new Button();
		AddActivity.setGraphic(selectedImage2);

		CreatActor.add(AddActivity, 0, 5);
		CreatActor.setHalignment(AddActivity, HPos.RIGHT);
		CreatActor.setMaxWidth(width / 1.5);

		CreatActor.setRowSpan(selectedImage_CreatActor, 5);
		CreatActor.setRowSpan(s, 7);
		CreatActor.setHalignment(Txt_CreatActor, HPos.RIGHT);
		CreatActor.setHalignment(t2, HPos.RIGHT);
		CreatActor.setColumnSpan(s, 3);
		CreatActor.setHalignment(t3, HPos.RIGHT);

		return CreatActor;
	}

	public void setCraetePaneActors(String TypeActor) {
		File f1 = new File("icons//" + TypeActor + ".png");
		Image i = new Image(f1.toURI().toString());
		Typeofcreateind = TypeActor;
		selectedImage_CreatActor.setImage(i);

		Activity_Vbox.getChildren().add(new ActivityActor());
		try {
			int i1 = 0;
			while (true) {

				System.out.println("delete = " + i1);
				Activity_Vbox.getChildren().remove(0);
				i1 = +1;
			}
		} catch (Exception e) {

		}
		Txt_CreatActor.setText(words[105] + " " + TypeActor + " : ");
		// ScrollPane s = new ScrollPane(CreatActor);

		PaneofMenu.setCenter(CreatActor);
	}

	public void setCreateDevice(String TypeActor) {
		File f1 = new File("icons//" + TypeActor + ".png");
		Image i = new Image(f1.toURI().toString());
		Typeofcreateind = TypeActor;
		selectedImage_CreatDevices.setImage(i);

		// ScrollPane s = new ScrollPane(CreatActor);

		PaneofMenu.setCenter(CreateDevice);
	}

	public CreateIndividual() {

		super();
		mainpane = new BorderPane();

		Text logo = new Text(words[62]);
		logo.setId("logo");
		File f1 = new File("icons//29842705_m.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();
		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(50);
		selectedImage14.setFitWidth(100);
		HBox h = new HBox();
		h.setSpacing(10);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(logo, selectedImage14);
		h.setId("Toplogo");
		CeneterPane = new BorderPane();
		PaneofMenu = new BorderPane();
		MenuBar menuBar = new MenuBar();
		menuBar.setPrefHeight(25);
		Listeoftypes = new Menu(words[104]);

		f1 = new File("icons//add.png");
		i = new Image(f1.toURI().toString());
		ImageView selectedImage1 = new ImageView();
		selectedImage1.setImage(i);
		selectedImage1.setFitHeight(10);
		selectedImage1.setFitWidth(10);
		Listeoftypes.setGraphic(selectedImage1);

		Actors = new Menu(words[65]);
		Group = new Menu(words[66]);
		Family = new MenuItem(words[67]);
		Individ = new Menu(words[68]);
		Human = new Menu(words[69]);
		grandmother = new MenuItem(words[70]);
		grandfather = new MenuItem(words[71]);
		mother = new MenuItem(words[72]);
		father = new MenuItem(words[73]);
		sister = new MenuItem(words[74]);
		broher = new MenuItem(words[75]);
		NonHuman = new Menu(words[76]);
		Pets = new Menu(words[77]);
		Dogs = new MenuItem(words[78]);
		Cats = new MenuItem(words[79]);
		Robot = new Menu(words[80]);
		missionRobot = new MenuItem(words[81]);
		Devices = new Menu(words[82]);
		DeviceConsumeEnergy = new Menu(words[83]);
		AudioAndVideo = new Menu(words[84]);
		BodyCare = new Menu(words[85]);
		CleaningDevices = new Menu(words[86]);
		Counters = new Menu(words[87]);
		KetchinDevices = new Menu(words[88]);
		Lights = new Menu(words[89]);
		Media = new Menu(words[90]);
		Desktop= new MenuItem("Desktop");
		Printer = new MenuItem("Printer");
		NetworkCoordinations = new Menu(words[91]);
		Security = new Menu(words[92]);
		Sensors = new Menu(words[93]);
		Switches = new Menu(words[94]);
		WeatherDevices = new Menu(words[95]);
		DeviceProductEnergy = new Menu(words[96]);
		contaminated_Energy = new Menu(words[97]);
		Electricity_Generator = new MenuItem(words[98]);
		gas_turbine = new MenuItem(words[99]);
		Green_Energy = new Menu(words[100]);
		Solar_Panels = new MenuItem(words[101]);
		Windmills = new MenuItem(words[102]);

		CDPlayer = new MenuItem(words[123]);
		AudioAndVideo.getItems().add(CDPlayer);

		//// ---------
		HairDryer = new MenuItem(words[125]);
		HairIron = new MenuItem(words[126]);
		MicrowaveOven = new MenuItem(words[127]);

		BodyCare.getItems().addAll(HairDryer, HairIron);
		// --------------
		CentralVacuumCleaner = new MenuItem(words[129]);
		RoboticVacuumCleaner = new MenuItem(words[130]);
		ThorWashingMachine = new MenuItem(words[131]);
		VacuumCleaner = new MenuItem(words[132]);
		WashingMachine = new MenuItem(words[133]);
		CleaningDevices.getItems().addAll(CentralVacuumCleaner, RoboticVacuumCleaner, ThorWashingMachine, VacuumCleaner,
				WashingMachine);
		// -----------------
		ElectricityCounter = new MenuItem(words[135]);
		Counters.getItems().add(ElectricityCounter);
		// ------------
		Dishwasher = new MenuItem(words[137]);
		ElectricWaterBoiler = new MenuItem(words[138]);
		Oven = new MenuItem(words[141]);
		Refrigerators = new MenuItem(words[142]);
		Stove = new MenuItem(words[143]);
		Blender = new MenuItem("Blender");
		 CoffeeMmachine = new MenuItem("CoffeeMmachine");

		KetchinDevices.getItems().addAll(Dishwasher, Oven, Refrigerators, Stove, MicrowaveOven,Blender,CoffeeMmachine);
		// -----------------
		Lightss = new MenuItem(words[145]);
		Lights.getItems().add(Lightss);
		// -----------------
		phone = new MenuItem(words[147]);
		television = new MenuItem(words[148]);
		Media.getItems().addAll(phone, television,	Desktop,Printer);
		// -----------------
		Hub = new MenuItem(words[150]);
		Router = new MenuItem(words[151]);
		NetworkCoordinations.getItems().addAll(Hub, Router);
		// -----------------
		Camera = new MenuItem(words[153]);
		Security.getItems().add(Camera);
		// ----------------
		Light_sensors = new MenuItem(words[155]);
		MovingSensor = new MenuItem(words[156]);
		RainSensor = new MenuItem(words[157]);
		SmokeSensor = new MenuItem(words[158]);
		TemperatureSensor = new MenuItem(words[159]);
		WindSensor = new MenuItem(words[160]);

		CO2_Sensor = new MenuItem(words[204]);
		Energy_Metering_Sensor = new MenuItem(words[205]);
		Noise_Sensor = new MenuItem(words[206]);
		Proximity_Sensor = new MenuItem(words[207]);
		RFID_Tag_Sensor = new MenuItem(words[208]);

		Sensors.getItems().addAll(Light_sensors, MovingSensor, RainSensor, SmokeSensor, TemperatureSensor, WindSensor,
				CO2_Sensor, Energy_Metering_Sensor, Noise_Sensor, Proximity_Sensor, RFID_Tag_Sensor);
		// ---------------- = new MenuItem(words[]);
		Switchess = new MenuItem(words[162]);
		Switches.getItems().add(Switchess);
		// ---------- = new MenuItem(words[]);
		Cooling = new Menu(words[164]);
		AirConditioner = new MenuItem(words[165]);
		AtticFan = new MenuItem(words[166]);
		CeilingFan = new MenuItem(words[167]);
		WindowFan = new MenuItem(words[168]);

		Cooling.getItems().addAll(AirConditioner, AtticFan, CeilingFan, WindowFan);
		// ---------------
		Heating = new Menu(words[170]);
		PatioHeater = new MenuItem(words[171]);

		Heating.getItems().add(PatioHeater);
		WeatherDevices.getItems().addAll(Cooling, Heating);

		Green_Energy.getItems().addAll(Solar_Panels, Windmills);
		contaminated_Energy.getItems().addAll(Electricity_Generator, gas_turbine);
		DeviceProductEnergy.getItems().addAll(contaminated_Energy, Green_Energy);
		DeviceConsumeEnergy.getItems().addAll(AudioAndVideo, BodyCare, CleaningDevices, Counters, KetchinDevices,
				Lights, Media, NetworkCoordinations, Security, Sensors, Switches, WeatherDevices);
		Devices.getItems().addAll(DeviceConsumeEnergy, DeviceProductEnergy);
		Robot.getItems().add(missionRobot);
		Pets.getItems().addAll(Dogs, Cats);
		NonHuman.getItems().addAll(Pets, Robot);
		Human.getItems().addAll(grandmother, grandfather, mother, father, sister, broher);
		Individ.getItems().addAll(Human, NonHuman);
		Group.getItems().add(Family);
		Actors.getItems().addAll(Group, Individ);
		Listeoftypes.getItems().addAll(Actors, Devices);
		menuBar.getMenus().add(Listeoftypes);
		PaneofMenu.setTop(menuBar);
		mainpane.setTop(h);
		mainpane.setCenter(PaneofMenu);
		mainpane.setPrefSize(width / 6 * 3.9, height);
		this.setText(words[62]);
		CreatActor = CraetePaneActors("add");
		CreateDevice = CreateCreateDevice("add");
		this.setContent(mainpane);
	}

	public MenuItem getPrinter() {
		return Printer;
	}

	public void setPrinter(MenuItem printer) {
		Printer = printer;
	}

	public MenuItem getCDPlayer() {
		return CDPlayer;
	}

	public MenuItem getHairDryer() {
		return HairDryer;
	}

	public MenuItem getHairIron() {
		return HairIron;
	}

	public MenuItem getMicrowaveOven() {
		return MicrowaveOven;
	}

	public MenuItem getCentralVacuumCleaner() {
		return CentralVacuumCleaner;
	}

	public MenuItem getRoboticVacuumCleaner() {
		return RoboticVacuumCleaner;
	}

	public MenuItem getThorWashingMachine() {
		return ThorWashingMachine;
	}

	public MenuItem getVacuumCleaner() {
		return VacuumCleaner;
	}

	public MenuItem getWashingMachine() {
		return WashingMachine;
	}

	public MenuItem getElectricityCounter() {
		return ElectricityCounter;
	}

	public MenuItem getDishwasher() {
		return Dishwasher;
	}

	public MenuItem getElectricWaterBoiler() {
		return ElectricWaterBoiler;
	}

	public MenuItem getOven() {
		return Oven;
	}

	public MenuItem getRefrigerators() {
		return Refrigerators;
	}

	public MenuItem getStove() {
		return Stove;
	}

	public MenuItem getLightss() {
		return Lightss;
	}

	public MenuItem getPhone() {
		return phone;
	}

	public MenuItem getTelevision() {
		return television;
	}

	public MenuItem getDesktop() {
		return Desktop;
	}

	public void setDesktop(Menu desktop) {
		Desktop = desktop;
	}

	public MenuItem getHub() {
		return Hub;
	}

	public MenuItem getRouter() {
		return Router;
	}

	public MenuItem getCamera() {
		return Camera;
	}

	public MenuItem getLight_sensors() {
		return Light_sensors;
	}

	public MenuItem getMovingSensor() {
		return MovingSensor;
	}

	public MenuItem getRainSensor() {
		return RainSensor;
	}

	public MenuItem getSmokeSensor() {
		return SmokeSensor;
	}

	public MenuItem getTemperatureSensor() {
		return TemperatureSensor;
	}

	public MenuItem getWindSensor() {
		return WindSensor;
	}

	public MenuItem getSwitchess() {
		return Switchess;
	}

	public Menu getCooling() {
		return Cooling;
	}

	public MenuItem getAirConditioner() {
		return AirConditioner;
	}

	public MenuItem getAtticFan() {
		return AtticFan;
	}

	public MenuItem getCeilingFan() {
		return CeilingFan;
	}

	public MenuItem getWindowFan() {
		return WindowFan;
	}

	public Menu getHeating() {
		return Heating;
	}

	public MenuItem getPatioHeater() {
		return PatioHeater;
	}

	public TextField getDevicename() {
		return devicename;
	}

	public TextField getDevice_consuming() {
		return device_consuming;
	}

	public TextField getDevice_protocol() {
		return device_protocol;
	}

	public ChoiceBox<String> getDevicestat() {
		return devicestat;
	}

	public TextField getDevice_values() {
		return device_values;
	}

	public ChoiceBox<String> getDevicezone() {
		return devicezone;
	}

	public Button getCreate_device() {
		return create_device;
	}

	public BorderPane getMainpane() {
		return mainpane;
	}

	public BorderPane getCeneterPane() {
		return CeneterPane;
	}

	public Menu getListeoftypes() {
		return Listeoftypes;
	}

	public Menu getActors() {
		return Actors;
	}

	public Menu getGroup() {
		return Group;
	}

	public MenuItem getFamily() {
		return Family;
	}

	public Menu getIndivid() {
		return Individ;
	}

	public Menu getHuman() {
		return Human;
	}

	public MenuItem getGrandmother() {
		return grandmother;
	}

	public MenuItem getGrandfather() {
		return grandfather;
	}

	public MenuItem getMother() {
		return mother;
	}

	public MenuItem getFather() {
		return father;
	}

	public MenuItem getSister() {
		return sister;
	}

	public MenuItem getBroher() {
		return broher;
	}

	public Menu getNonHuman() {
		return NonHuman;
	}

	public Menu getPets() {
		return Pets;
	}

	public MenuItem getDogs() {
		return Dogs;
	}

	public MenuItem getCats() {
		return Cats;
	}

	public Menu getRobot() {
		return Robot;
	}

	public MenuItem getMissionRobot() {
		return missionRobot;
	}

	public Menu getDevices() {
		return Devices;
	}

	public Menu getDeviceConsumeEnergy() {
		return DeviceConsumeEnergy;
	}

	public MenuItem getAudioAndVideo() {
		return AudioAndVideo;
	}

	public MenuItem getBodyCare() {
		return BodyCare;
	}

	public MenuItem getCleaningDevices() {
		return CleaningDevices;
	}

	public MenuItem getCounters() {
		return Counters;
	}

	public MenuItem getKetchinDevices() {
		return KetchinDevices;
	}

	public MenuItem getLights() {
		return Lights;
	}

	public MenuItem getMedia() {
		return Media;
	}

	public MenuItem getNetworkCoordinations() {
		return NetworkCoordinations;
	}

	public MenuItem getSecurity() {
		return Security;
	}

	public MenuItem getSensors() {
		return Sensors;
	}

	public MenuItem getSwitches() {
		return Switches;
	}

	public MenuItem getWeatherDevices() {
		return WeatherDevices;
	}

	public Menu getDeviceProductEnergy() {
		return DeviceProductEnergy;
	}

	public Menu getContaminated_Energy() {
		return contaminated_Energy;
	}

	public MenuItem getElectricity_Generator() {
		return Electricity_Generator;
	}

	public MenuItem getGas_turbine() {
		return gas_turbine;
	}

	public Menu getGreen_Energy() {
		return Green_Energy;
	}

	public MenuItem getSolar_Panels() {
		return Solar_Panels;
	}

	public MenuItem getWindmills() {
		return Windmills;
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

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public BorderPane getPaneofMenu() {
		return PaneofMenu;
	}

	public String getTypeofcreateind() {
		return Typeofcreateind;
	}

	public GridPane getCreatActor() {
		return CreatActor;
	}

	public GridPane getCreateDevice() {
		return CreateDevice;
	}

	public Button getButton_CreatActor() {
		return Button_CreatActor;
	}

	public Text getTxt_CreatActor() {
		return Txt_CreatActor;
	}

	public ImageView getSelectedImage_CreatActor() {
		return selectedImage_CreatActor;
	}

	public ChoiceBox<String> getShooseZones() {
		return shooseZones;
	}

	public VBox getActivity_Vbox() {
		return Activity_Vbox;
	}

	public Button getAddActivity() {
		return AddActivity;
	}

	public TextField getFirst_Name_of_ind_txf() {
		return First_Name_of_ind_txf;
	}

	public DatePicker getBirthday_of_ind_txf() {
		return birthday_of_ind_txf;
	}

	public TextField getEmail_of_ind_txf() {
		return email_of_ind_txf;
	}

	public TextField getPhone_of_ind_txf() {
		return phone_of_ind_txf;
	}

	public ChoiceBox<String> getSex_of_ind_txf() {
		return sex_of_ind_txf;
	}

	public ChoiceBox<String> getState_of_ind_txf() {
		return state_of_ind_txf;
	}
}
