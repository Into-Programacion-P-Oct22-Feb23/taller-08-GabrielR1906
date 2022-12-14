/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author renat
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int indice;
        int indice2;
        int indice3;
        int indice4;
        String mensaje = "";
        
        for(indice = 25; indice>=1; indice--) {
            indice2 = indice * 2;
            indice3 = indice * 3;
            indice4 = indice * 4;
            
            
            mensaje = String.format("%s%d\t%d\t%d\t%d\n", mensaje, indice,
                    indice2, indice3, indice4);
        }
        System.out.printf("N°\tx2\tx3\tx4\n%s", mensaje);
        
        
        
        
        
        
        
    }
    
}
