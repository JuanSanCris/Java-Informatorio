package tiposDeDatos;
public class CharBooleanPrimitive {
    public static void main(String[] args) {
        // Char es un caracter, en memoria guarda 16 bits, o del número '\u0000' (0) al '\uffff' (65535)
        
        // se puede definir un char de dos maneras: con comillas simples y el caracter en cuestion

        char letra = 'b';

        //o con su codigo unicode:

        char caracter = '\u002a';
        System.out.println(caracter);

        // El tipo booleano puede guardar True o False, nada muy loco.

        boolean verda = true;


    }
}
