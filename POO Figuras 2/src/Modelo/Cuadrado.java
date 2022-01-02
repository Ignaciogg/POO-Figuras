package Modelo;

public class Cuadrado extends PolÌgono {

	//DeclaraciÛn
    private float lado;

    public Cuadrado(float lado) {
    	this.numLados = 4;
        this.lado = lado;
}
    //Getters y Setters
    public float getLado() {return lado;}

    public void setLado(float lado) {this.lado = lado;}

    public float getArea() {
    	return (float) lado * lado;
    }
    //MÈtodos y toString
    @Override
    public float area(){
        return lado * lado;
    }

    @Override
    public float perimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        if(lado>0){
        	return "Cuadrado:"+
        			"\nLado: " + lado +
                    "\nPerimetro: " + perimetro() +
                    "\n¡rea: " + area() ;
        } else
        	return "Error en el valor 'Lado' del Cuadrado";
    }

}