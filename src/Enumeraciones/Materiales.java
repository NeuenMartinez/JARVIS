/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

/**
 *
 * @author MegaTecnologia
 */
public enum Materiales {

    CARBONO(20, "Carbono"), ACERO(40, "Acero"), TITANIO(80, "Titanio"), TUNGSTENO(100, "Tugsteno");

    private Integer dureza;
    private String nombre;

    private Materiales(Integer dureza, String nombre) {

        this.dureza = dureza;
        this.nombre = nombre;

    }

    public Integer getDureza() {
        return dureza;
    }

    public void setDureza(Integer dureza) {
        this.dureza = dureza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materiales{" + " Material: " + nombre + " Dureza: " + dureza + '}';
    }

    
}
