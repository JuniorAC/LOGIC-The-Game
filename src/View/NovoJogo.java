package View;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class NovoJogo implements TelaStrategy {
    private ExecutarAcoes executor;

    public NovoJogo(ExecutarAcoes executor){
        this.executor = executor;
    }


    @Override
    public Pane gerarTela() {
        Pane painel = new Pane();


        //criação dos elementos
        Label lbl = new Label ("LOGIC: \nThe Game");
        TextField txtApelido = new TextField("Digite o Apelido");
        Button btnComecar = new Button("Começar");

        //imagem do logo
        Image icon = new Image("icon.jpg");
        ImageView imageView = new ImageView(icon);



        //Estilo
        btnComecar.getStyleClass().add("botao");
        lbl.getStyleClass().add("estiloTexto");


        //tamanho
        btnComecar.setPrefSize(200,40);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        txtApelido.setPrefSize(300,30);

        //posicao
        lbl.relocate(400,75);
        imageView.relocate(300,75);
        btnComecar.relocate(300,250);
        txtApelido.relocate(250,200);

        painel.getChildren().addAll(lbl,btnComecar, imageView, txtApelido);




        return painel;
    }
}
