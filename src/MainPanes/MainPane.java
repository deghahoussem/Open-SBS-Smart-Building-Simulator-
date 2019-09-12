package MainPanes;

import application.App_Nodes_Actions;
import application.Main;
import javafx.application.Application;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class MainPane extends BorderPane {

	private TabPane MainPane;
	private CreateIndividual CreateIndividual;
	private DeleteIndiviuals DeleteIndiviuals;

	private EditOntology EditOntology;

	private SingleSelectionModel<Tab> selectionModel;
	private setmaps setmaps;
	private Simulator Simulator;
	private CreateScenario CreateScenario;
	private editindividuals editindividuals;
	private showindividiuals showindividiuals;
	private ShowOntology ShowOntology;
	private SWRLtab SWRLtab;

	public ShowOntology getShowOntology() {
		return ShowOntology;
	}

	public void setShowOntology(ShowOntology ShowOntology) {
		ShowOntology = ShowOntology;
	}

	public EditOntology getEditOntology() {
		return EditOntology;
	}

	public void setEditOntology(EditOntology editOntology) {
		EditOntology = editOntology;
	}

	private stats stats;
	private Main Main;

	public MainPane(double width, double height, App_Nodes_Actions App_Nodes_Actions, Main Main) {
		this.Main = Main;
		MainPane = new TabPane();
		editindividuals = new editindividuals();
		setmaps = new setmaps();
		Simulator = new Simulator(this.Main.getChart_stats());
		CreateIndividual = new CreateIndividual();
		CreateScenario = new CreateScenario(Main);
		MainPane.getTabs().add(setmaps);
		DeleteIndiviuals = new DeleteIndiviuals(App_Nodes_Actions);
		showindividiuals = new showindividiuals();
		selectionModel = MainPane.getSelectionModel();
		stats = new stats();
		EditOntology = new EditOntology(App_Nodes_Actions);
		ShowOntology = new ShowOntology();
		SWRLtab = new SWRLtab(App_Nodes_Actions);
		

		
		setMaxHeight(700);
		MainPane.setMaxHeight(700);
		setCenter(MainPane);

	}

	public SWRLtab getSWRLtab() {
		return SWRLtab;
	}

	public void setSWRLtab(SWRLtab sWRLtab) {
		SWRLtab = sWRLtab;
	}

	public Main getMain() {
		return Main;
	}

	public void setMain(Main main) {
		Main = main;
	}

	public stats getStats() {
		return stats;
	}

	public void setStats(stats stats) {
		this.stats = stats;
	}

	public editindividuals getEditindividuals() {
		return editindividuals;
	}

	public showindividiuals getShowindividiuals() {
		return showindividiuals;
	}

	public DeleteIndiviuals getDeleteIndiviuals() {
		return DeleteIndiviuals;
	}

	public void setDeleteIndiviuals(DeleteIndiviuals deleteIndiviuals) {
		DeleteIndiviuals = deleteIndiviuals;
	}

	public CreateScenario getCreateScenario() {
		return CreateScenario;
	}

	public void setMainPane(TabPane mainPane) {
		MainPane = mainPane;
	}

	public TabPane getMainPane() {
		return MainPane;
	}

	public SingleSelectionModel<Tab> getSelectionModel() {
		return selectionModel;
	}

	public setmaps getSetmaps() {
		return setmaps;
	}

	public Simulator getSimulator() {
		return Simulator;
	}

	public CreateIndividual Noise_Sensor() {
		return CreateIndividual;
	}

	public CreateIndividual getCreateIndividual() {
		return CreateIndividual;
	}

	public void setCreateIndividual(CreateIndividual createIndividual) {
		CreateIndividual = createIndividual;
	}

	public void setSelectionModel(SingleSelectionModel<Tab> selectionModel) {
		this.selectionModel = selectionModel;
	}

	public void setSetmaps(setmaps setmaps) {
		this.setmaps = setmaps;
	}

	public void setSimulator(Simulator simulator) {
		Simulator = simulator;
	}

	public void setCreateScenario(CreateScenario createScenario) {
		CreateScenario = createScenario;
	}

	public void setEditindividuals(editindividuals editindividuals) {
		this.editindividuals = editindividuals;
	}

	public void setShowindividiuals(showindividiuals showindividiuals) {
		this.showindividiuals = showindividiuals;
	}

}
