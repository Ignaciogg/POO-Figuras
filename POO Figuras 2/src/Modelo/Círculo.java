package Modelo;

public class Círculo extends Figura{

	//Declaración
	private float radio;

	//Constructor
    public Círculo(float radio) {
        this.radio = radio;
    }

    //Getters y Setters
    public float getRadio() {return radio;}

    public void setRadio(float radio) {this.radio = radio;}

    public float getArea() {
    	return (float) Math.PI * radio * radio;
    }
    //Métodos y toString
    @Override
    public float area() {
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float perimetro() {
        return (float) (2* Math.PI * radio);
    }

    @Override
    public String toString() {
    	if(radio>0){
    		return "Círculo:\n" + "Radio: " + radio +
                    "\nPerímetro: " + perimetro()+
                    "\nÁrea: " + area();
    	} else
    		return "Error en el valor 'Radio' del Círculo";

    }

}