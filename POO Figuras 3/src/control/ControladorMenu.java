package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiVentanaCanvas;
import view.MiVentanaMail;
import view.MiVentanaPrincipal;

public class ControladorMenu implements ActionListener{

	MiVentanaPrincipal ventana;
	Sistema sistema;

	public ControladorMenu(Sistema s) {
		this.sistema=s;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		ControladorVentanaMail controlador = new ControladorVentanaMail(sistema);
		ControladorVentanaCanvas controlador2 = new ControladorVentanaCanvas(sistema);
		MiVentanaMail vMail = new MiVentanaMail(controlador);
		MiVentanaCanvas vCanvas = new MiVentanaCanvas(controlador2);
		controlador.setVentanaControlada(vMail);
		controlador2.setVentanaControlada(vCanvas);

		ventana.getContentPane().add(vMail);
		ventana.getContentPane().add(vCanvas);
		vMail.setVisible(true);
		vCanvas.setVisible(true);
	}

	public void setVentanaAControlar(MiVentanaPrincipal v) {
		// TODO Auto-generated method stub
		this.ventana = v;
	}

}