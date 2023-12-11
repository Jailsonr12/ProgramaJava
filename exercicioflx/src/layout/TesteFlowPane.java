package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane{
	
	public TesteFlowPane() {
		Quardrado q1 = new Quardrado();
		Quardrado q2 = new Quardrado();
		Quardrado q3 = new Quardrado();
		Quardrado q4 = new Quardrado();
		Quardrado q5 = new Quardrado();
		
		setHgap(10.0);
		setVgap(10.0);
		setPadding(new Insets(10));
		
		setOrientation(Orientation.VERTICAL);
		setAlignment(Pos.CENTER_RIGHT);
		
		getChildren().addAll(q1,q2,q3,q4,q5);
		
	}
}
