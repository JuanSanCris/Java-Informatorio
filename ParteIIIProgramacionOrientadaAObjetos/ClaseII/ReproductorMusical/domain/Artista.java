package ParteIIIProgramacionOrientadaAObjetos.ClaseII.ReproductorMusical.domain;

public class Artista extends Discografia{
    

    private String generoMusical;

    Artista(){}

    Artista(String nombre, String generoMusical){
        this.nombre = nombre;
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarNombreEnMayuscula(){
        System.out.println("Metodo para artista");
        super.mostrarNombreEnMayuscula();
    }

    @Override
    public void mostrarNombreEnMinuscula(){
        System.out.println(this.nombre.toLowerCase());
    }

    public String getGeneroMusical(){
        return this.generoMusical;
    }

    public void setGeneroMusical(String generoMusical){
        this.generoMusical = generoMusical;
    }


}
