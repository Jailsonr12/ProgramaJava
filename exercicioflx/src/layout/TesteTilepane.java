package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilepane extends TilePane {

	public TesteTilepane() {
		
		List<Quardrado> quadrado = new ArrayList<>();
		
		for (int i =1 ; i< 10; i++) {
			quadrado.add(new Quardrado(i*10));
				
		}
		
		setPadding(new  Insets(20,10,20,10));
		setHgap(10);
		setVgap(10);
		
		setOrientation(Orientation.VERTICAL);
		setTileAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(quadrado);
		
	}

}
