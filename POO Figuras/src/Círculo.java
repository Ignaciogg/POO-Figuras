public class Círculo extends Figura{

	//Declaración
	private float radio;

	//Constructor
    Círculo(float radio) {
        this.radio = radio;
    }

    //Getters y Setters
    public float getRadio() {return radio;}

    public void setRadio(float radio) {this.radio = radio;}

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
    	if(radio>0.0){
    		return "Círculo:\n" + "radio: " + radio +
                    "\nPerímetro: " + perimetro()+
                    "\nArea: " + area();
    	} else
    		return "Valor erróneo en el Radio";

    }

}