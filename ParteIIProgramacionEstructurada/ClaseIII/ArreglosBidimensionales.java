package ParteIIProgramacionEstructurada.ClaseIII;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        /* los arreglos bidimensionales funcionana de la misma manera, y la idea de la bidimensionalidad
        se asocia mas con como lo entendemos nosotros como humanos (?), pero otra forma de verlo es como 
        un array cuyos elementos son otros arrays. */

        System.out.print("\nArreglo bidimensional: ");

        int[][] bidimensionalArray = {{1, 666, 3, 9}, {4, 4}, {0}};

        // podemos recorrerlo de dos maneras. la primera es un for comun, donde cada iteracion esta 
        // controlada por el numero del indice.


        for (int i = 0; i < bidimensionalArray.length; i++ ){
            for(int j = 0; j < bidimensionalArray[i].length; j++){
                System.out.printf("\nElemento %d %d: %d", i, j, bidimensionalArray[i][j]);
            }
        }
        System.out.println("");
        // o utilizando la version de for que en vez de iterar sobre numeros, 
        // itera directamente sobre los elementos del array

        for (int i[] : bidimensionalArray) {
            for (int j : i) {
                System.out.print(j);
            }
        }

        System.out.println(bidimensionalArray.length);
        System.out.println(bidimensionalArray[0].length);
    }
}
