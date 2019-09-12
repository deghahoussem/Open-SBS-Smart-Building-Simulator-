package GuiComnonets;

import java.awt.List;
import java.io.File;

import GIS.Ontology.OutPutIindividual;

import javafx.animation.TranslateTransition;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import javafx.util.Duration;
import application.*;
public class NormalDevice implements OutPutIindividual {
	private BorderPane Deviceobject;
	File f1= new File("icons//" + "on" + ".png");
	 ImageView Topimg;
	 ImageView Mainimg ;
	 List val = new  List();
	 String id;
	  ContextMenu cm = new ContextMenu();
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
		//System.out.println(x[0]);
		//System.out.print(x[1]);
		return x;
	}

	public NormalDevice(String NameDevice, String DviceType, String Position, int width, int height ,Main Main) {


		id = NameDevice;
		Deviceobject = new BorderPane();

		 MenuItem menuItem1 = new MenuItem("On");
	        MenuItem menuItem2 = new MenuItem("Off");

	        cm.getItems().addAll(menuItem1, menuItem2);


	        Deviceobject.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent e) {
	                if (e.getButton() == MouseButton.SECONDARY) {
	                    cm.show(Deviceobject, e.getScreenX(), e.getScreenY());
	                }
	            }
	        });

	        cm.setOnAction(new EventHandler<ActionEvent>() {

	            public void handle(ActionEvent event) {

	                        if(((MenuItem)event.getTarget()).getText().equals("On")){
	                        	Main.Turn_On_Off(id, "on");
	                        	System.out.println("id = "+id + "   | state = on");
	                        	File f1 = new File("icons//" + "on" + ".png");
	                			Image i = new Image(f1.toURI().toString());
	                			Topimg.setImage(i);
	                       }else{
	                        	Main.Turn_On_Off(id, "off");
	                          	System.out.println("id = "+id + "   | state = off");

	                        	File f1 = new File("icons//" + "off" + ".png");
	                			Image i = new Image(f1.toURI().toString());
	                			Topimg.setImage(i);
	                	    };
	            }
	        });
		File f1 = new File("icons//" + "off" + ".png");
		Image i = new Image(f1.toURI().toString());
		  Topimg = new ImageView();
		Topimg.setImage(i);
		Topimg.setFitHeight(10);
		Topimg.setFitWidth(10);

		f1 = new File("icons//" + DviceType + ".png");
		i = new Image(f1.toURI().toString());
		  Mainimg = new ImageView();
		Mainimg.setImage(i);
		Mainimg.setFitHeight(height);
		Mainimg.setFitWidth(width);

		Deviceobject.setTop(Mainimg);
		Deviceobject.setCenter(Topimg);
		Deviceobject.setLayoutX(getPosition(Position)[0]);
		Deviceobject.setLayoutY(getPosition(Position)[1]);




		Deviceobject.setOnMouseDragged(mouseEvent -> {
			Deviceobject.setTranslateX(mouseEvent.getSceneX()- 20- Deviceobject.getLayoutX());
			Deviceobject.setTranslateY(mouseEvent.getSceneY() -75- Deviceobject.getLayoutY());
		});
		// TODO Auto-generated constructor stub
	}

	public void Create(String IdName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete() {
		try {
			Deviceobject.setVisible(false);
			Deviceobject = null;

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
		if(nameAtion.equals("on")){

			Image i = new Image(f1.toURI().toString());
			Topimg.setImage(i);
			}else if(nameAtion.equals("off")){
			File f1 = new File("icons//" + "off" + ".png");
			Image i = new Image(f1.toURI().toString());
			Topimg.setImage(i);
			}
		// TODO Auto-generated method stub
		if(nameAtion.equals("move")){
			TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2.5),Deviceobject);

			translateTransition.setDuration(Duration.seconds(1));
			try{
				System.out.println("Pos = "+val);
				int cc[] = getPosition(val.toString());


			        translateTransition.setToX(cc[0]-Deviceobject.getLayoutX());
	        translateTransition.setToY(cc[1]-Deviceobject.getLayoutY());
			}catch(Exception e){
				System.out.println("omg");
			}
	        translateTransition.play();




		}

	}

	public BorderPane getDeviceobject() {
		return Deviceobject;
	}

	public void setDeviceobject(BorderPane deviceobject) {
		Deviceobject = deviceobject;
	}}
