package ParteIProgramacionImperativa.tiposDeDatos;
public class FloatDouble {
    public static void main(String[] args) {
        
        // float tiene 32 bits

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println(floatMin);
        System.out.println(floatMax);

        float numero = 8.56f; // Java autoconvierte a double cuando ve una coma, por eso hay que poner una F para obligar al Float
        System.out.println(numero);
        // double tiene 64 bits

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println(doubleMin);
        System.out.println(doubleMax);




    }
    
}
