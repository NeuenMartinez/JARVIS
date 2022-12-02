package Servicios;

import Entidades.Armadura;
import Entidades.Objetivos;
import Enumeraciones.Materiales;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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

    public void caminar(Objetivos a) {
        Double eleccion = 0d;
        System.out.println("ingrese la distancia a recorrer" + "\n"
                + "distancia maxima:" + a.getDistancia());
        do {
            try {
                eleccion = leer.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero entero valido");
                leer.next();
            }
        } while (eleccion < 0 || eleccion > a.getDistancia());
        int tiempo = CalcularTiempoDistancia(10, eleccion);
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getBotaTraje()[0].getConsumEnrgia() * tiempo * 1));
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getGuanteTraje()[0].getConsumEnrgia() * tiempo * 1));
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getBotaTraje()[i].setDañado(true);
            }
        }
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getGuanteTraje()[i].setDañado(true);
            }
        }
    }

    public void correr(Objetivos a) {
        Double eleccion = 0d;
        System.out.println("ingrese la distancia a recorrer" + "\n"
                + "distancia maxima:" + a.getDistancia());
        do {
            try {
                eleccion = leer.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero entero valido");
                leer.next();
            }
        } while (eleccion < 0 || eleccion > a.getDistancia());
        int tiempo = CalcularTiempoDistancia(10, eleccion);
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getBotaTraje()[0].getConsumEnrgia() * tiempo * 2));
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getGuanteTraje()[0].getConsumEnrgia() * tiempo * 1));
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getBotaTraje()[i].setDañado(true);
            }
        }
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getGuanteTraje()[i].setDañado(true);
            }
        }
    }

    public void propulsar(Objetivos a) {
        Double eleccion = 0d;
        System.out.println("ingrese la distancia a recorrer" + "\n"
                + "distancia maxima:" + a.getDistancia());
        do {
            try {
                eleccion = leer.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero entero valido");
                leer.next();
            }
        } while (eleccion < 0 || eleccion > a.getDistancia());
        int tiempo = CalcularTiempoDistancia(10, eleccion);
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getBotaTraje()[0].getConsumEnrgia() * tiempo * 3));
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getBotaTraje()[i].setDañado(true);
            }
        }
    }

    public void volar(Objetivos a) {
        Double eleccion = 0d;
        System.out.println("ingrese la distancia a recorrer" + "\n"
                + "distancia maxima:" + a.getDistancia());
        do {
            try {
                eleccion = leer.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("ingrese un numero entero valido");
                leer.next();
            }
        } while (eleccion < 0 || eleccion > a.getDistancia());
        int tiempo = CalcularTiempoDistancia(10, eleccion);
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getBotaTraje()[0].getConsumEnrgia() * tiempo * 3));
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getGuanteTraje()[0].getConsumEnrgia() * tiempo * 2));
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getBotaTraje()[i].setDañado(true);
            }
        }
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 31) {
                Ironman.getGuanteTraje()[i].setDañado(true);
            }
        }
    }

    public void disparar() {
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getGuanteTraje()[0].getConsumEnrgia() * 3 * 3));
        for (int i = 0; i < 2; i++) {
            Integer random = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (random < 6) {
                Ironman.getGuanteTraje()[i].setDañado(true);
            }
        }
    }

    public void usarConsola() {
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getConsolaTraje().getConsumEnrgia() * 1));
    }

    public void usarSintetizador() {
        Ironman.setEnergia(Ironman.getEnergia() - (Ironman.getSintetizadorTraje().getConsumEnrgia() * 1));
    }

    public void menu() {

        boolean exitMenu = false;
        do {
            System.out.println("¿Que acciones desea realizar?");
            System.out.println("------------------------------------------------");
            System.out.println("1. Mostrar Estado del traje" + "\n"
                    + "2. Utilizar radar" + "\n"
                    + "3. Destruir Enemigos" + "\n"
                    + "4. Salir");
            System.out.println("------------------------------------------------");
            try {
                switch (leer.nextInt()) {

                    case 1:
                        mostrarEstado();
                        break;
                    case 2:
                        radar();
                        break;
                    case 3:
                        destruirEnemigos();
                        break;
                    case 4:
                        System.out.println("Apagando sistemas...");
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("La opcion ingresada es invalida... Intente nuevamente");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Ingrese un caracter valido");
                leer.nextInt();
            }

        } while (exitMenu == false);

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

    //calculo de distancia entre punto A y punto B en un plano tridimenisonal donde A empieza en coordenadas 0 y b es un punto suelto
    public Integer CalcularDistancia() {
        int distancia;
        int a = ThreadLocalRandom.current().nextInt(1, 28867 + 1);
        int b = ThreadLocalRandom.current().nextInt(1, 28867 + 1);
        int c = ThreadLocalRandom.current().nextInt(1, 28867 + 1);
        distancia = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        return distancia;
    }

    //metodo para calcular el tiempo que toma recorrer de punto A a punto B donde int a es kmh e intb es la distancia
    public Integer CalcularTiempoDistancia(Integer a, double b) {
        Double tiempo = a / 3.6;
        return ((int) (b / tiempo));
    }
}
