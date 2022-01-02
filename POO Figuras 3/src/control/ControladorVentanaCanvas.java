package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import model.MiMail;
import view.MiVentanaCanvas;
import view.MiVentanaMail;

public class ControladorVentanaCanvas implements ActionListener {

	MiVentanaCanvas ventanaControlada;
	Sistema sistema;

	public ControladorVentanaCanvas(Sistema s) {

		this.sistema=s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
/*
		if (e.getActionCommand() == "Borrar") {
			this.getContentPane().add(panelCentral);
			this.setSize(310, 250);
			this.setTitle("Nuevo Canvas");
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		} else {
			// muestra en consola la lista de mensajes (usa el método toString de MiMail)
			System.out.println(sistema.listaMensajes);
			// actualizo el fichero, en lugar de lo que tenía, que guarde todos los mensajes
			sistema.cf.guardarMensajes(sistema.listaMensajes);
		}
		*/
	}


	public void setVentanaControlada(MiVentanaCanvas vCanvas) {
         ventanaControlada = vCanvas;
	}
}