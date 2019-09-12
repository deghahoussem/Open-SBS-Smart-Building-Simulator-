package GuiComnonets;

import java.io.File;

import GIS.Ontology.OutPutIindividual;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Light implements OutPutIindividual {
	private BorderPane Deviceobject;


	 ImageView Mainimg ;
	public int[] getPosition(String pos) {
		int x[] = new int[2];
		int i = 0;
		String xpos = "";
		while (pos.charAt(i) != '-') {
			xpos += pos.charAt(i);
			i++;
		}

		String ypos = "";
		i++;
		while (i < pos.length()) {
			ypos += pos.charAt(i);
			i++;
		}

		x[0] = Integer.valueOf(xpos);
		x[1] = Integer.valueOf(ypos);
		System.out.println(x[0]);
		System.out.print(x[1]);
		return x;
	}

	public Light(String NameDevice, String DviceType, String Position, int width, int height) {

		Deviceobject = new BorderPane();

		File f1 = new File("icons//" + DviceType + ".png");
		Image i = new Image(f1.toURI().toString());
		  Mainimg = new ImageView();
		Mainimg.setImage(i);
		Mainimg.setFitHeight(height);
		Mainimg.setFitWidth(width);

		Deviceobject.setCenter(Mainimg);
		Deviceobject.setLayoutX(getPosition(Position)[0]);
		Deviceobject.setLayoutY(getPosition(Position)[1]);



		Deviceobject.setOnMouseDragged(mouseEvent -> {
			Deviceobject.setTranslateX(mouseEvent.getSceneX() - 10 - Deviceobject.getLayoutX());
			Deviceobject.setTranslateY(mouseEvent.getSceneY() - 190 - Deviceobject.getLayoutY());
		});
		// TODO Auto-generated constructor stub
	}

	public void Create(String IdName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public Void SetValuesProperty(String PropertyName, Object PropertyValues) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public void MakeAction(String nameAtion, Object val) {
		if(nameAtion.equals("on")){
			File f1 = new File("icons//" + "lighton" + ".png");
			Image i = new Image(f1.toURI().toString());
			Mainimg.setImage(i);

		}else if(nameAtion.equals("off")){
			File f1 = new File("icons//" + "lightoff" + ".png");
			Image i = new Image(f1.toURI().toString());
			Mainimg.setImage(i);

		}
		// TODO Auto-generated method stub

	}

	public BorderPane getDeviceobject() {
		return Deviceobject;
	}

	public void setDeviceobject(BorderPane deviceobject) {
		Deviceobject = deviceobject;
	}}
