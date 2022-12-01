package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Bota {

    private Integer consumEnrgia = 2;
    private Boolean dañado = false;
    private Boolean destruido = false;

    public Bota() {
    }

    public Integer getConsumEnrgia() {
        return consumEnrgia;
    }

    public void setConsumEnrgia(Integer consumEnrgia) {
        this.consumEnrgia = consumEnrgia;
    }

    public Boolean getDañado() {
        return dañado;
    }

    public void setDañado(Boolean dañado) {
        this.dañado = dañado;
    }

    public Boolean getDestruido() {
        return destruido;
    }

    public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }

    @Override
    public String toString() {
        return "Bota{" + "dañado =" + dañado + ", destruido =" + destruido + '}';
    }
    
    
}
