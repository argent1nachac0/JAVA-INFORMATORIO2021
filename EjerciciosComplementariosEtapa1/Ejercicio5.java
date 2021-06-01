package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int sumaSucesiva;
    
        System.out.print("Ingrese un numero 1 = ");
        int num1 = consola.nextInt();
        System.out.print("Ingrese un numero 2 = ");
        int num2 = consola.nextInt();

        sumaSucesiva = 0;
        for(int i=0; i<num2 ; i++){
            sumaSucesiva += num1;
        }
     
        System.out.println(num1 + " * " + num2 + " = " + sumaSucesiva);
    }
}
