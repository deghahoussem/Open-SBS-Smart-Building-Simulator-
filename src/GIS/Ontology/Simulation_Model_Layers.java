package GIS.Ontology;

import java.util.ArrayList;
import java.util.List;

public class Simulation_Model_Layers {

	private List<OntologyIndividualsModel> Simulation_Models;
	private List<Simulation_Results> Simulation_Results;


	public List<OntologyIndividualsModel> getSimulation_Models() {
		return Simulation_Models;


	}

	public void setSimulation_Models(List<OntologyIndividualsModel> simulation_Models) {
		Simulation_Models = simulation_Models;
	}

	public Simulation_Model_Layers() {
		Simulation_Results = new ArrayList<Simulation_Results>();
		Simulation_Models = new ArrayList<OntologyIndividualsModel>();

		Simulation_Results.add(new Simulation_Results());
		Simulation_Results.add(new Simulation_Results());
		Simulation_Results.add(new Simulation_Results());
		Simulation_Results.add(new Simulation_Results());
	}


	public List<Simulation_Results> getSimulation_Results() {
		return Simulation_Results;
	}

	public void setSimulation_Results(List<Simulation_Results> simulation_Results) {
		Simulation_Results = simulation_Results;
	}

	public class Simulation_Results {
		 private List<Float> 	contaminated_Energy = new ArrayList<Float>();

		private List<Float> Green_Energy_Sources = new ArrayList<Float>();
		private List<Float> Energy_Consumption_Of_Devices = new ArrayList<Float>();
		private Float Bill = 0f;
		public List<Float> getGreen_Energy_Sources() {
			return Green_Energy_Sources;
		}
		public void setGreen_Energy_Sources(List<Float> green_Energy_Sources) {
			Green_Energy_Sources = green_Energy_Sources;
		}
		public List<Float> getEnergy_Consumption_Of_Devices() {
			return Energy_Consumption_Of_Devices;
		}
		public void setEnergy_Consumption_Of_Devices(List<Float> energy_Consumption_Of_Devices) {
			Energy_Consumption_Of_Devices = energy_Consumption_Of_Devices;
		}
		public Float getBill() {
			return Bill;
		}
		public void setBill(Float bill) {
			Bill = bill;
		}
		public Float getTimeSystem() {
			return TimeSystem;
		}
		public void setTimeSystem(Float timeSystem) {
			TimeSystem = timeSystem;
		}
		private Float TimeSystem = 0f;
		public List<Float> getContaminated_Energy() {
			return contaminated_Energy;
		}

		public void setContaminated_Energy(List<Float> contaminated_Energy) {
			this.contaminated_Energy = contaminated_Energy;
		}

	}
}
