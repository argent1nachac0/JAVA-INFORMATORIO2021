package EjerciciosComplementariosEtapa1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int opPotencia;
        
        System.out.print("Ingrese la base = ");
        int base = consola.nextInt();
        System.out.print("Ingrese la potencia = ");
        int potencia = consola.nextInt();
        
        opPotencia = 1;
        for(int i =0 ; i<potencia ; i++){
            opPotencia*=base;
        }
        
        System.out.println(base + " elevado a la "+ potencia + " = 3" + opPotencia);
    }
}
