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
public class Analisis {

    public char[] operadores = {'+', '/', '%', '|', '!', '>', '<', '=', '-', '*', '&'};
    public char[] delimitadores = {'(', ')', '[', ']', '"'};
    public char[] abcdario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    public char[] abcdario2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public char[] obtenerCadena(String frase) {
        char[] guardarFrase;
        guardarFrase = frase.toCharArray();
        return guardarFrase;
    }

    public String cadenasFrase(char[] cadenaDescompuesta) {
        String tipoToken = "operador";
        String operadoresAceptados = "";
        int count = 0;
        String arregloInfo = "";
        for (int i = 0; i < cadenaDescompuesta.length; i++) {
            for (int j = 0; j < operadores.length; j++) {
                if (cadenaDescompuesta[i] == operadores[j]) {
                    count++;
                    operadoresAceptados += cadenaDescompuesta[i];
                }
            }
        }
        arregloInfo = String.valueOf(count) + " tipo: " + tipoToken + " valorToken: " + operadoresAceptados;
        System.out.println(arregloInfo);
        return arregloInfo;
    }
    public String delimitador(char [] cadenaDescompuesta) {
        String token = "Tipo: delimitador ";
        String guardarDelimitador="", concatenar="";
        for (int i = 0; i < cadenaDescompuesta.length; i++) {
            for (int j = 0; j < delimitadores.length; j++) {
                if(cadenaDescompuesta[i]==delimitadores[j]) {
                    guardarDelimitador += cadenaDescompuesta[i];
                }
            }
        }
        concatenar = token+guardarDelimitador;
        System.out.println(concatenar);
        return concatenar;
    }
    public String abecedario (char [] cadenaDescompuesta) {
        String token = "indentificador: ";
        String cadenasABC = "", guardarABC="";
        
        for (int i = 0; i < cadenaDescompuesta.length; i++) {
            for (int j = 0; j < abcdario.length; j++) {
                if(cadenaDescompuesta[i]==abcdario[j] || cadenaDescompuesta[i]==abcdario2[j]) {
                    cadenasABC += cadenaDescompuesta[i];
                }
            }
        }
        guardarABC = token+cadenasABC;
        System.out.println(guardarABC);
        return guardarABC;
    }
    public String digito(char[] cadenaDescompuesta) {
        String tipoToken2 = "Constante";
        String numeros = "", guardarNumero = "";

        for (int i = 0; i < cadenaDescompuesta.length; i++) {
            if (Character.isDigit(cadenaDescompuesta[i]) == true) {
                numeros += cadenaDescompuesta[i] + " ";
            }
        }
        guardarNumero = tipoToken2 + " " + numeros;
        System.out.println(guardarNumero);
        return guardarNumero;
    }

    public void prueba(String arreglo) {
        System.out.println(arreglo);
    }
    
    
    

    public static void main(String[] args) {
        Analisis a = new Analisis();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa la palabra");
        String hola = "";
        hola = s.nextLine();
        char holaa[];
        holaa = hola.toCharArray();
        a.cadenasFrase(holaa);
        a.abecedario(holaa);
        a.delimitador(holaa);
        a.digito(holaa);
    }
}
