package Entidades;

import Enumeraciones.Materiales;
import java.util.Arrays;

/**
 *
 * @author NeuenMartinez
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private Integer Energia = 10000;
    private Integer Salud = 100;
    private Materiales Resistencia;
    private Guante guanteTraje[] = new Guante[2];
    private Bota botaTraje[] = new Bota[2];
    private Consola consolaTraje = new Consola();
    private Sintetizador sintetizadorTraje = new Sintetizador();

    public Armadura() {
        
    }

    public Armadura(Materiales Resistencia, Guante[] guanteTraje, Bota[] botaTraje, Consola consolaTraje, Sintetizador sintetizadorTraje) {
        this.Resistencia = Resistencia;
        this.guanteTraje = guanteTraje;
        this.botaTraje = botaTraje;
        this.consolaTraje = consolaTraje;
        this.sintetizadorTraje = sintetizadorTraje;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    
    public Integer getEnergia() {
        return Energia;
    }

    public void setEnergia(Integer Energia) {
        this.Energia = Energia;
    }

    public Integer getSalud() {
        return Salud;
    }

    public void setSalud(Integer Salud) {
        this.Salud = Salud;
    }

    public Materiales getResistencia() {
        return Resistencia;
    }

    public void setResistencia(Materiales Resistencia) {
        this.Resistencia = Resistencia;
    }

    public Guante[] getGuanteTraje() {
        return guanteTraje;
    }

    public void setGuanteTraje(Guante[] guanteTraje) {
        this.guanteTraje = guanteTraje;
    }

    public Bota[] getBotaTraje() {
        return botaTraje;
    }

    public void setBotaTraje(Bota[] botaTraje) {
        this.botaTraje = botaTraje;
    }

    public Consola getConsolaTraje() {
        return consolaTraje;
    }

    public void setConsolaTraje(Consola consolaTraje) {
        this.consolaTraje = consolaTraje;
    }

    public Sintetizador getSintetizadorTraje() {
        return sintetizadorTraje;
    }

    public void setSintetizadorTraje(Sintetizador sintetizadorTraje) {
        this.sintetizadorTraje = sintetizadorTraje;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario: " + colorPrimario + ", colorSecundario: " + colorSecundario + ", Energia =" + Energia + ", Salud =" + Salud + ", Resistencia =" + Resistencia + ", guanteTraje =" + Arrays.toString(guanteTraje) + ", botaTraje =" + Arrays.toString(botaTraje) + ", consolaTraje =" + consolaTraje + ", sintetizadorTraje =" + sintetizadorTraje + '}';
    }
    
    
    
    
}
