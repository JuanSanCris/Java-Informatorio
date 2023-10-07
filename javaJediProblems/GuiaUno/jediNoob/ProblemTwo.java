package javaJediProblems.GuiaUno.jediNoob;
//package javaJediProblems.numberOne.jediNoob;

public class ProblemTwo {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 23;
        
        int sum = num1 + num2;

        boolean paridad = (sum % 2 == 0);
        
        System.out.println("El resultado de la suma es " + sum + " y es " + ((paridad)?"par":"impar"));
    }
}
