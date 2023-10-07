package javaJediProblems.GuiaUno.jediNoob;
//package javaJediProblems.numberOne.jediNoob;

public class ProblemFour {
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 7;

        int suma = num1 + num2;

        boolean divisibilidad = (num1 % num2 == 0);

        System.out.println("El resultado de la suma es " + suma + " y el primer numero" + (divisibilidad ? " ":" no ") + "es divisible por el segundo");
    }
}
