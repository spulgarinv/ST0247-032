/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author cl18310
 */
import java.util.ArrayList;

/**
 * Clase en la cual se implementan los metodos del Taller 2
 *
 * @author Mauricio Toro, Camilo Paez
 */
public class Taller2 {

    /**
     * Metodo auxiliar que llama al metodo combinations posterios
     *
     * @param list el conjunto sobre el cual se haran las combinaciones
     *
     */
    public static void combinations(String s) {
        ArrayList <String> list = new ArrayList();
    }

    /**
     * Metodo para obtener las posibles combinaciones que se pueden hacer con
     * los elementos dados
     *
     * @param index lleva la posicion para recorrer el conjunto
     * @param list el conjunto que tiene todas las combinaciones
     * @param s la cadena actual
     *
     */
    private static void combinations(String s, String str, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(s);
        } else {
            combinations(s, str.substring(1), list);
            combinations(s+str.charAt(0), str.substring(1), list);
        }
    }

    /**
     * Metodo auxiliar que llama al metodo permutations posterios
     *
     * @param s la cadena a la cual se le haran las permutaciones
     * @return un ArrayList que contiene las permutaciones
     */
    public static ArrayList<String> permutations(String s) {
        ArrayList <String> perm = new ArrayList();
        permutations(" ",s, perm);
        for (int i = 0; i <perm.size(); i++) {
            System.out.println(perm.get(i));
        }     
        return perm;
        
    }

    /**
     * Metodo para obtener las posibles permutaciones que se pueden hacer con
     * los caracteres de una cadena dada, recuerde que las letras no se repiten
     * en este ejercicio
     *
     * @param pre parte de la cadena que empieza desde 0 a i
     * @param pos parte de cadena que empieza desde i a n
     * @param list el conjunto que tiene todas las permutaciones
     *
     */
    private static void permutations(String pre, String pos, ArrayList<String> list) {
        if (pos.isEmpty()) {
            list.add(pre);
            System.out.println(AdvancedEncryptionStandard.desencriptarArchivo(pre));
            
        } else {
            for (int i=0; i<pos.length(); i++) {
                permutations(pre + pos.charAt(i), pos.substring(0,i) + pos.substring(i+1), list);
            }
        }
    }

    /**
     * Metodoque imprime en pantalla como esta el tablero dado
     *
     * @param tablero es un arreglo con las posiciones de un tablero de ajedrez
     * no se modifica.
     */
    public static void imprimirTablero(int[] tablero) {
        int n = tablero.length;
        System.out.print("    ");
        for (int i = 0; i < n; ++i) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < n; ++i) {
            System.out.print(i + "   ");
            for (int j = 0; j < n; ++j) {
                System.out.print((tablero[i] == j ? "Q" : "#") + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * Metodo auxiliar verifica si el tablero implementado es correcto es decir
     * rodas las reinas se posicionan de foma correcta
     *
     * @param tablero un arreglo con las posiciones de un tablero de ajedrez
     * @return true si es verdaderos, false de lo contrario
     */
    public static boolean esValido(int[] tablero) {
        return false;
    }

    /**
     * Metodo que muestra el numero de posibles soluciones al problema
     *
     *
     * @param n numero de reinas
     * @return numero de soluciones
     */
    public static int queens(int n) {
        return 0;
    }
    
    public static void main(String[] args) {
        permutations("abcd");
    }
            
}
