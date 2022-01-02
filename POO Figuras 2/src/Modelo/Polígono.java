package Modelo;

public abstract class Polígono extends Figura{

	protected int numLados;

	public void Poligono (int numLados) {
		this.numLados = numLados;
	}

	public int getNumLados(){return numLados;}

	public void setnumLados(int numLados) {this.numLados = numLados;}

}