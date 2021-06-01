package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Ingrese un numero a: ");
        Scanner consola = new Scanner(System.in); 
        int a = consola.nextInt();
        System.out.print("Ingrese un numero b: ");
        int b = consola.nextInt();
        
        System.out.println("El resultado de la suma  del numero " + a +" con el numero " + b + " es = " + (a+b));
        System.out.println("El resultado de la resta  del numero " + a +" con el numero " + b + " es = " + (a-b));
        System.out.println("El resultado de la multiplicacion entre el numero " + a +" con el numero " + b + " es = " + (a*b));
        System.out.println("El resultado de la division entre el numero " + a +" con el numero " + b + " es = " + (a/b));
        System.out.println("El resultado del modulo entre el numero " + a +" con el numero " + b + " es = " + (a%b));
     
    }

   
}
