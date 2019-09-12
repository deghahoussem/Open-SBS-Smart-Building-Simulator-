package RightPane;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.axis.types.Time;

import javafx.geometry.Insets;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class System_Counters extends GridPane {

	private Text Green_energy_vall;
	private Text Green_energy_Number_devices;

	private Text contaminated_Energy_vall;
	private Text contaminated_Energy_number_devices;

	private Text weather_sun_ligt;

	private Text TimeSystem;

	private ProgressBar ProgressBar;


	public Text getTimeSystem() {
		return TimeSystem;
	}

	public void setGreen_energy_vall(Text green_energy_vall) {
		Green_energy_vall = green_energy_vall;
	}

	public void setGreen_energy_Number_devices(Text green_energy_Number_devices) {
		Green_energy_Number_devices = green_energy_Number_devices;
	}

	public void setContaminated_Energy_vall(Text contaminated_Energy_vall) {
		this.contaminated_Energy_vall = contaminated_Energy_vall;
	}

	public void setContaminated_Energy_number_devices(Text contaminated_Energy_number_devices) {
		this.contaminated_Energy_number_devices = contaminated_Energy_number_devices;
	}

	public void setWeather_sun_ligt(Text weather_sun_ligt) {
		this.weather_sun_ligt = weather_sun_ligt;
	}

	public void setTimeSystem(Text timeSystem) {
		TimeSystem = timeSystem;
	}

	public void setBills(Text bills) {
		this.bills = bills;
	}

	public void setWeather_tempiratur(Text weather_tempiratur) {
		this.weather_tempiratur = weather_tempiratur;
	}

	public Text getBills() {
		return bills;
	}

	private Text bills;

	public Text getGreen_energy_vall() {
		return Green_energy_vall;
	}

	public Text getGreen_energy_Number_devices() {
		return Green_energy_Number_devices;
	}

	public Text getContaminated_Energy_vall() {
		return contaminated_Energy_vall;
	}

	public Text getContaminated_Energy_number_devices() {
		return contaminated_Energy_number_devices;
	}

	public Text getWeather_sun_ligt() {
		return weather_sun_ligt;
	}

	public Text getWeather_tempiratur() {
		return weather_tempiratur;
	}

	private Text weather_tempiratur;

	public System_Counters() {
		super();
		
		
		
		
		setVgap(5);
		setHgap(5);
		setPadding(new Insets(5));
		File f = new File("icons//energy-functiongraphic-EN.png");
		Image i = new Image(f.toURI().toString());
		final ImageView selectedImage1f = new ImageView();
		selectedImage1f.setImage(i);
		selectedImage1f.setFitHeight(35);
		selectedImage1f.setFitWidth(35);

		Text t1 = new Text("Green Production  ");
		Text t2 = new Text("values kw/h  :  ");
		Text t4 = new Text("Number of Sources :  ");
		Green_energy_vall = new Text("00");
		Green_energy_Number_devices = new Text("0");

		
		ProgressBar = new ProgressBar(0.f);
		ProgressBar.setPrefWidth(400);
		Separator separator1 = new Separator();
		this.add(selectedImage1f, 0, 0);
		this.add(t1, 1, 0);
		this.add(t2, 0, 1);
		this.add(Green_energy_vall, 1, 1);
		this.add(t4, 0, 2);
		this.add(Green_energy_Number_devices, 1, 2);
		this.add(separator1, 0, 3);
		setColumnSpan(separator1, 3);

		f = new File("icons//energy-funchhtiongraphic-EN.png");
		i = new Image(f.toURI().toString());
		final ImageView selectedImage2 = new ImageView();
		selectedImage2.setImage(i);
		selectedImage2.setFitHeight(35);
		selectedImage2.setFitWidth(35);

		contaminated_Energy_vall = new Text("00");
		contaminated_Energy_number_devices = new Text("0");

		Text t11 = new Text("contaminated consumption");
		Text t21 = new Text("values kw/h :  ");
		Text t41 = new Text("Number of Sources :  ");

		Separator separator2 = new Separator();
		this.add(selectedImage2, 0, 4);
		this.add(t11, 1, 4);
		this.add(t21, 0, 5);
		this.add(contaminated_Energy_vall, 1, 5);
		this.add(t41, 0, 6);
		this.add(contaminated_Energy_number_devices, 1, 6);
		this.add(separator2, 0, 7);
		setColumnSpan(separator2, 3);

		// Sunny

		f = new File("icons//Sunny.png");
		i = new Image(f.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(35);
		selectedImage3.setFitWidth(35);

		weather_sun_ligt = new Text("100%");
		weather_tempiratur = new Text("38");

		Text t111 = new Text("Weather");
		Text t211 = new Text("Sun light :  ");
		Text t411 = new Text("temp :");

		Separator separator3 = new Separator();
		this.add(selectedImage3, 0, 8);
		this.add(t111, 1, 8);
		this.add(t211, 0, 9);
		this.add(weather_sun_ligt, 1, 9);
		this.add(t411, 0, 10);
		this.add(weather_tempiratur, 1, 10);
		this.add(separator3, 0, 11);
		setColumnSpan(separator3, 3);

		f = new File("icons//timee.png");
		i = new Image(f.toURI().toString());
		final ImageView selectedImage4 = new ImageView();
		selectedImage4.setImage(i);
		selectedImage4.setFitHeight(35);
		selectedImage4.setFitWidth(35);

		Text t1111 = new Text("Time");
		Text t2111 = new Text("System Time :  ");

		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd|hh:mm:ss aa");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);

		TimeSystem = new Text(strDate);

		Separator separator4 = new Separator();
		this.add(selectedImage4, 0, 12);
		this.add(t1111, 1, 12);
		this.add(t2111, 0, 13);
		this.add(TimeSystem, 1, 13);

		this.add(separator4, 0, 14);
		setColumnSpan(separator4, 3);

		f = new File("icons//logo.png");
		i = new Image(f.toURI().toString());
		final ImageView selectedImage5 = new ImageView();
		selectedImage5.setImage(i);
		selectedImage5.setFitHeight(45);
		selectedImage5.setFitWidth(45);

		Text t11112 = new Text("Open-SBS : Open-Source \n Smart Home Simulator");
		Text t21112 = new Text("devloper :  ");
		Text t21113 = new Text("Degha Houssem Eddine ");



		this.add(selectedImage5, 0, 19);
		this.add(t11112, 1, 19);
		this.add(t21112, 0, 20);
		this.add(t21113, 1, 20);

		Separator separator5= new Separator();
		this.add(separator5, 0, 18);
		setColumnSpan(separator5, 3);
		//-----------------------------------------------------
		f = new File("icons//billes.png");
		i = new Image(f.toURI().toString());
		final ImageView selectedImage6 = new ImageView();
		selectedImage6.setImage(i);
		selectedImage6.setFitHeight(35);
		selectedImage6.setFitWidth(35);

		Text t111121 = new Text("Bills");
		Text t211121 = new Text(" DA :  ");bills = new Text("00");




		this.add(selectedImage6, 0, 16);
		this.add(t111121, 1, 16);
		this.add(t211121, 0, 17);
		this.add(bills, 1, 17);
		

	}

	public ProgressBar getProgressBar() {
		return ProgressBar;
	}

	public void setProgressBar(ProgressBar progressBar) {
		ProgressBar = progressBar;
	}

}
