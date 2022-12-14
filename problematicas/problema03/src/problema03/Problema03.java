/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author renat
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius;
        double fahrenheit = 20;
        String mensaje = "";
        
        for(int indice = 1; indice <=20; indice++) {
            celsius = (double)5/9 *(fahrenheit - 32);
            mensaje = String.format("%s%.0f°F --> °C = 5/9 * (%.0f - 32) = %.2f°C"
                    + "\n", mensaje, fahrenheit, fahrenheit, celsius);
            fahrenheit = fahrenheit + 4;
        }
        System.out.println(mensaje);
    }
    
}
