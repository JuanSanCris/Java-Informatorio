package ParteIIIProgramacionOrientadaAObjetos.ClaseII.ReproductorMusical.domain;

//import java.util.ArrayList;
import java.time.Year;
import java.util.List;

public class Reproductor {
    public static void main(String[] args) {

        Artista theChainsmokers = new Artista("The Chainsmokers", "EDM");

        Album worldWarJoy = new Album();

        Cancion cancion1 = new Cancion("Takeaway", "2:30", worldWarJoy);
        Cancion cancion2 = new Cancion("The Reaper", "3:30", worldWarJoy);
        Cancion cancion3 = new Cancion("See The Way", "1:30", worldWarJoy);
        Cancion cancion4 = new Cancion("Call you mine", "4:30", worldWarJoy);

        worldWarJoy.setArtista(theChainsmokers);
        worldWarJoy.setAnio(Year.of(2019));
        worldWarJoy.setNombre("World War Joy");
        worldWarJoy.setCanciones(List.of(cancion1, cancion2, cancion3, cancion4));

        for(int i = 0; i <= 5; i++){
            worldWarJoy.reproducirMusica();
        }
    }
}
