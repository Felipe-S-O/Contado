package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// crinado botaão
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");

		// pegando active do botão e execuando a função
		botaoA.setOnAction(e -> System.out.print("A"));
		// pegando active do botão e execuando a função
		botaoB.setOnAction(e -> System.out.print("B"));

		// pegando active do botão e execuando a função sai da apricação
		botaoC.setOnAction(e -> System.exit(0));

		// crinado um box
		HBox box = new HBox();
		// centralizando botão no layaut
		box.setAlignment(Pos.CENTER);
		// definindo espaçamento dos botões
		box.setSpacing(10);
		// adicionadno botão no box
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);

		// crinado layaut
		Scene unicaCena = new Scene(box, 150, 100);

		// camando layaut
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
