package javaJediProblems.GuiaUno.jediPadawan;

public class EjercicioCuatro {
    public static void main(String[] args) {
        int edadPersonaUno = 20; 
        int edadPersonaDos = 30; 
        int edadPersonaTres = 27; 
        int edadPersonaCuatro = 18;
        
        String nombrePersonaUno = "Pedro";
        String nombrePersonaDos = "Maria";
        String nombrePersonaTres = "Hernan";
        String nombrePersonaCuatro = "Florencia";

        double promedioEdades = (double)(edadPersonaUno + edadPersonaDos + edadPersonaTres + edadPersonaCuatro) / 4;

        System.out.println(nombrePersonaUno + ": " + edadPersonaUno);
        System.out.println(nombrePersonaDos + ": " + edadPersonaDos);
        System.out.println(nombrePersonaTres + ": " + edadPersonaTres);
        System.out.println(nombrePersonaCuatro + ": " + edadPersonaCuatro);

        System.out.println("Promedio de edades: " + promedioEdades);
    }
}
