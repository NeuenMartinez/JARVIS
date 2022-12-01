package Servicios;

import Entidades.Armadura;
import Entidades.Objetivos;
import Enumeraciones.Materiales;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class JarvisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Armadura Ironman = new Armadura();
    ArrayList<Objetivos> ListaObjetos = new ArrayList<>();
    boolean exit = false;

    public void crearArmadura() {

        System.out.println("INICIALIZANDO LA CREACION DE LA ARMADURA...");
        System.out.println("Ingresar el color primario: ");
        Ironman.setColorPrimario(leer.next());
        System.out.println("Ingresar el color secundario: ");
        Ironman.setColorSecundario(leer.next());

        do {
            System.out.println("Elija el material del traje: ");
            for (Materiales aux : Materiales.values()) {
                System.out.println(aux);
            }
            try {
                System.out.println("Ingresar el material: ");
                String eleccionMaterial = leer.next();
                for (Materiales aux : Materiales.values()) {
                    if (aux.getNombre().equalsIgnoreCase(eleccionMaterial)) {
                        Ironman.setResistencia(aux);
                        exit = true;
                    }
                }

                if (exit == false) {
                    System.out.println("La opcion ingresada es incorrecta... Intente nuevamente");
                }
            } catch (Exception e) {

                System.out.println("Error del sistema...");
            }
        } while (exit == false);
        
    }

    public void caminar() {
        
        
    }

    public void correr() {

    }

    public void propulsar() {

    }

    public void volar() {

    }

    public void disparar() {

    }

    public void usarConsola() {

    }

    public void usarSintetizador() {

    }

    public void menu() {

    }

    public void mostrarEstado() {

    }

    public void revisarDispositivos() {

    }

    public void radar() {

    }

    public void simulador() {

    }

    public void destruirEnemigos() {

    }

    public void accionesEvasivas() {

    }
}
