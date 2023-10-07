package javaJediProblems.GuiaUno.jediPadawan;

public class EjercicioCinco {
    public static void main(String[] args) {
        double pesoEnLibras = 179.2358;
        final double equivalenciaLibraKilos = 2.2046226218;
        double pesoEnKilogramos = (1/equivalenciaLibraKilos * pesoEnLibras);
        
        System.out.println(pesoEnKilogramos);
    }
}
