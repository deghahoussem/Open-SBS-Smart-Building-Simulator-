package MainPanes;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;

public class ShowOntology extends Tab{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	private TextArea TextArea = new TextArea();

	public TextArea getTextArea() {
		return TextArea;
	}
	public void setTextArea(TextArea textArea) {
		TextArea = textArea;

	}
	public ShowOntology() {
		super("Show Ontoogy");

		TextArea.setPrefSize(width/3*2, height/2);

		this.setContent(TextArea);
	}
}
