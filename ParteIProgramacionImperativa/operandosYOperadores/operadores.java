package ParteIProgramacionImperativa.operandosYOperadores;

public class operadores {
    public static void main(String[] args) {
        // la predecendia entre operaciones matematicas es la misma que en la matematica tradicional.

        int operacion = 5 + 10 * 10;
        System.out.println(operacion);

        // operador ternario: recibe tres datos, y decide basado en el valor del primero (booleano)

        int cualNumero = ('f' == 'g') ? 5:10;

        System.out.println(cualNumero);
    }
}
