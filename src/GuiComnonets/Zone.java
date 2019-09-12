package GuiComnonets;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;

import GIS.Ontology.OutPutIindividual;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class Zone extends TitledPane implements OutPutIindividual {
	private VBox vboxObjects;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();

	public Zone(String ZoneName, String ZoneImg) {
		super();
		vboxObjects = new VBox();
		vboxObjects.setPadding(new Insets(2, 2, 2, 2));
		vboxObjects.setSpacing(2);
		this.setText(ZoneName);
		this.setContent(new ScrollPane(vboxObjects));
		this.setPadding(new Insets(2, 2, 2, 2));
		File f = new File("icons//" + ZoneImg + ".png");
		Image i = new Image(f.toURI().toString());
		final ImageView selectedImage1f = new ImageView();
		selectedImage1f.setImage(i);
		selectedImage1f.setFitHeight(25);
		selectedImage1f.setFitWidth(25);
		this.setGraphic(selectedImage1f);

	}

	public void AddObjects(String NameObject, String img) {
		Button object = new Button(NameObject);
		File f = new File("icons//" + img + ".png");
		Image i = new Image(f.toURI().toString());
		final ImageView selectedImage3 = new ImageView();
		selectedImage3.setImage(i);
		selectedImage3.setFitHeight(25);
		selectedImage3.setFitWidth(25);
		object.setGraphic(selectedImage3);
		object.setPrefWidth(width / 6.5);
		vboxObjects.getChildren().add(object);
	}

	public void RemoveObject(String NameObjec){
		for(int i =0 ;i<vboxObjects.getChildren().size(); i++ ){
			Button b = (Button) vboxObjects.getChildren().get(i);
			if(b.getText().equals(NameObjec)){
				vboxObjects.getChildren().remove(i);
			}
		}
	}

	@Override
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
		// TODO Auto-generated method stub

	}
}
