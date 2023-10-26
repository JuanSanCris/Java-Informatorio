package ParteIIIProgramacionOrientadaAObjetos.ClaseII.ReproductorMusical.domain;

public abstract class Discografia{
    protected String nombre;

    public void mostrarNombreEnMayuscula(){
        System.out.println(this.nombre.toUpperCase());
    }

    public abstract void mostrarNombreEnMinuscula();

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
