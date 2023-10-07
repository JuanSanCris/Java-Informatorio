package ProgramacionEstructurada.ClaseTres;

public class ejercicioTresArrays {
    public static void main(String[] args) {
        int myArray[] = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < myArray.length; i++){
            if (num1 < myArray[i]){
                num2 = num1; 
                num1 = myArray[i];
            } else if (num2 < myArray[i]){
               num2 = myArray[i];
            }
        }

        System.out.println(num1 + " " + num2);

    }
}
