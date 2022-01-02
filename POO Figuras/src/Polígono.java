public abstract class Polígono extends Figura{

	//Declaración
	protected int numLados;

	//Constructor
	public void Poligono (int numLados) {

		this.numLados = numLados;

	}

	//Getters y Setters
	public int getNumLados(){return numLados;}

	public void setNumLados(int numLados) {this.numLados = numLados;}

}