public abstract class Pol�gono extends Figura{

	//Declaraci�n
	protected int numLados;

	//Constructor
	public void Poligono (int numLados) {

		this.numLados = numLados;

	}

	//Getters y Setters
	public int getNumLados(){return numLados;}

	public void setNumLados(int numLados) {this.numLados = numLados;}

}