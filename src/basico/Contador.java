package basico;

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
	
	//metodo de toca a cor do numero e converte interiro para String
	private void atualizarLabelNumero(Label label) {
		//convertendo inteiro para String
		label.setText(Integer.toString(contador));
		
		//removendo as cores do label para adiciona outra
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		//cndição para troca de cor
		if(contador > 0) {
			 label.getStyleClass().add("verde");
		 }else if(contador < 0){
			 label.getStyleClass().add("vermelho");
		 }
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		// importando arquivo css para modifica o labelNumero
		labelTitulo.getStyleClass().add("titulo");
		Label labelNumero = new Label("0");
		// importando arquivo css para modifica o labelNumero
		labelNumero.getStyleClass().add("numero");

		Button botaoDecremento = new Button("-");
		// importando arquivo css para modifica botão decremento
		botaoDecremento.getStyleClass().add("botoesD");
		// adicionado uma função no botão e adicionano do labelNumero
		botaoDecremento.setOnAction(e -> {
			contador--;
			 atualizarLabelNumero(labelNumero);
		});
		Button botaoIncremento = new Button("+");
		// importando arquivo css para modifica botão incremento
		botaoIncremento.getStyleClass().add("botoesI");
		// adicionado uma função no botão e adicionano do labelNumero
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxConteudo = new VBox();
		// importando arquivo css para modifica o boxConteudo
		boxConteudo.getStyleClass().add("conteudo");

		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		// crindo caminho do css
		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();

		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		// adicionando arquivo css no cenario principal
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		// adicionando fonte por link
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
