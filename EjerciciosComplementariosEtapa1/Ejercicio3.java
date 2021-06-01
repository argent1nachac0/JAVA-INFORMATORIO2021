package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        Scanner consola = new Scanner(System.in); 
        int num = consola.nextInt();
        
        for (int i = 1; i <= num; i++){
            for(int x = 1; x <= i; x++){
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
