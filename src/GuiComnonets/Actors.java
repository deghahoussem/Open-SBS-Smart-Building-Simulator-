package GuiComnonets;

import java.io.File;

import GIS.Ontology.OutPutIindividual;
import javafx.animation.ScaleTransitionBuilder;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Actors implements OutPutIindividual {

	private BorderPane humanobject;

	public Actors(String Namehuman, String humantype, String Position,int w ,int h) {


		Text t = new Text(Namehuman);
		t.setId("ObjectName");
		humanobject = new BorderPane();
		File f1 = new File("icons//" + humantype + ".png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage = new ImageView();
		selectedImage.setImage(i);
		selectedImage.setFitHeight(h);
		selectedImage.setFitWidth(w);

		humanobject.setTop(t);
		humanobject.setCenter(selectedImage);
		humanobject.setLayoutX(getPosition(Position)[0]);
		humanobject.setLayoutY(getPosition(Position)[1]);

		humanobject.setOnMouseDragged(mouseEvent -> {
			humanobject.setTranslateX(mouseEvent.getSceneX() -10-humanobject.getLayoutX());
			humanobject.setTranslateY(mouseEvent.getSceneY() - 100-humanobject.getLayoutY());
		});


	}

	public void Create(String IdName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete() {
		try {
			humanobject.setVisible(false);
			humanobject = null;

			this.finalize();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

	@Override
	public Void SetValuesProperty(String PropertyName, Object PropertyValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void MakeAction(String nameAtion, Object val) {
		System.out.println("Pooooooooooo----------------------------------ooooozzzzz = ");
		System.out.println("Pooooooooooo----------------------------------ooooozzzzz = ");

		if(nameAtion.equals("move")){
			TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2.5),humanobject);

			translateTransition.setDuration(Duration.seconds(1));
			try{
				System.out.println("Pos = "+val);
				int cc[] = getPosition(val.toString());


			        translateTransition.setToX(cc[0]-humanobject.getLayoutX());
	        translateTransition.setToY(cc[1]-humanobject.getLayoutY()-50);
			}catch(Exception e){
				System.out.println("omg");
			}
	        translateTransition.play();




		}
		// TODO Auto-generated method stub

	}

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
		return x;
	}

	public BorderPane getHumanobject() {
		return humanobject;
	}

}
