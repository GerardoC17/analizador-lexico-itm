/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.util.Scanner;

/**
 *
 * @author gcetzal
 */
public class LexicalAnalyzer {
    String sPattern = ("(print)|([0-9])|([a-zA-Z])|([x+-/=])|([()])");
    
    
    public String leer() {
        String cadena;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese Cadena: ");
        cadena = s.nextLine();
        
        return cadena;
    }
    
}
