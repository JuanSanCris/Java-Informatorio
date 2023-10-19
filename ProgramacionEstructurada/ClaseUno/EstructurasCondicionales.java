package ProgramacionEstructurada.ClaseUno;

public class EstructurasCondicionales {
    public static void main(String[] args) {
        int birthDay = 9;
        int birthMonth = 10;
        int birthYear = 2012;

        int todayDay = 9;
        int todayMonth = 10;
        int todayYear = 2023;
        
        if (todayYear - birthYear < 18 || (todayYear - birthYear == 18 && (birthMonth > todayMonth || (birthMonth == todayMonth && birthDay < todayDay)))){
            System.out.println("You are underage");
        } else {
            if (birthMonth == todayMonth && birthDay == todayDay){
                System.out.println("Happy birthday my friendo");
            }

            System.out.printf("You are %d years old\n", todayYear-birthYear);
        }
        String mensaje;
        switch (birthYear) {
            case 2010, 2012:
                mensaje = "Naciste hace 13 años";
                break;
            case 2000:
                mensaje = "Naciste hace 23 años";
                break;
            default:
                mensaje = "La verdad no me importa cuando naciste";
                break;
        }

        System.out.println(mensaje);
    }

    
}