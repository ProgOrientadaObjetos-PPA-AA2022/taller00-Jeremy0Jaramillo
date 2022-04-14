/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Mensaje;
import paquete3.Valor;
/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase = Mensaje.obtenerFrase();
        int numero = Valor.obtenerHabitantes();
        
        System.out.printf("%s con %s \n", frase, numero);
    }
    
}
