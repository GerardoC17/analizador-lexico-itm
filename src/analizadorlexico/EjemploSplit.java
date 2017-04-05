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
public class EjemploSplit {
    public static void  main (String args[]) {
        Scanner op = new Scanner(System.in);
        System.out.println("Ingrese palabra");
        String text = op.nextLine();
        
        
        String numeros = "print,while,for,if,class,in";
        String[] numerosComoArray = numeros.split(",");
        for (int i = 0; i < numerosComoArray.length; i++) {
            //System.out.println(numerosComoArray[i]);
            if(text == numerosComoArray[i]) {
                System.out.println("palabra reservada: "+text);
            }else {
                
            }
        }
        System.out.println(3+4);
        
    }
}