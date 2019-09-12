package MainPanes;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;
import GuiComnonets.*;
import RulesEngenGIS.SWRL_Rule_Graph;
import application.App_Nodes_Actions;

public class SWRLtab extends Tab {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth() + 100;
	double height = screenSize.getHeight();

	DynamicTableView DynamicTableView_Added;
	DynamicTableView DynamicTableView_Result;

	TextField ruleName;
	TextArea RuleText;
	Button add;
	Button Run;

	BorderPane table =new BorderPane();

	public SWRLtab(App_Nodes_Actions App_Nodes_Actions) {
		super("SWRL-Tab");

		// TODO Auto-generated constructor stub

		BorderPane mainpane = new BorderPane();

		Text logo = new Text("SWRL rules Tab");
		logo.setId("logo");
		File f1 = new File("icons/owl-swrl1.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage14 = new ImageView();

		selectedImage14.setImage(i);
		selectedImage14.setFitHeight(60);
		selectedImage14.setFitWidth(70);
		HBox h = new HBox();
		h.setSpacing(10);
		h.setAlignment(Pos.CENTER);
		h.getChildren().addAll(logo, selectedImage14);
		h.setId("Toplogo");
		VBox V = new VBox();
		V.setSpacing(10);
		V.setAlignment(Pos.CENTER);

		GridPane g = new GridPane();
		g.setPadding(new Insets(10));
		g.setVgap(10);
		g.setHgap(10);

		Text t1 = new Text("Type A rule Name : ");
		ruleName = new TextField("");
		ruleName.setPrefWidth(400);

		Text t2 = new Text("Type A rule Expression : ");
		RuleText = new TextArea();
		RuleText.setPrefSize(400, 150);
		RuleText.setMaxHeight(150);

		g.add(t1, 0, 0);
		g.add(ruleName, 0, 1);

		g.add(t2, 0, 2);
		g.add(RuleText, 0, 3);


		DynamicTableView_Result = new DynamicTableView();
		DynamicTableView_Result.getTableView().setPrefSize(400,200);
		DynamicTableView_Result.getTableView().setMinHeight(200);
		table.setPrefSize(400,200);
		table.setMinHeight(200);

		add = new Button("Add");
		add.setPrefSize(150, 30);
		add.setId("buttomPane");

		add.setOnAction(App_Nodes_Actions);

		Run = new Button("Execute");
		Run.setPrefSize(150, 30);
		Run.setId("buttomPane");

		Run.setOnAction(App_Nodes_Actions);

		HBox hbox1 = new HBox();
		hbox1.setSpacing(10);
		hbox1.setPadding(new Insets(10));
		hbox1.setAlignment(Pos.CENTER);
		hbox1.getChildren().addAll(add, Run);


		DynamicTableView_Added = new DynamicTableView();
		DynamicTableView_Added.getTableView().setPrefSize(width / 5 * 3.9, 450);
		List<String> columns = new ArrayList<String>();

		columns.add("Rule Name");
		columns.add("Expression");
		DynamicTableView_Added.SetColumns(columns);
		DynamicTableView_Added.getTableView().getColumns().get(0).setPrefWidth(150);

		DynamicTableView_Added.getTableView().getColumns().get(1).setPrefWidth((width / 5 * 3.9));

		table.setCenter(DynamicTableView_Result.getTableView());

		//DynamicTableView_Result.getTableView());

		HBox hbox2 = new HBox();
		hbox2.setSpacing(10);
		hbox2.setPadding(new Insets(10));
		hbox2.setAlignment(Pos.CENTER);
		hbox2.getChildren().addAll(g, table);

		V.setAlignment(Pos.CENTER);
		V.getChildren().add(hbox2);
		V.getChildren().add(hbox1);

		V.getChildren().add(DynamicTableView_Added.getTableView());

		mainpane.setTop(h);
		mainpane.setCenter(V);
		mainpane.setPrefSize(width -500, height / 2 + 90+250);

		ScrollPane s = new ScrollPane(mainpane);

		this.setContent(s);

	}

	public BorderPane getTable() {
		return table;
	}

	public void setTable(BorderPane table) {
		this.table = table;
	}

	public DynamicTableView getDynamicTableView_Result() {
		return DynamicTableView_Result;
	}

	public void setDynamicTableView_Result(DynamicTableView dynamicTableView_Result) {
		DynamicTableView_Result = dynamicTableView_Result;
	}

	public Button getRun() {
		return Run;
	}

	public void setRun(Button run) {
		Run = run;
	}

	public Dimension getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Dimension screenSize) {
		this.screenSize = screenSize;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public DynamicTableView getDynamicTableView_Added() {
		return DynamicTableView_Added;
	}

	public void setDynamicTableView_Added(DynamicTableView DynamicTableView_Added) {
		DynamicTableView_Added = DynamicTableView_Added;
	}

	public TextField getRuleName() {
		return ruleName;
	}

	public void setRuleName(TextField ruleName) {
		this.ruleName = ruleName;
	}

	public TextArea getRuleText() {
		return RuleText;
	}

	public void setRuleText(TextArea ruleText) {
		RuleText = ruleText;
	}

	public Button getAdd() {
		return add;
	}

	public void setAdd(Button add) {
		this.add = add;
	}

}
