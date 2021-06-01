package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        System.out.print("Ingrese un numero cualquiera para saber su serie de fibonacci = ");
        Scanner consola = new Scanner(System.in);
        int num = consola.nextInt();
        int factorial = 1;

        while(num > 0){
            factorial = factorial*num;
            num-=1;
        }

        System.out.println(factorial);
    }
}
