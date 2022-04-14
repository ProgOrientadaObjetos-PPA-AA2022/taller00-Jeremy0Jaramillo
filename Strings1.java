/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings1;

import java.util.Scanner;

/**
 *
 * @author SALA A
 */
public class Strings1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cad1 = "Ana";
        String cad2 = "Espinoza Castillo";
        String cad3 = cad1 + "." + cad2;
        
        String universidad = "La#UTPL#esta en Loja";
        
        int x = 10;
        int y = 11;
        
        System.out.println(cad3);
        System.out.println(cad3.substring(4, 12));
        System.out.println(cad3.substring(4));
        System.out.printf("%s\n\n", cad3.indexOf("."));
        
        System.out.println(universidad.substring(universidad.indexOf("U"), universidad.indexOf("P")+2));
        System.out.println(universidad.substring(universidad.indexOf("L#")+2, universidad.indexOf("j")+2));
        
        int a = ++x;
        int b = --y;
        int c = x++;
        int d = y--;
        
        System.out.printf("\nx\t y\t a\t b\t c\t d\t");
        System.out.printf("\n%s\t %s\t %s\t %s\t %s\t %s\t\n", x, y, a, b, c, d);
        
    }

}
