package javaJediProblems.GuiaUno.jediKnight;
import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en dolares");
        final double cotizacionDolar = 347.50;

        String cantidadDolaresString = myObj.nextLine();

        double cantidadEnDolares = Double.parseDouble(cantidadDolaresString);

        System.out.println("U$D" + cantidadEnDolares + " = AR$" + (cantidadEnDolares*cotizacionDolar));
    }
}
