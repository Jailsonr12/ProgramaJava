package exercicioflx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Wizard extends Application {

	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {

		janela = primaryStage;
		criarPasso1();
		criarPasso2();
		criarPasso3();
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}

	private void criarPasso1() {

		Label labelTitle = new Label("Passo 1");
		Button proximaPasso = new Button("Ir p/ Passo 2 >>");
		proximaPasso.setOnAction(e -> {
			janela.setScene(passo2);
		});
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(labelTitle);
		box.getChildren().add(proximaPasso);

		VBox conteudo = new VBox();
		conteudo.setAlignment(Pos.CENTER);
		conteudo.getChildren().add(labelTitle);
		conteudo.getChildren().add(box);

		passo1 = new Scene(conteudo, 400, 400);
	}

	private void criarPasso2() {
		Label labelTitle = new Label("Passo 2");
		Button passoAnterios = new Button("<< Voltar para passo 1");
		Button proximaPasso = new Button("Ir p/ Passo 3 >>");

		passoAnterios.setOnAction(e -> {
			janela.setScene(passo1);
		});

		proximaPasso.setOnAction(e -> {
			janela.setScene(passo3);
		});

		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterios);
		box.getChildren().add(proximaPasso);

		VBox conteudo = new VBox();
		conteudo.setAlignment(Pos.CENTER);
		conteudo.getChildren().add(labelTitle);
		conteudo.getChildren().add(box);

		passo2 = new Scene(conteudo, 400, 400);
	}

	private void criarPasso3() {
		Label labelTitle = new Label("Passo 3");
		Button passoAnterios = new Button("<< Voltar para passo 2");
		passoAnterios.setOnAction(ee -> {
			janela.setScene(passo2);
		});
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterios);

		VBox conteudo = new VBox();
		conteudo.setAlignment(Pos.CENTER);
		conteudo.getChildren().add(labelTitle);
		conteudo.getChildren().add(box);

		passo3 = new Scene(conteudo, 400, 400);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
