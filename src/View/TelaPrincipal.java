package View;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class TelaPrincipal extends Application implements EventHandler<ActionEvent>, ExecutarAcoes {

    private TelaStrategy menuPrincipal = new MenuPrincipal(this);
    private TelaStrategy novoJogo = new NovoJogo(this);
    private TelaStrategy continueTela = new ContinueTela(this);

    private Map<String, TelaStrategy> mapaTela = new HashMap<>();

    private void gerarMapaTela() {
        mapaTela.put("MenuPrincipal", menuPrincipal);
        mapaTela.put("NovoJogo", novoJogo);
        mapaTela.put("ContinueTela", continueTela);
    }

    private BorderPane bp = new BorderPane();


    @Override
    public void start(Stage stage) throws Exception {


        Scene scn = new Scene(bp, 800, 600);
        stage.setResizable(false);
        scn.getStylesheets().add("DesignTela.css");

        gerarMapaTela();

        //tela de inicio
        bp.setCenter(menuPrincipal.gerarTela());

        //Icone da janela
        Image icon = new Image("icon.jpg");
        stage.getIcons().add(icon);

        stage.setScene(scn);
        stage.setTitle("LOGIC: The Game");
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(TelaPrincipal.class, args);
    }

    @Override
    public void handle(ActionEvent event) {
//        EventTarget target = event.getTarget();
//        if (target instanceof MenuItem){
//            if(((MenuItem) target).getText().equals("Troca Usuário")){
//                bp.setCenter(login.gerarTela());
//            }else{
//                Platform.exit();
//            }
//        }
//    }
    }

    public void executarAcao(String acao) {

        if (acao.equals("Sair")) {

            Platform.exit();
        } else if (acao.equals("Configuracoes")) {
            System.out.println("aqui");
        }

        TelaStrategy tela = mapaTela.get(acao);
        if (tela != null) {
            bp.setCenter(tela.gerarTela());
        }
    }
}