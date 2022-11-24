/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package vistaventanas;

import ventanas.Ventana1;
import ventanas.Ventana2;
import ventanas.Ventana3;
import ventanas.VentanaBandera;

/**
 *
 * @author Juan Diego Roman
 */
public class Principal {

    public static void main(String[] args) {

        var v1 = new Ventana1("BorderLayout");
        var v2 = new Ventana2("FlowLayout");
        var v3 = new Ventana3("GridLayout");
        var v4b = new VentanaBandera(" ");
        

    }
}
