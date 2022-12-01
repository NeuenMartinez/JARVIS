/*
 * @author NeuenMartinez
 */
package Jarvis;

import Servicios.JarvisService;


public class Jarvis {

    public static void main(String[] args) {


        JarvisService js = new JarvisService();
        js.crearArmadura();
        System.out.println("HOLA MUNDO");
    }

}