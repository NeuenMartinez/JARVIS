package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Armadura {

    private final String colorPrimario = "Rojo";
    private final String colorSecundario = "Amarillo";
    private Integer Energia = 10000;
    private Integer Salud = 100;
    private Integer Resistencia;
    private Guante guanteTraje;
    private Bota botaTraje;
    private Consola consolaTraje;
    private Sintetizador sintetizadorTraje;

    public Armadura() {
    }

    public Armadura(Integer Resistencia, Guante guanteTraje, Bota botaTraje, Consola consolaTraje, Sintetizador sintetizadorTraje) {
        this.Resistencia = Resistencia;
        this.guanteTraje = guanteTraje;
        this.botaTraje = botaTraje;
        this.consolaTraje = consolaTraje;
        this.sintetizadorTraje = sintetizadorTraje;
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

    public Integer getResistencia() {
        return Resistencia;
    }

    public void setResistencia(Integer Resistencia) {
        this.Resistencia = Resistencia;
    }

    public Guante getGuanteTraje() {
        return guanteTraje;
    }

    public void setGuanteTraje(Guante guanteTraje) {
        this.guanteTraje = guanteTraje;
    }

    public Bota getBotaTraje() {
        return botaTraje;
    }

    public void setBotaTraje(Bota botaTraje) {
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
        return "Armadura{" + "colorPrimario: " + colorPrimario + ", colorSecundario: " + colorSecundario + ", Energia =" + Energia + ", Salud =" + Salud + ", Resistencia =" + Resistencia + ", guanteTraje =" + guanteTraje + ", botaTraje =" + botaTraje + ", consolaTraje =" + consolaTraje + ", sintetizadorTraje =" + sintetizadorTraje + '}';
    }
    
    
    
    
}
