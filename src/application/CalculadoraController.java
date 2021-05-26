package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController implements Initializable {
	
	@FXML private TextField txtnumero1;
	@FXML private TextField txtnumero2;
	@FXML private Label lblresult;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
public void actionSuma(ActionEvent event) {
	String hola= "bienvenido";
	
	float number1= Float.valueOf(txtnumero1.getText());
	float number2= Float.valueOf(txtnumero2.getText());
	
	Operaciones op = new Operaciones();
	float suma = op.Suma(number1, number2);
	System.out.println("La suma es: " + suma);

	lblresult.setText(String.valueOf(suma));

}

	
	
}
