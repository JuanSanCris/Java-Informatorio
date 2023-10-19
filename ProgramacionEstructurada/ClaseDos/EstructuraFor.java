package ProgramacionEstructurada.ClaseDos;

public class EstructuraFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.print(i);
        }

        System.out.println("");

        for (int i = 10; i > 0; i--){
            System.out.print(i);
            if (i == 1){
                System.out.println("0");
            }
        }
    }
}
