package Ontology;

import java.io.File;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;

import edu.stanford.smi.protegex.owl.ProtegeOWL;
import edu.stanford.smi.protegex.owl.model.*;

public class Smart_Building_Ontology_Model {
	// OWLmodel Object
	// private OWLModel owlModelGis;
	// Ontology Classes

	public List<String> getSuperClasses(String ClassType) {
		List l = new ArrayList<String>();

		for (int i = 0; i < OWLNamedClass_OpenSBSList.size(); i++) {
			OWLNamedClass_OpenSBS OWLNamedClass_OpenSBS = OWLNamedClass_OpenSBSList.get(i);
			if (ClassType.equals(OWLNamedClass_OpenSBS.getBrowserText())) {

				for (int j = 0; j < OWLNamedClass_OpenSBS.getSuperClasses().size(); j++) {
					l.add(OWLNamedClass_OpenSBS.getSuperClasses().get(j).getBrowserText());
				}
				break;
			}
		}

		return l;
	};

	public OWLNamedClass_OpenSBS getOWLNamedClass(String classname) {

		for (int i = 0; i < OWLNamedClass_OpenSBSList.size(); i++) {
			if (OWLNamedClass_OpenSBSList.get(i).getBrowserText().equals(classname)) {
				return OWLNamedClass_OpenSBSList.get(i);
			}

		}
		return null;
	}

	public OWLDatatypeProperty_OpenSBS getOWLDatatypeProperty_OpenSBSList(String classname) {

		for (int i = 0; i < OWLDatatypeProperty_OpenSBSList.size(); i++) {
			if (OWLDatatypeProperty_OpenSBSList.get(i).getBrowserText().equals(classname)) {
				return OWLDatatypeProperty_OpenSBSList.get(i);
			}

		}
		return null;
	}

	public OWLObjectProperty_OpenSBS getOWLObjectProperty_OpenSBSList(String classname) {

		for (int i = 0; i < OWLObjectProperty_OpenSBSList.size(); i++) {
			if (OWLObjectProperty_OpenSBSList.get(i).getBrowserText().equals(classname)) {
				return OWLObjectProperty_OpenSBSList.get(i);
			}

		}
		return null;
	}

	private List<OWLNamedClass_OpenSBS> OWLNamedClass_OpenSBSList;
	private List<OWLDatatypeProperty_OpenSBS> OWLDatatypeProperty_OpenSBSList;
	private List<OWLObjectProperty_OpenSBS> OWLObjectProperty_OpenSBSList;

	private OWLNamedClass_OpenSBS OwlThing;

	private OWLNamedClass_OpenSBS Building;
	private OWLNamedClass_OpenSBS Home;
	private OWLNamedClass_OpenSBS Actors;
	private OWLNamedClass_OpenSBS Group;
	private OWLNamedClass_OpenSBS Family;
	private OWLNamedClass_OpenSBS Individ;
	private OWLNamedClass_OpenSBS NonHuman;
	private OWLNamedClass_OpenSBS Pets;
	private OWLNamedClass_OpenSBS Robot;
	private OWLNamedClass_OpenSBS SupervisorRobot;
	private OWLNamedClass_OpenSBS MissionRobot;
	private OWLNamedClass_OpenSBS Human;
	private OWLNamedClass_OpenSBS Grandmother;
	private OWLNamedClass_OpenSBS Grandfather;
	private OWLNamedClass_OpenSBS Mother;
	private OWLNamedClass_OpenSBS Father;
	private OWLNamedClass_OpenSBS Sister;
	private OWLNamedClass_OpenSBS Brother;

	private OWLNamedClass_OpenSBS Actions;
	private OWLNamedClass_OpenSBS Cammand_Action;
	private OWLNamedClass_OpenSBS Notification_Action;
	private OWLNamedClass_OpenSBS Call_phone;
	private OWLNamedClass_OpenSBS Email;
	private OWLNamedClass_OpenSBS Notify_Software;
	private OWLNamedClass_OpenSBS SMS_Notification;
	private OWLNamedClass_OpenSBS Turn_Off_Action;
	private OWLNamedClass_OpenSBS Turn_On_Action;
	private OWLNamedClass_OpenSBS Update_Value_Action;

	private OWLNamedClass_OpenSBS Activity;
	private OWLNamedClass_OpenSBS SchedulerActivity;
	private OWLNamedClass_OpenSBS Metting;
	private OWLNamedClass_OpenSBS Party;
	private OWLNamedClass_OpenSBS Dinner;
	private OWLNamedClass_OpenSBS praying;
	private OWLNamedClass_OpenSBS InferredActivity;
	private OWLNamedClass_OpenSBS Supervising;
	private OWLNamedClass_OpenSBS ListeningToMusic;
	private OWLNamedClass_OpenSBS Showering;
	private OWLNamedClass_OpenSBS Reading;
	private OWLNamedClass_OpenSBS Cooking;
	private OWLNamedClass_OpenSBS HouseWork;
	private OWLNamedClass_OpenSBS Entertaining;
	private OWLNamedClass_OpenSBS WatchingTv;

	private OWLNamedClass_OpenSBS Appliance;
	private OWLNamedClass_OpenSBS Devices;
	private OWLNamedClass_OpenSBS Battery;

	private OWLNamedClass_OpenSBS DeviceProductEnergy;
	private OWLNamedClass_OpenSBS Green_Energy;
	private OWLNamedClass_OpenSBS Windmills;
	private OWLNamedClass_OpenSBS Solar_Panels;
	private OWLNamedClass_OpenSBS contaminated_Energy;
	private OWLNamedClass_OpenSBS gas_turbine;
	private OWLNamedClass_OpenSBS Electricity_Generator;

	private OWLNamedClass_OpenSBS DeviceConsumeEnergy;
	private OWLNamedClass_OpenSBS KetchinDevices;
	private OWLNamedClass_OpenSBS Refrigerators;
	private OWLNamedClass_OpenSBS Blender;
	private OWLNamedClass_OpenSBS CoffeeMmachine;
	private OWLNamedClass_OpenSBS ElectricWaterBoiler;
	private OWLNamedClass_OpenSBS Oven;
	private OWLNamedClass_OpenSBS Stove;
	private OWLNamedClass_OpenSBS Dishwasher;
	private OWLNamedClass_OpenSBS Counters;
	private OWLNamedClass_OpenSBS ElectricityCounter;
	private OWLNamedClass_OpenSBS Security;
	private OWLNamedClass_OpenSBS Camera;
	private OWLNamedClass_OpenSBS AudioAndVideo;
	private OWLNamedClass_OpenSBS CDPlayer;
	private OWLNamedClass_OpenSBS Switches;
	private OWLNamedClass_OpenSBS WeatherDevices;
	private OWLNamedClass_OpenSBS Heating;
	private OWLNamedClass_OpenSBS PatioHeater;
	private OWLNamedClass_OpenSBS Cooling;
	private OWLNamedClass_OpenSBS AirConditioner;
	private OWLNamedClass_OpenSBS AtticFan;
	private OWLNamedClass_OpenSBS WindowFan;
	private OWLNamedClass_OpenSBS CeilingFan;

	private OWLNamedClass_OpenSBS Others;
	private OWLNamedClass_OpenSBS Media;
	private OWLNamedClass_OpenSBS television;
	private OWLNamedClass_OpenSBS phone;
	private OWLNamedClass_OpenSBS Lights;
	private OWLNamedClass_OpenSBS	Desktop;
	private OWLNamedClass_OpenSBS	Printer;
	private OWLNamedClass_OpenSBS Sensors;
	private OWLNamedClass_OpenSBS SmokeSensor;
	private OWLNamedClass_OpenSBS MovingSensor;
	private OWLNamedClass_OpenSBS Light_sensors;
	private OWLNamedClass_OpenSBS TemperatureSensor;
	private OWLNamedClass_OpenSBS WindSensor;
	private OWLNamedClass_OpenSBS RainSensor;
	private OWLNamedClass_OpenSBS CO2_Sensor;
	private OWLNamedClass_OpenSBS Energy_Metering_Sensor;
	private OWLNamedClass_OpenSBS Noise_Sensor;
	private OWLNamedClass_OpenSBS Proximity_Sensor;
	private OWLNamedClass_OpenSBS RFID_Tag_Sensor;
	private OWLNamedClass_OpenSBS CleaningDevices;
	private OWLNamedClass_OpenSBS ThorWashingMachine;
	private OWLNamedClass_OpenSBS VacuumCleaner;
	private OWLNamedClass_OpenSBS RoboticVacuumCleaner;
	private OWLNamedClass_OpenSBS CentralVacuumCleaner;
	private OWLNamedClass_OpenSBS WashingMachine;
	private OWLNamedClass_OpenSBS BodyCare;
	private OWLNamedClass_OpenSBS HairDryer;
	private OWLNamedClass_OpenSBS HairIron;
	private OWLNamedClass_OpenSBS MicrowaveOven;
	private OWLNamedClass_OpenSBS NetworkCoordinations;
	private OWLNamedClass_OpenSBS Router;
	private OWLNamedClass_OpenSBS Hub;
	private OWLNamedClass_OpenSBS Bills;

	private OWLNamedClass_OpenSBS EnergySources;
	private OWLNamedClass_OpenSBS GreenSources;
	private OWLNamedClass_OpenSBS Winds;
	private OWLNamedClass_OpenSBS SunLight;
	private OWLNamedClass_OpenSBS ContaminatedSources;
	private OWLNamedClass_OpenSBS ElectricGrid;

	private OWLNamedClass_OpenSBS Behaviors;
	private OWLNamedClass_OpenSBS CategoriseBehavior;
	private OWLNamedClass_OpenSBS CommonBehaviors;

	private OWLNamedClass_OpenSBS Context_Awareness;
	private OWLNamedClass_OpenSBS Context_Atribute;
	private OWLNamedClass_OpenSBS Context_Level;
	private OWLNamedClass_OpenSBS Context_Life_Cycle;
	private OWLNamedClass_OpenSBS Context_Model;
	private OWLNamedClass_OpenSBS Context_Schemes;
	private OWLNamedClass_OpenSBS Context_Acquisition_Schema;
	private OWLNamedClass_OpenSBS Context_Modeling_Schema;
	private OWLNamedClass_OpenSBS Context_State;
	private OWLNamedClass_OpenSBS Context_type;
	private OWLNamedClass_OpenSBS Quality_Of_Context;

	private OWLNamedClass_OpenSBS Environment;
	private OWLNamedClass_OpenSBS EnvironmentLight; // luimunance
	private OWLNamedClass_OpenSBS EnvironmentTemperature; // temperature
	private OWLNamedClass_OpenSBS EnvironmentHumedity;
	private OWLNamedClass_OpenSBS EnvironmentNoise;
	private OWLNamedClass_OpenSBS EnvironmentCO2level;

	private OWLNamedClass_OpenSBS Zone;
	private OWLNamedClass_OpenSBS Place;
	private OWLNamedClass_OpenSBS IndoorSpace;
	private OWLNamedClass_OpenSBS LevingRoom;
	private OWLNamedClass_OpenSBS Bathroom;
	private OWLNamedClass_OpenSBS Patio;
	private OWLNamedClass_OpenSBS Landing;
	private OWLNamedClass_OpenSBS DenningRoom;
	private OWLNamedClass_OpenSBS Kitchen;
	private OWLNamedClass_OpenSBS room;
	private OWLNamedClass_OpenSBS Hall;
	private OWLNamedClass_OpenSBS wc;
	private OWLNamedClass_OpenSBS Bedroom;
	private OWLNamedClass_OpenSBS KidsRoom;
	private OWLNamedClass_OpenSBS Outdoorspace;
	private OWLNamedClass_OpenSBS Wall;
	private OWLNamedClass_OpenSBS Garage;

	private OWLNamedClass_OpenSBS Time;
	private OWLNamedClass_OpenSBS SystemTime;
	private OWLNamedClass_OpenSBS TemporalTime;
	private OWLNamedClass_OpenSBS InstantTime;
	private OWLNamedClass_OpenSBS IntervalTime;

	private OWLNamedClass_OpenSBS Events;
	private OWLNamedClass_OpenSBS Policy;
	private OWLNamedClass_OpenSBS Requirement;
	private OWLNamedClass_OpenSBS Address;

	private OWLNamedClass_OpenSBS Service;
	private OWLNamedClass_OpenSBS Service_Grounding;
	private OWLNamedClass_OpenSBS Service_Model;
	private OWLNamedClass_OpenSBS Service_Type;
	private OWLNamedClass_OpenSBS Access_Control;
	private OWLNamedClass_OpenSBS Climate_Service;
	private OWLNamedClass_OpenSBS Cloud_Service;
	private OWLNamedClass_OpenSBS Emergencu_Service;
	private OWLNamedClass_OpenSBS Information_Supply_Service;
	private OWLNamedClass_OpenSBS Media_Service;

	private OWLNamedClass_OpenSBS Profile;
	private OWLNamedClass_OpenSBS BuildingProfile;
	private OWLNamedClass_OpenSBS HumanProfile;
	private OWLNamedClass_OpenSBS Ability;
	private OWLNamedClass_OpenSBS Contact;
	private OWLNamedClass_OpenSBS Interest;
	private OWLNamedClass_OpenSBS Property;
	private OWLNamedClass_OpenSBS Role;
	private OWLNamedClass_OpenSBS Skills;
	private OWLNamedClass_OpenSBS State;
	private OWLNamedClass_OpenSBS HealthState;
	private OWLNamedClass_OpenSBS PsycholodivalState;
	private OWLNamedClass_OpenSBS Boredom;
	private OWLNamedClass_OpenSBS Joyfulness;
	private OWLNamedClass_OpenSBS Restlessness;
	private OWLNamedClass_OpenSBS Disgust;
	private OWLNamedClass_OpenSBS Surprise;
	private OWLNamedClass_OpenSBS Sadness;
	private OWLNamedClass_OpenSBS Worry;
	private OWLNamedClass_OpenSBS Fear;
	private OWLNamedClass_OpenSBS ServiceProfile;
	private OWLNamedClass_OpenSBS Condition_Effect;
	private OWLNamedClass_OpenSBS Input_Service;
	private OWLNamedClass_OpenSBS Output_Service;
	private OWLNamedClass_OpenSBS Paramater_Service;
	private OWLNamedClass_OpenSBS Precondition;
	private OWLNamedClass_OpenSBS SiteProfile;

	// Ontology ObjectProperty ======================================

	private OWLObjectProperty_OpenSBS Action_EffectIn_Device;

	private OWLObjectProperty_OpenSBS Event_Object_Property;
	private OWLObjectProperty_OpenSBS Event_Has_Actions;
	private OWLObjectProperty_OpenSBS Event_Has_Time;

	private OWLObjectProperty_OpenSBS Bills_Has_Energy_Sources;

	private OWLObjectProperty_OpenSBS Activity_Object_Property;
	private OWLObjectProperty_OpenSBS Activity_DoneInPlace;
	private OWLObjectProperty_OpenSBS Activity_HasBeginTime;
	private OWLObjectProperty_OpenSBS Activity_HasEndTime;
	private OWLObjectProperty_OpenSBS Activity_HasOutcome;
	private OWLObjectProperty_OpenSBS Activity_HasSubActivity;
	private OWLObjectProperty_OpenSBS Activity_UsesAppliance;
	private OWLObjectProperty_OpenSBS Activity_Has_Actions;

	private OWLObjectProperty_OpenSBS Appliance_Object_Property;
	private OWLObjectProperty_OpenSBS Appliance_Locate_Near_To;
	private OWLObjectProperty_OpenSBS Belong_to;
	private OWLObjectProperty_OpenSBS HasAction;
	private OWLObjectProperty_OpenSBS HasNetworkProtocol;
	private OWLObjectProperty_OpenSBS HasSoftware;
	private OWLObjectProperty_OpenSBS Appliance_LocateInPlace;
	private OWLObjectProperty_OpenSBS OwnByHuman;
	private OWLObjectProperty_OpenSBS ProvideService;
	private OWLObjectProperty_OpenSBS ConactedTo;

	private OWLObjectProperty_OpenSBS Building_Object_Property;
	private OWLObjectProperty_OpenSBS HasBill;
	private OWLObjectProperty_OpenSBS HasContext;
	private OWLObjectProperty_OpenSBS HasEnergySuorce;
	private OWLObjectProperty_OpenSBS HasEvent;
	private OWLObjectProperty_OpenSBS HasAddress;
	private OWLObjectProperty_OpenSBS HasPlaces;
	private OWLObjectProperty_OpenSBS HasProfile;
	private OWLObjectProperty_OpenSBS HasRequirement;
	private OWLObjectProperty_OpenSBS Ownby;

	private OWLObjectProperty_OpenSBS Context_Awareness_Object_Property;
	private OWLObjectProperty_OpenSBS Context_Model_Relation;
	private OWLObjectProperty_OpenSBS Context_Model_HasContext_Schema;
	private OWLObjectProperty_OpenSBS Context_Model_Modeling_Has_Time;
	private OWLObjectProperty_OpenSBS Context_Schema_Relation;
	private OWLObjectProperty_OpenSBS Context_Modeling_Schema_realtions;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Context_Acquisition_Schema;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Context_Level;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Context_Modeling_Shcema;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Conetxt_State;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_What;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Where;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_who;
	private OWLObjectProperty_OpenSBS Modeling_Schema_Has_Modeling_Time;
	private OWLObjectProperty_OpenSBS Modeling_Schema_HasQoc;
	private OWLObjectProperty_OpenSBS Context_Acquisution_Schema_Relation;
	private OWLObjectProperty_OpenSBS Acquisution_Schema_HasContext_Type;
	private OWLObjectProperty_OpenSBS Acquisution_Schema_HasQoc;
	private OWLObjectProperty_OpenSBS Acquisution_Schema_HasTime;

	private OWLObjectProperty_OpenSBS Environment_Paramaters_Objects_Property;
	private OWLObjectProperty_OpenSBS Environment_Paramaters_MeasuredBy;

	private OWLObjectProperty_OpenSBS Human_Object_Property;
	private OWLObjectProperty_OpenSBS CurrentActivity;
	private OWLObjectProperty_OpenSBS HasFather;
	private OWLObjectProperty_OpenSBS HasMother;
	private OWLObjectProperty_OpenSBS Human_LocateInPlace;
	private OWLObjectProperty_OpenSBS HumanHasProfile;
	private OWLObjectProperty_OpenSBS Human_Has_Behaviors;
	private OWLObjectProperty_OpenSBS Human_Has_Activity;

	private OWLObjectProperty_OpenSBS Behaviors_Object_Property;
	private OWLObjectProperty_OpenSBS Behaviors_HasBeginTime;
	private OWLObjectProperty_OpenSBS Behaviors_HasEndTime;
	private OWLObjectProperty_OpenSBS Behaviors_Has_Actions;

	private OWLObjectProperty_OpenSBS Time_Object_Property;
	private OWLObjectProperty_OpenSBS TimeHasBegining;
	private OWLObjectProperty_OpenSBS TimeHasDuration;
	private OWLObjectProperty_OpenSBS TimeHasDescription;

	private OWLObjectProperty_OpenSBS Place_Object_Property;
	private OWLObjectProperty_OpenSBS Place_HasAppliance;
	private OWLObjectProperty_OpenSBS PlaceHasEnvironment;
	private OWLObjectProperty_OpenSBS PlaceOwnBy;

	private OWLObjectProperty_OpenSBS Human_Profile_Object_Property;
	private OWLObjectProperty_OpenSBS HasAbility;
	private OWLObjectProperty_OpenSBS HasBehavior;
	private OWLObjectProperty_OpenSBS HasCalandar;
	private OWLObjectProperty_OpenSBS HasContact;
	private OWLObjectProperty_OpenSBS HasHealthState;
	private OWLObjectProperty_OpenSBS HasIdentify;
	private OWLObjectProperty_OpenSBS HasInterest;
	private OWLObjectProperty_OpenSBS HasPreference;
	private OWLObjectProperty_OpenSBS HasPsycholocicalState;
	private OWLObjectProperty_OpenSBS HasRole;
	private OWLObjectProperty_OpenSBS HasState;
	private OWLObjectProperty_OpenSBS HasSkills;
	private OWLObjectProperty_OpenSBS OwnAppliance;
	private OWLObjectProperty_OpenSBS OwnPlace;

	private OWLObjectProperty_OpenSBS Service_Object_Property;
	private OWLObjectProperty_OpenSBS Service_HasModel;
	private OWLObjectProperty_OpenSBS Service_HasType;
	private OWLObjectProperty_OpenSBS Service_HasProfile;
	private OWLObjectProperty_OpenSBS Service_require_Service;
	private OWLObjectProperty_OpenSBS Service_HasRerquirement;

	// Ontology OWLDatatypeProperty
	// private OWLDatatypeProperty_OpenSBS Service_Type;
	// ==============================================================================

	private OWLDatatypeProperty_OpenSBS Context_Awareness_Property;
	private OWLDatatypeProperty_OpenSBS Context_Aquisition_Schema;
	private OWLDatatypeProperty_OpenSBS APT;
	private OWLDatatypeProperty_OpenSBS CA;
	private OWLDatatypeProperty_OpenSBS Context_ID;
	private OWLDatatypeProperty_OpenSBS Context_Name;
	private OWLDatatypeProperty_OpenSBS Csbt;
	private OWLDatatypeProperty_OpenSBS Qod;
	private OWLDatatypeProperty_OpenSBS Rbt;
	private OWLDatatypeProperty_OpenSBS ContextHasTime;
	private OWLDatatypeProperty_OpenSBS Vl;

	private OWLDatatypeProperty_OpenSBS Context_Level_property;
	private OWLDatatypeProperty_OpenSBS Context_Level_Degree;
	private OWLDatatypeProperty_OpenSBS Context_Level_Process;

	private OWLDatatypeProperty_OpenSBS Context_Model_Property;
	private OWLDatatypeProperty_OpenSBS Context_Model_Name;

	private OWLDatatypeProperty_OpenSBS Context_Modeling_Schema_Property;
	private OWLDatatypeProperty_OpenSBS Context_Modeling_Schema_ID;
	private OWLDatatypeProperty_OpenSBS Context_Modeling_Schema_Name;

	private OWLDatatypeProperty_OpenSBS Context_State_Value;
	private OWLDatatypeProperty_OpenSBS Quality_Of_Context_Property;
	private OWLDatatypeProperty_OpenSBS Data_precision;
	private OWLDatatypeProperty_OpenSBS Data_UpToDatedness;
	private OWLDatatypeProperty_OpenSBS Data_Validity;
	private OWLDatatypeProperty_OpenSBS Energy_Consumption_Level;
	private OWLDatatypeProperty_OpenSBS Inhabitant_Feedback;
	private OWLDatatypeProperty_OpenSBS Number_Of_Occurrences_In_History;
	private OWLDatatypeProperty_OpenSBS Quality_Of_Context_Data;
	private OWLDatatypeProperty_OpenSBS Quality_Of_The_delivery_Process;

	private OWLDatatypeProperty_OpenSBS Building_ID;
	private OWLDatatypeProperty_OpenSBS Building_Room_Number;

	private OWLDatatypeProperty_OpenSBS Policy_Max_Energy_ConsumptionByMonth;

	private OWLDatatypeProperty_OpenSBS Environment_Name;
	private OWLDatatypeProperty_OpenSBS Environment_Values;

	private OWLDatatypeProperty_OpenSBS Service_Name;
	private OWLDatatypeProperty_OpenSBS Service_Values;

	private OWLDatatypeProperty_OpenSBS Time_Second;
	private OWLDatatypeProperty_OpenSBS Time_Min;
	private OWLDatatypeProperty_OpenSBS Time_Hours;
	private OWLDatatypeProperty_OpenSBS Time_Day;
	private OWLDatatypeProperty_OpenSBS Time_Type_Am_Pm;

	private OWLDatatypeProperty_OpenSBS Activity_Name;
	private OWLDatatypeProperty_OpenSBS Activity_Type;
	private OWLDatatypeProperty_OpenSBS Activity_Description;
	private OWLDatatypeProperty_OpenSBS Activity_ID;

	private OWLDatatypeProperty_OpenSBS Behaviors_Name;
	private OWLDatatypeProperty_OpenSBS Behaviors_Percentage_Importance;
	private OWLDatatypeProperty_OpenSBS Behaviors_Stat_On_Off;
	private OWLDatatypeProperty_OpenSBS Behaviors_Description;

	private OWLDatatypeProperty_OpenSBS Action_Name;
	private OWLDatatypeProperty_OpenSBS Action_Type;
	private OWLDatatypeProperty_OpenSBS Action_command_List;
	private OWLDatatypeProperty_OpenSBS Action_Description;

	private OWLDatatypeProperty_OpenSBS Address_Country;
	private OWLDatatypeProperty_OpenSBS Address_County;
	private OWLDatatypeProperty_OpenSBS Address_Line_2;
	private OWLDatatypeProperty_OpenSBS Address_Stat;
	private OWLDatatypeProperty_OpenSBS Address_city;
	private OWLDatatypeProperty_OpenSBS Address_Postal_Code;
	private OWLDatatypeProperty_OpenSBS Adress_GPS_Location;
	private OWLDatatypeProperty_OpenSBS Address_Line_1;

	private OWLDatatypeProperty_OpenSBS Device_ID;
	private OWLDatatypeProperty_OpenSBS Devices_Name;
	private OWLDatatypeProperty_OpenSBS Devices_State;
	private OWLDatatypeProperty_OpenSBS Devices_Type;
	private OWLDatatypeProperty_OpenSBS Devices_Values;
	private OWLDatatypeProperty_OpenSBS Devices_Watts_Consuming;

	private OWLDatatypeProperty_OpenSBS Devices_Protocol;
	private OWLDatatypeProperty_OpenSBS DeviceStartRunTime;

	private OWLDatatypeProperty_OpenSBS Home_Area;
	private OWLDatatypeProperty_OpenSBS Home_Number;

	private OWLDatatypeProperty_OpenSBS Events_Percentage;
	private OWLDatatypeProperty_OpenSBS Events_Name;
	private OWLDatatypeProperty_OpenSBS Events_Level;
	private OWLDatatypeProperty_OpenSBS Events_type;

	private OWLDatatypeProperty_OpenSBS Zone_Type;
	private OWLDatatypeProperty_OpenSBS Zone_VectoreXY;
	private OWLDatatypeProperty_OpenSBS Zone_Size;
	private OWLDatatypeProperty_OpenSBS Zone_Floor;
	private OWLDatatypeProperty_OpenSBS Zone_Name;

	private OWLDatatypeProperty_OpenSBS Human_Email;
	private OWLDatatypeProperty_OpenSBS Human_Phone_Number;
	private OWLDatatypeProperty_OpenSBS Human_Birthday;
	private OWLDatatypeProperty_OpenSBS Human_First_Name;
	private OWLDatatypeProperty_OpenSBS Human_Gender;
	private OWLDatatypeProperty_OpenSBS Human_Last_Name;
	private OWLDatatypeProperty_OpenSBS Human_Age;

	private OWLDatatypeProperty_OpenSBS Bills_Type;
	private OWLDatatypeProperty_OpenSBS Bills_Name;
	private OWLDatatypeProperty_OpenSBS Bills_Values;

	static FileTxtManagmentGIS FileTxtManagment;

	public Smart_Building_Ontology_Model() {

		OWLNamedClass_OpenSBSList = new ArrayList<OWLNamedClass_OpenSBS>();
		OWLDatatypeProperty_OpenSBSList = new ArrayList<OWLDatatypeProperty_OpenSBS>();
		OWLObjectProperty_OpenSBSList = new ArrayList<OWLObjectProperty_OpenSBS>();

		// ----------------------------------------------------------------
		OwlThing = new OWLNamedClass_OpenSBS("OwlThing");

		Building = new OWLNamedClass_OpenSBS("Building");
		Home = new OWLNamedClass_OpenSBS("Home");

		Actors = new OWLNamedClass_OpenSBS("Actors");

		Group = new OWLNamedClass_OpenSBS("Group");
		Group.getSuperClasses().add(Actors);

		Family = new OWLNamedClass_OpenSBS("Family");
		Family.getSuperClasses().add(Group);

		Individ = new OWLNamedClass_OpenSBS("Individ");
		Individ.getSuperClasses().add(Actors);

		NonHuman = new OWLNamedClass_OpenSBS("NonHuman");
		NonHuman.getSuperClasses().add(Individ);
		NonHuman.getSuperClasses().add(Actors);

		Pets = new OWLNamedClass_OpenSBS("Pets");
		Pets.getSuperClasses().add(NonHuman);
		Pets.getSuperClasses().add(Individ);
		Pets.getSuperClasses().add(Actors);

		Robot = new OWLNamedClass_OpenSBS("Robot");
		Robot.getSuperClasses().add(NonHuman);
		Robot.getSuperClasses().add(Individ);
		Robot.getSuperClasses().add(Actors);

		SupervisorRobot = new OWLNamedClass_OpenSBS("SupervisorRobot");
		SupervisorRobot.getSuperClasses().add(Robot);
		SupervisorRobot.getSuperClasses().add(NonHuman);
		SupervisorRobot.getSuperClasses().add(Individ);
		SupervisorRobot.getSuperClasses().add(Actors);

		MissionRobot = new OWLNamedClass_OpenSBS("MissionRobot");
		MissionRobot.getSuperClasses().add(Robot);
		MissionRobot.getSuperClasses().add(NonHuman);
		MissionRobot.getSuperClasses().add(Individ);
		MissionRobot.getSuperClasses().add(Actors);

		Human = new OWLNamedClass_OpenSBS("Human");
		Human.getSuperClasses().add(Individ);
		Human.getSuperClasses().add(Actors);

		Grandmother = new OWLNamedClass_OpenSBS("Grandmother");
		Grandmother.getSuperClasses().add(Human);
		Grandmother.getSuperClasses().add(Individ);
		Grandmother.getSuperClasses().add(Actors);

		Grandfather = new OWLNamedClass_OpenSBS("Grandfather");
		Grandfather.getSuperClasses().add(Human);
		Grandfather.getSuperClasses().add(Individ);
		Grandfather.getSuperClasses().add(Actors);

		Mother = new OWLNamedClass_OpenSBS("Mother");
		Mother.getSuperClasses().add(Human);
		Mother.getSuperClasses().add(Individ);
		Mother.getSuperClasses().add(Actors);

		Father = new OWLNamedClass_OpenSBS("Father");
		Father.getSuperClasses().add(Human);
		Father.getSuperClasses().add(Individ);
		Father.getSuperClasses().add(Actors);

		Sister = new OWLNamedClass_OpenSBS("Sister");
		Sister.getSuperClasses().add(Human);
		Sister.getSuperClasses().add(Individ);
		Sister.getSuperClasses().add(Actors);

		Brother = new OWLNamedClass_OpenSBS("Brother");
		Brother.getSuperClasses().add(Human);
		Brother.getSuperClasses().add(Individ);
		Brother.getSuperClasses().add(Actors);

		Actions = new OWLNamedClass_OpenSBS("Actions");
		Cammand_Action = new OWLNamedClass_OpenSBS("Cammand_Action");
		Notification_Action = new OWLNamedClass_OpenSBS("Notification_Action");
		Call_phone = new OWLNamedClass_OpenSBS("Call_phone");
		Email = new OWLNamedClass_OpenSBS("Email");
		Notify_Software = new OWLNamedClass_OpenSBS("Notify_Software");
		SMS_Notification = new OWLNamedClass_OpenSBS("SMS_Notification");
		Turn_Off_Action = new OWLNamedClass_OpenSBS("Turn_Off_Action");
		Turn_On_Action = new OWLNamedClass_OpenSBS("Turn_On_Action");
		Update_Value_Action = new OWLNamedClass_OpenSBS("Update_Value_Action");

		Activity = new OWLNamedClass_OpenSBS("Activity");
		SchedulerActivity = new OWLNamedClass_OpenSBS("SchedulerActivity");
		Metting = new OWLNamedClass_OpenSBS("Metting");
		Party = new OWLNamedClass_OpenSBS("Party");
		Dinner = new OWLNamedClass_OpenSBS("Dinner");
		praying = new OWLNamedClass_OpenSBS("praying");
		InferredActivity = new OWLNamedClass_OpenSBS("InferredActivity");
		Supervising = new OWLNamedClass_OpenSBS("Supervising");
		ListeningToMusic = new OWLNamedClass_OpenSBS("ListeningToMusic");
		Showering = new OWLNamedClass_OpenSBS("Showering");
		Reading = new OWLNamedClass_OpenSBS("Reading");
		Cooking = new OWLNamedClass_OpenSBS("Cooking");
		HouseWork = new OWLNamedClass_OpenSBS("HouseWork");
		Entertaining = new OWLNamedClass_OpenSBS("Entertaining");
		WatchingTv = new OWLNamedClass_OpenSBS("WatchingTv");

		Appliance = new OWLNamedClass_OpenSBS("Appliance");
		Devices = new OWLNamedClass_OpenSBS("Devices");

		Battery = new OWLNamedClass_OpenSBS("Battery");

		DeviceProductEnergy = new OWLNamedClass_OpenSBS("DeviceProductEnergy");
		DeviceProductEnergy.getSuperClasses().add(Devices);
		DeviceProductEnergy.getSuperClasses().add(Appliance);

		Green_Energy = new OWLNamedClass_OpenSBS("Green_Energy");
		Green_Energy.getSuperClasses().add(DeviceProductEnergy);
		Green_Energy.getSuperClasses().add(Devices);
		Green_Energy.getSuperClasses().add(Appliance);

		Windmills = new OWLNamedClass_OpenSBS("Windmills");
		Windmills.getSuperClasses().add(DeviceProductEnergy);
		Windmills.getSuperClasses().add(Devices);
		Windmills.getSuperClasses().add(Appliance);
		Windmills.getSuperClasses().add(Green_Energy);

		Solar_Panels = new OWLNamedClass_OpenSBS("Solar_Panels");
		Solar_Panels.getSuperClasses().add(DeviceProductEnergy);
		Solar_Panels.getSuperClasses().add(Devices);
		Solar_Panels.getSuperClasses().add(Appliance);
		Solar_Panels.getSuperClasses().add(Green_Energy);

		contaminated_Energy = new OWLNamedClass_OpenSBS("contaminated_Energy");
		contaminated_Energy.getSuperClasses().add(Devices);
		contaminated_Energy.getSuperClasses().add(Appliance);

		gas_turbine = new OWLNamedClass_OpenSBS("gas_turbine");
		gas_turbine.getSuperClasses().add(DeviceProductEnergy);
		gas_turbine.getSuperClasses().add(Devices);
		gas_turbine.getSuperClasses().add(Appliance);
		gas_turbine.getSuperClasses().add(contaminated_Energy);

		Electricity_Generator = new OWLNamedClass_OpenSBS("Electricity_Generator");
		Electricity_Generator.getSuperClasses().add(DeviceProductEnergy);
		Electricity_Generator.getSuperClasses().add(Devices);
		Electricity_Generator.getSuperClasses().add(Appliance);
		Electricity_Generator.getSuperClasses().add(contaminated_Energy);

		DeviceConsumeEnergy = new OWLNamedClass_OpenSBS("DeviceConsumeEnergy");
		DeviceConsumeEnergy.getSuperClasses().add(Appliance);
		DeviceConsumeEnergy.getSuperClasses().add(Devices);

		KetchinDevices = new OWLNamedClass_OpenSBS("KetchinDevices");
		KetchinDevices.getSuperClasses().add(DeviceConsumeEnergy);
		DeviceConsumeEnergy.getSuperClasses().add(Appliance);
		DeviceConsumeEnergy.getSuperClasses().add(Devices);

		Refrigerators = new OWLNamedClass_OpenSBS("Refrigerators");
		Refrigerators.getSuperClasses().add(DeviceConsumeEnergy);
		Refrigerators.getSuperClasses().add(KetchinDevices);
		Refrigerators.getSuperClasses().add(Appliance);
		Refrigerators.getSuperClasses().add(Devices);

		ElectricWaterBoiler = new OWLNamedClass_OpenSBS("ElectricWaterBoiler");
		ElectricWaterBoiler.getSuperClasses().add(DeviceConsumeEnergy);
		ElectricWaterBoiler.getSuperClasses().add(KetchinDevices);
		ElectricWaterBoiler.getSuperClasses().add(Appliance);
		ElectricWaterBoiler.getSuperClasses().add(Devices);

		Blender  = new OWLNamedClass_OpenSBS("Blender");
		Blender.getSuperClasses().add(DeviceConsumeEnergy);
		Blender.getSuperClasses().add(KetchinDevices);
		Blender.getSuperClasses().add(Appliance);
		Blender.getSuperClasses().add(Devices);

		CoffeeMmachine  = new OWLNamedClass_OpenSBS("CoffeeMmachine");
		CoffeeMmachine.getSuperClasses().add(DeviceConsumeEnergy);
		CoffeeMmachine.getSuperClasses().add(KetchinDevices);
		CoffeeMmachine.getSuperClasses().add(Appliance);
		CoffeeMmachine.getSuperClasses().add(Devices);


		Oven = new OWLNamedClass_OpenSBS("Oven");
		Oven.getSuperClasses().add(DeviceConsumeEnergy);
		Oven.getSuperClasses().add(KetchinDevices);
		Oven.getSuperClasses().add(Appliance);
		Oven.getSuperClasses().add(Devices);

		MicrowaveOven = new OWLNamedClass_OpenSBS("MicrowaveOven");
		MicrowaveOven.getSuperClasses().add(DeviceConsumeEnergy);
		MicrowaveOven.getSuperClasses().add(KetchinDevices);
		MicrowaveOven.getSuperClasses().add(Appliance);
		MicrowaveOven.getSuperClasses().add(Devices);


		Stove = new OWLNamedClass_OpenSBS("Stove");
		Stove.getSuperClasses().add(DeviceConsumeEnergy);
		Stove.getSuperClasses().add(KetchinDevices);
		Stove.getSuperClasses().add(Appliance);
		Stove.getSuperClasses().add(Devices);

		Dishwasher = new OWLNamedClass_OpenSBS("Dishwasher");
		Dishwasher.getSuperClasses().add(DeviceConsumeEnergy);
		Dishwasher.getSuperClasses().add(KetchinDevices);
		Dishwasher.getSuperClasses().add(Appliance);
		Dishwasher.getSuperClasses().add(Devices);

		Counters = new OWLNamedClass_OpenSBS("Counters");
		Counters.getSuperClasses().add(DeviceConsumeEnergy);
		Counters.getSuperClasses().add(Appliance);
		Counters.getSuperClasses().add(Devices);

		ElectricityCounter = new OWLNamedClass_OpenSBS("ElectricityCounter");
		ElectricityCounter.getSuperClasses().add(DeviceConsumeEnergy);
		ElectricityCounter.getSuperClasses().add(Counters);
		ElectricityCounter.getSuperClasses().add(Appliance);
		ElectricityCounter.getSuperClasses().add(Devices);

		Security = new OWLNamedClass_OpenSBS("Security");
		Security.getSuperClasses().add(DeviceConsumeEnergy);
		Security.getSuperClasses().add(Appliance);
		Security.getSuperClasses().add(Devices);

		Camera = new OWLNamedClass_OpenSBS("Camera");
		Camera.getSuperClasses().add(DeviceConsumeEnergy);
		Camera.getSuperClasses().add(Security);
		Camera.getSuperClasses().add(Appliance);
		Camera.getSuperClasses().add(Devices);

		AudioAndVideo = new OWLNamedClass_OpenSBS("AudioAndVideo");
		AudioAndVideo.getSuperClasses().add(DeviceConsumeEnergy);
		AudioAndVideo.getSuperClasses().add(Appliance);
		AudioAndVideo.getSuperClasses().add(Devices);

		CDPlayer = new OWLNamedClass_OpenSBS("CDPlayer");
		CDPlayer.getSuperClasses().add(DeviceConsumeEnergy);
		CDPlayer.getSuperClasses().add(AudioAndVideo);
		CDPlayer.getSuperClasses().add(Appliance);
		CDPlayer.getSuperClasses().add(Devices);

		Switches = new OWLNamedClass_OpenSBS("Switches");
		Switches.getSuperClasses().add(DeviceConsumeEnergy);
		Switches.getSuperClasses().add(Appliance);
		Switches.getSuperClasses().add(Devices);

		WeatherDevices = new OWLNamedClass_OpenSBS("WeatherDevices");
		WeatherDevices.getSuperClasses().add(DeviceConsumeEnergy);
		WeatherDevices.getSuperClasses().add(Appliance);
		WeatherDevices.getSuperClasses().add(Devices);

		Heating = new OWLNamedClass_OpenSBS("Heating");
		Heating.getSuperClasses().add(DeviceConsumeEnergy);
		Heating.getSuperClasses().add(WeatherDevices);
		Heating.getSuperClasses().add(Appliance);
		Heating.getSuperClasses().add(Devices);

		PatioHeater = new OWLNamedClass_OpenSBS("PatioHeater");
		PatioHeater.getSuperClasses().add(DeviceConsumeEnergy);
		PatioHeater.getSuperClasses().add(WeatherDevices);
		PatioHeater.getSuperClasses().add(Heating);
		PatioHeater.getSuperClasses().add(Appliance);
		PatioHeater.getSuperClasses().add(Devices);

		Cooling = new OWLNamedClass_OpenSBS("Cooling");
		Cooling.getSuperClasses().add(DeviceConsumeEnergy);
		Cooling.getSuperClasses().add(WeatherDevices);
		Cooling.getSuperClasses().add(Appliance);
		Cooling.getSuperClasses().add(Devices);

		AirConditioner = new OWLNamedClass_OpenSBS("AirConditioner");
		AirConditioner.getSuperClasses().add(DeviceConsumeEnergy);
		AirConditioner.getSuperClasses().add(WeatherDevices);
		AirConditioner.getSuperClasses().add(Cooling);
		AirConditioner.getSuperClasses().add(Appliance);
		AirConditioner.getSuperClasses().add(Devices);

		AtticFan = new OWLNamedClass_OpenSBS("AtticFan");
		AtticFan.getSuperClasses().add(DeviceConsumeEnergy);
		AtticFan.getSuperClasses().add(WeatherDevices);
		AtticFan.getSuperClasses().add(Cooling);
		AtticFan.getSuperClasses().add(Appliance);
		AtticFan.getSuperClasses().add(Devices);

		WindowFan = new OWLNamedClass_OpenSBS("WindowFan");
		WindowFan.getSuperClasses().add(DeviceConsumeEnergy);
		WindowFan.getSuperClasses().add(WeatherDevices);
		WindowFan.getSuperClasses().add(Cooling);
		WindowFan.getSuperClasses().add(Appliance);
		WindowFan.getSuperClasses().add(Devices);

		CeilingFan = new OWLNamedClass_OpenSBS("CeilingFan");
		CeilingFan.getSuperClasses().add(DeviceConsumeEnergy);
		CeilingFan.getSuperClasses().add(WeatherDevices);
		CeilingFan.getSuperClasses().add(Cooling);
		CeilingFan.getSuperClasses().add(Appliance);
		CeilingFan.getSuperClasses().add(Devices);

		Others = new OWLNamedClass_OpenSBS("Others");

		Media = new OWLNamedClass_OpenSBS("Media");
		Media.getSuperClasses().add(DeviceConsumeEnergy);
		Media.getSuperClasses().add(Appliance);
		Media.getSuperClasses().add(Devices);

		Desktop =  new OWLNamedClass_OpenSBS("Desktop");
		Desktop.getSuperClasses().add(DeviceConsumeEnergy);
		Desktop.getSuperClasses().add(Media);
		Desktop.getSuperClasses().add(Appliance);
		Desktop.getSuperClasses().add(Devices);

		Printer =  new OWLNamedClass_OpenSBS("Printer");
		Printer.getSuperClasses().add(DeviceConsumeEnergy);
		Printer.getSuperClasses().add(Media);
		Printer.getSuperClasses().add(Appliance);
		Printer.getSuperClasses().add(Devices);


		television = new OWLNamedClass_OpenSBS("television");
		television.getSuperClasses().add(DeviceConsumeEnergy);
		television.getSuperClasses().add(Media);
		television.getSuperClasses().add(Appliance);
		television.getSuperClasses().add(Devices);

		phone = new OWLNamedClass_OpenSBS("phone");
		phone.getSuperClasses().add(DeviceConsumeEnergy);
		phone.getSuperClasses().add(Media);
		phone.getSuperClasses().add(Appliance);
		phone.getSuperClasses().add(Devices);

		Lights = new OWLNamedClass_OpenSBS("Lights");
		Lights.getSuperClasses().add(DeviceConsumeEnergy);
		Lights.getSuperClasses().add(Appliance);
		Lights.getSuperClasses().add(Devices);

		Sensors = new OWLNamedClass_OpenSBS("Sensors");
		Sensors.getSuperClasses().add(DeviceConsumeEnergy);
		Sensors.getSuperClasses().add(Appliance);
		Sensors.getSuperClasses().add(Devices);

		SmokeSensor = new OWLNamedClass_OpenSBS("SmokeSensor");
		SmokeSensor.getSuperClasses().add(DeviceConsumeEnergy);
		SmokeSensor.getSuperClasses().add(Sensors);
		SmokeSensor.getSuperClasses().add(Appliance);
		SmokeSensor.getSuperClasses().add(Devices);

		MovingSensor = new OWLNamedClass_OpenSBS("MovingSensor");
		MovingSensor.getSuperClasses().add(DeviceConsumeEnergy);
		MovingSensor.getSuperClasses().add(Sensors);
		MovingSensor.getSuperClasses().add(Appliance);
		MovingSensor.getSuperClasses().add(Devices);

		Light_sensors = new OWLNamedClass_OpenSBS("Light_sensors");
		Light_sensors.getSuperClasses().add(DeviceConsumeEnergy);
		Light_sensors.getSuperClasses().add(Sensors);
		Light_sensors.getSuperClasses().add(Appliance);
		Light_sensors.getSuperClasses().add(Devices);

		TemperatureSensor = new OWLNamedClass_OpenSBS("TemperatureSensor");
		TemperatureSensor.getSuperClasses().add(DeviceConsumeEnergy);
		TemperatureSensor.getSuperClasses().add(Sensors);
		TemperatureSensor.getSuperClasses().add(Appliance);
		TemperatureSensor.getSuperClasses().add(Devices);

		WindSensor = new OWLNamedClass_OpenSBS("WindSensor");
		WindSensor.getSuperClasses().add(DeviceConsumeEnergy);
		WindSensor.getSuperClasses().add(Sensors);
		WindSensor.getSuperClasses().add(Appliance);
		WindSensor.getSuperClasses().add(Devices);

		RainSensor = new OWLNamedClass_OpenSBS("RainSensor");
		RainSensor.getSuperClasses().add(DeviceConsumeEnergy);
		RainSensor.getSuperClasses().add(Sensors);
		RainSensor.getSuperClasses().add(Appliance);
		RainSensor.getSuperClasses().add(Devices);

		CO2_Sensor = new OWLNamedClass_OpenSBS("CO2_Sensor");
		CO2_Sensor.getSuperClasses().add(DeviceConsumeEnergy);
		CO2_Sensor.getSuperClasses().add(Sensors);
		CO2_Sensor.getSuperClasses().add(Appliance);
		CO2_Sensor.getSuperClasses().add(Devices);

		Energy_Metering_Sensor = new OWLNamedClass_OpenSBS("Energy_Metering_Sensor");
		Energy_Metering_Sensor.getSuperClasses().add(Sensors);
		Energy_Metering_Sensor.getSuperClasses().add(DeviceConsumeEnergy);
		Energy_Metering_Sensor.getSuperClasses().add(Appliance);
		Energy_Metering_Sensor.getSuperClasses().add(Devices);

		Noise_Sensor = new OWLNamedClass_OpenSBS("Noise_Sensor");
		Noise_Sensor.getSuperClasses().add(DeviceConsumeEnergy);
		Noise_Sensor.getSuperClasses().add(Sensors);
		Noise_Sensor.getSuperClasses().add(Appliance);
		Noise_Sensor.getSuperClasses().add(Devices);

		Proximity_Sensor = new OWLNamedClass_OpenSBS("Proximity_Sensor");
		Proximity_Sensor.getSuperClasses().add(DeviceConsumeEnergy);
		Proximity_Sensor.getSuperClasses().add(Sensors);
		Proximity_Sensor.getSuperClasses().add(Appliance);
		Proximity_Sensor.getSuperClasses().add(Devices);

		RFID_Tag_Sensor = new OWLNamedClass_OpenSBS("RFID_Tag_Sensor");
		RFID_Tag_Sensor.getSuperClasses().add(DeviceConsumeEnergy);
		RFID_Tag_Sensor.getSuperClasses().add(Sensors);
		RFID_Tag_Sensor.getSuperClasses().add(Appliance);
		RFID_Tag_Sensor.getSuperClasses().add(Devices);

		CleaningDevices = new OWLNamedClass_OpenSBS("CleaningDevices");
		CleaningDevices.getSuperClasses().add(DeviceConsumeEnergy);
		CleaningDevices.getSuperClasses().add(Appliance);
		CleaningDevices.getSuperClasses().add(Devices);

		ThorWashingMachine = new OWLNamedClass_OpenSBS("ThorWashingMachine");
		ThorWashingMachine.getSuperClasses().add(DeviceConsumeEnergy);
		ThorWashingMachine.getSuperClasses().add(CleaningDevices);
		ThorWashingMachine.getSuperClasses().add(Appliance);
		ThorWashingMachine.getSuperClasses().add(Devices);

		VacuumCleaner = new OWLNamedClass_OpenSBS("VacuumCleaner");
		VacuumCleaner.getSuperClasses().add(DeviceConsumeEnergy);
		VacuumCleaner.getSuperClasses().add(CleaningDevices);
		VacuumCleaner.getSuperClasses().add(Appliance);
		VacuumCleaner.getSuperClasses().add(Devices);

		RoboticVacuumCleaner = new OWLNamedClass_OpenSBS("RoboticVacuumCleaner");
		RoboticVacuumCleaner.getSuperClasses().add(DeviceConsumeEnergy);
		RoboticVacuumCleaner.getSuperClasses().add(CleaningDevices);
		RoboticVacuumCleaner.getSuperClasses().add(Appliance);
		RoboticVacuumCleaner.getSuperClasses().add(Devices);

		CentralVacuumCleaner = new OWLNamedClass_OpenSBS("CentralVacuumCleaner");
		CentralVacuumCleaner.getSuperClasses().add(DeviceConsumeEnergy);
		CentralVacuumCleaner.getSuperClasses().add(CleaningDevices);
		CentralVacuumCleaner.getSuperClasses().add(Appliance);
		CentralVacuumCleaner.getSuperClasses().add(Devices);

		WashingMachine = new OWLNamedClass_OpenSBS("WashingMachine");
		WashingMachine.getSuperClasses().add(DeviceConsumeEnergy);
		WashingMachine.getSuperClasses().add(CleaningDevices);
		WashingMachine.getSuperClasses().add(Appliance);
		WashingMachine.getSuperClasses().add(Devices);

		BodyCare = new OWLNamedClass_OpenSBS("BodyCare");
		BodyCare.getSuperClasses().add(DeviceConsumeEnergy);
		BodyCare.getSuperClasses().add(Appliance);
		BodyCare.getSuperClasses().add(Devices);

		HairDryer = new OWLNamedClass_OpenSBS("HairDryer");
		HairDryer.getSuperClasses().add(DeviceConsumeEnergy);
		HairDryer.getSuperClasses().add(BodyCare);
		HairDryer.getSuperClasses().add(Appliance);
		HairDryer.getSuperClasses().add(Devices);

		HairIron = new OWLNamedClass_OpenSBS("HairIron");
		HairIron.getSuperClasses().add(DeviceConsumeEnergy);
		HairIron.getSuperClasses().add(BodyCare);
		HairIron.getSuperClasses().add(Appliance);
		HairIron.getSuperClasses().add(Devices);


		NetworkCoordinations = new OWLNamedClass_OpenSBS("NetworkCoordinations");
		NetworkCoordinations.getSuperClasses().add(DeviceConsumeEnergy);
		NetworkCoordinations.getSuperClasses().add(Appliance);
		NetworkCoordinations.getSuperClasses().add(Devices);

		Router = new OWLNamedClass_OpenSBS("Router");
		Router.getSuperClasses().add(DeviceConsumeEnergy);
		Router.getSuperClasses().add(NetworkCoordinations);
		Router.getSuperClasses().add(Appliance);
		Router.getSuperClasses().add(Devices);

		Hub = new OWLNamedClass_OpenSBS("Hub");
		Hub.getSuperClasses().add(DeviceConsumeEnergy);
		Hub.getSuperClasses().add(NetworkCoordinations);
		Hub.getSuperClasses().add(Appliance);
		Hub.getSuperClasses().add(Devices);

		Bills = new OWLNamedClass_OpenSBS("Bills");
		Bills.getSuperClasses().add(DeviceConsumeEnergy);

		EnergySources = new OWLNamedClass_OpenSBS("EnergySources");
		GreenSources = new OWLNamedClass_OpenSBS("GreenSources");
		Winds = new OWLNamedClass_OpenSBS("Winds");
		SunLight = new OWLNamedClass_OpenSBS("SunLight");
		ContaminatedSources = new OWLNamedClass_OpenSBS("ContaminatedSources");
		ElectricGrid = new OWLNamedClass_OpenSBS("ElectricGrid");

		Behaviors = new OWLNamedClass_OpenSBS("Behaviors");
		CategoriseBehavior = new OWLNamedClass_OpenSBS("CategoriseBehavior");
		CommonBehaviors = new OWLNamedClass_OpenSBS("CommonBehaviors");

		Context_Awareness = new OWLNamedClass_OpenSBS("Context_Awareness");
		Context_Atribute = new OWLNamedClass_OpenSBS("Context_Atribute");
		Context_Level = new OWLNamedClass_OpenSBS("Context_Level");
		Context_Life_Cycle = new OWLNamedClass_OpenSBS("Context_Life_Cycle");
		Context_Model = new OWLNamedClass_OpenSBS("Context_Model");
		Context_Schemes = new OWLNamedClass_OpenSBS("Context_Schemes");
		Context_Acquisition_Schema = new OWLNamedClass_OpenSBS("Context_Acquisition_Schema");
		Context_Modeling_Schema = new OWLNamedClass_OpenSBS("Context_Modeling_Schema");
		Context_State = new OWLNamedClass_OpenSBS("Context_State");
		Context_type = new OWLNamedClass_OpenSBS("Context_type");
		Quality_Of_Context = new OWLNamedClass_OpenSBS("Quality_Of_Context");

		Environment = new OWLNamedClass_OpenSBS("Environment");
		EnvironmentLight = new OWLNamedClass_OpenSBS("EnvironmentLight"); // luimunance
		EnvironmentTemperature = new OWLNamedClass_OpenSBS("EnvironmentTemperature"); // temperature
		EnvironmentHumedity = new OWLNamedClass_OpenSBS("EnvironmentHumedity");
		EnvironmentNoise = new OWLNamedClass_OpenSBS("EnvironmentNoise");
		EnvironmentCO2level = new OWLNamedClass_OpenSBS("EnvironmentCO2level");

		Zone = new OWLNamedClass_OpenSBS("Zone");
		Place = new OWLNamedClass_OpenSBS("Place");
		IndoorSpace = new OWLNamedClass_OpenSBS("IndoorSpace");

		LevingRoom = new OWLNamedClass_OpenSBS("LevingRoom");
		LevingRoom.getSuperClasses().add(IndoorSpace);
		LevingRoom.getSuperClasses().add(Place);
		LevingRoom.getSuperClasses().add(Zone);

		Bathroom = new OWLNamedClass_OpenSBS("Bathroom");
		Bathroom.getSuperClasses().add(IndoorSpace);
		Bathroom.getSuperClasses().add(Place);
		Bathroom.getSuperClasses().add(Zone);

		Patio = new OWLNamedClass_OpenSBS("Patio");
		Patio.getSuperClasses().add(IndoorSpace);
		Patio.getSuperClasses().add(Place);
		Patio.getSuperClasses().add(Zone);

		Landing = new OWLNamedClass_OpenSBS("Landing");
		Landing.getSuperClasses().add(IndoorSpace);
		Landing.getSuperClasses().add(Place);
		Landing.getSuperClasses().add(Zone);

		DenningRoom = new OWLNamedClass_OpenSBS("DenningRoom");
		DenningRoom.getSuperClasses().add(IndoorSpace);
		DenningRoom.getSuperClasses().add(Place);
		DenningRoom.getSuperClasses().add(Zone);

		Kitchen = new OWLNamedClass_OpenSBS("Kitchen");
		Kitchen.getSuperClasses().add(IndoorSpace);
		Kitchen.getSuperClasses().add(Place);
		Kitchen.getSuperClasses().add(Zone);

		room = new OWLNamedClass_OpenSBS("room");
		room.getSuperClasses().add(IndoorSpace);
		room.getSuperClasses().add(Place);
		room.getSuperClasses().add(Zone);

		Hall = new OWLNamedClass_OpenSBS("Hall");
		Hall.getSuperClasses().add(IndoorSpace);
		Hall.getSuperClasses().add(Place);
		Hall.getSuperClasses().add(Zone);

		wc = new OWLNamedClass_OpenSBS("wc");
		wc.getSuperClasses().add(IndoorSpace);
		wc.getSuperClasses().add(Place);
		wc.getSuperClasses().add(Zone);

		Bedroom = new OWLNamedClass_OpenSBS("Bedroom");
		Bedroom.getSuperClasses().add(IndoorSpace);
		Bedroom.getSuperClasses().add(Place);
		Bedroom.getSuperClasses().add(Zone);

		KidsRoom = new OWLNamedClass_OpenSBS("KidsRoom");
		KidsRoom.getSuperClasses().add(IndoorSpace);
		KidsRoom.getSuperClasses().add(Place);
		KidsRoom.getSuperClasses().add(Zone);

		Outdoorspace = new OWLNamedClass_OpenSBS("Outdoorspace");

		Wall = new OWLNamedClass_OpenSBS("Wall");
		Wall.getSuperClasses().add(Outdoorspace);
		Wall.getSuperClasses().add(Place);
		Wall.getSuperClasses().add(Zone);

		Garage = new OWLNamedClass_OpenSBS("Garage");
		Garage.getSuperClasses().add(Outdoorspace);
		Garage.getSuperClasses().add(Place);
		Garage.getSuperClasses().add(Zone);

		Time = new OWLNamedClass_OpenSBS("Time");
		SystemTime = new OWLNamedClass_OpenSBS("SystemTime");
		TemporalTime = new OWLNamedClass_OpenSBS("TemporalTime");
		InstantTime = new OWLNamedClass_OpenSBS("InstantTime");
		IntervalTime = new OWLNamedClass_OpenSBS("IntervalTime");

		Events = new OWLNamedClass_OpenSBS("Events");
		Policy = new OWLNamedClass_OpenSBS("Policy");
		Requirement = new OWLNamedClass_OpenSBS("Requirement");
		Address = new OWLNamedClass_OpenSBS("Address");

		Service = new OWLNamedClass_OpenSBS("Service");
		Service_Grounding = new OWLNamedClass_OpenSBS("Service_Grounding");
		Service_Model = new OWLNamedClass_OpenSBS("Service_Model");
		Service_Type = new OWLNamedClass_OpenSBS("Service_Type");
		Access_Control = new OWLNamedClass_OpenSBS("Access_Control");
		Climate_Service = new OWLNamedClass_OpenSBS("Climate_Service");
		Cloud_Service = new OWLNamedClass_OpenSBS("Cloud_Service");
		Emergencu_Service = new OWLNamedClass_OpenSBS("Emergencu_Service");
		Information_Supply_Service = new OWLNamedClass_OpenSBS("Information_Supply_Service");
		Media_Service = new OWLNamedClass_OpenSBS("Media_Service");

		Profile = new OWLNamedClass_OpenSBS("Profile");
		BuildingProfile = new OWLNamedClass_OpenSBS("BuildingProfile");
		HumanProfile = new OWLNamedClass_OpenSBS("HumanProfile");
		Ability = new OWLNamedClass_OpenSBS("Ability");
		Contact = new OWLNamedClass_OpenSBS("Contact");
		Interest = new OWLNamedClass_OpenSBS("Interest");
		Property = new OWLNamedClass_OpenSBS("Property");
		Role = new OWLNamedClass_OpenSBS("Role");
		Skills = new OWLNamedClass_OpenSBS("Skills");
		State = new OWLNamedClass_OpenSBS("State");
		HealthState = new OWLNamedClass_OpenSBS("HealthState");
		PsycholodivalState = new OWLNamedClass_OpenSBS("PsycholodivalState");
		Boredom = new OWLNamedClass_OpenSBS("Boredom");
		Joyfulness = new OWLNamedClass_OpenSBS("Joyfulness");
		Restlessness = new OWLNamedClass_OpenSBS("Restlessness");
		Disgust = new OWLNamedClass_OpenSBS("Disgust");
		Surprise = new OWLNamedClass_OpenSBS("Surprise");
		Sadness = new OWLNamedClass_OpenSBS("Sadness");
		Worry = new OWLNamedClass_OpenSBS("Worry");
		Fear = new OWLNamedClass_OpenSBS("Fear");
		ServiceProfile = new OWLNamedClass_OpenSBS("ServiceProfile");
		Condition_Effect = new OWLNamedClass_OpenSBS("Condition_Effect");
		Input_Service = new OWLNamedClass_OpenSBS("Input_Service");
		Output_Service = new OWLNamedClass_OpenSBS("Output_Service");
		Paramater_Service = new OWLNamedClass_OpenSBS("Paramater_Service");
		Precondition = new OWLNamedClass_OpenSBS("Precondition");
		SiteProfile = new OWLNamedClass_OpenSBS("SiteProfile");

		// ========================================================================================================
		OWLNamedClass_OpenSBSList.add(OwlThing);
		OWLNamedClass_OpenSBSList.add(Building);
		OWLNamedClass_OpenSBSList.add(Home);
		OWLNamedClass_OpenSBSList.add(Actors);
		OWLNamedClass_OpenSBSList.add(Group);
		OWLNamedClass_OpenSBSList.add(Family);
		OWLNamedClass_OpenSBSList.add(Individ);
		OWLNamedClass_OpenSBSList.add(NonHuman);
		OWLNamedClass_OpenSBSList.add(Pets);
		OWLNamedClass_OpenSBSList.add(Robot);
		OWLNamedClass_OpenSBSList.add(SupervisorRobot);
		OWLNamedClass_OpenSBSList.add(MissionRobot);
		OWLNamedClass_OpenSBSList.add(Human);

		OWLNamedClass_OpenSBSList.add(Grandmother);
		OWLNamedClass_OpenSBSList.add(Grandfather);
		OWLNamedClass_OpenSBSList.add(Mother);
		OWLNamedClass_OpenSBSList.add(Father);
		OWLNamedClass_OpenSBSList.add(Sister);
		OWLNamedClass_OpenSBSList.add(Brother);

		OWLNamedClass_OpenSBSList.add(Actions);
		OWLNamedClass_OpenSBSList.add(Cammand_Action);
		OWLNamedClass_OpenSBSList.add(Notification_Action);
		OWLNamedClass_OpenSBSList.add(Call_phone);
		OWLNamedClass_OpenSBSList.add(Email);
		OWLNamedClass_OpenSBSList.add(Notify_Software);
		OWLNamedClass_OpenSBSList.add(SMS_Notification);
		OWLNamedClass_OpenSBSList.add(Turn_Off_Action);
		OWLNamedClass_OpenSBSList.add(Turn_On_Action);
		OWLNamedClass_OpenSBSList.add(Update_Value_Action);

		OWLNamedClass_OpenSBSList.add(Activity);
		OWLNamedClass_OpenSBSList.add(SchedulerActivity);
		OWLNamedClass_OpenSBSList.add(Metting);
		OWLNamedClass_OpenSBSList.add(Party);
		OWLNamedClass_OpenSBSList.add(Dinner);
		OWLNamedClass_OpenSBSList.add(praying);
		OWLNamedClass_OpenSBSList.add(InferredActivity);
		OWLNamedClass_OpenSBSList.add(Supervising);
		OWLNamedClass_OpenSBSList.add(ListeningToMusic);
		OWLNamedClass_OpenSBSList.add(Showering);
		OWLNamedClass_OpenSBSList.add(Reading);
		OWLNamedClass_OpenSBSList.add(Cooking);
		OWLNamedClass_OpenSBSList.add(HouseWork);
		OWLNamedClass_OpenSBSList.add(Entertaining);
		OWLNamedClass_OpenSBSList.add(WatchingTv);

		OWLNamedClass_OpenSBSList.add(Appliance);
		OWLNamedClass_OpenSBSList.add(Devices);
		OWLNamedClass_OpenSBSList.add(Battery);


	//	/webfve
		//r.univouargla
		//wRug*ey7G

		OWLNamedClass_OpenSBSList.add(DeviceProductEnergy);
		OWLNamedClass_OpenSBSList.add(Green_Energy);
		OWLNamedClass_OpenSBSList.add(Windmills);
		OWLNamedClass_OpenSBSList.add(Solar_Panels);
		OWLNamedClass_OpenSBSList.add(contaminated_Energy);
		OWLNamedClass_OpenSBSList.add(gas_turbine);
		OWLNamedClass_OpenSBSList.add(Electricity_Generator);

		OWLNamedClass_OpenSBSList.add(DeviceConsumeEnergy);
		OWLNamedClass_OpenSBSList.add(KetchinDevices);
		OWLNamedClass_OpenSBSList.add(Refrigerators);
		OWLNamedClass_OpenSBSList.add(ElectricWaterBoiler);

		OWLNamedClass_OpenSBSList.add(Blender);
		OWLNamedClass_OpenSBSList.add(CoffeeMmachine);

		OWLNamedClass_OpenSBSList.add(Oven);
		OWLNamedClass_OpenSBSList.add(Stove);
		OWLNamedClass_OpenSBSList.add(Dishwasher);
		OWLNamedClass_OpenSBSList.add(Counters);
		OWLNamedClass_OpenSBSList.add(ElectricityCounter);
		OWLNamedClass_OpenSBSList.add(Security);
		OWLNamedClass_OpenSBSList.add(Camera);
		OWLNamedClass_OpenSBSList.add(AudioAndVideo);
		OWLNamedClass_OpenSBSList.add(CDPlayer);
		OWLNamedClass_OpenSBSList.add(Switches);
		OWLNamedClass_OpenSBSList.add(WeatherDevices);
		OWLNamedClass_OpenSBSList.add(Heating);
		OWLNamedClass_OpenSBSList.add(PatioHeater);
		OWLNamedClass_OpenSBSList.add(Cooling);
		OWLNamedClass_OpenSBSList.add(AirConditioner);
		OWLNamedClass_OpenSBSList.add(AtticFan);
		OWLNamedClass_OpenSBSList.add(WindowFan);
		OWLNamedClass_OpenSBSList.add(CeilingFan);

		OWLNamedClass_OpenSBSList.add(Others);
		OWLNamedClass_OpenSBSList.add(Media);
		OWLNamedClass_OpenSBSList.add(Printer);
		OWLNamedClass_OpenSBSList.add(Desktop);
		OWLNamedClass_OpenSBSList.add(television);
		OWLNamedClass_OpenSBSList.add(phone);
		OWLNamedClass_OpenSBSList.add(Lights);
		OWLNamedClass_OpenSBSList.add(Sensors);
		OWLNamedClass_OpenSBSList.add(SmokeSensor);
		OWLNamedClass_OpenSBSList.add(MovingSensor);
		OWLNamedClass_OpenSBSList.add(Light_sensors);
		OWLNamedClass_OpenSBSList.add(TemperatureSensor);
		OWLNamedClass_OpenSBSList.add(WindSensor);
		OWLNamedClass_OpenSBSList.add(RainSensor);
		OWLNamedClass_OpenSBSList.add(CO2_Sensor);
		OWLNamedClass_OpenSBSList.add(Energy_Metering_Sensor);
		OWLNamedClass_OpenSBSList.add(Noise_Sensor);
		OWLNamedClass_OpenSBSList.add(Proximity_Sensor);
		OWLNamedClass_OpenSBSList.add(RFID_Tag_Sensor);
		OWLNamedClass_OpenSBSList.add(CleaningDevices);
		OWLNamedClass_OpenSBSList.add(ThorWashingMachine);
		OWLNamedClass_OpenSBSList.add(VacuumCleaner);
		OWLNamedClass_OpenSBSList.add(RoboticVacuumCleaner);
		OWLNamedClass_OpenSBSList.add(CentralVacuumCleaner);
		OWLNamedClass_OpenSBSList.add(WashingMachine);
		OWLNamedClass_OpenSBSList.add(BodyCare);
		OWLNamedClass_OpenSBSList.add(HairDryer);
		OWLNamedClass_OpenSBSList.add(HairIron);
		OWLNamedClass_OpenSBSList.add(MicrowaveOven);
		OWLNamedClass_OpenSBSList.add(NetworkCoordinations);
		OWLNamedClass_OpenSBSList.add(Router);
		OWLNamedClass_OpenSBSList.add(Hub);
		OWLNamedClass_OpenSBSList.add(Bills);

		OWLNamedClass_OpenSBSList.add(EnergySources);
		OWLNamedClass_OpenSBSList.add(GreenSources);
		OWLNamedClass_OpenSBSList.add(Winds);
		OWLNamedClass_OpenSBSList.add(SunLight);
		OWLNamedClass_OpenSBSList.add(ContaminatedSources);
		OWLNamedClass_OpenSBSList.add(ElectricGrid);

		OWLNamedClass_OpenSBSList.add(Behaviors);
		OWLNamedClass_OpenSBSList.add(CategoriseBehavior);
		OWLNamedClass_OpenSBSList.add(CommonBehaviors);

		OWLNamedClass_OpenSBSList.add(Context_Awareness);
		OWLNamedClass_OpenSBSList.add(Context_Atribute);
		OWLNamedClass_OpenSBSList.add(Context_Level);
		OWLNamedClass_OpenSBSList.add(Context_Life_Cycle);
		OWLNamedClass_OpenSBSList.add(Context_Model);
		OWLNamedClass_OpenSBSList.add(Context_Schemes);
		OWLNamedClass_OpenSBSList.add(Context_Acquisition_Schema);
		OWLNamedClass_OpenSBSList.add(Context_Modeling_Schema);
		OWLNamedClass_OpenSBSList.add(Context_State);
		OWLNamedClass_OpenSBSList.add(Context_type);
		OWLNamedClass_OpenSBSList.add(Quality_Of_Context);

		OWLNamedClass_OpenSBSList.add(Environment);
		OWLNamedClass_OpenSBSList.add(EnvironmentLight); // luimunance
		OWLNamedClass_OpenSBSList.add(EnvironmentTemperature); // temperature
		OWLNamedClass_OpenSBSList.add(EnvironmentHumedity);
		OWLNamedClass_OpenSBSList.add(EnvironmentNoise);
		OWLNamedClass_OpenSBSList.add(EnvironmentCO2level);

		OWLNamedClass_OpenSBSList.add(Zone);
		OWLNamedClass_OpenSBSList.add(Place);
		OWLNamedClass_OpenSBSList.add(IndoorSpace);
		OWLNamedClass_OpenSBSList.add(LevingRoom);
		OWLNamedClass_OpenSBSList.add(Bathroom);
		OWLNamedClass_OpenSBSList.add(Patio);
		OWLNamedClass_OpenSBSList.add(Landing);
		OWLNamedClass_OpenSBSList.add(DenningRoom);
		OWLNamedClass_OpenSBSList.add(Kitchen);
		OWLNamedClass_OpenSBSList.add(room);
		OWLNamedClass_OpenSBSList.add(Hall);
		OWLNamedClass_OpenSBSList.add(wc);
		OWLNamedClass_OpenSBSList.add(Bedroom);
		OWLNamedClass_OpenSBSList.add(KidsRoom);
		OWLNamedClass_OpenSBSList.add(Outdoorspace);
		OWLNamedClass_OpenSBSList.add(Wall);
		OWLNamedClass_OpenSBSList.add(Garage);

		OWLNamedClass_OpenSBSList.add(Time);
		OWLNamedClass_OpenSBSList.add(SystemTime);
		OWLNamedClass_OpenSBSList.add(TemporalTime);
		OWLNamedClass_OpenSBSList.add(InstantTime);
		OWLNamedClass_OpenSBSList.add(IntervalTime);

		OWLNamedClass_OpenSBSList.add(Events);
		OWLNamedClass_OpenSBSList.add(Policy);
		OWLNamedClass_OpenSBSList.add(Requirement);
		OWLNamedClass_OpenSBSList.add(Address);

		OWLNamedClass_OpenSBSList.add(Service);
		OWLNamedClass_OpenSBSList.add(Service_Grounding);
		OWLNamedClass_OpenSBSList.add(Service_Model);
		OWLNamedClass_OpenSBSList.add(Service_Type);
		OWLNamedClass_OpenSBSList.add(Access_Control);
		OWLNamedClass_OpenSBSList.add(Climate_Service);
		OWLNamedClass_OpenSBSList.add(Cloud_Service);
		OWLNamedClass_OpenSBSList.add(Emergencu_Service);
		OWLNamedClass_OpenSBSList.add(Information_Supply_Service);
		OWLNamedClass_OpenSBSList.add(Media_Service);

		OWLNamedClass_OpenSBSList.add(Profile);
		OWLNamedClass_OpenSBSList.add(BuildingProfile);
		OWLNamedClass_OpenSBSList.add(HumanProfile);
		OWLNamedClass_OpenSBSList.add(Ability);
		OWLNamedClass_OpenSBSList.add(Contact);
		OWLNamedClass_OpenSBSList.add(Interest);
		OWLNamedClass_OpenSBSList.add(Property);
		OWLNamedClass_OpenSBSList.add(Role);
		OWLNamedClass_OpenSBSList.add(Skills);
		OWLNamedClass_OpenSBSList.add(State);
		OWLNamedClass_OpenSBSList.add(HealthState);
		OWLNamedClass_OpenSBSList.add(PsycholodivalState);
		OWLNamedClass_OpenSBSList.add(Boredom);
		OWLNamedClass_OpenSBSList.add(Joyfulness);
		OWLNamedClass_OpenSBSList.add(Restlessness);
		OWLNamedClass_OpenSBSList.add(Disgust);
		OWLNamedClass_OpenSBSList.add(Surprise);
		OWLNamedClass_OpenSBSList.add(Sadness);
		OWLNamedClass_OpenSBSList.add(Worry);
		OWLNamedClass_OpenSBSList.add(Fear);
		OWLNamedClass_OpenSBSList.add(ServiceProfile);
		OWLNamedClass_OpenSBSList.add(Condition_Effect);
		OWLNamedClass_OpenSBSList.add(Input_Service);
		OWLNamedClass_OpenSBSList.add(Output_Service);
		OWLNamedClass_OpenSBSList.add(Paramater_Service);
		OWLNamedClass_OpenSBSList.add(Precondition);
		OWLNamedClass_OpenSBSList.add(SiteProfile);
		// ========================================================================================================
		// --------------------------------------------------------------------------------
		Action_EffectIn_Device = new OWLObjectProperty_OpenSBS("Action_EffectIn_Device");

		Event_Object_Property = new OWLObjectProperty_OpenSBS("Event_Object_Property");
		Event_Has_Actions = new OWLObjectProperty_OpenSBS("Event_Has_Actions");
		Event_Has_Time = new OWLObjectProperty_OpenSBS("Event_Has_Time");

		Bills_Has_Energy_Sources = new OWLObjectProperty_OpenSBS("Bills_Has_Energy_Sources");

		Activity_Object_Property = new OWLObjectProperty_OpenSBS("Activity_Object_Property");
		Activity_DoneInPlace = new OWLObjectProperty_OpenSBS("DoneInPlace");
		Activity_HasBeginTime = new OWLObjectProperty_OpenSBS("HasBeginTime");
		Activity_HasEndTime = new OWLObjectProperty_OpenSBS("HasEndTime");
		Activity_HasOutcome = new OWLObjectProperty_OpenSBS("HasOutcome");
		Activity_HasSubActivity = new OWLObjectProperty_OpenSBS("HasSubActivity");
		Activity_UsesAppliance = new OWLObjectProperty_OpenSBS("UsesAppliance");
		Activity_Has_Actions = new OWLObjectProperty_OpenSBS("Activity_Has_Actions");

		Appliance_Object_Property = new OWLObjectProperty_OpenSBS("Appliance_Object_Property");
		Appliance_Locate_Near_To = new OWLObjectProperty_OpenSBS("Appliance_Locate_Near_To");
		Belong_to = new OWLObjectProperty_OpenSBS("Belong_to");
		HasAction = new OWLObjectProperty_OpenSBS("HasAction");
		HasNetworkProtocol = new OWLObjectProperty_OpenSBS("HasNetworkProtocol");
		HasSoftware = new OWLObjectProperty_OpenSBS("HasSoftware");
		Appliance_LocateInPlace = new OWLObjectProperty_OpenSBS("Appliance_LocateInPlace");
		OwnByHuman = new OWLObjectProperty_OpenSBS("OwnByHuman");
		ProvideService = new OWLObjectProperty_OpenSBS("ProvideService");
		ConactedTo = new OWLObjectProperty_OpenSBS("ConactedTo");

		Building_Object_Property = new OWLObjectProperty_OpenSBS("Building_Object_Property");
		HasBill = new OWLObjectProperty_OpenSBS("HasBill");
		HasContext = new OWLObjectProperty_OpenSBS("HasContext");
		HasEnergySuorce = new OWLObjectProperty_OpenSBS("HasEnergySuorce");
		HasEvent = new OWLObjectProperty_OpenSBS("HasEvent");
		HasAddress = new OWLObjectProperty_OpenSBS("HasAddress");
		HasPlaces = new OWLObjectProperty_OpenSBS("HasPlaces");
		HasProfile = new OWLObjectProperty_OpenSBS("HasProfile");
		HasRequirement = new OWLObjectProperty_OpenSBS("HasRequirement");
		Ownby = new OWLObjectProperty_OpenSBS("Ownby");

		Context_Awareness_Object_Property = new OWLObjectProperty_OpenSBS("Context_Awareness_Object_Property");
		Context_Model_Relation = new OWLObjectProperty_OpenSBS("Context_Model_Relation");
		Context_Model_HasContext_Schema = new OWLObjectProperty_OpenSBS("Context_Model_HasContext_Schema");
		Context_Model_Modeling_Has_Time = new OWLObjectProperty_OpenSBS("Context_Model_Modeling_Has_Time");
		Context_Schema_Relation = new OWLObjectProperty_OpenSBS("Context_Schema_Relation");
		Context_Modeling_Schema_realtions = new OWLObjectProperty_OpenSBS("Context_Modeling_Schema_realtions");

		Modeling_Schema_Has_Context_Acquisition_Schema = new OWLObjectProperty_OpenSBS(
				"Modeling_Schema_Has_Context_Acquisition_Schema");
		Modeling_Schema_Has_Context_Level = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_Context_Level");
		Modeling_Schema_Has_Context_Modeling_Shcema = new OWLObjectProperty_OpenSBS(
				"Modeling_Schema_Has_Context_Modeling_Shcema");
		Modeling_Schema_Has_Conetxt_State = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_Conetxt_State");
		Modeling_Schema_Has_What = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_What");
		Modeling_Schema_Has_Where = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_Where");
		Modeling_Schema_Has_who = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_who");
		Modeling_Schema_Has_Modeling_Time = new OWLObjectProperty_OpenSBS("Modeling_Schema_Has_Modeling_Time");
		Modeling_Schema_HasQoc = new OWLObjectProperty_OpenSBS("Modeling_Schema_HasQoc");
		Context_Acquisution_Schema_Relation = new OWLObjectProperty_OpenSBS("Context_Acquisution_Schema_Relation");
		Acquisution_Schema_HasContext_Type = new OWLObjectProperty_OpenSBS("Acquisution_Schema_HasContext_Type");
		Acquisution_Schema_HasQoc = new OWLObjectProperty_OpenSBS("Acquisution_Schema_HasQoc");
		Acquisution_Schema_HasTime = new OWLObjectProperty_OpenSBS("Acquisution_Schema_HasTime");

		Environment_Paramaters_Objects_Property = new OWLObjectProperty_OpenSBS(
				"Environment_Paramaters_Objects_Property");
		Environment_Paramaters_MeasuredBy = new OWLObjectProperty_OpenSBS("Environment_Paramaters_MeasuredBy");

		Human_Object_Property = new OWLObjectProperty_OpenSBS("Human_Object_Property");
		CurrentActivity = new OWLObjectProperty_OpenSBS("CurrentActivity");
		HasFather = new OWLObjectProperty_OpenSBS("HasFather");
		HasMother = new OWLObjectProperty_OpenSBS("HasMother");
		Human_LocateInPlace = new OWLObjectProperty_OpenSBS("Human_LocateInPlace");
		HumanHasProfile = new OWLObjectProperty_OpenSBS("HumanHasProfile");
		Human_Has_Behaviors = new OWLObjectProperty_OpenSBS("Human_Has_Behaviors");
		Human_Has_Activity = new OWLObjectProperty_OpenSBS("Human_Has_Activity");

		Behaviors_Object_Property = new OWLObjectProperty_OpenSBS("Behaviors_Object_Property");
		Behaviors_HasBeginTime = new OWLObjectProperty_OpenSBS("Behaviors_HasBeginTime");
		Behaviors_HasEndTime = new OWLObjectProperty_OpenSBS("Behaviors_HasEndTime");
		Behaviors_Has_Actions = new OWLObjectProperty_OpenSBS("Behaviors_Has_Actions");

		Time_Object_Property = new OWLObjectProperty_OpenSBS("Time_Object_Property");
		TimeHasBegining = new OWLObjectProperty_OpenSBS("TimeHasBegining");
		TimeHasDuration = new OWLObjectProperty_OpenSBS("TimeHasDuration");
		TimeHasDescription = new OWLObjectProperty_OpenSBS("TimeHasDescription");

		Place_Object_Property = new OWLObjectProperty_OpenSBS("Place_Object_Property");
		Place_HasAppliance = new OWLObjectProperty_OpenSBS("Place_HasAppliance");
		PlaceHasEnvironment = new OWLObjectProperty_OpenSBS("PlaceHasEnvironment");
		PlaceOwnBy = new OWLObjectProperty_OpenSBS("PlaceOwnBy");

		Human_Profile_Object_Property = new OWLObjectProperty_OpenSBS("Human_Profile_Object_Property");
		HasAbility = new OWLObjectProperty_OpenSBS("HasAbility");
		HasBehavior = new OWLObjectProperty_OpenSBS("HasBehavior");
		HasCalandar = new OWLObjectProperty_OpenSBS("HasCalandar");
		HasContact = new OWLObjectProperty_OpenSBS("HasContact");
		HasHealthState = new OWLObjectProperty_OpenSBS("HasHealthState");
		HasIdentify = new OWLObjectProperty_OpenSBS("HasIdentify");
		HasInterest = new OWLObjectProperty_OpenSBS("HasInterest");
		HasPreference = new OWLObjectProperty_OpenSBS("HasPreference");
		HasPsycholocicalState = new OWLObjectProperty_OpenSBS("HasPsycholocicalState");
		HasRole = new OWLObjectProperty_OpenSBS("HasRole");
		HasState = new OWLObjectProperty_OpenSBS("HasState");
		HasSkills = new OWLObjectProperty_OpenSBS("HasSkills");
		OwnAppliance = new OWLObjectProperty_OpenSBS("OwnAppliance");
		OwnPlace = new OWLObjectProperty_OpenSBS("OwnPlace");

		Service_Object_Property = new OWLObjectProperty_OpenSBS("Service_Object_Property");
		Service_HasModel = new OWLObjectProperty_OpenSBS("Service_HasModel");
		Service_HasType = new OWLObjectProperty_OpenSBS("Service_HasType");
		Service_HasProfile = new OWLObjectProperty_OpenSBS("Service_HasProfile");
		Service_require_Service = new OWLObjectProperty_OpenSBS("Service_require_Service");
		Service_HasRerquirement = new OWLObjectProperty_OpenSBS("Service_HasRerquirement");

		OWLObjectProperty_OpenSBSList.add(Action_EffectIn_Device);

		OWLObjectProperty_OpenSBSList.add(Event_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Event_Has_Actions);
		OWLObjectProperty_OpenSBSList.add(Event_Has_Time);

		OWLObjectProperty_OpenSBSList.add(Bills_Has_Energy_Sources);

		OWLObjectProperty_OpenSBSList.add(Activity_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Activity_DoneInPlace);
		OWLObjectProperty_OpenSBSList.add(Activity_HasBeginTime);
		OWLObjectProperty_OpenSBSList.add(Activity_HasEndTime);
		OWLObjectProperty_OpenSBSList.add(Activity_HasOutcome);
		OWLObjectProperty_OpenSBSList.add(Activity_HasSubActivity);
		OWLObjectProperty_OpenSBSList.add(Activity_UsesAppliance);
		OWLObjectProperty_OpenSBSList.add(Activity_Has_Actions);

		OWLObjectProperty_OpenSBSList.add(Appliance_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Appliance_Locate_Near_To);
		OWLObjectProperty_OpenSBSList.add(Belong_to);
		OWLObjectProperty_OpenSBSList.add(HasAction);
		OWLObjectProperty_OpenSBSList.add(HasNetworkProtocol);
		OWLObjectProperty_OpenSBSList.add(HasSoftware);
		OWLObjectProperty_OpenSBSList.add(Appliance_LocateInPlace);
		OWLObjectProperty_OpenSBSList.add(OwnByHuman);
		OWLObjectProperty_OpenSBSList.add(ProvideService);
		OWLObjectProperty_OpenSBSList.add(ConactedTo);

		OWLObjectProperty_OpenSBSList.add(Building_Object_Property);
		OWLObjectProperty_OpenSBSList.add(HasBill);
		OWLObjectProperty_OpenSBSList.add(HasContext);
		OWLObjectProperty_OpenSBSList.add(HasEnergySuorce);
		OWLObjectProperty_OpenSBSList.add(HasEvent);
		OWLObjectProperty_OpenSBSList.add(HasAddress);
		OWLObjectProperty_OpenSBSList.add(HasPlaces);
		OWLObjectProperty_OpenSBSList.add(HasProfile);
		OWLObjectProperty_OpenSBSList.add(HasRequirement);
		OWLObjectProperty_OpenSBSList.add(Ownby);

		OWLObjectProperty_OpenSBSList.add(Context_Awareness_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Context_Model_Relation);
		OWLObjectProperty_OpenSBSList.add(Context_Model_HasContext_Schema);
		OWLObjectProperty_OpenSBSList.add(Context_Model_Modeling_Has_Time);
		OWLObjectProperty_OpenSBSList.add(Context_Schema_Relation);
		OWLObjectProperty_OpenSBSList.add(Context_Modeling_Schema_realtions);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Context_Acquisition_Schema);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Context_Level);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Context_Modeling_Shcema);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Conetxt_State);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_What);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Where);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_who);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_Has_Modeling_Time);
		OWLObjectProperty_OpenSBSList.add(Modeling_Schema_HasQoc);
		OWLObjectProperty_OpenSBSList.add(Context_Acquisution_Schema_Relation);
		OWLObjectProperty_OpenSBSList.add(Acquisution_Schema_HasContext_Type);
		OWLObjectProperty_OpenSBSList.add(Acquisution_Schema_HasQoc);
		OWLObjectProperty_OpenSBSList.add(Acquisution_Schema_HasTime);

		OWLObjectProperty_OpenSBSList.add(Environment_Paramaters_Objects_Property);
		OWLObjectProperty_OpenSBSList.add(Environment_Paramaters_MeasuredBy);

		OWLObjectProperty_OpenSBSList.add(Human_Object_Property);
		OWLObjectProperty_OpenSBSList.add(CurrentActivity);
		OWLObjectProperty_OpenSBSList.add(HasFather);
		OWLObjectProperty_OpenSBSList.add(HasMother);
		OWLObjectProperty_OpenSBSList.add(Human_LocateInPlace);
		OWLObjectProperty_OpenSBSList.add(HumanHasProfile);
		OWLObjectProperty_OpenSBSList.add(Human_Has_Behaviors);
		OWLObjectProperty_OpenSBSList.add(Human_Has_Activity);

		OWLObjectProperty_OpenSBSList.add(Behaviors_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Behaviors_HasBeginTime);
		OWLObjectProperty_OpenSBSList.add(Behaviors_HasEndTime);
		OWLObjectProperty_OpenSBSList.add(Behaviors_Has_Actions);

		OWLObjectProperty_OpenSBSList.add(Time_Object_Property);
		OWLObjectProperty_OpenSBSList.add(TimeHasBegining);
		OWLObjectProperty_OpenSBSList.add(TimeHasDuration);
		OWLObjectProperty_OpenSBSList.add(TimeHasDescription);

		OWLObjectProperty_OpenSBSList.add(Place_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Place_HasAppliance);
		OWLObjectProperty_OpenSBSList.add(PlaceHasEnvironment);
		OWLObjectProperty_OpenSBSList.add(PlaceOwnBy);

		OWLObjectProperty_OpenSBSList.add(Human_Profile_Object_Property);
		OWLObjectProperty_OpenSBSList.add(HasAbility);
		OWLObjectProperty_OpenSBSList.add(HasBehavior);
		OWLObjectProperty_OpenSBSList.add(HasCalandar);
		OWLObjectProperty_OpenSBSList.add(HasContact);
		OWLObjectProperty_OpenSBSList.add(HasHealthState);
		OWLObjectProperty_OpenSBSList.add(HasIdentify);
		OWLObjectProperty_OpenSBSList.add(HasInterest);
		OWLObjectProperty_OpenSBSList.add(HasPreference);
		OWLObjectProperty_OpenSBSList.add(HasPsycholocicalState);
		OWLObjectProperty_OpenSBSList.add(HasRole);
		OWLObjectProperty_OpenSBSList.add(HasState);
		OWLObjectProperty_OpenSBSList.add(HasSkills);
		OWLObjectProperty_OpenSBSList.add(OwnAppliance);
		OWLObjectProperty_OpenSBSList.add(OwnPlace);

		OWLObjectProperty_OpenSBSList.add(Service_Object_Property);
		OWLObjectProperty_OpenSBSList.add(Service_HasModel);
		OWLObjectProperty_OpenSBSList.add(Service_HasType);
		OWLObjectProperty_OpenSBSList.add(Service_HasProfile);
		OWLObjectProperty_OpenSBSList.add(Service_require_Service);
		OWLObjectProperty_OpenSBSList.add(Service_HasRerquirement);

		// --------------------------------------------------------------------------------
		Context_Awareness_Property = new OWLDatatypeProperty_OpenSBS("Context_Awareness_Property");
		Context_Aquisition_Schema = new OWLDatatypeProperty_OpenSBS("Context_Aquisition_Schema");
		APT = new OWLDatatypeProperty_OpenSBS("APT");
		CA = new OWLDatatypeProperty_OpenSBS("CA");
		Context_ID = new OWLDatatypeProperty_OpenSBS("Context_ID");
		Context_Name = new OWLDatatypeProperty_OpenSBS("Context_Name");
		Csbt = new OWLDatatypeProperty_OpenSBS("Csbt");
		Qod = new OWLDatatypeProperty_OpenSBS("Qod");
		Rbt = new OWLDatatypeProperty_OpenSBS("Rbt");
		ContextHasTime = new OWLDatatypeProperty_OpenSBS("ContextHasTime");
		Vl = new OWLDatatypeProperty_OpenSBS("Vl");

		Context_Level_property = new OWLDatatypeProperty_OpenSBS("Context_Level_property");
		Context_Level_Degree = new OWLDatatypeProperty_OpenSBS("Context_Level_Degree");
		Context_Level_Process = new OWLDatatypeProperty_OpenSBS("Context_Level_Process");

		Context_Model_Property = new OWLDatatypeProperty_OpenSBS("Context_Model_Property");
		Context_Model_Name = new OWLDatatypeProperty_OpenSBS("Context_Model_Name");

		Context_Modeling_Schema_Property = new OWLDatatypeProperty_OpenSBS("Context_Modeling_Schema_Property");
		Context_Modeling_Schema_ID = new OWLDatatypeProperty_OpenSBS("Context_Modeling_Schema_ID");
		Context_Modeling_Schema_Name = new OWLDatatypeProperty_OpenSBS("Context_Modeling_Schema_Name");

		Context_State_Value = new OWLDatatypeProperty_OpenSBS("Context_State_Value");
		Quality_Of_Context_Property = new OWLDatatypeProperty_OpenSBS("Quality_Of_Context_Property");
		Data_precision = new OWLDatatypeProperty_OpenSBS("Data_precision");
		Data_UpToDatedness = new OWLDatatypeProperty_OpenSBS("Data_UpToDatedness");
		Data_Validity = new OWLDatatypeProperty_OpenSBS("Data_Validity");
		Energy_Consumption_Level = new OWLDatatypeProperty_OpenSBS("Energy_Consumption_Level");
		Inhabitant_Feedback = new OWLDatatypeProperty_OpenSBS("Inhabitant_Feedback");
		Number_Of_Occurrences_In_History = new OWLDatatypeProperty_OpenSBS("Number_Of_Occurrences_In_History");
		Quality_Of_Context_Data = new OWLDatatypeProperty_OpenSBS("Quality_Of_Context_Data");
		Quality_Of_The_delivery_Process = new OWLDatatypeProperty_OpenSBS("Quality_Of_The_delivery_Process");

		Building_ID = new OWLDatatypeProperty_OpenSBS("Building_ID");
		Building_Room_Number = new OWLDatatypeProperty_OpenSBS("Building_Room_Number");

		Policy_Max_Energy_ConsumptionByMonth = new OWLDatatypeProperty_OpenSBS("Policy_Max_Energy_ConsumptionByMonth");

		Environment_Name = new OWLDatatypeProperty_OpenSBS("Environment_Name");
		Environment_Values = new OWLDatatypeProperty_OpenSBS("Environment_Values");

		Service_Name = new OWLDatatypeProperty_OpenSBS("Service_Name");
		Service_Values = new OWLDatatypeProperty_OpenSBS("Service_Values");

		Time_Second = new OWLDatatypeProperty_OpenSBS("Time_Second");
		Time_Min = new OWLDatatypeProperty_OpenSBS("Time_Min");
		Time_Hours = new OWLDatatypeProperty_OpenSBS("Time_Hours");
		Time_Day = new OWLDatatypeProperty_OpenSBS("Time_Day");
		Time_Type_Am_Pm = new OWLDatatypeProperty_OpenSBS("Time_Type_Am_Pm");

		Activity_Name = new OWLDatatypeProperty_OpenSBS("Activity_Name");
		Activity_Type = new OWLDatatypeProperty_OpenSBS("Activity_Type");
		Activity_Description = new OWLDatatypeProperty_OpenSBS("Activity_Description");
		Activity_ID = new OWLDatatypeProperty_OpenSBS("Activity_ID");

		Behaviors_Name = new OWLDatatypeProperty_OpenSBS("Behaviors_Name");
		Behaviors_Percentage_Importance = new OWLDatatypeProperty_OpenSBS("Behaviors_Percentage_Importance");
		Behaviors_Stat_On_Off = new OWLDatatypeProperty_OpenSBS("Behaviors_Stat_On_Off");
		Behaviors_Description = new OWLDatatypeProperty_OpenSBS("Behaviors_Description");

		Action_Name = new OWLDatatypeProperty_OpenSBS("Action_Name");
		Action_Type = new OWLDatatypeProperty_OpenSBS("Action_Type");
		Action_command_List = new OWLDatatypeProperty_OpenSBS("Action_command_List");
		Action_Description = new OWLDatatypeProperty_OpenSBS("Action_Description");

		Address_Country = new OWLDatatypeProperty_OpenSBS("Address_Country");
		Address_County = new OWLDatatypeProperty_OpenSBS("Address_County");
		Address_Line_2 = new OWLDatatypeProperty_OpenSBS("Address_Line_2");
		Address_Stat = new OWLDatatypeProperty_OpenSBS("Address_Stat");
		Address_city = new OWLDatatypeProperty_OpenSBS("Address_city");
		Address_Postal_Code = new OWLDatatypeProperty_OpenSBS("Address_Postal_Code");
		Adress_GPS_Location = new OWLDatatypeProperty_OpenSBS("Adress_GPS_Location");
		Address_Line_1 = new OWLDatatypeProperty_OpenSBS("Address_Line_1");

		Device_ID = new OWLDatatypeProperty_OpenSBS("Device_ID");
		Devices_Name = new OWLDatatypeProperty_OpenSBS("Devices_Name");
		Devices_State = new OWLDatatypeProperty_OpenSBS("Devices_State");
		Devices_Type = new OWLDatatypeProperty_OpenSBS("Devices_Type");
		Devices_Values = new OWLDatatypeProperty_OpenSBS("Devices_Values");
		Devices_Watts_Consuming = new OWLDatatypeProperty_OpenSBS("Devices_Watts_Consuming");
		Devices_Protocol = new OWLDatatypeProperty_OpenSBS("Devices_Protocol");
		DeviceStartRunTime = new OWLDatatypeProperty_OpenSBS("DeviceStartRunTime");

		Home_Area = new OWLDatatypeProperty_OpenSBS("Home_Area");
		Home_Number = new OWLDatatypeProperty_OpenSBS("Home_Number");

		Events_Percentage = new OWLDatatypeProperty_OpenSBS("Events_Percentage");
		Events_Name = new OWLDatatypeProperty_OpenSBS("Events_Name");
		Events_Level = new OWLDatatypeProperty_OpenSBS("Events_Level");
		Events_type = new OWLDatatypeProperty_OpenSBS("Events_type");

		Zone_Type = new OWLDatatypeProperty_OpenSBS("Zone_Type");
		Zone_VectoreXY = new OWLDatatypeProperty_OpenSBS("Zone_VectoreXY");
		Zone_Size = new OWLDatatypeProperty_OpenSBS("Zone_Size");
		Zone_Floor = new OWLDatatypeProperty_OpenSBS("Zone_Floor");
		Zone_Name = new OWLDatatypeProperty_OpenSBS("Zone_Name");

		Human_Email = new OWLDatatypeProperty_OpenSBS("Human_Email");
		Human_Phone_Number = new OWLDatatypeProperty_OpenSBS("Human_Phone_Number");
		Human_Birthday = new OWLDatatypeProperty_OpenSBS("Human_Birthday");
		Human_First_Name = new OWLDatatypeProperty_OpenSBS("Human_First_Name");
		Human_Gender = new OWLDatatypeProperty_OpenSBS("Human_Gender");
		Human_Last_Name = new OWLDatatypeProperty_OpenSBS("Human_Last_Name");
		Human_Age = new OWLDatatypeProperty_OpenSBS("Human_Age");

		Bills_Type = new OWLDatatypeProperty_OpenSBS("Bills_Type");
		Bills_Name = new OWLDatatypeProperty_OpenSBS("Bills_Name");
		Bills_Values = new OWLDatatypeProperty_OpenSBS("Bills_Values");

		// =============================================================================================
		OWLDatatypeProperty_OpenSBSList.add(Context_Awareness_Property);
		OWLDatatypeProperty_OpenSBSList.add(Context_Aquisition_Schema);
		OWLDatatypeProperty_OpenSBSList.add(APT);
		OWLDatatypeProperty_OpenSBSList.add(CA);
		OWLDatatypeProperty_OpenSBSList.add(Context_ID);
		OWLDatatypeProperty_OpenSBSList.add(Context_Name);
		OWLDatatypeProperty_OpenSBSList.add(Csbt);
		OWLDatatypeProperty_OpenSBSList.add(Qod);
		OWLDatatypeProperty_OpenSBSList.add(Rbt);
		OWLDatatypeProperty_OpenSBSList.add(ContextHasTime);
		OWLDatatypeProperty_OpenSBSList.add(Vl);

		OWLDatatypeProperty_OpenSBSList.add(Context_Level_property);
		OWLDatatypeProperty_OpenSBSList.add(Context_Level_Degree);
		OWLDatatypeProperty_OpenSBSList.add(Context_Level_Process);

		OWLDatatypeProperty_OpenSBSList.add(Context_Model_Property);
		OWLDatatypeProperty_OpenSBSList.add(Context_Model_Name);

		OWLDatatypeProperty_OpenSBSList.add(Context_Modeling_Schema_Property);
		OWLDatatypeProperty_OpenSBSList.add(Context_Modeling_Schema_ID);
		OWLDatatypeProperty_OpenSBSList.add(Context_Modeling_Schema_Name);

		OWLDatatypeProperty_OpenSBSList.add(Context_State_Value);
		OWLDatatypeProperty_OpenSBSList.add(Quality_Of_Context_Property);
		OWLDatatypeProperty_OpenSBSList.add(Data_precision);
		OWLDatatypeProperty_OpenSBSList.add(Data_UpToDatedness);
		OWLDatatypeProperty_OpenSBSList.add(Data_Validity);
		OWLDatatypeProperty_OpenSBSList.add(Energy_Consumption_Level);
		OWLDatatypeProperty_OpenSBSList.add(Inhabitant_Feedback);
		OWLDatatypeProperty_OpenSBSList.add(Number_Of_Occurrences_In_History);
		OWLDatatypeProperty_OpenSBSList.add(Quality_Of_Context_Data);
		OWLDatatypeProperty_OpenSBSList.add(Quality_Of_The_delivery_Process);

		OWLDatatypeProperty_OpenSBSList.add(Building_ID);
		OWLDatatypeProperty_OpenSBSList.add(Building_Room_Number);

		OWLDatatypeProperty_OpenSBSList.add(Policy_Max_Energy_ConsumptionByMonth);

		OWLDatatypeProperty_OpenSBSList.add(Environment_Name);
		OWLDatatypeProperty_OpenSBSList.add(Environment_Values);

		OWLDatatypeProperty_OpenSBSList.add(Service_Name);
		OWLDatatypeProperty_OpenSBSList.add(Service_Values);

		OWLDatatypeProperty_OpenSBSList.add(Time_Second);
		OWLDatatypeProperty_OpenSBSList.add(Time_Min);
		OWLDatatypeProperty_OpenSBSList.add(Time_Hours);
		OWLDatatypeProperty_OpenSBSList.add(Time_Day);
		OWLDatatypeProperty_OpenSBSList.add(Time_Type_Am_Pm);

		OWLDatatypeProperty_OpenSBSList.add(Activity_Name);
		OWLDatatypeProperty_OpenSBSList.add(Activity_Type);
		OWLDatatypeProperty_OpenSBSList.add(Activity_Description);
		OWLDatatypeProperty_OpenSBSList.add(Activity_ID);

		OWLDatatypeProperty_OpenSBSList.add(Behaviors_Name);
		OWLDatatypeProperty_OpenSBSList.add(Behaviors_Percentage_Importance);
		OWLDatatypeProperty_OpenSBSList.add(Behaviors_Stat_On_Off);
		OWLDatatypeProperty_OpenSBSList.add(Behaviors_Description);

		OWLDatatypeProperty_OpenSBSList.add(Action_Name);
		OWLDatatypeProperty_OpenSBSList.add(Action_Type);
		OWLDatatypeProperty_OpenSBSList.add(Action_command_List);
		OWLDatatypeProperty_OpenSBSList.add(Action_Description);

		OWLDatatypeProperty_OpenSBSList.add(Address_Country);
		OWLDatatypeProperty_OpenSBSList.add(Address_County);
		OWLDatatypeProperty_OpenSBSList.add(Address_Line_2);
		OWLDatatypeProperty_OpenSBSList.add(Address_Stat);
		OWLDatatypeProperty_OpenSBSList.add(Address_city);
		OWLDatatypeProperty_OpenSBSList.add(Address_Postal_Code);
		OWLDatatypeProperty_OpenSBSList.add(Adress_GPS_Location);
		OWLDatatypeProperty_OpenSBSList.add(Address_Line_1);

		OWLDatatypeProperty_OpenSBSList.add(Device_ID);
		OWLDatatypeProperty_OpenSBSList.add(Devices_Name);
		OWLDatatypeProperty_OpenSBSList.add(Devices_State);
		OWLDatatypeProperty_OpenSBSList.add(Devices_Type);
		OWLDatatypeProperty_OpenSBSList.add(Devices_Values);
		OWLDatatypeProperty_OpenSBSList.add(Devices_Watts_Consuming);

		OWLDatatypeProperty_OpenSBSList.add(Devices_Protocol);
		OWLDatatypeProperty_OpenSBSList.add(DeviceStartRunTime);

		OWLDatatypeProperty_OpenSBSList.add(Home_Area);
		OWLDatatypeProperty_OpenSBSList.add(Home_Number);

		OWLDatatypeProperty_OpenSBSList.add(Events_Percentage);
		OWLDatatypeProperty_OpenSBSList.add(Events_Name);
		OWLDatatypeProperty_OpenSBSList.add(Events_Level);
		OWLDatatypeProperty_OpenSBSList.add(Events_type);

		OWLDatatypeProperty_OpenSBSList.add(Zone_Type);
		OWLDatatypeProperty_OpenSBSList.add(Zone_VectoreXY);
		OWLDatatypeProperty_OpenSBSList.add(Zone_Size);
		OWLDatatypeProperty_OpenSBSList.add(Zone_Floor);
		OWLDatatypeProperty_OpenSBSList.add(Zone_Name);

		OWLDatatypeProperty_OpenSBSList.add(Human_Email);
		OWLDatatypeProperty_OpenSBSList.add(Human_Phone_Number);
		OWLDatatypeProperty_OpenSBSList.add(Human_Birthday);
		OWLDatatypeProperty_OpenSBSList.add(Human_First_Name);
		OWLDatatypeProperty_OpenSBSList.add(Human_Gender);
		OWLDatatypeProperty_OpenSBSList.add(Human_Last_Name);
		OWLDatatypeProperty_OpenSBSList.add(Human_Age);

		OWLDatatypeProperty_OpenSBSList.add(Bills_Type);
		OWLDatatypeProperty_OpenSBSList.add(Bills_Name);
		OWLDatatypeProperty_OpenSBSList.add(Bills_Values);

	}

	public OWLNamedClass_OpenSBS getBlender() {
		return Blender;
	}

	public void setBlender(OWLNamedClass_OpenSBS blender) {
		Blender = blender;
	}

	public OWLNamedClass_OpenSBS getCoffeeMmachine() {
		return CoffeeMmachine;
	}

	public void setCoffeeMmachine(OWLNamedClass_OpenSBS coffeeMmachine) {
		CoffeeMmachine = coffeeMmachine;
	}

	public OWLNamedClass_OpenSBS getDesktop() {
		return Desktop;
	}

	public OWLNamedClass_OpenSBS getGrandmother() {
		return Grandmother;
	}

	public void setGrandmother(OWLNamedClass_OpenSBS grandmother) {
		Grandmother = grandmother;
	}

	public OWLNamedClass_OpenSBS getGrandfather() {
		return Grandfather;
	}

	public void setGrandfather(OWLNamedClass_OpenSBS grandfather) {
		Grandfather = grandfather;
	}

	public OWLNamedClass_OpenSBS getMother() {
		return Mother;
	}

	public void setMother(OWLNamedClass_OpenSBS mother) {
		Mother = mother;
	}

	public OWLNamedClass_OpenSBS getFather() {
		return Father;
	}

	public void setFather(OWLNamedClass_OpenSBS father) {
		Father = father;
	}

	public OWLNamedClass_OpenSBS getSister() {
		return Sister;
	}

	public void setSister(OWLNamedClass_OpenSBS sister) {
		Sister = sister;
	}

	public OWLNamedClass_OpenSBS getBrother() {
		return Brother;
	}

	public void setBrother(OWLNamedClass_OpenSBS brother) {
		Brother = brother;
	}

	public OWLNamedClass_OpenSBS getPrinter() {
		return Printer;
	}

	public void setPrinter(OWLNamedClass_OpenSBS printer) {
		Printer = printer;
	}

	public void setDesktop(OWLNamedClass_OpenSBS desktop) {
		Desktop = desktop;
	}

	public List<OWLObjectProperty_OpenSBS> getOWLObjectProperty_OpenSBSList() {
		return OWLObjectProperty_OpenSBSList;
	}

	public void setOWLObjectProperty_OpenSBSList(List<OWLObjectProperty_OpenSBS> oWLObjectProperty_OpenSBSList) {
		OWLObjectProperty_OpenSBSList = oWLObjectProperty_OpenSBSList;
	}

	public List<OWLDatatypeProperty_OpenSBS> getOWLDatatypeProperty_OpenSBSList() {
		return OWLDatatypeProperty_OpenSBSList;
	}

	public void setOWLDatatypeProperty_OpenSBSList(List<OWLDatatypeProperty_OpenSBS> oWLDatatypeProperty_OpenSBSList) {
		OWLDatatypeProperty_OpenSBSList = oWLDatatypeProperty_OpenSBSList;
	}

	public List<OWLNamedClass_OpenSBS> getOWLNamedClass_OpenSBSList() {
		return OWLNamedClass_OpenSBSList;
	}

	public void setOWLNamedClass_OpenSBSList(List<OWLNamedClass_OpenSBS> oWLNamedClass_OpenSBSList) {
		OWLNamedClass_OpenSBSList = oWLNamedClass_OpenSBSList;
	}

	public OWLObjectProperty_OpenSBS getAction_EffectIn_Device() {
		return Action_EffectIn_Device;
	}

	public void setAction_EffectIn_Device(OWLObjectProperty_OpenSBS action_EffectIn_Device) {
		Action_EffectIn_Device = action_EffectIn_Device;
	}

	public OWLObjectProperty_OpenSBS getActivity_Has_Actions() {
		return Activity_Has_Actions;
	}

	public void setActivity_Has_Actions(OWLObjectProperty_OpenSBS activity_Has_Actions) {
		Activity_Has_Actions = activity_Has_Actions;
	}

	public OWLObjectProperty_OpenSBS getActivity_DoneInPlace() {
		return Activity_DoneInPlace;
	}

	public void setActivity_DoneInPlace(OWLObjectProperty_OpenSBS activity_DoneInPlace) {
		Activity_DoneInPlace = activity_DoneInPlace;
	}

	public OWLObjectProperty_OpenSBS getActivity_HasBeginTime() {
		return Activity_HasBeginTime;
	}

	public void setActivity_HasBeginTime(OWLObjectProperty_OpenSBS activity_HasBeginTime) {
		Activity_HasBeginTime = activity_HasBeginTime;
	}

	public OWLObjectProperty_OpenSBS getActivity_HasEndTime() {
		return Activity_HasEndTime;
	}

	public void setActivity_HasEndTime(OWLObjectProperty_OpenSBS activity_HasEndTime) {
		Activity_HasEndTime = activity_HasEndTime;
	}

	public OWLObjectProperty_OpenSBS getActivity_HasOutcome() {
		return Activity_HasOutcome;
	}

	public void setActivity_HasOutcome(OWLObjectProperty_OpenSBS activity_HasOutcome) {
		Activity_HasOutcome = activity_HasOutcome;
	}

	public OWLObjectProperty_OpenSBS getActivity_HasSubActivity() {
		return Activity_HasSubActivity;
	}

	public void setActivity_HasSubActivity(OWLObjectProperty_OpenSBS activity_HasSubActivity) {
		Activity_HasSubActivity = activity_HasSubActivity;
	}

	public OWLObjectProperty_OpenSBS getActivity_UsesAppliance() {
		return Activity_UsesAppliance;
	}

	public void setActivity_UsesAppliance(OWLObjectProperty_OpenSBS activity_UsesAppliance) {
		Activity_UsesAppliance = activity_UsesAppliance;
	}

	private static void printClassTree(RDFSClass cls, String indentation) {
		String str = indentation + cls.getBrowserText() + "\n";
		System.out.println(str + "    ======>");
		/*
		 * for (Iterator it = cls.getSubclasses(true).iterator(); it.hasNext();) {
		 * RDFSClass subclass = (RDFSClass) it.next(); // str = str +
		 * printClassTree(subclass, indentation + "    ") + "";
		 * System.out.println(subclass.getBrowserText() + "     ****"); }
		 */

		for (Iterator it = cls.getNamedSubclasses(true).iterator(); it.hasNext();) {
			RDFSClass subclass = (RDFSClass) it.next();
			// str = str + printClassTree(subclass, indentation + " ") + "";
			System.out.println(subclass.getBrowserText() + "     ****");
		}
		// return str;
	}

	public static boolean TestExistingSuperCclass(List<String> l, String c) {
		for (int i = 0; i < l.size(); i++) {
			if (c.equals(l.get(i))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] arg) {
		Smart_Building_Ontology_Model GisOntologyModel = new Smart_Building_Ontology_Model();

		List<String> l = GisOntologyModel.getSuperClasses("Grandfather");

		// OWLNamedClass HumanClass = GisOntologyModel.new
		// OWLNamedClass_OpenSBS("owl:Thing");
		// printClassTree(HumanClass, "");
		System.out.println(TestExistingSuperCclass(l,"Actors"));
	}

	public OWLNamedClass_OpenSBS getDevices() {
		return Devices;
	}

	public OWLNamedClass_OpenSBS getDeviceProductEnergy() {
		return DeviceProductEnergy;
	}

	public OWLNamedClass_OpenSBS getGreen_Energy() {
		return Green_Energy;
	}

	public OWLNamedClass_OpenSBS getWindmills() {
		return Windmills;
	}

	public OWLNamedClass_OpenSBS getSolar_Panels() {
		return Solar_Panels;
	}

	public OWLNamedClass_OpenSBS getContaminated_Energy() {
		return contaminated_Energy;
	}

	public OWLNamedClass_OpenSBS getGas_turbine() {
		return gas_turbine;
	}

	public OWLNamedClass_OpenSBS getElectricity_Generator() {
		return Electricity_Generator;
	}

	public OWLNamedClass_OpenSBS getDeviceConsumeEnergy() {
		return DeviceConsumeEnergy;
	}

	public OWLNamedClass_OpenSBS getKetchinDevices() {
		return KetchinDevices;
	}

	public OWLNamedClass_OpenSBS getRefrigerators() {
		return Refrigerators;
	}

	public OWLNamedClass_OpenSBS getElectricWaterBoiler() {
		return ElectricWaterBoiler;
	}

	public OWLNamedClass_OpenSBS getOven() {
		return Oven;
	}

	public OWLNamedClass_OpenSBS getStove() {
		return Stove;
	}

	public OWLNamedClass_OpenSBS getDishwasher() {
		return Dishwasher;
	}

	public OWLNamedClass_OpenSBS getCounters() {
		return Counters;
	}

	public OWLNamedClass_OpenSBS getElectricityCounter() {
		return ElectricityCounter;
	}

	public OWLNamedClass_OpenSBS getSecurity() {
		return Security;
	}

	public OWLNamedClass_OpenSBS getCamera() {
		return Camera;
	}

	public OWLNamedClass_OpenSBS getAudioAndVideo() {
		return AudioAndVideo;
	}

	public OWLNamedClass_OpenSBS getCDPlayer() {
		return CDPlayer;
	}

	public OWLNamedClass_OpenSBS getSwitches() {
		return Switches;
	}

	public OWLNamedClass_OpenSBS getWeatherDevices() {
		return WeatherDevices;
	}

	public OWLNamedClass_OpenSBS getHeating() {
		return Heating;
	}

	public OWLNamedClass_OpenSBS getPatioHeater() {
		return PatioHeater;
	}

	public OWLNamedClass_OpenSBS getCooling() {
		return Cooling;
	}

	public OWLNamedClass_OpenSBS getAirConditioner() {
		return AirConditioner;
	}

	public OWLNamedClass_OpenSBS getAtticFan() {
		return AtticFan;
	}

	public OWLNamedClass_OpenSBS getWindowFan() {
		return WindowFan;
	}

	public OWLNamedClass_OpenSBS getCeilingFan() {
		return CeilingFan;
	}

	public OWLNamedClass_OpenSBS getOthers() {
		return Others;
	}

	public OWLNamedClass_OpenSBS getMedia() {
		return Media;
	}

	public OWLNamedClass_OpenSBS getTelevision() {
		return television;
	}

	public OWLNamedClass_OpenSBS getPhone() {
		return phone;
	}

	public OWLNamedClass_OpenSBS getLights() {
		return Lights;
	}

	public OWLNamedClass_OpenSBS getSensors() {
		return Sensors;
	}

	public OWLNamedClass_OpenSBS getSmokeSensor() {
		return SmokeSensor;
	}

	public OWLNamedClass_OpenSBS getMovingSensor() {
		return MovingSensor;
	}

	public OWLNamedClass_OpenSBS getLight_sensors() {
		return Light_sensors;
	}

	public OWLNamedClass_OpenSBS getTemperatureSensor() {
		return TemperatureSensor;
	}

	public OWLNamedClass_OpenSBS getWindSensor() {
		return WindSensor;
	}

	public OWLNamedClass_OpenSBS getRainSensor() {
		return RainSensor;
	}

	public OWLNamedClass_OpenSBS getCleaningDevices() {
		return CleaningDevices;
	}

	public OWLNamedClass_OpenSBS getThorWashingMachine() {
		return ThorWashingMachine;
	}

	public OWLNamedClass_OpenSBS getVacuumCleaner() {
		return VacuumCleaner;
	}

	public OWLNamedClass_OpenSBS getRoboticVacuumCleaner() {
		return RoboticVacuumCleaner;
	}

	public OWLNamedClass_OpenSBS getCentralVacuumCleaner() {
		return CentralVacuumCleaner;
	}

	public OWLNamedClass_OpenSBS getWashingMachine() {
		return WashingMachine;
	}

	public OWLNamedClass_OpenSBS getBodyCare() {
		return BodyCare;
	}

	public OWLNamedClass_OpenSBS getHairDryer() {
		return HairDryer;
	}

	public OWLNamedClass_OpenSBS getHairIron() {
		return HairIron;
	}

	public OWLNamedClass_OpenSBS getMicrowaveOven() {
		return MicrowaveOven;
	}

	public OWLNamedClass_OpenSBS getNetworkCoordinations() {
		return NetworkCoordinations;
	}

	public OWLNamedClass_OpenSBS getRouter() {
		return Router;
	}

	public OWLNamedClass_OpenSBS getHub() {
		return Hub;
	}

	public OWLNamedClass_OpenSBS getBills() {
		return Bills;
	}

	public OWLNamedClass_OpenSBS getEnergySources() {
		return EnergySources;
	}

	public OWLNamedClass_OpenSBS getGreenSources() {
		return GreenSources;
	}

	public OWLNamedClass_OpenSBS getWinds() {
		return Winds;
	}

	public OWLNamedClass_OpenSBS getSunLight() {
		return SunLight;
	}

	public OWLNamedClass_OpenSBS getContaminatedSources() {
		return ContaminatedSources;
	}

	public OWLNamedClass_OpenSBS getElectricGrid() {
		return ElectricGrid;
	}

	public OWLNamedClass_OpenSBS getActivity() {
		return Activity;
	}

	public OWLNamedClass_OpenSBS getSchedulerActivity() {
		return SchedulerActivity;
	}

	public OWLNamedClass_OpenSBS getMetting() {
		return Metting;
	}

	public OWLNamedClass_OpenSBS getParty() {
		return Party;
	}

	public OWLNamedClass_OpenSBS getDinner() {
		return Dinner;
	}

	public OWLNamedClass_OpenSBS getInferredActivity() {
		return InferredActivity;
	}

	public OWLNamedClass_OpenSBS getSupervising() {
		return Supervising;
	}

	public OWLNamedClass_OpenSBS getListeningToMusic() {
		return ListeningToMusic;
	}

	public OWLNamedClass_OpenSBS getShowering() {
		return Showering;
	}

	public OWLNamedClass_OpenSBS getReading() {
		return Reading;
	}

	public OWLNamedClass_OpenSBS getCooking() {
		return Cooking;
	}

	public OWLNamedClass_OpenSBS getHouseWork() {
		return HouseWork;
	}

	public OWLNamedClass_OpenSBS getEntertaining() {
		return Entertaining;
	}

	public OWLNamedClass_OpenSBS getWatchingTv() {
		return WatchingTv;
	}

	public OWLNamedClass_OpenSBS getEnvironment() {
		return Environment;
	}

	public OWLNamedClass_OpenSBS getEnvironmentLight() {
		return EnvironmentLight;
	}

	public OWLNamedClass_OpenSBS getEnvironmentTemperature() {
		return EnvironmentTemperature;
	}

	public OWLNamedClass_OpenSBS getAddress() {
		return Address;
	}

	public OWLNamedClass_OpenSBS getState() {
		return State;
	}

	public OWLNamedClass_OpenSBS getBoredom() {
		return Boredom;
	}

	public OWLNamedClass_OpenSBS getJoyfulness() {
		return Joyfulness;
	}

	public OWLNamedClass_OpenSBS getRestlessness() {
		return Restlessness;
	}

	public OWLNamedClass_OpenSBS getDisgust() {
		return Disgust;
	}

	public OWLNamedClass_OpenSBS getSurprise() {
		return Surprise;
	}

	public OWLNamedClass_OpenSBS getSadness() {
		return Sadness;
	}

	public OWLNamedClass_OpenSBS getWorry() {
		return Worry;
	}

	public OWLNamedClass_OpenSBS getFear() {
		return Fear;
	}

	public OWLNamedClass_OpenSBS getZone() {
		return Zone;
	}

	public OWLNamedClass_OpenSBS getIndoorSpace() {
		return IndoorSpace;
	}

	public OWLNamedClass_OpenSBS getLevingRoom() {
		return LevingRoom;
	}

	public OWLNamedClass_OpenSBS getBathroom() {
		return Bathroom;
	}

	public OWLNamedClass_OpenSBS getPatio() {
		return Patio;
	}

	public OWLNamedClass_OpenSBS getLanding() {
		return Landing;
	}

	public OWLNamedClass_OpenSBS getDenningRoom() {
		return DenningRoom;
	}

	public OWLNamedClass_OpenSBS getKitchen() {
		return Kitchen;
	}

	public OWLNamedClass_OpenSBS getRoom() {
		return room;
	}

	public OWLNamedClass_OpenSBS getHall() {
		return Hall;
	}

	public OWLNamedClass_OpenSBS getGarage() {
		return Garage;
	}

	public OWLNamedClass_OpenSBS getWc() {
		return wc;
	}

	public OWLNamedClass_OpenSBS getBedroom() {
		return Bedroom;
	}

	public OWLNamedClass_OpenSBS getKidsRoom() {
		return KidsRoom;
	}

	public OWLNamedClass_OpenSBS getOutdoorspace() {
		return Outdoorspace;
	}

	public OWLNamedClass_OpenSBS getWall() {
		return Wall;
	}

	public OWLNamedClass_OpenSBS getTime() {
		return Time;
	}

	public OWLNamedClass_OpenSBS getSystemTime() {
		return SystemTime;
	}

	public OWLNamedClass_OpenSBS getBehaviors() {
		return Behaviors;
	}

	public OWLNamedClass_OpenSBS getCategoriseBehavior() {
		return CategoriseBehavior;
	}

	public OWLNamedClass_OpenSBS getCommonBehaviors() {
		return CommonBehaviors;
	}

	public OWLNamedClass_OpenSBS getHome() {
		return Home;
	}

	public OWLNamedClass_OpenSBS getEvents() {
		return Events;
	}

	public OWLNamedClass_OpenSBS getService() {
		return Service;
	}

	public OWLNamedClass_OpenSBS getActions() {
		return Actions;
	}

	public OWLNamedClass_OpenSBS getActors() {
		return Actors;
	}

	public OWLNamedClass_OpenSBS getGroup() {
		return Group;
	}

	public OWLNamedClass_OpenSBS getFamily() {
		return Family;
	}

	public OWLNamedClass_OpenSBS getIndivid() {
		return Individ;
	}

	public OWLNamedClass_OpenSBS getNonHuman() {
		return NonHuman;
	}

	public OWLNamedClass_OpenSBS getPets() {
		return Pets;
	}

	public OWLNamedClass_OpenSBS getRobot() {
		return Robot;
	}

	public OWLNamedClass_OpenSBS getSupervisorRobot() {
		return SupervisorRobot;
	}

	public OWLNamedClass_OpenSBS getMissionRobot() {
		return MissionRobot;
	}

	public OWLNamedClass_OpenSBS getHuman() {
		return Human;
	}

	public OWLObjectProperty_OpenSBS getHuman_Has_Behaviors() {
		return Human_Has_Behaviors;
	}

	public OWLObjectProperty_OpenSBS getHuman_Has_Activity() {
		return Human_Has_Activity;
	}

	public OWLObjectProperty_OpenSBS getEvent_Has_Actions() {
		return Event_Has_Actions;
	}

	public OWLObjectProperty_OpenSBS getBehaviors_Has_Actions() {
		return Behaviors_Has_Actions;
	}

	public OWLObjectProperty_OpenSBS getBills_Has_Energy_Sources() {
		return Bills_Has_Energy_Sources;
	}

	public OWLObjectProperty_OpenSBS getEvent_Has_Time() {
		return Event_Has_Time;
	}

	public OWLDatatypeProperty_OpenSBS getEnvironment_Values() {
		return Environment_Values;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_County() {
		return Address_County;
	}

	public OWLDatatypeProperty_OpenSBS getAction_Type() {
		return Action_Type;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_Line_2() {
		return Address_Line_2;
	}

	public OWLDatatypeProperty_OpenSBS getBehaviors_Percentage_Importance() {
		return Behaviors_Percentage_Importance;
	}

	public OWLDatatypeProperty_OpenSBS getAction_command_List() {
		return Action_command_List;
	}

	public OWLDatatypeProperty_OpenSBS getTime_Hours() {
		return Time_Hours;
	}

	public OWLDatatypeProperty_OpenSBS getEvents_Level() {
		return Events_Level;
	}

	public OWLDatatypeProperty_OpenSBS getBills_Name() {
		return Bills_Name;
	}

	public OWLDatatypeProperty_OpenSBS getService_Name() {
		return Service_Name;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_Stat() {
		return Address_Stat;
	}

	public OWLDatatypeProperty_OpenSBS getBehaviors_Stat_On_Off() {
		return Behaviors_Stat_On_Off;
	}

	public OWLDatatypeProperty_OpenSBS getZone_Size() {
		return Zone_Size;
	}

	public OWLDatatypeProperty_OpenSBS getTime_Day() {
		return Time_Day;
	}

	public OWLDatatypeProperty_OpenSBS getEnvironment_Name() {
		return Environment_Name;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_Postal_Code() {
		return Address_Postal_Code;
	}

	public OWLDatatypeProperty_OpenSBS getActivity_Name() {
		return Activity_Name;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_State() {
		return Devices_State;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Phone_Number() {
		return Human_Phone_Number;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Birthday() {
		return Human_Birthday;
	}

	public OWLDatatypeProperty_OpenSBS getBehaviors_Name() {
		return Behaviors_Name;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_Name() {
		return Devices_Name;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_Values() {
		return Devices_Values;
	}

	public OWLDatatypeProperty_OpenSBS getAction_Name() {
		return Action_Name;
	}

	public OWLDatatypeProperty_OpenSBS getTime_Min() {
		return Time_Min;
	}

	public OWLDatatypeProperty_OpenSBS getTime_Second() {
		return Time_Second;
	}

	public OWLDatatypeProperty_OpenSBS getAdress_GPS_Location() {
		return Adress_GPS_Location;
	}

	public OWLDatatypeProperty_OpenSBS getService_Values() {
		return Service_Values;
	}

	public OWLDatatypeProperty_OpenSBS getEvents_Name() {
		return Events_Name;
	}

	public OWLDatatypeProperty_OpenSBS getZone_Floor() {
		return Zone_Floor;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_Line_1() {
		return Address_Line_1;
	}

	public OWLDatatypeProperty_OpenSBS getEvents_type() {
		return Events_type;
	}

	public OWLDatatypeProperty_OpenSBS getZone_VectoreXY() {
		return Zone_VectoreXY;
	}

	public OWLDatatypeProperty_OpenSBS getActivity_Description() {
		return Activity_Description;
	}

	public OWLDatatypeProperty_OpenSBS getTime_Type_Am_Pm() {
		return Time_Type_Am_Pm;
	}

	public OWLDatatypeProperty_OpenSBS getActivity_Type() {
		return Activity_Type;
	}

	public OWLDatatypeProperty_OpenSBS getBehaviors_Description() {
		return Behaviors_Description;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_city() {
		return Address_city;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Last_Name() {
		return Human_Last_Name;
	}

	public OWLDatatypeProperty_OpenSBS getHome_Number() {
		return Home_Number;
	}

	public OWLDatatypeProperty_OpenSBS getAction_Description() {
		return Action_Description;
	}

	public OWLDatatypeProperty_OpenSBS getAddress_Country() {
		return Address_Country;
	}

	public OWLDatatypeProperty_OpenSBS getZone_Name() {
		return Zone_Name;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_Protocol() {
		return Devices_Protocol;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_First_Name() {
		return Human_First_Name;
	}

	public OWLDatatypeProperty_OpenSBS getHome_Area() {
		return Home_Area;
	}

	public OWLDatatypeProperty_OpenSBS getEvents_Percentage() {
		return Events_Percentage;
	}

	public OWLDatatypeProperty_OpenSBS getZone_Type() {
		return Zone_Type;
	}

	public OWLNamedClass_OpenSBS getOwlThing() {
		return OwlThing;
	}

	public void setOwlThing(OWLNamedClass_OpenSBS owlThing) {
		OwlThing = owlThing;
	}

	public OWLNamedClass_OpenSBS getBuilding() {
		return Building;
	}

	public void setBuilding(OWLNamedClass_OpenSBS building) {
		Building = building;
	}

	public OWLNamedClass_OpenSBS getCammand_Action() {
		return Cammand_Action;
	}

	public void setCammand_Action(OWLNamedClass_OpenSBS cammand_Action) {
		Cammand_Action = cammand_Action;
	}

	public OWLNamedClass_OpenSBS getNotification_Action() {
		return Notification_Action;
	}

	public void setNotification_Action(OWLNamedClass_OpenSBS notification_Action) {
		Notification_Action = notification_Action;
	}

	public OWLNamedClass_OpenSBS getCall_phone() {
		return Call_phone;
	}

	public void setCall_phone(OWLNamedClass_OpenSBS call_phone) {
		Call_phone = call_phone;
	}

	public OWLNamedClass_OpenSBS getEmail() {
		return Email;
	}

	public void setEmail(OWLNamedClass_OpenSBS email) {
		Email = email;
	}

	public OWLNamedClass_OpenSBS getNotify_Software() {
		return Notify_Software;
	}

	public void setNotify_Software(OWLNamedClass_OpenSBS notify_Software) {
		Notify_Software = notify_Software;
	}

	public OWLNamedClass_OpenSBS getSMS_Notification() {
		return SMS_Notification;
	}

	public void setSMS_Notification(OWLNamedClass_OpenSBS sMS_Notification) {
		SMS_Notification = sMS_Notification;
	}

	public OWLNamedClass_OpenSBS getTurn_Off_Action() {
		return Turn_Off_Action;
	}

	public void setTurn_Off_Action(OWLNamedClass_OpenSBS turn_Off_Action) {
		Turn_Off_Action = turn_Off_Action;
	}

	public OWLNamedClass_OpenSBS getTurn_On_Action() {
		return Turn_On_Action;
	}

	public void setTurn_On_Action(OWLNamedClass_OpenSBS turn_On_Action) {
		Turn_On_Action = turn_On_Action;
	}

	public OWLNamedClass_OpenSBS getUpdate_Value_Action() {
		return Update_Value_Action;
	}

	public void setUpdate_Value_Action(OWLNamedClass_OpenSBS update_Value_Action) {
		Update_Value_Action = update_Value_Action;
	}

	public OWLNamedClass_OpenSBS getPraying() {
		return praying;
	}

	public void setPraying(OWLNamedClass_OpenSBS praying) {
		this.praying = praying;
	}

	public OWLNamedClass_OpenSBS getAppliance() {
		return Appliance;
	}

	public void setAppliance(OWLNamedClass_OpenSBS appliance) {
		Appliance = appliance;
	}

	public OWLNamedClass_OpenSBS getCO2_Sensor() {
		return CO2_Sensor;
	}

	public void setCO2_Sensor(OWLNamedClass_OpenSBS cO2_Sensor) {
		CO2_Sensor = cO2_Sensor;
	}

	public OWLNamedClass_OpenSBS getEnergy_Metering_Sensor() {
		return Energy_Metering_Sensor;
	}

	public void setEnergy_Metering_Sensor(OWLNamedClass_OpenSBS energy_Metering_Sensor) {
		Energy_Metering_Sensor = energy_Metering_Sensor;
	}

	public OWLNamedClass_OpenSBS getNoise_Sensor() {
		return Noise_Sensor;
	}

	public void setNoise_Sensor(OWLNamedClass_OpenSBS noise_Sensor) {
		Noise_Sensor = noise_Sensor;
	}

	public OWLNamedClass_OpenSBS getProximity_Sensor() {
		return Proximity_Sensor;
	}

	public void setProximity_Sensor(OWLNamedClass_OpenSBS proximity_Sensor) {
		Proximity_Sensor = proximity_Sensor;
	}

	public OWLNamedClass_OpenSBS getRFID_Tag_Sensor() {
		return RFID_Tag_Sensor;
	}

	public void setRFID_Tag_Sensor(OWLNamedClass_OpenSBS rFID_Tag_Sensor) {
		RFID_Tag_Sensor = rFID_Tag_Sensor;
	}

	public OWLNamedClass_OpenSBS getContext_Awareness() {
		return Context_Awareness;
	}

	public void setContext_Awareness(OWLNamedClass_OpenSBS context_Awareness) {
		Context_Awareness = context_Awareness;
	}

	public OWLNamedClass_OpenSBS getContext_Atribute() {
		return Context_Atribute;
	}

	public void setContext_Atribute(OWLNamedClass_OpenSBS context_Atribute) {
		Context_Atribute = context_Atribute;
	}

	public OWLNamedClass_OpenSBS getContext_Level() {
		return Context_Level;
	}

	public void setContext_Level(OWLNamedClass_OpenSBS context_Level) {
		Context_Level = context_Level;
	}

	public OWLNamedClass_OpenSBS getContext_Life_Cycle() {
		return Context_Life_Cycle;
	}

	public void setContext_Life_Cycle(OWLNamedClass_OpenSBS context_Life_Cycle) {
		Context_Life_Cycle = context_Life_Cycle;
	}

	public OWLNamedClass_OpenSBS getContext_Model() {
		return Context_Model;
	}

	public void setContext_Model(OWLNamedClass_OpenSBS context_Model) {
		Context_Model = context_Model;
	}

	public OWLNamedClass_OpenSBS getContext_Schemes() {
		return Context_Schemes;
	}

	public void setContext_Schemes(OWLNamedClass_OpenSBS context_Schemes) {
		Context_Schemes = context_Schemes;
	}

	public OWLNamedClass_OpenSBS getContext_Acquisition_Schema() {
		return Context_Acquisition_Schema;
	}

	public void setContext_Acquisition_Schema(OWLNamedClass_OpenSBS context_Acquisition_Schema) {
		Context_Acquisition_Schema = context_Acquisition_Schema;
	}

	public OWLNamedClass_OpenSBS getContext_Modeling_Schema() {
		return Context_Modeling_Schema;
	}

	public void setContext_Modeling_Schema(OWLNamedClass_OpenSBS context_Modeling_Schema) {
		Context_Modeling_Schema = context_Modeling_Schema;
	}

	public OWLNamedClass_OpenSBS getContext_State() {
		return Context_State;
	}

	public void setContext_State(OWLNamedClass_OpenSBS context_State) {
		Context_State = context_State;
	}

	public OWLNamedClass_OpenSBS getContext_type() {
		return Context_type;
	}

	public void setContext_type(OWLNamedClass_OpenSBS context_type) {
		Context_type = context_type;
	}

	public OWLNamedClass_OpenSBS getQuality_Of_Context() {
		return Quality_Of_Context;
	}

	public void setQuality_Of_Context(OWLNamedClass_OpenSBS quality_Of_Context) {
		Quality_Of_Context = quality_Of_Context;
	}

	public OWLNamedClass_OpenSBS getEnvironmentHumedity() {
		return EnvironmentHumedity;
	}

	public void setEnvironmentHumedity(OWLNamedClass_OpenSBS environmentHumedity) {
		EnvironmentHumedity = environmentHumedity;
	}

	public OWLNamedClass_OpenSBS getEnvironmentNoise() {
		return EnvironmentNoise;
	}

	public void setEnvironmentNoise(OWLNamedClass_OpenSBS environmentNoise) {
		EnvironmentNoise = environmentNoise;
	}

	public OWLNamedClass_OpenSBS getEnvironmentCO2level() {
		return EnvironmentCO2level;
	}

	public void setEnvironmentCO2level(OWLNamedClass_OpenSBS environmentCO2level) {
		EnvironmentCO2level = environmentCO2level;
	}

	public OWLNamedClass_OpenSBS getPlace() {
		return Place;
	}

	public void setPlace(OWLNamedClass_OpenSBS place) {
		Place = place;
	}

	public OWLNamedClass_OpenSBS getTemporalTime() {
		return TemporalTime;
	}

	public void setTemporalTime(OWLNamedClass_OpenSBS temporalTime) {
		TemporalTime = temporalTime;
	}

	public OWLNamedClass_OpenSBS getInstantTime() {
		return InstantTime;
	}

	public void setInstantTime(OWLNamedClass_OpenSBS instantTime) {
		InstantTime = instantTime;
	}

	public OWLNamedClass_OpenSBS getIntervalTime() {
		return IntervalTime;
	}

	public void setIntervalTime(OWLNamedClass_OpenSBS intervalTime) {
		IntervalTime = intervalTime;
	}

	public OWLNamedClass_OpenSBS getPolicy() {
		return Policy;
	}

	public void setPolicy(OWLNamedClass_OpenSBS policy) {
		Policy = policy;
	}

	public OWLNamedClass_OpenSBS getRequirement() {
		return Requirement;
	}

	public void setRequirement(OWLNamedClass_OpenSBS requirement) {
		Requirement = requirement;
	}

	public OWLNamedClass_OpenSBS getService_Grounding() {
		return Service_Grounding;
	}

	public void setService_Grounding(OWLNamedClass_OpenSBS service_Grounding) {
		Service_Grounding = service_Grounding;
	}

	public OWLNamedClass_OpenSBS getService_Model() {
		return Service_Model;
	}

	public void setService_Model(OWLNamedClass_OpenSBS service_Model) {
		Service_Model = service_Model;
	}

	public OWLNamedClass_OpenSBS getService_Type() {
		return Service_Type;
	}

	public void setService_Type(OWLNamedClass_OpenSBS service_Type) {
		Service_Type = service_Type;
	}

	public OWLNamedClass_OpenSBS getAccess_Control() {
		return Access_Control;
	}

	public void setAccess_Control(OWLNamedClass_OpenSBS access_Control) {
		Access_Control = access_Control;
	}

	public OWLNamedClass_OpenSBS getClimate_Service() {
		return Climate_Service;
	}

	public void setClimate_Service(OWLNamedClass_OpenSBS climate_Service) {
		Climate_Service = climate_Service;
	}

	public OWLNamedClass_OpenSBS getCloud_Service() {
		return Cloud_Service;
	}

	public void setCloud_Service(OWLNamedClass_OpenSBS cloud_Service) {
		Cloud_Service = cloud_Service;
	}

	public OWLNamedClass_OpenSBS getEmergencu_Service() {
		return Emergencu_Service;
	}

	public void setEmergencu_Service(OWLNamedClass_OpenSBS emergencu_Service) {
		Emergencu_Service = emergencu_Service;
	}

	public OWLNamedClass_OpenSBS getInformation_Supply_Service() {
		return Information_Supply_Service;
	}

	public void setInformation_Supply_Service(OWLNamedClass_OpenSBS information_Supply_Service) {
		Information_Supply_Service = information_Supply_Service;
	}

	public OWLNamedClass_OpenSBS getMedia_Service() {
		return Media_Service;
	}

	public void setMedia_Service(OWLNamedClass_OpenSBS media_Service) {
		Media_Service = media_Service;
	}

	public OWLNamedClass_OpenSBS getProfile() {
		return Profile;
	}

	public void setProfile(OWLNamedClass_OpenSBS profile) {
		Profile = profile;
	}

	public OWLNamedClass_OpenSBS getBuildingProfile() {
		return BuildingProfile;
	}

	public void setBuildingProfile(OWLNamedClass_OpenSBS buildingProfile) {
		BuildingProfile = buildingProfile;
	}

	public OWLNamedClass_OpenSBS getHumanProfile() {
		return HumanProfile;
	}

	public void setHumanProfile(OWLNamedClass_OpenSBS humanProfile) {
		HumanProfile = humanProfile;
	}

	public OWLNamedClass_OpenSBS getAbility() {
		return Ability;
	}

	public void setAbility(OWLNamedClass_OpenSBS ability) {
		Ability = ability;
	}

	public OWLNamedClass_OpenSBS getContact() {
		return Contact;
	}

	public void setContact(OWLNamedClass_OpenSBS contact) {
		Contact = contact;
	}

	public OWLNamedClass_OpenSBS getInterest() {
		return Interest;
	}

	public void setInterest(OWLNamedClass_OpenSBS interest) {
		Interest = interest;
	}

	public OWLNamedClass_OpenSBS getProperty() {
		return Property;
	}

	public void setProperty(OWLNamedClass_OpenSBS property) {
		Property = property;
	}

	public OWLNamedClass_OpenSBS getRole() {
		return Role;
	}

	public void setRole(OWLNamedClass_OpenSBS role) {
		Role = role;
	}

	public OWLNamedClass_OpenSBS getSkills() {
		return Skills;
	}

	public void setSkills(OWLNamedClass_OpenSBS skills) {
		Skills = skills;
	}

	public OWLNamedClass_OpenSBS getHealthState() {
		return HealthState;
	}

	public void setHealthState(OWLNamedClass_OpenSBS healthState) {
		HealthState = healthState;
	}

	public OWLNamedClass_OpenSBS getPsycholodivalState() {
		return PsycholodivalState;
	}

	public void setPsycholodivalState(OWLNamedClass_OpenSBS psycholodivalState) {
		PsycholodivalState = psycholodivalState;
	}

	public OWLNamedClass_OpenSBS getServiceProfile() {
		return ServiceProfile;
	}

	public void setServiceProfile(OWLNamedClass_OpenSBS serviceProfile) {
		ServiceProfile = serviceProfile;
	}

	public OWLNamedClass_OpenSBS getCondition_Effect() {
		return Condition_Effect;
	}

	public void setCondition_Effect(OWLNamedClass_OpenSBS condition_Effect) {
		Condition_Effect = condition_Effect;
	}

	public OWLNamedClass_OpenSBS getInput_Service() {
		return Input_Service;
	}

	public void setInput_Service(OWLNamedClass_OpenSBS input_Service) {
		Input_Service = input_Service;
	}

	public OWLNamedClass_OpenSBS getOutput_Service() {
		return Output_Service;
	}

	public void setOutput_Service(OWLNamedClass_OpenSBS output_Service) {
		Output_Service = output_Service;
	}

	public OWLNamedClass_OpenSBS getParamater_Service() {
		return Paramater_Service;
	}

	public void setParamater_Service(OWLNamedClass_OpenSBS paramater_Service) {
		Paramater_Service = paramater_Service;
	}

	public OWLNamedClass_OpenSBS getPrecondition() {
		return Precondition;
	}

	public void setPrecondition(OWLNamedClass_OpenSBS precondition) {
		Precondition = precondition;
	}

	public OWLNamedClass_OpenSBS getSiteProfile() {
		return SiteProfile;
	}

	public void setSiteProfile(OWLNamedClass_OpenSBS siteProfile) {
		SiteProfile = siteProfile;
	}

	public OWLObjectProperty_OpenSBS getEvent_Object_Property() {
		return Event_Object_Property;
	}

	public void setEvent_Object_Property(OWLObjectProperty_OpenSBS event_Object_Property) {
		Event_Object_Property = event_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getActivity_Object_Property() {
		return Activity_Object_Property;
	}

	public void setActivity_Object_Property(OWLObjectProperty_OpenSBS activity_Object_Property) {
		Activity_Object_Property = activity_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getAppliance_Object_Property() {
		return Appliance_Object_Property;
	}

	public void setAppliance_Object_Property(OWLObjectProperty_OpenSBS appliance_Object_Property) {
		Appliance_Object_Property = appliance_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getAppliance_Locate_Near_To() {
		return Appliance_Locate_Near_To;
	}

	public void setAppliance_Locate_Near_To(OWLObjectProperty_OpenSBS appliance_Locate_Near_To) {
		Appliance_Locate_Near_To = appliance_Locate_Near_To;
	}

	public OWLObjectProperty_OpenSBS getBelong_to() {
		return Belong_to;
	}

	public void setBelong_to(OWLObjectProperty_OpenSBS belong_to) {
		Belong_to = belong_to;
	}

	public OWLObjectProperty_OpenSBS getHasAction() {
		return HasAction;
	}

	public void setHasAction(OWLObjectProperty_OpenSBS hasAction) {
		HasAction = hasAction;
	}

	public OWLObjectProperty_OpenSBS getHasNetworkProtocol() {
		return HasNetworkProtocol;
	}

	public void setHasNetworkProtocol(OWLObjectProperty_OpenSBS hasNetworkProtocol) {
		HasNetworkProtocol = hasNetworkProtocol;
	}

	public OWLObjectProperty_OpenSBS getHasSoftware() {
		return HasSoftware;
	}

	public void setHasSoftware(OWLObjectProperty_OpenSBS hasSoftware) {
		HasSoftware = hasSoftware;
	}

	public OWLObjectProperty_OpenSBS getAppliance_LocateInPlace() {
		return Appliance_LocateInPlace;
	}

	public void setAppliance_LocateInPlace(OWLObjectProperty_OpenSBS appliance_LocateInPlace) {
		Appliance_LocateInPlace = appliance_LocateInPlace;
	}

	public OWLObjectProperty_OpenSBS getOwnByHuman() {
		return OwnByHuman;
	}

	public void setOwnByHuman(OWLObjectProperty_OpenSBS ownByHuman) {
		OwnByHuman = ownByHuman;
	}

	public OWLObjectProperty_OpenSBS getProvideService() {
		return ProvideService;
	}

	public void setProvideService(OWLObjectProperty_OpenSBS provideService) {
		ProvideService = provideService;
	}

	public OWLObjectProperty_OpenSBS getConactedTo() {
		return ConactedTo;
	}

	public void setConactedTo(OWLObjectProperty_OpenSBS conactedTo) {
		ConactedTo = conactedTo;
	}

	public OWLObjectProperty_OpenSBS getBuilding_Object_Property() {
		return Building_Object_Property;
	}

	public void setBuilding_Object_Property(OWLObjectProperty_OpenSBS building_Object_Property) {
		Building_Object_Property = building_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getHasBill() {
		return HasBill;
	}

	public void setHasBill(OWLObjectProperty_OpenSBS hasBill) {
		HasBill = hasBill;
	}

	public OWLObjectProperty_OpenSBS getHasContext() {
		return HasContext;
	}

	public void setHasContext(OWLObjectProperty_OpenSBS hasContext) {
		HasContext = hasContext;
	}

	public OWLObjectProperty_OpenSBS getHasEnergySuorce() {
		return HasEnergySuorce;
	}

	public void setHasEnergySuorce(OWLObjectProperty_OpenSBS hasEnergySuorce) {
		HasEnergySuorce = hasEnergySuorce;
	}

	public OWLObjectProperty_OpenSBS getHasEvent() {
		return HasEvent;
	}

	public void setHasEvent(OWLObjectProperty_OpenSBS hasEvent) {
		HasEvent = hasEvent;
	}

	public OWLObjectProperty_OpenSBS getHasAddress() {
		return HasAddress;
	}

	public void setHasAddress(OWLObjectProperty_OpenSBS hasAddress) {
		HasAddress = hasAddress;
	}

	public OWLObjectProperty_OpenSBS getHasPlaces() {
		return HasPlaces;
	}

	public void setHasPlaces(OWLObjectProperty_OpenSBS hasPlaces) {
		HasPlaces = hasPlaces;
	}

	public OWLObjectProperty_OpenSBS getHasProfile() {
		return HasProfile;
	}

	public void setHasProfile(OWLObjectProperty_OpenSBS hasProfile) {
		HasProfile = hasProfile;
	}

	public OWLObjectProperty_OpenSBS getHasRequirement() {
		return HasRequirement;
	}

	public void setHasRequirement(OWLObjectProperty_OpenSBS hasRequirement) {
		HasRequirement = hasRequirement;
	}

	public OWLObjectProperty_OpenSBS getOwnby() {
		return Ownby;
	}

	public void setOwnby(OWLObjectProperty_OpenSBS ownby) {
		Ownby = ownby;
	}

	public OWLObjectProperty_OpenSBS getContext_Awareness_Object_Property() {
		return Context_Awareness_Object_Property;
	}

	public void setContext_Awareness_Object_Property(OWLObjectProperty_OpenSBS context_Awareness_Object_Property) {
		Context_Awareness_Object_Property = context_Awareness_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getContext_Model_Relation() {
		return Context_Model_Relation;
	}

	public void setContext_Model_Relation(OWLObjectProperty_OpenSBS context_Model_Relation) {
		Context_Model_Relation = context_Model_Relation;
	}

	public OWLObjectProperty_OpenSBS getContext_Model_HasContext_Schema() {
		return Context_Model_HasContext_Schema;
	}

	public void setContext_Model_HasContext_Schema(OWLObjectProperty_OpenSBS context_Model_HasContext_Schema) {
		Context_Model_HasContext_Schema = context_Model_HasContext_Schema;
	}

	public OWLObjectProperty_OpenSBS getContext_Model_Modeling_Has_Time() {
		return Context_Model_Modeling_Has_Time;
	}

	public void setContext_Model_Modeling_Has_Time(OWLObjectProperty_OpenSBS context_Model_Modeling_Has_Time) {
		Context_Model_Modeling_Has_Time = context_Model_Modeling_Has_Time;
	}

	public OWLObjectProperty_OpenSBS getContext_Schema_Relation() {
		return Context_Schema_Relation;
	}

	public void setContext_Schema_Relation(OWLObjectProperty_OpenSBS context_Schema_Relation) {
		Context_Schema_Relation = context_Schema_Relation;
	}

	public OWLObjectProperty_OpenSBS getContext_Modeling_Schema_realtions() {
		return Context_Modeling_Schema_realtions;
	}

	public void setContext_Modeling_Schema_realtions(OWLObjectProperty_OpenSBS context_Modeling_Schema_realtions) {
		Context_Modeling_Schema_realtions = context_Modeling_Schema_realtions;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Context_Acquisition_Schema() {
		return Modeling_Schema_Has_Context_Acquisition_Schema;
	}

	public void setModeling_Schema_Has_Context_Acquisition_Schema(
			OWLObjectProperty_OpenSBS modeling_Schema_Has_Context_Acquisition_Schema) {
		Modeling_Schema_Has_Context_Acquisition_Schema = modeling_Schema_Has_Context_Acquisition_Schema;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Context_Level() {
		return Modeling_Schema_Has_Context_Level;
	}

	public void setModeling_Schema_Has_Context_Level(OWLObjectProperty_OpenSBS modeling_Schema_Has_Context_Level) {
		Modeling_Schema_Has_Context_Level = modeling_Schema_Has_Context_Level;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Context_Modeling_Shcema() {
		return Modeling_Schema_Has_Context_Modeling_Shcema;
	}

	public void setModeling_Schema_Has_Context_Modeling_Shcema(
			OWLObjectProperty_OpenSBS modeling_Schema_Has_Context_Modeling_Shcema) {
		Modeling_Schema_Has_Context_Modeling_Shcema = modeling_Schema_Has_Context_Modeling_Shcema;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Conetxt_State() {
		return Modeling_Schema_Has_Conetxt_State;
	}

	public void setModeling_Schema_Has_Conetxt_State(OWLObjectProperty_OpenSBS modeling_Schema_Has_Conetxt_State) {
		Modeling_Schema_Has_Conetxt_State = modeling_Schema_Has_Conetxt_State;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_What() {
		return Modeling_Schema_Has_What;
	}

	public void setModeling_Schema_Has_What(OWLObjectProperty_OpenSBS modeling_Schema_Has_What) {
		Modeling_Schema_Has_What = modeling_Schema_Has_What;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Where() {
		return Modeling_Schema_Has_Where;
	}

	public void setModeling_Schema_Has_Where(OWLObjectProperty_OpenSBS modeling_Schema_Has_Where) {
		Modeling_Schema_Has_Where = modeling_Schema_Has_Where;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_who() {
		return Modeling_Schema_Has_who;
	}

	public void setModeling_Schema_Has_who(OWLObjectProperty_OpenSBS modeling_Schema_Has_who) {
		Modeling_Schema_Has_who = modeling_Schema_Has_who;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_Has_Modeling_Time() {
		return Modeling_Schema_Has_Modeling_Time;
	}

	public void setModeling_Schema_Has_Modeling_Time(OWLObjectProperty_OpenSBS modeling_Schema_Has_Modeling_Time) {
		Modeling_Schema_Has_Modeling_Time = modeling_Schema_Has_Modeling_Time;
	}

	public OWLObjectProperty_OpenSBS getModeling_Schema_HasQoc() {
		return Modeling_Schema_HasQoc;
	}

	public void setModeling_Schema_HasQoc(OWLObjectProperty_OpenSBS modeling_Schema_HasQoc) {
		Modeling_Schema_HasQoc = modeling_Schema_HasQoc;
	}

	public OWLObjectProperty_OpenSBS getContext_Acquisution_Schema_Relation() {
		return Context_Acquisution_Schema_Relation;
	}

	public void setContext_Acquisution_Schema_Relation(OWLObjectProperty_OpenSBS context_Acquisution_Schema_Relation) {
		Context_Acquisution_Schema_Relation = context_Acquisution_Schema_Relation;
	}

	public OWLObjectProperty_OpenSBS getAcquisution_Schema_HasContext_Type() {
		return Acquisution_Schema_HasContext_Type;
	}

	public void setAcquisution_Schema_HasContext_Type(OWLObjectProperty_OpenSBS acquisution_Schema_HasContext_Type) {
		Acquisution_Schema_HasContext_Type = acquisution_Schema_HasContext_Type;
	}

	public OWLObjectProperty_OpenSBS getAcquisution_Schema_HasQoc() {
		return Acquisution_Schema_HasQoc;
	}

	public void setAcquisution_Schema_HasQoc(OWLObjectProperty_OpenSBS acquisution_Schema_HasQoc) {
		Acquisution_Schema_HasQoc = acquisution_Schema_HasQoc;
	}

	public OWLObjectProperty_OpenSBS getAcquisution_Schema_HasTime() {
		return Acquisution_Schema_HasTime;
	}

	public void setAcquisution_Schema_HasTime(OWLObjectProperty_OpenSBS acquisution_Schema_HasTime) {
		Acquisution_Schema_HasTime = acquisution_Schema_HasTime;
	}

	public OWLObjectProperty_OpenSBS getEnvironment_Paramaters_Objects_Property() {
		return Environment_Paramaters_Objects_Property;
	}

	public void setEnvironment_Paramaters_Objects_Property(
			OWLObjectProperty_OpenSBS environment_Paramaters_Objects_Property) {
		Environment_Paramaters_Objects_Property = environment_Paramaters_Objects_Property;
	}

	public OWLObjectProperty_OpenSBS getEnvironment_Paramaters_MeasuredBy() {
		return Environment_Paramaters_MeasuredBy;
	}

	public void setEnvironment_Paramaters_MeasuredBy(OWLObjectProperty_OpenSBS environment_Paramaters_MeasuredBy) {
		Environment_Paramaters_MeasuredBy = environment_Paramaters_MeasuredBy;
	}

	public OWLObjectProperty_OpenSBS getHuman_Object_Property() {
		return Human_Object_Property;
	}

	public void setHuman_Object_Property(OWLObjectProperty_OpenSBS human_Object_Property) {
		Human_Object_Property = human_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getCurrentActivity() {
		return CurrentActivity;
	}

	public void setCurrentActivity(OWLObjectProperty_OpenSBS currentActivity) {
		CurrentActivity = currentActivity;
	}

	public OWLObjectProperty_OpenSBS getHasFather() {
		return HasFather;
	}

	public void setHasFather(OWLObjectProperty_OpenSBS hasFather) {
		HasFather = hasFather;
	}

	public OWLObjectProperty_OpenSBS getHasMother() {
		return HasMother;
	}

	public void setHasMother(OWLObjectProperty_OpenSBS hasMother) {
		HasMother = hasMother;
	}

	public OWLObjectProperty_OpenSBS getHuman_LocateInPlace() {
		return Human_LocateInPlace;
	}

	public void setHuman_LocateInPlace(OWLObjectProperty_OpenSBS human_LocateInPlace) {
		Human_LocateInPlace = human_LocateInPlace;
	}

	public OWLObjectProperty_OpenSBS getHumanHasProfile() {
		return HumanHasProfile;
	}

	public void setHumanHasProfile(OWLObjectProperty_OpenSBS humanHasProfile) {
		HumanHasProfile = humanHasProfile;
	}

	public OWLObjectProperty_OpenSBS getBehaviors_Object_Property() {
		return Behaviors_Object_Property;
	}

	public void setBehaviors_Object_Property(OWLObjectProperty_OpenSBS behaviors_Object_Property) {
		Behaviors_Object_Property = behaviors_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getBehaviors_HasBeginTime() {
		return Behaviors_HasBeginTime;
	}

	public void setBehaviors_HasBeginTime(OWLObjectProperty_OpenSBS behaviors_HasBeginTime) {
		Behaviors_HasBeginTime = behaviors_HasBeginTime;
	}

	public OWLObjectProperty_OpenSBS getBehaviors_HasEndTime() {
		return Behaviors_HasEndTime;
	}

	public void setBehaviors_HasEndTime(OWLObjectProperty_OpenSBS behaviors_HasEndTime) {
		Behaviors_HasEndTime = behaviors_HasEndTime;
	}

	public OWLObjectProperty_OpenSBS getTime_Object_Property() {
		return Time_Object_Property;
	}

	public void setTime_Object_Property(OWLObjectProperty_OpenSBS time_Object_Property) {
		Time_Object_Property = time_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getTimeHasBegining() {
		return TimeHasBegining;
	}

	public void setTimeHasBegining(OWLObjectProperty_OpenSBS timeHasBegining) {
		TimeHasBegining = timeHasBegining;
	}

	public OWLObjectProperty_OpenSBS getTimeHasDuration() {
		return TimeHasDuration;
	}

	public void setTimeHasDuration(OWLObjectProperty_OpenSBS timeHasDuration) {
		TimeHasDuration = timeHasDuration;
	}

	public OWLObjectProperty_OpenSBS getTimeHasDescription() {
		return TimeHasDescription;
	}

	public void setTimeHasDescription(OWLObjectProperty_OpenSBS timeHasDescription) {
		TimeHasDescription = timeHasDescription;
	}

	public OWLObjectProperty_OpenSBS getPlace_Object_Property() {
		return Place_Object_Property;
	}

	public void setPlace_Object_Property(OWLObjectProperty_OpenSBS place_Object_Property) {
		Place_Object_Property = place_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getPlace_HasAppliance() {
		return Place_HasAppliance;
	}

	public void setPlace_HasAppliance(OWLObjectProperty_OpenSBS place_HasAppliance) {
		Place_HasAppliance = place_HasAppliance;
	}

	public OWLObjectProperty_OpenSBS getPlaceHasEnvironment() {
		return PlaceHasEnvironment;
	}

	public void setPlaceHasEnvironment(OWLObjectProperty_OpenSBS placeHasEnvironment) {
		PlaceHasEnvironment = placeHasEnvironment;
	}

	public OWLObjectProperty_OpenSBS getPlaceOwnBy() {
		return PlaceOwnBy;
	}

	public void setPlaceOwnBy(OWLObjectProperty_OpenSBS placeOwnBy) {
		PlaceOwnBy = placeOwnBy;
	}

	public OWLObjectProperty_OpenSBS getHuman_Profile_Object_Property() {
		return Human_Profile_Object_Property;
	}

	public void setHuman_Profile_Object_Property(OWLObjectProperty_OpenSBS human_Profile_Object_Property) {
		Human_Profile_Object_Property = human_Profile_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getHasAbility() {
		return HasAbility;
	}

	public void setHasAbility(OWLObjectProperty_OpenSBS hasAbility) {
		HasAbility = hasAbility;
	}

	public OWLObjectProperty_OpenSBS getHasBehavior() {
		return HasBehavior;
	}

	public void setHasBehavior(OWLObjectProperty_OpenSBS hasBehavior) {
		HasBehavior = hasBehavior;
	}

	public OWLObjectProperty_OpenSBS getHasCalandar() {
		return HasCalandar;
	}

	public void setHasCalandar(OWLObjectProperty_OpenSBS hasCalandar) {
		HasCalandar = hasCalandar;
	}

	public OWLObjectProperty_OpenSBS getHasContact() {
		return HasContact;
	}

	public void setHasContact(OWLObjectProperty_OpenSBS hasContact) {
		HasContact = hasContact;
	}

	public OWLObjectProperty_OpenSBS getHasHealthState() {
		return HasHealthState;
	}

	public void setHasHealthState(OWLObjectProperty_OpenSBS hasHealthState) {
		HasHealthState = hasHealthState;
	}

	public OWLObjectProperty_OpenSBS getHasIdentify() {
		return HasIdentify;
	}

	public void setHasIdentify(OWLObjectProperty_OpenSBS hasIdentify) {
		HasIdentify = hasIdentify;
	}

	public OWLObjectProperty_OpenSBS getHasInterest() {
		return HasInterest;
	}

	public void setHasInterest(OWLObjectProperty_OpenSBS hasInterest) {
		HasInterest = hasInterest;
	}

	public OWLObjectProperty_OpenSBS getHasPreference() {
		return HasPreference;
	}

	public void setHasPreference(OWLObjectProperty_OpenSBS hasPreference) {
		HasPreference = hasPreference;
	}

	public OWLObjectProperty_OpenSBS getHasPsycholocicalState() {
		return HasPsycholocicalState;
	}

	public void setHasPsycholocicalState(OWLObjectProperty_OpenSBS hasPsycholocicalState) {
		HasPsycholocicalState = hasPsycholocicalState;
	}

	public OWLObjectProperty_OpenSBS getHasRole() {
		return HasRole;
	}

	public void setHasRole(OWLObjectProperty_OpenSBS hasRole) {
		HasRole = hasRole;
	}

	public OWLObjectProperty_OpenSBS getHasState() {
		return HasState;
	}

	public void setHasState(OWLObjectProperty_OpenSBS hasState) {
		HasState = hasState;
	}

	public OWLObjectProperty_OpenSBS getHasSkills() {
		return HasSkills;
	}

	public void setHasSkills(OWLObjectProperty_OpenSBS hasSkills) {
		HasSkills = hasSkills;
	}

	public OWLObjectProperty_OpenSBS getOwnAppliance() {
		return OwnAppliance;
	}

	public void setOwnAppliance(OWLObjectProperty_OpenSBS ownAppliance) {
		OwnAppliance = ownAppliance;
	}

	public OWLObjectProperty_OpenSBS getOwnPlace() {
		return OwnPlace;
	}

	public void setOwnPlace(OWLObjectProperty_OpenSBS ownPlace) {
		OwnPlace = ownPlace;
	}

	public OWLObjectProperty_OpenSBS getService_Object_Property() {
		return Service_Object_Property;
	}

	public void setService_Object_Property(OWLObjectProperty_OpenSBS service_Object_Property) {
		Service_Object_Property = service_Object_Property;
	}

	public OWLObjectProperty_OpenSBS getService_HasModel() {
		return Service_HasModel;
	}

	public void setService_HasModel(OWLObjectProperty_OpenSBS service_HasModel) {
		Service_HasModel = service_HasModel;
	}

	public OWLObjectProperty_OpenSBS getService_HasType() {
		return Service_HasType;
	}

	public void setService_HasType(OWLObjectProperty_OpenSBS service_HasType) {
		Service_HasType = service_HasType;
	}

	public OWLObjectProperty_OpenSBS getService_HasProfile() {
		return Service_HasProfile;
	}

	public void setService_HasProfile(OWLObjectProperty_OpenSBS service_HasProfile) {
		Service_HasProfile = service_HasProfile;
	}

	public OWLObjectProperty_OpenSBS getService_require_Service() {
		return Service_require_Service;
	}

	public void setService_require_Service(OWLObjectProperty_OpenSBS service_require_Service) {
		Service_require_Service = service_require_Service;
	}

	public OWLObjectProperty_OpenSBS getService_HasRerquirement() {
		return Service_HasRerquirement;
	}

	public void setService_HasRerquirement(OWLObjectProperty_OpenSBS service_HasRerquirement) {
		Service_HasRerquirement = service_HasRerquirement;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Awareness_Property() {
		return Context_Awareness_Property;
	}

	public void setContext_Awareness_Property(OWLDatatypeProperty_OpenSBS context_Awareness_Property) {
		Context_Awareness_Property = context_Awareness_Property;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Aquisition_Schema() {
		return Context_Aquisition_Schema;
	}

	public void setContext_Aquisition_Schema(OWLDatatypeProperty_OpenSBS context_Aquisition_Schema) {
		Context_Aquisition_Schema = context_Aquisition_Schema;
	}

	public OWLDatatypeProperty_OpenSBS getAPT() {
		return APT;
	}

	public void setAPT(OWLDatatypeProperty_OpenSBS aPT) {
		APT = aPT;
	}

	public OWLDatatypeProperty_OpenSBS getCA() {
		return CA;
	}

	public void setCA(OWLDatatypeProperty_OpenSBS cA) {
		CA = cA;
	}

	public OWLDatatypeProperty_OpenSBS getContext_ID() {
		return Context_ID;
	}

	public void setContext_ID(OWLDatatypeProperty_OpenSBS context_ID) {
		Context_ID = context_ID;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Name() {
		return Context_Name;
	}

	public void setContext_Name(OWLDatatypeProperty_OpenSBS context_Name) {
		Context_Name = context_Name;
	}

	public OWLDatatypeProperty_OpenSBS getCsbt() {
		return Csbt;
	}

	public void setCsbt(OWLDatatypeProperty_OpenSBS csbt) {
		Csbt = csbt;
	}

	public OWLDatatypeProperty_OpenSBS getQod() {
		return Qod;
	}

	public void setQod(OWLDatatypeProperty_OpenSBS qod) {
		Qod = qod;
	}

	public OWLDatatypeProperty_OpenSBS getRbt() {
		return Rbt;
	}

	public void setRbt(OWLDatatypeProperty_OpenSBS rbt) {
		Rbt = rbt;
	}

	public OWLDatatypeProperty_OpenSBS getContextHasTime() {
		return ContextHasTime;
	}

	public void setContextHasTime(OWLDatatypeProperty_OpenSBS contextHasTime) {
		ContextHasTime = contextHasTime;
	}

	public OWLDatatypeProperty_OpenSBS getVl() {
		return Vl;
	}

	public void setVl(OWLDatatypeProperty_OpenSBS vl) {
		Vl = vl;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Level_property() {
		return Context_Level_property;
	}

	public void setContext_Level_property(OWLDatatypeProperty_OpenSBS context_Level_property) {
		Context_Level_property = context_Level_property;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Level_Degree() {
		return Context_Level_Degree;
	}

	public void setContext_Level_Degree(OWLDatatypeProperty_OpenSBS context_Level_Degree) {
		Context_Level_Degree = context_Level_Degree;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Level_Process() {
		return Context_Level_Process;
	}

	public void setContext_Level_Process(OWLDatatypeProperty_OpenSBS context_Level_Process) {
		Context_Level_Process = context_Level_Process;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Model_Property() {
		return Context_Model_Property;
	}

	public void setContext_Model_Property(OWLDatatypeProperty_OpenSBS context_Model_Property) {
		Context_Model_Property = context_Model_Property;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Model_Name() {
		return Context_Model_Name;
	}

	public void setContext_Model_Name(OWLDatatypeProperty_OpenSBS context_Model_Name) {
		Context_Model_Name = context_Model_Name;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Modeling_Schema_Property() {
		return Context_Modeling_Schema_Property;
	}

	public void setContext_Modeling_Schema_Property(OWLDatatypeProperty_OpenSBS context_Modeling_Schema_Property) {
		Context_Modeling_Schema_Property = context_Modeling_Schema_Property;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Modeling_Schema_ID() {
		return Context_Modeling_Schema_ID;
	}

	public void setContext_Modeling_Schema_ID(OWLDatatypeProperty_OpenSBS context_Modeling_Schema_ID) {
		Context_Modeling_Schema_ID = context_Modeling_Schema_ID;
	}

	public OWLDatatypeProperty_OpenSBS getContext_Modeling_Schema_Name() {
		return Context_Modeling_Schema_Name;
	}

	public void setContext_Modeling_Schema_Name(OWLDatatypeProperty_OpenSBS context_Modeling_Schema_Name) {
		Context_Modeling_Schema_Name = context_Modeling_Schema_Name;
	}

	public OWLDatatypeProperty_OpenSBS getContext_State_Value() {
		return Context_State_Value;
	}

	public void setContext_State_Value(OWLDatatypeProperty_OpenSBS context_State_Value) {
		Context_State_Value = context_State_Value;
	}

	public OWLDatatypeProperty_OpenSBS getQuality_Of_Context_Property() {
		return Quality_Of_Context_Property;
	}

	public void setQuality_Of_Context_Property(OWLDatatypeProperty_OpenSBS quality_Of_Context_Property) {
		Quality_Of_Context_Property = quality_Of_Context_Property;
	}

	public OWLDatatypeProperty_OpenSBS getData_precision() {
		return Data_precision;
	}

	public void setData_precision(OWLDatatypeProperty_OpenSBS data_precision) {
		Data_precision = data_precision;
	}

	public OWLDatatypeProperty_OpenSBS getData_UpToDatedness() {
		return Data_UpToDatedness;
	}

	public void setData_UpToDatedness(OWLDatatypeProperty_OpenSBS data_UpToDatedness) {
		Data_UpToDatedness = data_UpToDatedness;
	}

	public OWLDatatypeProperty_OpenSBS getData_Validity() {
		return Data_Validity;
	}

	public void setData_Validity(OWLDatatypeProperty_OpenSBS data_Validity) {
		Data_Validity = data_Validity;
	}

	public OWLDatatypeProperty_OpenSBS getEnergy_Consumption_Level() {
		return Energy_Consumption_Level;
	}

	public void setEnergy_Consumption_Level(OWLDatatypeProperty_OpenSBS energy_Consumption_Level) {
		Energy_Consumption_Level = energy_Consumption_Level;
	}

	public OWLDatatypeProperty_OpenSBS getInhabitant_Feedback() {
		return Inhabitant_Feedback;
	}

	public void setInhabitant_Feedback(OWLDatatypeProperty_OpenSBS inhabitant_Feedback) {
		Inhabitant_Feedback = inhabitant_Feedback;
	}

	public OWLDatatypeProperty_OpenSBS getNumber_Of_Occurrences_In_History() {
		return Number_Of_Occurrences_In_History;
	}

	public void setNumber_Of_Occurrences_In_History(OWLDatatypeProperty_OpenSBS number_Of_Occurrences_In_History) {
		Number_Of_Occurrences_In_History = number_Of_Occurrences_In_History;
	}

	public OWLDatatypeProperty_OpenSBS getQuality_Of_Context_Data() {
		return Quality_Of_Context_Data;
	}

	public void setQuality_Of_Context_Data(OWLDatatypeProperty_OpenSBS quality_Of_Context_Data) {
		Quality_Of_Context_Data = quality_Of_Context_Data;
	}

	public OWLDatatypeProperty_OpenSBS getQuality_Of_The_delivery_Process() {
		return Quality_Of_The_delivery_Process;
	}

	public void setQuality_Of_The_delivery_Process(OWLDatatypeProperty_OpenSBS quality_Of_The_delivery_Process) {
		Quality_Of_The_delivery_Process = quality_Of_The_delivery_Process;
	}

	public OWLDatatypeProperty_OpenSBS getBuilding_ID() {
		return Building_ID;
	}

	public void setBuilding_ID(OWLDatatypeProperty_OpenSBS building_ID) {
		Building_ID = building_ID;
	}

	public OWLDatatypeProperty_OpenSBS getBuilding_Room_Number() {
		return Building_Room_Number;
	}

	public void setBuilding_Room_Number(OWLDatatypeProperty_OpenSBS building_Room_Number) {
		Building_Room_Number = building_Room_Number;
	}

	public OWLDatatypeProperty_OpenSBS getPolicy_Max_Energy_ConsumptionByMonth() {
		return Policy_Max_Energy_ConsumptionByMonth;
	}

	public void setPolicy_Max_Energy_ConsumptionByMonth(
			OWLDatatypeProperty_OpenSBS policy_Max_Energy_ConsumptionByMonth) {
		Policy_Max_Energy_ConsumptionByMonth = policy_Max_Energy_ConsumptionByMonth;
	}

	public OWLDatatypeProperty_OpenSBS getActivity_ID() {
		return Activity_ID;
	}

	public void setActivity_ID(OWLDatatypeProperty_OpenSBS activity_ID) {
		Activity_ID = activity_ID;
	}

	public OWLDatatypeProperty_OpenSBS getDevice_ID() {
		return Device_ID;
	}

	public void setDevice_ID(OWLDatatypeProperty_OpenSBS device_ID) {
		Device_ID = device_ID;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_Type() {
		return Devices_Type;
	}

	public void setDevices_Type(OWLDatatypeProperty_OpenSBS devices_Type) {
		Devices_Type = devices_Type;
	}

	public OWLDatatypeProperty_OpenSBS getDevices_Watts_Consuming() {
		return Devices_Watts_Consuming;
	}

	public void setDevices_Watts_Consuming(OWLDatatypeProperty_OpenSBS devices_Watts_Consuming) {
		Devices_Watts_Consuming = devices_Watts_Consuming;
	}

	public OWLDatatypeProperty_OpenSBS getDeviceStartRunTime() {
		return DeviceStartRunTime;
	}

	public void setDeviceStartRunTime(OWLDatatypeProperty_OpenSBS deviceStartRunTime) {
		DeviceStartRunTime = deviceStartRunTime;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Gender() {
		return Human_Gender;
	}

	public void setHuman_Gender(OWLDatatypeProperty_OpenSBS human_Gender) {
		Human_Gender = human_Gender;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Age() {
		return Human_Age;
	}

	public void setHuman_Age(OWLDatatypeProperty_OpenSBS human_Age) {
		Human_Age = human_Age;
	}

	public OWLDatatypeProperty_OpenSBS getBills_Values() {
		return Bills_Values;
	}

	public void setBills_Values(OWLDatatypeProperty_OpenSBS bills_Values) {
		Bills_Values = bills_Values;
	}

	public void setHome(OWLNamedClass_OpenSBS home) {
		Home = home;
	}

	public void setActors(OWLNamedClass_OpenSBS actors) {
		Actors = actors;
	}

	public void setGroup(OWLNamedClass_OpenSBS group) {
		Group = group;
	}

	public void setFamily(OWLNamedClass_OpenSBS family) {
		Family = family;
	}

	public void setIndivid(OWLNamedClass_OpenSBS individ) {
		Individ = individ;
	}

	public void setNonHuman(OWLNamedClass_OpenSBS nonHuman) {
		NonHuman = nonHuman;
	}

	public void setPets(OWLNamedClass_OpenSBS pets) {
		Pets = pets;
	}

	public void setRobot(OWLNamedClass_OpenSBS robot) {
		Robot = robot;
	}

	public void setSupervisorRobot(OWLNamedClass_OpenSBS supervisorRobot) {
		SupervisorRobot = supervisorRobot;
	}

	public void setMissionRobot(OWLNamedClass_OpenSBS missionRobot) {
		MissionRobot = missionRobot;
	}

	public void setHuman(OWLNamedClass_OpenSBS human) {
		Human = human;
	}

	public void setActions(OWLNamedClass_OpenSBS actions) {
		Actions = actions;
	}

	public void setActivity(OWLNamedClass_OpenSBS activity) {
		Activity = activity;
	}

	public void setSchedulerActivity(OWLNamedClass_OpenSBS schedulerActivity) {
		SchedulerActivity = schedulerActivity;
	}

	public void setMetting(OWLNamedClass_OpenSBS metting) {
		Metting = metting;
	}

	public void setParty(OWLNamedClass_OpenSBS party) {
		Party = party;
	}

	public void setDinner(OWLNamedClass_OpenSBS dinner) {
		Dinner = dinner;
	}

	public void setInferredActivity(OWLNamedClass_OpenSBS inferredActivity) {
		InferredActivity = inferredActivity;
	}

	public void setSupervising(OWLNamedClass_OpenSBS supervising) {
		Supervising = supervising;
	}

	public void setListeningToMusic(OWLNamedClass_OpenSBS listeningToMusic) {
		ListeningToMusic = listeningToMusic;
	}

	public void setShowering(OWLNamedClass_OpenSBS showering) {
		Showering = showering;
	}

	public void setReading(OWLNamedClass_OpenSBS reading) {
		Reading = reading;
	}

	public void setCooking(OWLNamedClass_OpenSBS cooking) {
		Cooking = cooking;
	}

	public void setHouseWork(OWLNamedClass_OpenSBS houseWork) {
		HouseWork = houseWork;
	}

	public void setEntertaining(OWLNamedClass_OpenSBS entertaining) {
		Entertaining = entertaining;
	}

	public void setWatchingTv(OWLNamedClass_OpenSBS watchingTv) {
		WatchingTv = watchingTv;
	}

	public void setDevices(OWLNamedClass_OpenSBS devices) {
		Devices = devices;
	}

	public void setBattery(OWLNamedClass_OpenSBS battery) {
		Battery = battery;
	}

	public void setDeviceProductEnergy(OWLNamedClass_OpenSBS deviceProductEnergy) {
		DeviceProductEnergy = deviceProductEnergy;
	}

	public void setGreen_Energy(OWLNamedClass_OpenSBS green_Energy) {
		Green_Energy = green_Energy;
	}

	public void setWindmills(OWLNamedClass_OpenSBS windmills) {
		Windmills = windmills;
	}

	public void setSolar_Panels(OWLNamedClass_OpenSBS solar_Panels) {
		Solar_Panels = solar_Panels;
	}

	public void setContaminated_Energy(OWLNamedClass_OpenSBS contaminated_Energy) {
		this.contaminated_Energy = contaminated_Energy;
	}

	public void setGas_turbine(OWLNamedClass_OpenSBS gas_turbine) {
		this.gas_turbine = gas_turbine;
	}

	public void setElectricity_Generator(OWLNamedClass_OpenSBS electricity_Generator) {
		Electricity_Generator = electricity_Generator;
	}

	public void setDeviceConsumeEnergy(OWLNamedClass_OpenSBS deviceConsumeEnergy) {
		DeviceConsumeEnergy = deviceConsumeEnergy;
	}

	public void setKetchinDevices(OWLNamedClass_OpenSBS ketchinDevices) {
		KetchinDevices = ketchinDevices;
	}

	public void setRefrigerators(OWLNamedClass_OpenSBS refrigerators) {
		Refrigerators = refrigerators;
	}

	public void setElectricWaterBoiler(OWLNamedClass_OpenSBS electricWaterBoiler) {
		ElectricWaterBoiler = electricWaterBoiler;
	}

	public void setOven(OWLNamedClass_OpenSBS oven) {
		Oven = oven;
	}

	public void setStove(OWLNamedClass_OpenSBS stove) {
		Stove = stove;
	}

	public void setDishwasher(OWLNamedClass_OpenSBS dishwasher) {
		Dishwasher = dishwasher;
	}

	public void setCounters(OWLNamedClass_OpenSBS counters) {
		Counters = counters;
	}

	public void setElectricityCounter(OWLNamedClass_OpenSBS electricityCounter) {
		ElectricityCounter = electricityCounter;
	}

	public void setSecurity(OWLNamedClass_OpenSBS security) {
		Security = security;
	}

	public void setCamera(OWLNamedClass_OpenSBS camera) {
		Camera = camera;
	}

	public void setAudioAndVideo(OWLNamedClass_OpenSBS audioAndVideo) {
		AudioAndVideo = audioAndVideo;
	}

	public void setCDPlayer(OWLNamedClass_OpenSBS cDPlayer) {
		CDPlayer = cDPlayer;
	}

	public void setSwitches(OWLNamedClass_OpenSBS switches) {
		Switches = switches;
	}

	public void setWeatherDevices(OWLNamedClass_OpenSBS weatherDevices) {
		WeatherDevices = weatherDevices;
	}

	public void setHeating(OWLNamedClass_OpenSBS heating) {
		Heating = heating;
	}

	public void setPatioHeater(OWLNamedClass_OpenSBS patioHeater) {
		PatioHeater = patioHeater;
	}

	public void setCooling(OWLNamedClass_OpenSBS cooling) {
		Cooling = cooling;
	}

	public void setAirConditioner(OWLNamedClass_OpenSBS airConditioner) {
		AirConditioner = airConditioner;
	}

	public void setAtticFan(OWLNamedClass_OpenSBS atticFan) {
		AtticFan = atticFan;
	}

	public void setWindowFan(OWLNamedClass_OpenSBS windowFan) {
		WindowFan = windowFan;
	}

	public void setCeilingFan(OWLNamedClass_OpenSBS ceilingFan) {
		CeilingFan = ceilingFan;
	}

	public void setOthers(OWLNamedClass_OpenSBS others) {
		Others = others;
	}

	public void setMedia(OWLNamedClass_OpenSBS media) {
		Media = media;
	}

	public void setTelevision(OWLNamedClass_OpenSBS television) {
		this.television = television;
	}

	public void setPhone(OWLNamedClass_OpenSBS phone) {
		this.phone = phone;
	}

	public void setLights(OWLNamedClass_OpenSBS lights) {
		Lights = lights;
	}

	public void setSensors(OWLNamedClass_OpenSBS sensors) {
		Sensors = sensors;
	}

	public void setSmokeSensor(OWLNamedClass_OpenSBS smokeSensor) {
		SmokeSensor = smokeSensor;
	}

	public void setMovingSensor(OWLNamedClass_OpenSBS movingSensor) {
		MovingSensor = movingSensor;
	}

	public void setLight_sensors(OWLNamedClass_OpenSBS light_sensors) {
		Light_sensors = light_sensors;
	}

	public void setTemperatureSensor(OWLNamedClass_OpenSBS temperatureSensor) {
		TemperatureSensor = temperatureSensor;
	}

	public void setWindSensor(OWLNamedClass_OpenSBS windSensor) {
		WindSensor = windSensor;
	}

	public void setRainSensor(OWLNamedClass_OpenSBS rainSensor) {
		RainSensor = rainSensor;
	}

	public void setCleaningDevices(OWLNamedClass_OpenSBS cleaningDevices) {
		CleaningDevices = cleaningDevices;
	}

	public void setThorWashingMachine(OWLNamedClass_OpenSBS thorWashingMachine) {
		ThorWashingMachine = thorWashingMachine;
	}

	public void setVacuumCleaner(OWLNamedClass_OpenSBS vacuumCleaner) {
		VacuumCleaner = vacuumCleaner;
	}

	public void setRoboticVacuumCleaner(OWLNamedClass_OpenSBS roboticVacuumCleaner) {
		RoboticVacuumCleaner = roboticVacuumCleaner;
	}

	public void setCentralVacuumCleaner(OWLNamedClass_OpenSBS centralVacuumCleaner) {
		CentralVacuumCleaner = centralVacuumCleaner;
	}

	public void setWashingMachine(OWLNamedClass_OpenSBS washingMachine) {
		WashingMachine = washingMachine;
	}

	public void setBodyCare(OWLNamedClass_OpenSBS bodyCare) {
		BodyCare = bodyCare;
	}

	public void setHairDryer(OWLNamedClass_OpenSBS hairDryer) {
		HairDryer = hairDryer;
	}

	public void setHairIron(OWLNamedClass_OpenSBS hairIron) {
		HairIron = hairIron;
	}

	public void setMicrowaveOven(OWLNamedClass_OpenSBS microwaveOven) {
		MicrowaveOven = microwaveOven;
	}

	public void setNetworkCoordinations(OWLNamedClass_OpenSBS networkCoordinations) {
		NetworkCoordinations = networkCoordinations;
	}

	public void setRouter(OWLNamedClass_OpenSBS router) {
		Router = router;
	}

	public void setHub(OWLNamedClass_OpenSBS hub) {
		Hub = hub;
	}

	public void setBills(OWLNamedClass_OpenSBS bills) {
		Bills = bills;
	}

	public void setEnergySources(OWLNamedClass_OpenSBS energySources) {
		EnergySources = energySources;
	}

	public void setGreenSources(OWLNamedClass_OpenSBS greenSources) {
		GreenSources = greenSources;
	}

	public void setWinds(OWLNamedClass_OpenSBS winds) {
		Winds = winds;
	}

	public void setSunLight(OWLNamedClass_OpenSBS sunLight) {
		SunLight = sunLight;
	}

	public void setContaminatedSources(OWLNamedClass_OpenSBS contaminatedSources) {
		ContaminatedSources = contaminatedSources;
	}

	public void setElectricGrid(OWLNamedClass_OpenSBS electricGrid) {
		ElectricGrid = electricGrid;
	}

	public void setBehaviors(OWLNamedClass_OpenSBS behaviors) {
		Behaviors = behaviors;
	}

	public void setCategoriseBehavior(OWLNamedClass_OpenSBS categoriseBehavior) {
		CategoriseBehavior = categoriseBehavior;
	}

	public void setCommonBehaviors(OWLNamedClass_OpenSBS commonBehaviors) {
		CommonBehaviors = commonBehaviors;
	}

	public void setEnvironment(OWLNamedClass_OpenSBS environment) {
		Environment = environment;
	}

	public void setEnvironmentLight(OWLNamedClass_OpenSBS environmentLight) {
		EnvironmentLight = environmentLight;
	}

	public void setEnvironmentTemperature(OWLNamedClass_OpenSBS environmentTemperature) {
		EnvironmentTemperature = environmentTemperature;
	}

	public void setZone(OWLNamedClass_OpenSBS zone) {
		Zone = zone;
	}

	public void setIndoorSpace(OWLNamedClass_OpenSBS indoorSpace) {
		IndoorSpace = indoorSpace;
	}

	public void setLevingRoom(OWLNamedClass_OpenSBS levingRoom) {
		LevingRoom = levingRoom;
	}

	public void setBathroom(OWLNamedClass_OpenSBS bathroom) {
		Bathroom = bathroom;
	}

	public void setPatio(OWLNamedClass_OpenSBS patio) {
		Patio = patio;
	}

	public void setLanding(OWLNamedClass_OpenSBS landing) {
		Landing = landing;
	}

	public void setDenningRoom(OWLNamedClass_OpenSBS denningRoom) {
		DenningRoom = denningRoom;
	}

	public void setKitchen(OWLNamedClass_OpenSBS kitchen) {
		Kitchen = kitchen;
	}

	public void setRoom(OWLNamedClass_OpenSBS room) {
		this.room = room;
	}

	public void setHall(OWLNamedClass_OpenSBS hall) {
		Hall = hall;
	}

	public void setWc(OWLNamedClass_OpenSBS wc) {
		this.wc = wc;
	}

	public void setBedroom(OWLNamedClass_OpenSBS bedroom) {
		Bedroom = bedroom;
	}

	public void setKidsRoom(OWLNamedClass_OpenSBS kidsRoom) {
		KidsRoom = kidsRoom;
	}

	public void setOutdoorspace(OWLNamedClass_OpenSBS outdoorspace) {
		Outdoorspace = outdoorspace;
	}

	public void setWall(OWLNamedClass_OpenSBS wall) {
		Wall = wall;
	}

	public void setGarage(OWLNamedClass_OpenSBS garage) {
		Garage = garage;
	}

	public void setTime(OWLNamedClass_OpenSBS time) {
		Time = time;
	}

	public void setSystemTime(OWLNamedClass_OpenSBS systemTime) {
		SystemTime = systemTime;
	}

	public void setEvents(OWLNamedClass_OpenSBS events) {
		Events = events;
	}

	public void setAddress(OWLNamedClass_OpenSBS address) {
		Address = address;
	}

	public void setService(OWLNamedClass_OpenSBS service) {
		Service = service;
	}

	public void setState(OWLNamedClass_OpenSBS state) {
		State = state;
	}

	public void setBoredom(OWLNamedClass_OpenSBS boredom) {
		Boredom = boredom;
	}

	public void setJoyfulness(OWLNamedClass_OpenSBS joyfulness) {
		Joyfulness = joyfulness;
	}

	public void setRestlessness(OWLNamedClass_OpenSBS restlessness) {
		Restlessness = restlessness;
	}

	public void setDisgust(OWLNamedClass_OpenSBS disgust) {
		Disgust = disgust;
	}

	public void setSurprise(OWLNamedClass_OpenSBS surprise) {
		Surprise = surprise;
	}

	public void setSadness(OWLNamedClass_OpenSBS sadness) {
		Sadness = sadness;
	}

	public void setWorry(OWLNamedClass_OpenSBS worry) {
		Worry = worry;
	}

	public void setFear(OWLNamedClass_OpenSBS fear) {
		Fear = fear;
	}

	public void setEvent_Has_Actions(OWLObjectProperty_OpenSBS event_Has_Actions) {
		Event_Has_Actions = event_Has_Actions;
	}

	public void setEvent_Has_Time(OWLObjectProperty_OpenSBS event_Has_Time) {
		Event_Has_Time = event_Has_Time;
	}

	public void setBills_Has_Energy_Sources(OWLObjectProperty_OpenSBS bills_Has_Energy_Sources) {
		Bills_Has_Energy_Sources = bills_Has_Energy_Sources;
	}

	public void setHuman_Has_Behaviors(OWLObjectProperty_OpenSBS human_Has_Behaviors) {
		Human_Has_Behaviors = human_Has_Behaviors;
	}

	public void setHuman_Has_Activity(OWLObjectProperty_OpenSBS human_Has_Activity) {
		Human_Has_Activity = human_Has_Activity;
	}

	public void setBehaviors_Has_Actions(OWLObjectProperty_OpenSBS behaviors_Has_Actions) {
		Behaviors_Has_Actions = behaviors_Has_Actions;
	}

	public void setEnvironment_Name(OWLDatatypeProperty_OpenSBS environment_Name) {
		Environment_Name = environment_Name;
	}

	public void setEnvironment_Values(OWLDatatypeProperty_OpenSBS environment_Values) {
		Environment_Values = environment_Values;
	}

	public void setService_Name(OWLDatatypeProperty_OpenSBS service_Name) {
		Service_Name = service_Name;
	}

	public void setService_Values(OWLDatatypeProperty_OpenSBS service_Values) {
		Service_Values = service_Values;
	}

	public void setTime_Second(OWLDatatypeProperty_OpenSBS time_Second) {
		Time_Second = time_Second;
	}

	public void setTime_Min(OWLDatatypeProperty_OpenSBS time_Min) {
		Time_Min = time_Min;
	}

	public void setTime_Hours(OWLDatatypeProperty_OpenSBS time_Hours) {
		Time_Hours = time_Hours;
	}

	public void setTime_Day(OWLDatatypeProperty_OpenSBS time_Day) {
		Time_Day = time_Day;
	}

	public void setTime_Type_Am_Pm(OWLDatatypeProperty_OpenSBS time_Type_Am_Pm) {
		Time_Type_Am_Pm = time_Type_Am_Pm;
	}

	public void setActivity_Name(OWLDatatypeProperty_OpenSBS activity_Name) {
		Activity_Name = activity_Name;
	}

	public void setActivity_Type(OWLDatatypeProperty_OpenSBS activity_Type) {
		Activity_Type = activity_Type;
	}

	public void setActivity_Description(OWLDatatypeProperty_OpenSBS activity_Description) {
		Activity_Description = activity_Description;
	}

	public void setBehaviors_Name(OWLDatatypeProperty_OpenSBS behaviors_Name) {
		Behaviors_Name = behaviors_Name;
	}

	public void setBehaviors_Percentage_Importance(OWLDatatypeProperty_OpenSBS behaviors_Percentage_Importance) {
		Behaviors_Percentage_Importance = behaviors_Percentage_Importance;
	}

	public void setBehaviors_Stat_On_Off(OWLDatatypeProperty_OpenSBS behaviors_Stat_On_Off) {
		Behaviors_Stat_On_Off = behaviors_Stat_On_Off;
	}

	public void setBehaviors_Description(OWLDatatypeProperty_OpenSBS behaviors_Description) {
		Behaviors_Description = behaviors_Description;
	}

	public void setAction_Name(OWLDatatypeProperty_OpenSBS action_Name) {
		Action_Name = action_Name;
	}

	public void setAction_Type(OWLDatatypeProperty_OpenSBS action_Type) {
		Action_Type = action_Type;
	}

	public void setAction_command_List(OWLDatatypeProperty_OpenSBS action_command_List) {
		Action_command_List = action_command_List;
	}

	public void setAction_Description(OWLDatatypeProperty_OpenSBS action_Description) {
		Action_Description = action_Description;
	}

	public void setAddress_Country(OWLDatatypeProperty_OpenSBS address_Country) {
		Address_Country = address_Country;
	}

	public void setAddress_County(OWLDatatypeProperty_OpenSBS address_County) {
		Address_County = address_County;
	}

	public void setAddress_Line_2(OWLDatatypeProperty_OpenSBS address_Line_2) {
		Address_Line_2 = address_Line_2;
	}

	public void setAddress_Stat(OWLDatatypeProperty_OpenSBS address_Stat) {
		Address_Stat = address_Stat;
	}

	public void setAddress_city(OWLDatatypeProperty_OpenSBS address_city) {
		Address_city = address_city;
	}

	public void setAddress_Postal_Code(OWLDatatypeProperty_OpenSBS address_Postal_Code) {
		Address_Postal_Code = address_Postal_Code;
	}

	public void setAdress_GPS_Location(OWLDatatypeProperty_OpenSBS adress_GPS_Location) {
		Adress_GPS_Location = adress_GPS_Location;
	}

	public void setAddress_Line_1(OWLDatatypeProperty_OpenSBS address_Line_1) {
		Address_Line_1 = address_Line_1;
	}

	public void setDevices_Name(OWLDatatypeProperty_OpenSBS devices_Name) {
		Devices_Name = devices_Name;
	}

	public void setDevices_State(OWLDatatypeProperty_OpenSBS devices_State) {
		Devices_State = devices_State;
	}

	public void setDevices_Values(OWLDatatypeProperty_OpenSBS devices_Values) {
		Devices_Values = devices_Values;
	}

	public void setDevices_Protocol(OWLDatatypeProperty_OpenSBS devices_Protocol) {
		Devices_Protocol = devices_Protocol;
	}

	public void setHome_Area(OWLDatatypeProperty_OpenSBS home_Area) {
		Home_Area = home_Area;
	}

	public void setHome_Number(OWLDatatypeProperty_OpenSBS home_Number) {
		Home_Number = home_Number;
	}

	public void setEvents_Percentage(OWLDatatypeProperty_OpenSBS events_Percentage) {
		Events_Percentage = events_Percentage;
	}

	public void setEvents_Name(OWLDatatypeProperty_OpenSBS events_Name) {
		Events_Name = events_Name;
	}

	public void setEvents_Level(OWLDatatypeProperty_OpenSBS events_Level) {
		Events_Level = events_Level;
	}

	public void setEvents_type(OWLDatatypeProperty_OpenSBS events_type) {
		Events_type = events_type;
	}

	public void setZone_Type(OWLDatatypeProperty_OpenSBS zone_Type) {
		Zone_Type = zone_Type;
	}

	public void setZone_VectoreXY(OWLDatatypeProperty_OpenSBS zone_VectoreXY) {
		Zone_VectoreXY = zone_VectoreXY;
	}

	public void setZone_Size(OWLDatatypeProperty_OpenSBS zone_Size) {
		Zone_Size = zone_Size;
	}

	public void setZone_Floor(OWLDatatypeProperty_OpenSBS zone_Floor) {
		Zone_Floor = zone_Floor;
	}

	public void setZone_Name(OWLDatatypeProperty_OpenSBS zone_Name) {
		Zone_Name = zone_Name;
	}

	public void setHuman_Email(OWLDatatypeProperty_OpenSBS human_Email) {
		Human_Email = human_Email;
	}

	public void setHuman_Phone_Number(OWLDatatypeProperty_OpenSBS human_Phone_Number) {
		Human_Phone_Number = human_Phone_Number;
	}

	public void setHuman_Birthday(OWLDatatypeProperty_OpenSBS human_Birthday) {
		Human_Birthday = human_Birthday;
	}

	public void setHuman_First_Name(OWLDatatypeProperty_OpenSBS human_First_Name) {
		Human_First_Name = human_First_Name;
	}

	public void setHuman_Last_Name(OWLDatatypeProperty_OpenSBS human_Last_Name) {
		Human_Last_Name = human_Last_Name;
	}

	public void setBills_Type(OWLDatatypeProperty_OpenSBS bills_Type) {
		Bills_Type = bills_Type;
	}

	public void setBills_Name(OWLDatatypeProperty_OpenSBS bills_Name) {
		Bills_Name = bills_Name;
	}

	public static void setFileTxtManagment(FileTxtManagmentGIS fileTxtManagment) {
		FileTxtManagment = fileTxtManagment;
	}

	public OWLDatatypeProperty_OpenSBS getHuman_Email() {
		return Human_Email;
	}

	public OWLDatatypeProperty_OpenSBS getBills_Type() {
		return Bills_Type;
	}

	public static FileTxtManagmentGIS getFileTxtManagment() {
		return FileTxtManagment;
	}

	public OWLNamedClass_OpenSBS getBattery() {
		return Battery;
	}

}
