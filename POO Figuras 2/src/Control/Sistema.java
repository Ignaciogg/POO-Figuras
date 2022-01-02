package Control;

import Modelo.Cuadrado;
import Modelo.Círculo;
import Modelo.Figura;
import Modelo.Triángulo;

public class Sistema {

    public static void main(String[] args) {

        Figura f1 = new Triángulo(3,3,5);
        System.out.println(f1 + "\n");

        Figura f2 = new Cuadrado(7);
        System.out.println(f2+ "\n");

        Figura f3 = new Círculo((float) 5.55);
        System.out.println(f3+ "\n\n");

        compareTo(f1,f2,f3);
	}

    public static void compareTo(Figura f1, Figura f2, Figura f3) {

    	float areas[] = {'0','0','0'};

		float a1 = getArea1(f1);
		float a2 = getArea2(f2);
		float a3 = getArea3(f3);

		if (a1>a2 && a2>a3){
			System.out.println("El área de f1 es mayor que la de f2, la cual es mayor a la de f3.");
			areas[0] = a1;
			areas[1] = a2;
			areas[2] = a3;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f1 + "\n\n" + f2 + "\n\n" + f3);
		}
		else if (a2>a1 && a1>a3){
			System.out.println("El área de f2 es mayor que la de f1, la cual es mayor a la de f3.");
			areas[0] = a2;
			areas[1] = a1;
			areas[2] = a3;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f2 + "\n\n" + f1 + "\n\n" + f3);
		}
		else if (a3>a2 && a2>a1){
			System.out.println("El área de f3 es mayor que la de f2, la cual es mayor a la de f1.");
			areas[0] = a3;
			areas[1] = a2;
			areas[2] = a1;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f3 + "\n\n" + f2 + "\n\n" + f1);
		}
		else if (a1>a3 && a3>a2){
			System.out.println("El área de f1 es mayor que la de f3, la cual es mayor a la de f2.");
			areas[0] = a1;
			areas[1] = a3;
			areas[2] = a2;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f1 + "\n\n" + f3 + "\n\n" + f2);
		}
		else if (a2>a3 && a3>a1){
			System.out.println("El área de f2 es mayor que la de f3, la cual es mayor a la de f1.");
			areas[0] = a2;
			areas[1] = a3;
			areas[2] = a1;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f2 + "\n\n" + f3 + "\n\n" + f1);
		}
		else if (a3>a1 && a1>a2){
			System.out.println("El área de f3 es mayor que la de f1, la cual es mayor a la de f2.");
			areas[0] = a3;
			areas[1] = a1;
			areas[2] = a2;
			System.out.println("El orden de las áreas sería el siguiente: " + areas[0] +", " +
					areas[1] + " y " + areas[2]);
			System.out.println("El vector ordenado quedaría así: \n\n" +
					f3 + "\n\n" + f1 + "\n\n" + f2);
		}

    }

    public static float getArea1(Figura f1) {
    	return (float)f1.area();
    }

    public static float getArea2(Figura f2) {
    	return (float)f2.area();
    }

    public static float getArea3(Figura f3) {
    	return (float)f3.area();
    }
}
