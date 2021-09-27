package View;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class MenuPrincipal implements TelaStrategy {

   private ExecutarAcoes executorAcoes;

    public MenuPrincipal(ExecutarAcoes executorAcoes){
      this.executorAcoes = executorAcoes;
   }


    @Override
    public Pane gerarTela() {
        Pane painel = new Pane();


        //criacao dos elementos do menu
        Label lbl = new Label ("LOGIC: \nThe Game");
        Button btnNovoJogo = new Button("Novo Jogo");
        Button btnContinuar = new Button("Continuar");
        Button btnConfiguracoes = new Button("configurações");
        Button btnSair = new Button("Sair");


        //imagem do logo
        Image icon = new Image("icon.jpg");
        ImageView imageView = new ImageView(icon);


        //Estilo
        btnNovoJogo.getStyleClass().add("botao");
        btnContinuar.getStyleClass().add("botao");
        btnConfiguracoes.getStyleClass().add("botao");
        btnSair.getStyleClass().add("botao");
        lbl.getStyleClass().add("estiloTexto");



        //tamanho
        btnNovoJogo.setPrefSize(200,40);
        btnContinuar.setPrefSize(200,40);
        btnConfiguracoes.setPrefSize(200,40);
        btnSair.setPrefSize(200,40);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        //Posicao
        lbl.relocate(400,75);
        btnNovoJogo.relocate(300,200);
        btnContinuar.relocate(300,250);
        btnConfiguracoes.relocate(300,300);
        btnSair.relocate(300, 350);
        imageView.relocate(300,75);



        painel.getChildren().addAll(lbl,btnNovoJogo,btnContinuar,btnConfiguracoes,btnSair, imageView);

        btnNovoJogo.setOnAction((e)->{
            executorAcoes.executarAcao("NovoJogo");
        });

        btnContinuar.setOnAction((e)->{
            executorAcoes.executarAcao("ContinueTela");
        });

        btnConfiguracoes.setOnAction((e)->{
            executorAcoes.executarAcao("Configuracoes");
        });

        btnSair.setOnAction((e)-> {
            if (CertezaSair.display() == true){
                Platform.exit();
            }
        });





        return painel;
    }


}
