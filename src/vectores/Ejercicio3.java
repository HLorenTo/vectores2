/*
Desarrollar un programa que, dada una palabra, divida todos sus 
caracteres y los almacene en las posiciones de un vector del tamaño de 
la palabra, por ejemplo:
- “Colombia”, tiene 8 palabras, por ende, el vector debe ser de 
tamaño 8 para almacenar cada carácter
 */
package vectores;
public class Ejercicio3 {
    public static void main(String[] args) {
        String palabra = "Colombia";
        char vector [] = new char [palabra.length()];
        for (int i = 0; i < palabra.length(); i ++){
            vector [i] = palabra.charAt(i);
        }
        for (int i = 0; i < vector.length; i++){
            System.out.println("Letra ->" + vector[i] +" -> " +i);
        }
        System.out.println("La palabra " + palabra +" tiene "+ palabra.length()+ " caracteres");
    }
}
