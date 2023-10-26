package ParteIIIProgramacionOrientadaAObjetos.ClaseI;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre(){
        return this.nombre; // --> this es un puntero que hace referencia a la instancia, al objeto.
    }

    public String getApellido(){
        return this.apellido;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        if (this.nombre == null){
            this.nombre = nombre;
        }
        
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
