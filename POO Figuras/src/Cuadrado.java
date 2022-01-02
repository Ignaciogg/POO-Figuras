public class Cuadrado extends Pol�gono {

	//Declaraci�n
    private float lado;

    //Constructor
    public Cuadrado(float lado) {

        this.lado = lado;
    }

    //Getters y Setters
    public float getLado() {return lado;}

    public void setLado(float lado) {this.lado = lado;}

    //M�todos y toString
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
        return "Cuadrado:"+
                "\nlado: " + lado +
                "\nPerimetro: " + perimetro() +
                "\nArea: " + area() ;
    }
}