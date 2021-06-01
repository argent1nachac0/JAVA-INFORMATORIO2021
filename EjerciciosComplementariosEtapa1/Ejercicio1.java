package EjerciciosComplementariosEtapa1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Escribe el nombre de usuario: ");
        Scanner consola = new Scanner(System.in); 
        var usuario = consola.nextLine(); //
        System.out.println("HOLA " + usuario);
    }
        
}
