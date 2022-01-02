package Modelo;

public class C�rculo extends Figura{

	//Declaraci�n
	private float radio;

	//Constructor
    public C�rculo(float radio) {
        this.radio = radio;
    }

    //Getters y Setters
    public float getRadio() {return radio;}

    public void setRadio(float radio) {this.radio = radio;}

    public float getArea() {
    	return (float) Math.PI * radio * radio;
    }
    //M�todos y toString
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
    		return "C�rculo:\n" + "Radio: " + radio +
                    "\nPer�metro: " + perimetro()+
                    "\n�rea: " + area();
    	} else
    		return "Error en el valor 'Radio' del C�rculo";

    }

}