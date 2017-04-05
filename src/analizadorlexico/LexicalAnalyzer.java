package analizadorlexico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gcetzal
 */
public class LexicalAnalyzer {

    public String patron = ("(print)|([0-9][0-9]*)|([a-zA-Z][a-zA-Z]*)|([x+-/=])|([('')])|(\\s)|([^(print)|([0-9])|([a-zA-Z])|([x+-/=])|([('')])|(\\s)])");

    public String leer() {
        String cadena;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese Cadena: ");
        cadena = s.nextLine();
        return cadena;
    }

    public ArrayList<String> obtenerValor(String cadena) {
        Pattern patronle = Pattern.compile(patron);
        Matcher mat = patronle.matcher(cadena);

        ArrayList<String> valor = new ArrayList<>();

        while (mat.find()) {
            String tokenTipoR = mat.group(1);
            if (tokenTipoR != null) {
                valor.add(tokenTipoR);
            }
            String tokenTipoC = mat.group(2);
            if (tokenTipoC != null) {
                valor.add(tokenTipoC);
            }
            String tokenTipoI = mat.group(3);
            if (tokenTipoI != null) {
                valor.add(tokenTipoI);
            }
            String tokenTipoO = mat.group(4);
            if (tokenTipoO != null) {
                valor.add(tokenTipoO);
            }
            String tokenTipoD = mat.group(5);
            if (tokenTipoD != null) {
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
        //System.out.println(valor);
        return valor;
    }

    public ArrayList<String> obtenerTipo(String cadena) {
        Pattern patronle = Pattern.compile(patron);
        Matcher mat = patronle.matcher(cadena);

        ArrayList<String> tipo = new ArrayList<>();

        while (mat.find()) {
            String tokenTipoR = mat.group(1);
            if (tokenTipoR != null) {
                String pr = "Palabra Reservada";
                tipo.add(pr);
            }
            String tokenTipoC = mat.group(2);
            if (tokenTipoC != null) {
                String con = "Constante";
                tipo.add(con);
            }
            String tokenTipoI = mat.group(3);
            if (tokenTipoI != null) {
                String iden = "Identificador";
                tipo.add(iden);
            }
            String tokenTipoO = mat.group(4);
            if (tokenTipoO != null) {
                String ope = "Operador";
                tipo.add(ope);
            }
            String tokenTipoD = mat.group(5);
            if (tokenTipoD != null) {
                String del = "Delimitador";
                tipo.add(del);
            }
        }
        //System.out.println(tipo);
        return tipo;
    }

    public void imprimirLexico(ArrayList<String> uno, ArrayList<String> dos) {
        System.out.print("Tipo: ");
        for (String aDo : dos) {
            System.out.print(aDo);
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.print("Valor: ");
        for (String a : uno) {
            System.out.print(a);
            System.out.print(" | ");
        }

    }

    public static void main(String[] args) {
        LexicalAnalyzer obj = new LexicalAnalyzer();
        String info = obj.leer();
        obj.obtenerValor(info);
        obj.obtenerTipo(info);
        obj.imprimirLexico(obj.obtenerValor(info), obj.obtenerTipo(info));
    }
}

class SyntacticAnalyzer {

}
