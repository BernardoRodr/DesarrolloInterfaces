package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label lblPantalla;
    @FXML
    private Button btn1;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn0;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnSuma;

    @FXML
    public void onPulsarBoton1(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"1");
    }

    @FXML
    public void onPulsarBoton0(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"0");
    }

    @FXML
    public void onPulsarBoton7(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"7");
    }

    @FXML
    public void onPulsarBoton6(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"6");
    }

    @FXML
    public void onPulsarBoton9(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"9");
    }

    @FXML
    public void onPulsarBoton8(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"8");
    }

    @FXML
    public void onPulsarBoton3(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"3");
    }

    @FXML
    public void onPulsarBoton2(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"2");
    }

    @FXML
    public void onPulsarBoton5(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"5");
    }

    @FXML
    public void onPulsarBoton4(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+"4");
    }

    @FXML
    public void onPulsarBotonPunto(ActionEvent actionEvent) {
        lblPantalla.setText(lblPantalla.getText()+".");

    }

    @FXML
    public void onPulsarBotonBorrar(ActionEvent actionEvent) {
        lblPantalla.setText("");
    }

    @FXML
    public void Sumar(ActionEvent actionEvent) {
     float numero1 =  lblPantalla.hashCode();

    }
}