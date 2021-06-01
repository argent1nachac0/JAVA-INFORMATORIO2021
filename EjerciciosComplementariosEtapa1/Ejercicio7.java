package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String [] args){
        Scanner consola = new Scanner(System.in);
        String unaFrase;

        System.out.println("Introduzca una frase: ");
        unaFrase = consola.nextLine();
        consola.close();

        System.out.println(convertirMayusculas(unaFrase));
    }

    public static String convertirMayusculas(String unaFrase){
        String enMayuscula = "";
        char unaLetra = ' ';

        for(int i = 0; i < unaFrase.length(); i++){

            if (unaFrase.charAt(i) >= 'a' && unaFrase.charAt(i) <= 'z'){
                unaLetra = (char)(unaFrase.charAt(i) - 32);
            }
            else {
                unaLetra = (char)(unaFrase.charAt(i));
            }

            enMayuscula += unaLetra;
        }
        
        return enMayuscula;
    }
}
