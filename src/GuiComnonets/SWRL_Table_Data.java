package GuiComnonets;

import javafx.beans.property.SimpleStringProperty;

public class SWRL_Table_Data {
	private SimpleStringProperty RuleName;
	private SimpleStringProperty Expression;


	public SWRL_Table_Data(String fName, String lName) {
	        this.RuleName = new SimpleStringProperty(fName);
	        this.Expression = new SimpleStringProperty(lName);

	    }


	public void setRuleName(SimpleStringProperty ruleName) {
		RuleName = ruleName;
	}


	public void setExpression(SimpleStringProperty expression) {
		Expression = expression;
	}


	public SimpleStringProperty getRuleName() {
		return RuleName;
	}


	public SimpleStringProperty getExpression() {
		return Expression;
	}


}
