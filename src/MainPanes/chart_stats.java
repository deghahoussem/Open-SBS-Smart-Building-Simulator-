package MainPanes;

import RightPane.System_Counters;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import GIS.Ontology.*;

public class chart_stats extends HBox {
	public XYChart.Series<Number, Number> getGreen_prodection() {
		return Green_prodection;
	}

	public XYChart.Series<Number, Number> getContaminated_consumation() {
		return contaminated_consumation;
	}

	public NumberAxis getxAxis() {
		return xAxis;
	}

	public Timeline getAnimation() {
		return animation;
	}

	public double getTimeInHours() {
		return timeInHours;
	}

	private XYChart.Series<Number, Number> Green_prodection;
	private XYChart.Series<Number, Number> contaminated_consumation;
	private NumberAxis xAxis;
	private Timeline animation;
	private double timeInHours = 0;
	final AreaChart<Number, Number> lc;
	Simulation_Model_Layers Simulation_Model_Layers;

	public chart_stats(Simulation_Model_Layers Simulation_Model_Layers) {
		
		super();
		this.Simulation_Model_Layers = Simulation_Model_Layers;
		xAxis = new NumberAxis(0, 100, 5);
		xAxis.setLabel("Time");
		final NumberAxis yAxis = new NumberAxis(0, 1000, 5);
		yAxis.setLabel("Energy Consumption");
		lc = new AreaChart<Number, Number>(xAxis, yAxis);
		// setup chart
		lc.setCreateSymbols(true);
		lc.setAnimated(true);
		lc.setLegendVisible(true);

		xAxis.setForceZeroInRange(false);

		lc.setPrefSize(800, 600);
		lc.setTitle("Stats of Energy Consumption of Simulation");
		yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis, " kw/h ", null));

		Green_prodection = new XYChart.Series<Number, Number>();
		Green_prodection.setName("Green energy prodection");

		contaminated_consumation = new XYChart.Series<Number, Number>();
		contaminated_consumation.setName("energy consumption");

		lc.getData().add(contaminated_consumation);
		lc.getData().add(Green_prodection);

		getChildren().add(lc);

		animation = new Timeline();
		animation.getKeyFrames().add(new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent actionEvent) {
				// 6 minutes data per frame

				plotNewVall();

			}

		}));
		animation.setCycleCount(Animation.INDEFINITE);

		setAlignment(Pos.TOP_CENTER);
	}

	public void Start() {
		try {

			Green_prodection.getData().remove(0, Green_prodection.getData().size());

			contaminated_consumation.getData().remove(0, contaminated_consumation.getData().size());

		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		timeInHours = 0;
		xAxis.setLowerBound(0);
		xAxis.setUpperBound(100);

		animation.play();

	}

	public void Stop() {
		animation.stop();
	}

	private void plotNewVall() {

		Integer x1 = 0;
		Integer x2;
		if (Simulation_Model_Layers.getSimulation_Results().get(0).getGreen_Energy_Sources().get(0)
				.toString() != null) {
			x1 = Float.valueOf(Simulation_Model_Layers.getSimulation_Results().get(0).getGreen_Energy_Sources().get(0))
					.intValue();
			x2 = Float.valueOf(
					Simulation_Model_Layers.getSimulation_Results().get(0).getEnergy_Consumption_Of_Devices().get(0))
					.intValue();
		} else {

			x2 = Integer.valueOf(Simulation_Model_Layers.getSimulation_Results().get(0)
					.getEnergy_Consumption_Of_Devices().get(0).toString());

		}

		Green_prodection.getData().add(new XYChart.Data<Number, Number>(timeInHours, x1));
		contaminated_consumation.getData().add(new XYChart.Data<Number, Number>(timeInHours, x2));

		// after 25hours delete old data

		// every hour after 24 move range 1 hour
		if (timeInHours > 100) {
			Green_prodection.getData().remove(0);
			contaminated_consumation.getData().remove(0);

			xAxis.setLowerBound(xAxis.getLowerBound() + 1);
			xAxis.setUpperBound(xAxis.getUpperBound() + 1);
		}
		timeInHours += 1;
	}
}
