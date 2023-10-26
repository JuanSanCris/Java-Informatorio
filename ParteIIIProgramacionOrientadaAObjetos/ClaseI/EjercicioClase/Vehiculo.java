package ParteIIIProgramacionOrientadaAObjetos.ClaseI.EjercicioClase;

public class Vehiculo {
    private String marca;
    private int cantRuedas;
    protected boolean esDeCompetencia;
    protected boolean estaEncendidaLaAlarma;
    private String kmMaximo;
    private String kmMinimo;

    Vehiculo(String marca, int ruedas, boolean competencia, boolean alarma, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantRuedas = ruedas;
        this.esDeCompetencia = competencia;
        this.estaEncendidaLaAlarma = alarma;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }

    Vehiculo(String marca, int ruedas, boolean competencia, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantRuedas = ruedas;
        this.esDeCompetencia = competencia;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }


    public String getMarca(){
        return this.marca;
    }

    public int getCantRuedas(){
        return this.cantRuedas;
    }

    public boolean getEsDeCompetencia(){
        return this.esDeCompetencia;
    }

    public boolean getEstaEncendidaLaAlarma(){
        return this.estaEncendidaLaAlarma;
    }

    public String getKmMaximo(){
        return this.kmMaximo;
    }

    public String getKmMinimo(){
        return this.kmMinimo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCantRuedas(int ruedas){
        this.cantRuedas = ruedas;
    }

    public void setEsDeCompetencia(boolean competencia){
        this.esDeCompetencia = competencia;
    }

    public void setEstadoAlarma(boolean alarma){
        this.estaEncendidaLaAlarma = alarma;
    }

    public void setKmMaximo(String kmMaximo){
        this.kmMaximo = kmMaximo;
    }

    public void setKmMinimo(String kmMinimo){
        this.kmMinimo = kmMinimo;
    }

    public void ArrancarVehiculo(){
        if(estaEncendidaLaAlarma){
            System.out.println("Ruido de alarma");
        } else {
            System.out.println("Arranca el vehiculo");
        }
    }

    

}
