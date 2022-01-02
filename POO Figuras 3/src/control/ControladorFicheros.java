package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;

import model.MiMail;

public class ControladorFicheros {

	// atributo para guardar el fichero
	File fichero;
	//lo que necesito para leer del fichero
	Scanner scLector;
	//lo que necesito para escribir en el fichero
	PrintWriter pwEscritor;

	// constructor p�blico que recibe la ruta donde est� el archivo que voy a leer/escribir
	public ControladorFicheros (String rutaArchivo) {
		// crear el fichero a partir de la ruta pasada
		fichero = new File (rutaArchivo);
		//crear el scanner a partir del fichero creado.
		//primero tengo que crear e importar el FileReader, y para ello tengo que campturar el error de que el fichero no exista
		try {
			scLector = new Scanner (new FileReader(fichero));
			// indico cu�l es el delimitador entre campos de cada linea del fichero
			scLector.useDelimiter(";");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// m�todo que lee del archivo y la devuelve en una lista de mails.
	public Vector <MiMail> leerYCrearMails() {
		// creo el vector donde voy a ir guardando los mails que leo del fichero
		// ser� el resultado, el valor de salida de mi m�todo.
		Vector <MiMail> correos = new Vector<MiMail>();

		while (scLector.hasNextLine()){
			// leo una l�nea de fichero. Todos los elementos que s� que incluye
			String para = scLector.next();
			String asunto = scLector.next();
			String cuerpo = scLector.next();
			int anno = Integer.parseInt(scLector.next());
			scLector.nextLine();

			// creo un nuevo mail con los elementos le�dos de una l�nea del fichero
			correos.add(new MiMail(para,asunto,cuerpo,anno));
		}
		return correos;
	}

	// m�todo que sobreescribe el archivo a partir de una lista de mails.
	public void guardarMensajes(Vector<MiMail> listaMensajes) {
		// creo el PrintWriter capturando el posible error de que no exista (FileNotFoundException)
		try {
			// utilizo el mismo fichero que ten�a desde la construcci�n del objeto, del que leo, para escribir
			pwEscritor = new PrintWriter (fichero);
			// recorro la lista de mensajes y escribo una l�nea por cada mensaje
			for (MiMail correo: listaMensajes) {
				pwEscritor.println(correo); // esto utilizar� el toString de correo
			}
			// Cierro el fichero. Hasta que no cierro el PrintWriter el fichero no se actualiza en el sistema de archivos.
			pwEscritor.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}