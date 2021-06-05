package EjerciciosComplementariosEtapa2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        Numero numero = new Numero();
        int num1;
        int num2;

        System.out.print("Ingrese el numero 1 que sea menor: ");
        num1= consola.nextInt();
        System.out.print("Ingrese el numero 2 que sea mayor al 1: ");
        num2= consola.nextInt();
        
        if(num1 < num2){
            numero.fizzBuzzFunction(num1,num2);
            numero.mostrarResultados();
        }else{
            System.out.println("Ingrese correctamente los numeros");
        }
    }
}
