  package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.List;

import DataManagment.FileTxtManagmentGIS;
import application.Main;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.PaginationBuilder;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class Simulator extends Tab{
	private BorderPane Main_Panes[];
	private chart_stats chart_stats ;
	private BorderPane MainSimulatorPane ;
	private BorderPane MainSimulatorPane_Table ;
	
	

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
     private Pagination pagination;
	
	public Simulator(chart_stats chart_stats) {
		super();
		
		
		this.chart_stats = chart_stats;
		this.chart_stats.setPrefSize(500, 500);
	
		FileTxtManagmentGIS FileTxtManagmentGIS = new FileTxtManagmentGIS();
		String[] words = FileTxtManagmentGIS.Read_from_file("GIS Files//WordsFile.txt");
	
		this.setText(words[48]);
		
		Main_Panes = new BorderPane[3];
		
	}

	public void SetMapImage(String MapName ){
	
		MainSimulatorPane = new BorderPane();
	
		File f1 = new File("Maps//"+MapName+".png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage = new ImageView();
		selectedImage.setImage(i);
	
		selectedImage.setFitHeight(height-200);
		selectedImage.setFitWidth(width-400);
		
		
	
		MainSimulatorPane.setTop(selectedImage);
		
		 pagination = PaginationBuilder.create().pageCount(3).pageFactory(new Callback<Integer, Node>() {           
	            @Override public Node call(Integer pageIndex) {
	                return createAnimalPage(pageIndex);
	            }
	        }).build();
		
		 this.setContent(pagination);
		
		 MainSimulatorPane_Table = new BorderPane();
		 Main_Panes[0] = new BorderPane();
		 Main_Panes[1] = new BorderPane();
		 Main_Panes[2] = new BorderPane();
		 
		 Main_Panes[0].getChildren().add(MainSimulatorPane);
	
		 BorderPane mainpane = new BorderPane();
		    Text logo = new Text("Statisticques");
			logo.setId("logo");
			File flogo = new File("icons//Stats-icon.png");
			Image ilogo = new Image(flogo.toURI().toString());
			final ImageView selectedImage14 = new ImageView();
			selectedImage14.setImage(ilogo);
			selectedImage14.setFitHeight(50);
			selectedImage14.setFitWidth(50);

			HBox h = new HBox();
			h.setSpacing(10);
			h.setAlignment(Pos.CENTER);
			h.getChildren().addAll(logo, selectedImage14);
			h.setId("Toplogo");
			h.setPadding(new Insets(5));
			mainpane.setTop(h);
			mainpane.setCenter(chart_stats);

		 Main_Panes[1].setCenter(mainpane);
		 
	}
	 private VBox createAnimalPage(int pageIndex) {
	       	 
		 
	        VBox box = new VBox();box.setAlignment(Pos.TOP_CENTER);
	     
	        box.getChildren().add(Main_Panes[pageIndex]);
	        return box;
		
	    }
	public BorderPane getMainSimulatorPane() {
		return MainSimulatorPane;
	}

	public Dimension getScreenSize() {
		return screenSize;
	}
	public BorderPane[] getMain_Panes() {
		return Main_Panes;
	}

	public chart_stats getChart_stats() {
		return chart_stats;
	}

	public BorderPane getMainSimulatorPane_Table() {
		return MainSimulatorPane_Table;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setMain_Panes(BorderPane[] main_Panes) {
		Main_Panes = main_Panes;
	}

	public void setChart_stats(chart_stats chart_stats) {
		this.chart_stats = chart_stats;
	}

	public void setMainSimulatorPane(BorderPane mainSimulatorPane) {
		MainSimulatorPane = mainSimulatorPane;
	}

	public void setMainSimulatorPane_Table(BorderPane mainSimulatorPane_Table) {
		MainSimulatorPane_Table = mainSimulatorPane_Table;
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

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}
