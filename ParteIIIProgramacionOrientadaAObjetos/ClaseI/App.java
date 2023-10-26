package ParteIIIProgramacionOrientadaAObjetos.ClaseI;

public class App {
    public static void main(String[] args) {
        
        //con new devolvemos la direccion que hace referencia al objeto creado.
        Persona persona = new Persona(); //Instancia de un objeto

        // persona.nombre = "Juan";
        // persona.apellido = "San Cristobal"; // asignacion de valores
        // persona.edad = 26;

        // System.out.println(persona.nombre);
        // System.out.println(persona.apellido); // acceso a la informacion del objeto
        // System.out.println(persona.edad);

        persona.setNombre("juan");
        persona.setApellido("san cristobal");
        persona.setEdad(26);


        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getEdad());

    }
}
