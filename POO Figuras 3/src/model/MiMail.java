package model;

public class MiMail {

	String para;
	String asunto;
	String mensaje;
	int anno;

	public MiMail(String para, String asunto, String mensaje, int anno) {
		super();
		this.para = para;
		this.asunto = asunto;
		this.mensaje = mensaje;
		this.anno = anno;
	}

	public String toString() {

		return para+";"+asunto+";"+mensaje+";"+anno+";";
	}

}