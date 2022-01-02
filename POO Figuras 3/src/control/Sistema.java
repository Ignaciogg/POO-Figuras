package control;

import view.MiVentanaPrincipal;
import model.MiMail;
import java.util.Vector;

public class Sistema {

	Vector <MiMail> listaMensajes = new Vector <MiMail>();
	// necesito un controlador de ficheros
	ControladorFicheros cf;

	public static void main(String[] args) {

		Sistema s = new Sistema ();

		//creo el controlador de ficheros, indicando la ruta. En este caso está en la misma ruta donde estamos, por eso ponemos .
		// y ponemos \\ para que java entienda el simbolo especial \
		s.cf = new ControladorFicheros (".\\email.txt");
		//leemos la lista de mensaje a partir de lo almacenado en el fichero.
		s.listaMensajes = s.cf.leerYCrearMails();

		ControladorMenu controlador = new ControladorMenu (s);
		ControladorMenu controlador2 = new ControladorMenu (s);
		MiVentanaPrincipal miV = new MiVentanaPrincipal (controlador, controlador2);

		controlador.setVentanaAControlar(miV);
		controlador2.setVentanaAControlar(miV);
		miV.setVisible(true);
	}
}