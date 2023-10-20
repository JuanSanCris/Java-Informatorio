package ParteIProgramacionImperativa.tiposDeDatos;
public class ByteLongShortAndWidth {
    public static void main(String[] args) {
        // Clase Wrapper: Es un tipo de dato compuesto que permite acceder a información
        // sobre los tipos de datos primitivos. Cada tipo de dato primitivo, al escribirse con mayuscula
        // se "convierte" en una clase, con sus propios metodos y atributos.

        // Tipo byte, 8 bits.
        System.out.println("El tipo de dato byte admite valores desde: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);

        byte numerito = Byte.MIN_VALUE;

        System.out.println(numerito);
        // Tipo Short, 16 bits.
        System.out.println("El tipo de dato short admite valores desde: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);

        short numerito1 = Short.MIN_VALUE;
        System.out.println(numerito1);

        // Tipo Int, 32 bits
        System.out.println("El tipo de dato int admite valores desde: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);

        int numerito2 = Integer.MIN_VALUE;
        System.out.println(numerito2);

        // Tipo Long, 64 bits
        System.out.println("El tipo de dato long admite valores desde: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        long numerito3 = 2345114123132151L;
        System.out.println(numerito3);        

    }
}
