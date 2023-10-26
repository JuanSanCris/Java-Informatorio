package ParteIIIProgramacionOrientadaAObjetos.ClaseII.ReproductorMusical.domain;

public class Cancion extends Discografia implements ElementoMusical{

    private String duracion;

    private Album album;

    @Override
    public void reproducirMusica(){
        System.out.println("Reproduciendo cancion: " + this.nombre);
    }

    @Override
    public void mostrarNombreEnMinuscula(){
        System.out.println(this.nombre.toLowerCase());
    }

    Cancion(){}

    Cancion(String nombre, String duracion, Album album){
        this.nombre = nombre;
        this.duracion = duracion;
        this.album = album;
    }

    public String getDuracion(){
        return this.duracion;
    }

    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    public Album getAlbum(){
        return this.album;
    }

    public void setAlbum(Album album){
        this.album = album;
    }
}


