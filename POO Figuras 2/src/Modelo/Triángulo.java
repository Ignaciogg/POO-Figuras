package Modelo;

public class Triángulo extends Polígono{

    private float lado1;
    private float lado2;
    private float lado3;
    float p = (lado1+lado2+lado3)/2;

    public Triángulo(float lado1, float lado2, float lado3) {
    	this.numLados = 3;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {return lado1;}

    public void setLado1(float lado1) {this.lado1 = lado1;}

    public float getLado2() {return lado2;}

    public void setLado2(float lado2) {this.lado2 = lado2;}

    public float getLado3() {return lado3;}

    public void setLado3(float lado3) {this.lado3 = lado3;}

    public float getArea() {
    	return (float) Math.sqrt((p*(p-lado1)* (p-lado2)* (p-lado3)));
    }

    @Override
    public float area() {
    	float p = (lado1+lado2+lado3)/2;
        return (float) Math.sqrt((p*(p-lado1)* (p-lado2)* (p-lado3)));
    }

    @Override
    public float perimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public String toString() {
    	if(lado1>0 && lado2>0 && lado3>0){
    		 return "Triangulo:\n" + "Lado1: " + lado1 + ", Lado2: " + lado2 + ", Lado3: " + lado3 +
    	                "\nPerímetro: " + perimetro() +
    	                "\nÁrea: " + area();
    	} else
    		if(lado1<=0)
    			return "Error en el valor 'Lado1' del Tríangulo";
    		else
    			if(lado2<=0)
    				return "Error en el valor 'Lado2' del Tríangulo";
    	return "Error en el valor 'Lado3' del Tríangulo";

    }

}