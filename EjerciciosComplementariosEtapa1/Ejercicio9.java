package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String cadena;
        char letra;
        
        System.out.println("Introduzca una cadena de caracteres: ");
        cadena = consola.nextLine();
        System.out.println("Introduzca una letra: ");
        letra = consola.next().charAt(0);

        int ctdad = contador(cadena,letra);
        System.out.println("La letra '"+letra+"' se repite "+ctdad+" veces");

        }

    public static int contador(String cadena, char letra){
        int contador = 0;
        cadena = cadena.toLowerCase();
        
        for (int i = 0; i < cadena.length(); i++ ){
            char caracter = cadena.charAt(i); 
            if(caracter == letra){
                contador++;
            }
        }
        return contador;
    
    }
}
