package ParteIProgramacionImperativa.operandosYOperadores;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        // la predecendia entre operaciones matematicas es la misma que en la matematica tradicional.

        int operacion = 5 + 10 * 10;
        System.out.println(operacion);

        // operador ternario: recibe tres datos, y decide basado en el valor del primero (booleano)

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero del 0 al 15");

        int numero = input.nextInt();

        int cualNumero = (numero - 10 < 5) ? 5:10;

        System.out.println(cualNumero);

        input.close();
    }
}
