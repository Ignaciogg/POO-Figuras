public class Triángulo extends Polígono{
    private float lado1;
    private float lado2;
    private float lado3;

    public Triángulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo:\n" + "lado1: " + lado1 + ", lado2: " + lado2 + ", lado3: " + lado3 +
                "\nPerímetro: " + perimetro() +
                "\nArea: " + area();
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

}