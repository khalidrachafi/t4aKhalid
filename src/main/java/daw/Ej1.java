/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author khalid
 */
public class Ej1 {

    public static void main(String[] args) {
      //JOptionPane.showMessageDialog(null, arrayPalabras());
       mostrarPalabras(arrayPalabras());
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
    
    public static String[] arrayPalabras(){
      Scanner teclado = new Scanner(System.in);
        
       String palabras[];
       palabras= new String [palabrasLeidas()]; 
        
       for (int i = 0; i < palabras.length; i++) {
       
       System.out.println("Introduce una de las palabras a rellenar:");
       palabras[i]= teclado.nextLine();
                
        }
 
       return palabras;
    }
    
     public static void mostrarPalabras(String[] palabras){
  

          StringBuilder mensaje = new StringBuilder();
         
         for (int i = 0; i <palabras.length; i++) {
             
          
                  
             mensaje.append("Posición ").append(i)
                     .append(" - Palabra: ")
                     .append(palabras[i])
                     .append("\n");
             
         }
         
         JOptionPane.showMessageDialog(null,mensaje.toString());
    }
     
    
   
}
