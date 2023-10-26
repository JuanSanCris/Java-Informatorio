package ParteIIIProgramacionOrientadaAObjetos.ClaseI.EjercicioClase;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Peugeot", 4, Boolean.FALSE, Boolean.TRUE, "100", "0");

        Persona persona = new Persona(12345678l, "Juan", LocalDate.of(1997, 6, 20), vehiculo);

        System.out.println("Nombre de la persona: " + persona.getNombre());
        System.out.println("dni: " + persona.getDni());
        System.out.println("fecha de nacimiento: " + persona.getFechaDeNacimiento());
        System.out.println("marca del vehiculo de la persona: " + persona.getVehiculo().getMarca());

        persona.getVehiculo().ArrancarVehiculo();

        persona.getVehiculo().setEstadoAlarma(false);

        persona.getVehiculo().ArrancarVehiculo();
    }
}
