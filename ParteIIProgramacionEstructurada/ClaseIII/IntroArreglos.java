package ParteIIProgramacionEstructurada.ClaseIII;

public class IntroArreglos {
    public static void main(String[] args) {
        
        /* aparece el operador unario 'new', que devuelve una direccion a un espacio de memoria.
        que se utiliza cuando buscamos crear un array vacio. en caso de que querer asignarle valores
        predeterminados al array, basta con escribir los valores entre llaves */ 
        
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("[" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + "]");

        System.out.println("");

        int[] arr2 = new int[5];

        System.out.print("[" + arr2[0] + ", " + arr2[1] + ", " + arr2[2] + ", " + arr2[3] + ", " + arr2[4] + "]");

    }

}
