package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CertezaSair {

    static boolean resposta;

    public static boolean display(){

            Stage tela = new Stage();
            tela.initModality(Modality.APPLICATION_MODAL);

            Label lbl = new Label ("Tem certeza que deseja sair?");
            Button btnSim = new Button ("Sim");
            Button btnNao = new Button ("Não");

            btnSim.getStyleClass().add("botao");
            btnNao.getStyleClass().add("botao");
            lbl.getStyleClass().add("estiloTexto");

            btnSim.relocate(150,75);
            btnNao.relocate(150,125);
            lbl.relocate(15,20);

            Pane lay = new Pane();
            lay.getChildren().addAll(lbl, btnNao,btnSim);

        btnSim.setOnAction((e)->{
            resposta=true;
            tela.close();
        });

        btnNao.setOnAction((e)->{
            resposta=false;
            tela.close();
        });

            Scene cena = new Scene (lay,350,200);
            cena.getStylesheets().add("DesignTela.css");
            tela.setScene(cena);
            tela.showAndWait();

            return resposta;
    }


}
