/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 *
 * @author gcetzal
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexico {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe ");
        String cadena = sc.nextLine();

        String patron = ("(print)|([0-9])|([a-zA-Z])|([x+-/=])|([('')])|(\\s)|([^(print)|([0-9])|([a-zA-Z])|([x+-/=])|([('')])|(\\s)])");

        Pattern patronle = Pattern.compile(patron);
        Matcher mat = patronle.matcher(cadena);

        ArrayList<String> tipo = new ArrayList<>();
        ArrayList<String> valor = new ArrayList<>();

        while (mat.find()) {
            String tokenTipoR = mat.group(1);
            if (tokenTipoR != null) {
                String pr = "Palabra Reservada";
                tipo.add(pr);
                valor.add(tokenTipoR);
            }
            String tokenTipoC = mat.group(2);
            if (tokenTipoC != null) {
                String con = "Constante";
                tipo.add(con);
                valor.add(tokenTipoC);
            }
            String tokenTipoI = mat.group(3);
            if (tokenTipoI != null) {
                String iden = "Identificador";
                tipo.add(iden);
                valor.add(tokenTipoI);
            }
            String tokenTipoO = mat.group(4);
            if (tokenTipoO != null) {
                String ope = "Operador";
                tipo.add(ope);
                valor.add(tokenTipoO);
            }
            String tokenTipoD = mat.group(5);
            if (tokenTipoD != null) {
                String del = "Delimitador";
                tipo.add(del);
                valor.add(tokenTipoD);
            }
            String tokenTipoB = mat.group(6);
            if (tokenTipoB != null) {
                String blanco = "Blanco";
                System.out.println(blanco + " " + tokenTipoB);
            }
            String tokenOtro = mat.group(7);
            if (tokenOtro != null) {
                String otro = "otro";
                System.out.println(otro + " " + tokenOtro);
            }
        }

    }
}
