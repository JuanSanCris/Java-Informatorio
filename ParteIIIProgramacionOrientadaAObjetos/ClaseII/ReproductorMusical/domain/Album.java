package ParteIIIProgramacionOrientadaAObjetos.ClaseII.ReproductorMusical.domain;

import java.time.Year;
// import java.util.ArrayList;
import java.util.List;

public class Album extends Discografia implements ElementoMusical{
    private Year anioDeLanzamiento;

    private Artista artista;

    private List<Cancion> canciones;

    @Override
    public void reproducirMusica(){
        for (Cancion cancion : this.canciones) {
            System.out.println("Reproduciendo album " + this.nombre);
            cancion.reproducirMusica();
        }
    }

    @Override
    public void mostrarNombreEnMinuscula(){
        System.out.println(this.nombre.toLowerCase());
    }

    Album(){}

    Album(String nombre, Year anio, Artista artista, List<Cancion> canciones){
        this.nombre = nombre;
        this.anioDeLanzamiento = anio;
        this.artista = artista;
        this.canciones = canciones;
    }

    public Year getAnio(){
        return this.anioDeLanzamiento;
    }

    public void setAnio(Year anio){
        this.anioDeLanzamiento = anio;
    }
    
    
    public Artista getArtista(){
        return this.artista;
    }

    public void setArtista(Artista artista){
        this.artista = artista;
    }
    
    public List<Cancion> getCanciones(){
        return this.canciones;
    }

    public void setCanciones(List<Cancion> canciones){
        this.canciones = canciones;
    }



}
