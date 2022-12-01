package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public class Consola {

    private Integer consumEnrgia = 1;
    private Boolean dañado = false;
    private Boolean destruido = false;

    public Consola() {
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
        return "Consola{" + "dañado =" + dañado + ", destruido =" + destruido + '}';
    }
    
    
}
