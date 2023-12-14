/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author khalid
 */
public class Ej1 {

    public static void main(String[] args) {
        System.out.println(palabrasLeidas());
    }

    public static int palabrasLeidas() {

        boolean error = true;
        String numPalabras = "";
        int numeroPal=0;

        do {

            try {
                numPalabras = JOptionPane.showInputDialog(null,
                        "Introduce el numero de palabras a guardar");
                numeroPal = Integer.parseInt(numPalabras);
                error = false;
            } catch (NumberFormatException exc) {
                JOptionPane.showMessageDialog(null, "Has introducido un dato incorrecto");
                error = true;
            }
            

        } while (error);

        return numeroPal;
    }

}
