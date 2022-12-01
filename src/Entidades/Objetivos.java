package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Objetivos {

    private Integer distancia;
    private Integer resistencia;
    private Boolean hostil;

    public Objetivos() {
    }

    public Objetivos(Integer distancia, Integer resistencia, Boolean hostil) {
        this.distancia = distancia;
        this.resistencia = resistencia;
        this.hostil = hostil;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Boolean getHostil() {
        return hostil;
    }

    public void setHostil(Boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public String toString() {
        return "Objetivos{" + "distancia =" + distancia + ", resistencia =" + resistencia + ", hostil =" + hostil + '}';
    }
    
    
    
}
