package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quardrado extends Rectangle {

	private static int i = 0;

	private String[] cores = { "#c33c5e", "#39aac6", "#28d79a", "#fb750e", "#6657a8", "#f9060e" };

	public Quardrado() {
		this(100);
	}

	public Quardrado(int tamanho) {
		
		setWidth(tamanho);
		setHeight(tamanho);
		
		setFill(Color.web(cores[i++]));
		if (i == 6)
			i = 0;
	};
}
