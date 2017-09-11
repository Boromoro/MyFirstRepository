package KołkoIKrzyzyk;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Racibór on 2017-08-07.
 */
public class Gierka extends Application {

    private static int nKlikniec = 0;
    private static String btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    public void start(Stage primaryStage) throws Exception {

//      Zdefiniowanie układu
        BorderPane layout = new BorderPane();
        layout.getStyleClass().add("border-pane");

//      Zdefiniowanie elementów
        Label label = new Label("Trwa rozgrywka");
        Button btn_1 = new Button();
        Button btn_2 = new Button();
        Button btn_3 = new Button();
        Button btn_4 = new Button();
        Button btn_5 = new Button();
        Button btn_6 = new Button();
        Button btn_7 = new Button();
        Button btn_8 = new Button();
        Button btn_9 = new Button();

//      Zadanie funkcjonalności przyciskom
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_1.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_1.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_1.getText(),btn_2.getText(),btn_3.getText(),btn_4.getText(),
                        btn_7.getText(), btn_5.getText(), btn_9.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_1.getText() );

                    btn_9.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_1.setStyle("-fx-background-color: #ff7f50");
                }else { btn_1.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_2.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_2.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_2.getText(),btn_1.getText(),btn_3.getText(),btn_5.getText(),
                        btn_8.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_2.getText() );

                    btn_1.setDisable(true); btn_9.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_2.setStyle("-fx-background-color: #ff7f50");
                }else { btn_2.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_3.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_3.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_3.getText(),btn_1.getText(),btn_2.getText(),btn_6.getText(),
                        btn_9.getText(), btn_5.getText(), btn_7.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_3.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_9.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_3.setStyle("-fx-background-color: #ff7f50");
                }else { btn_3.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_4.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_4.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_4.getText(),btn_1.getText(),btn_7.getText(),btn_5.getText(),
                        btn_6.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_4.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_9.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_4.setStyle("-fx-background-color: #ff7f50");
                }else { btn_4.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_5.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_5.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_5.getText(), btn_2.getText(), btn_8.getText(), btn_4.getText(),
                        btn_6.getText(), btn_1.getText(), btn_9.getText(), btn_3.getText(), btn_7.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_5.getText());

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_9.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_5.setStyle("-fx-background-color: #ff7f50");
                }else { btn_5.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_6.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_6.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_6.getText(),btn_5.getText(),btn_4.getText(),btn_3.getText(),
                        btn_9.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_6.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_9.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_6.setStyle("-fx-background-color: #ff7f50");
                }else { btn_6.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_7.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_7.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_7.getText(),btn_8.getText(),btn_9.getText(),btn_1.getText(),
                        btn_4.getText(), btn_5.getText(), btn_3.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_7.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_9.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_7.setStyle("-fx-background-color: #ff7f50");
                }else { btn_7.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_8.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_8.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_8.getText(),btn_7.getText(),btn_9.getText(),btn_5.getText(),
                        btn_2.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_8.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_9.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_8.setStyle("-fx-background-color: #ff7f50");
                }else { btn_8.setStyle("-fx-background-color: #a9a9a9");}
            }
        });

        btn_9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                nKlikniec++;
                btn_9.setText(FunkcjonowanieButtonow.wynik(nKlikniec));
                btn_9.setDisable(true);

                if (TypowanieWygranej.wygrana(btn_9.getText(),btn_8.getText(),btn_7.getText(),btn_6.getText(),
                        btn_3.getText(), btn_5.getText(), btn_1.getText()) == 1) {
                    label.setText("Wygrywa kracz o symbolu " + btn_9.getText() );

                    btn_1.setDisable(true); btn_2.setDisable(true); btn_3.setDisable(true); btn_4.setDisable(true);
                    btn_5.setDisable(true); btn_6.setDisable(true); btn_7.setDisable(true); btn_8.setDisable(true);

                }if (nKlikniec % 2 == 0) {
                    btn_9.setStyle("-fx-background-color: #ff7f50");
                }else { btn_9.setStyle("-fx-background-color: #a9a9a9");}
            }
        });


//      Zdefiniowanie Hboxow
        HBox hBox_1 = new HBox();
        HBox hBox_2 = new HBox();
        HBox hBox_3 = new HBox();
        VBox vbox_1 = new VBox();

//      Zdefiniowanie sceny
        Scene scene = new Scene(layout, 300, 315);
        scene.getStylesheets().add("KołkoIKrzyzyk/PrzykładowyStyl.css");

//      Umiejscowienie buttonow i labelki
        hBox_1.getChildren().addAll(btn_1,btn_2,btn_3);
        hBox_2.getChildren().addAll(btn_4,btn_5,btn_6);
        hBox_3.getChildren().addAll(btn_7,btn_8,btn_9);
        vbox_1.getChildren().addAll(hBox_3,label);

//      Umiejscowienie w layoucie
        layout.setTop(hBox_1);
        layout.setCenter(hBox_2);
        layout.setBottom(vbox_1);

//      Wyświetlenie okna
        primaryStage.setTitle("Kółko i krzyżyk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}