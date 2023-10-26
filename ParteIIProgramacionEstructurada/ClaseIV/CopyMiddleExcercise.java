package ParteIIProgramacionEstructurada.ClaseIV;
import java.util.Scanner;

/* Write a program that takes an array and creates a new one which contains all the same elements, except 
for the first and last elements of the original array. Essentially, only copy the middle elements from 
the original array to the new one.  */

public class CopyMiddleExcercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos que desee que tenga el array");
        int arrLength = input.nextInt();
        int[] integerArray = new int[arrLength];
        for (int j = 0; j < arrLength; j++){
            integerArray[j] = j+1;
        }
        int[] newIntegerArray = new int[integerArray.length-2];

        if(integerArray.length <= 2){
            newIntegerArray = null;
        } else {
            for (int i = 0; i < integerArray.length; i++){
                if (i == 0 || i == integerArray.length-1){
                    continue;
                } else{
                    newIntegerArray[i-1] = integerArray[i];
                }
            }
        }

        System.out.print("[");
        for (int element : newIntegerArray) {
            System.out.print(element + " ");
        }

        System.out.println("]\nEl numero de elementos del nuevo array es: "+ newIntegerArray.length);

        input.close();
    }
}
