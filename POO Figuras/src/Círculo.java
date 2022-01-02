public class C�rculo extends Figura{

	//Declaraci�n
	private float radio;

	//Constructor
    C�rculo(float radio) {
        this.radio = radio;
    }

    //Getters y Setters
    public float getRadio() {return radio;}

    public void setRadio(float radio) {this.radio = radio;}

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
    	if(radio>0.0){
    		return "C�rculo:\n" + "radio: " + radio +
                    "\nPer�metro: " + perimetro()+
                    "\nArea: " + area();
    	} else
    		return "Valor err�neo en el Radio";

    }

}