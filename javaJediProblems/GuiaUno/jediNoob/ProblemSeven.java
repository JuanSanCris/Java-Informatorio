package javaJediProblems.GuiaUno.jediNoob;
//package javaJediProblems.numberOne.jediNoob;

public class ProblemSeven {
    public static void main(String[] args) {
        double num1 = 20.96;
        double num2 = 12.54;
        double mult1 = num1 * num2;
        int num3 = 4;
        int num4 = 5;
        int mult2 = num3 * num4;

        System.out.println("Producto de reales: " + mult1 + "\nProducto de enteros: " + mult2);

        System.out.println(mult1 + mult2);

        // al realizar la suma, java arroja un resultado real, porque convierte el entero a real.
    }
}
