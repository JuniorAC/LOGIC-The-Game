package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ContinueTela implements TelaStrategy{

    private ExecutarAcoes executorAcoes;

    public ContinueTela(ExecutarAcoes executorAcoes){
        this.executorAcoes = executorAcoes;
    }

    @Override
    public Pane gerarTela() {

        Pane painel = new Pane();

        //criacao dos elementos do menu
        Label lbl = new Label ("LOGIC: \nThe Game");
        Label lblPerfil = new Label ("Selecione o perfil");
        //comboBox
        Button btnComecar = new Button("Começar");


        //imagem do logo
        Image icon = new Image("icon.jpg");
        ImageView imageView = new ImageView(icon);


        //Estilo
        btnComecar.getStyleClass().add("botao");
        lbl.getStyleClass().add("estiloTexto");
        lblPerfil.getStyleClass().add("txt2");



        //tamanho
        btnComecar.setPrefSize(200,40);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);



        //Posicao
        lbl.relocate(400,75);
        lblPerfil.relocate(350,200);
        btnComecar.relocate(300,300);
        imageView.relocate(300,75);

        painel.getChildren().addAll(lbl,lblPerfil,btnComecar, imageView );

        return painel;
    }
}
