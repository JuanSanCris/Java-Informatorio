package tiposDeDatos;

public class Conversiones {
    public static void main(String[] args) {
        // Existen tres tipos de conversiones en Java: promocion, contraccion y conversion implicita

        // promocion: transforma un dato de un tipo a otro con el mismo o mayor espacio de memoria para almacenarlo.

        int valor = 5; 
        
        // en este caso, 5 ingresa y es automaticamente 'convertido' por promocion a un int, 
        // y como valor es una variable int, entonces la asignación es correcta.

        // contraccion: transforma un dato a un tipo de menor espacio de memoria, con la consecuente perdida de info.

        int valor2 = (int)5.50f; //cast
    
        // es un 'casteo' o 'casting'. Toma la parte que le interesa del valor recibido.

        // conversion implicita: se da cuando se combinana dos operandos de tipos distintos. 

        double suma = 10 + 4.501d;
        System.out.println(suma);

        // aca lo que ocurre es que al sumar un int y un double, Java lo 'convierte' en double automaticamente.
        // predomina el que tiene mayor precision.
    }

}
