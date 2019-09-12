package MainPanes;

import DataManagment.FileTxtManagmentGIS;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class ActivityActor  extends GridPane{
	FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
	String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");

	private TextField Activity_Name;
	private TextArea Activity_descreption;
	private ChoiceBox<String> Activity_type;
	private DatePicker checkInDatePicker;
	private ChoiceBox<String> hours;
	private ChoiceBox<String> min;

	CheckBoxTreeItem<String> rootItem;
	TreeView tree;

	public ActivityActor() {
		super();
		setVgap(5);
		setHgap(5);
		setPadding(new Insets(10));
		Text t1 = new Text(words[109]);
		Activity_Name = new TextField();
		Text t2 = new Text(words[110]);
		Activity_descreption = new TextArea();
		Activity_descreption.setMaxHeight(50);
		Text t3 = new Text(words[111]);
		Activity_type = new ChoiceBox<String>();
		Activity_type.getItems().addAll("Scheduler","Inferred");
		Text t4 = new Text(words[112]);
		checkInDatePicker = new DatePicker();
		hours = new ChoiceBox<String>();
		min = new ChoiceBox<String>();
		for(int i = 1; i<=12; i++){
			hours.getItems().add(String.valueOf(i));
		}
		for(int i = 0; i<60; i++){
			min.getItems().add(String.valueOf(i));
		}
        Text t6 = new Text(words[114]);
        Text t7 = new Text(words[115]);
		HBox h = new HBox();
		h.setSpacing(5); h.getChildren().addAll(checkInDatePicker,t6,hours,t7,min);
		

		Text t5 = new Text(words[113]);
		rootItem = new CheckBoxTreeItem<String>("View Source Files");
		
		tree = new TreeView(rootItem);
		tree.setCellFactory(CheckBoxTreeCell.<String>forTreeView());  
		tree.setRoot(rootItem);
	
		tree.setMaxHeight(100);
		
		rootItem.setExpanded(true);                  
        tree.setEditable(true);
        tree.setShowRoot(true);
	
		t1.setId("TextBig");
		t2.setId("TextBig");
		t3.setId("TextBig");
		t4.setId("TextBig");
		t5.setId("TextBig");
		t6.setId("TextBig");
		t7.setId("TextBig");
		setId("Activity_Vbox");
		setHalignment(t1, HPos.RIGHT);
		setHalignment(t2, HPos.RIGHT);
		setHalignment(t3, HPos.RIGHT);
		setHalignment(t4, HPos.RIGHT);
		setHalignment(t5, HPos.RIGHT);
		setHalignment(t6, HPos.RIGHT);
		setHalignment(t7, HPos.RIGHT);
		
		add(t1, 0, 0);
		add(Activity_Name, 1, 0);
		
		add(t2, 0, 1);
		add(Activity_descreption, 1, 1);
		
		add(t3, 0, 2);
		add(Activity_type, 1, 2);
	
		add(t4, 0, 3);
		add(h, 1, 3);
	
		add(t5, 0, 4);
		add(tree, 1, 4);
		
	
					// TODO Auto-generated constructor stub
	}

	public GridPane getActivity_Gridpane() {
		return this;
	}

	public TextField getActivity_Name() {
		return Activity_Name;
	}

	public TextArea getActivity_descreption() {
		return Activity_descreption;
	}

	public ChoiceBox<String> getActivity_type() {
		return Activity_type;
	}

	public DatePicker getCheckInDatePicker() {
		return checkInDatePicker;
	}

	public ChoiceBox<String> getHours() {
		return hours;
	}

	public ChoiceBox<String> getMin() {
		return min;
	}

	public CheckBoxTreeItem<String> getRootItem() {
		return rootItem;
	}

	public TreeView getTree() {
		return tree;
	}
}

