package exercicioflx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;

	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else if( contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitle = new Label("Contador");

		labelTitle.getStyleClass().add("titulo");

		Label labelNumero = new Label("0");

		labelNumero.getStyleClass().add("numero");

		Button BotaoDecremento = new Button("-");
		BotaoDecremento.getStyleClass().add("botoes");
		BotaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		Button BotaoIncremento = new Button("+");
		BotaoIncremento.getStyleClass().add("botoes");
		BotaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		HBox boxBotos = new HBox();

		boxBotos.getChildren().add(BotaoDecremento);
		boxBotos.getChildren().add(BotaoIncremento);
		boxBotos.setAlignment(Pos.CENTER);
		boxBotos.setSpacing(10);

		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitle);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotos);
		boxConteudo.setSpacing(10);

		String caminhoDoCss = getClass().getResource("/exercicioflx/Contador.css").toExternalForm();

		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
