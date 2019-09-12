package GuiComnonets;


import java.io.File;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class switchButton extends Label
{
	 Button switchBtn;
    private SimpleBooleanProperty switchedOn = new SimpleBooleanProperty(true);

    public switchButton()
    {
    	File f1 = new File("icons/logo.png");
		Image i = new Image(f1.toURI().toString());
		final ImageView selectedImage9 = new ImageView();

		selectedImage9.setImage(i);
		selectedImage9.setFitHeight(45);
		selectedImage9.setFitWidth(40);
         switchBtn = new Button("");

        setPrefWidth(121);
        switchBtn.setGraphic(selectedImage9);
        switchBtn.setPrefWidth(60);


        switchBtn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t)
            {
                switchedOn.set(!switchedOn.get());
            }
        });

        setGraphic(switchBtn);

        switchedOn.addListener(new ChangeListener<Boolean>()
        {
            @Override
            public void changed(ObservableValue<? extends Boolean> ov,
                Boolean t, Boolean t1)
            {
                if (t1)
                {
                	setOn();
                }
                else
                {
                 setoff();
                }
            }
        });

        switchedOn.set(false);
    }

    public SimpleBooleanProperty switchOnProperty() { return switchedOn; }

	public SimpleBooleanProperty getSwitchedOn() {
		return switchedOn;
	}

	public void setSwitchedOn(SimpleBooleanProperty switchedOn) {
		this.switchedOn = switchedOn;
	}
	public void setOn(){
	    setText("    ON    ");

        setStyle(" "

	+ " -fx-background-color: radial-gradient(focus-angle 0deg, focus-distance 10%,"
        		+ "     center 50% 50%, "
        		+ "     radius 100%, "
        		+ "    transparent 10%, "
        		+ "    #339900 82%, "
        		+ "#339900 83%, "
        		+ "rgb(226, 226, 226) 86%, "
        		+ "rgb(238, 238, 238) 87%, "
        		+ "rgb(187, 187, 187) 100%)"
        		+ ";"

        		);

       setContentDisplay(ContentDisplay.RIGHT);
	}
	public void setoff(){
		   setText("  OFF");
           setStyle(" "
            		+ " -fx-background-color: radial-gradient(focus-angle 0deg, focus-distance 10%,"
           		+ "     center 50% 50%, "
           		+ "     radius 100%, "
           		+ "    transparent 10%, "
           		+ "    rgb(255, 0, 0) 82%, "
           		+ "rgb(255, 0, 0) 83%, "
           		+ "rgb(226, 226, 226) 86%, "
           		+ "rgb(238, 238, 238) 87%, "
           		+ "rgb(187, 187, 187) 100%)"
           		+ ";"

           		);

     setContentDisplay(ContentDisplay.LEFT);
	}
}
