package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import model.MiMail;
import view.MiVentanaMail;

public class ControladorVentanaMail implements ActionListener {

	MiVentanaMail ventanaControlada;
	Sistema sistema;

	public ControladorVentanaMail(Sistema s) {

		this.sistema=s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand() == "Enviar") {
			String destino = ventanaControlada.email.getText();
			String asunto = ventanaControlada.asunto.getText();
			String mensaje = ventanaControlada.mensaje.getText();

			// para añadir el año actual al mail usamos un objeto de clase Calendar
			// como Calendar tiene el constructor privado o protegido (es Syngleton) tengo que usar el getInstance en lugar de hacer un new.
			Calendar c = Calendar.getInstance();

			// Creando un nuevo mensaje
			MiMail m = new MiMail(destino, asunto, mensaje, c.get(Calendar.YEAR));
			//Añadirlo a la lista de la clase Sistema
			sistema.listaMensajes.add(m);
		} else {
			// muestra en consola la lista de mensajes (usa el método toString de MiMail)
			System.out.println(sistema.listaMensajes);
			// actualizo el fichero, en lugar de lo que tenía, que guarde todos los mensajes
			sistema.cf.guardarMensajes(sistema.listaMensajes);
		}
	}

	public void setVentanaControlada(MiVentanaMail vMail) {

		ventanaControlada = vMail;
	}
}