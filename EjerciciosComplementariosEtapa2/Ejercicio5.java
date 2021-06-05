package EjerciciosComplementariosEtapa2;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<Integer>();
        List<Integer> valorHora = new ArrayList<Integer>();
        List<Integer> totalDia = new ArrayList<Integer>();
        Scanner consola = new Scanner(System.in);
        
        horasTrabajadas.clear();
        valorHora.clear();
        totalDia.clear();
        int horas;
        int precioHora;
        int totalCobrar;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la cantidad de horas trabajadas del dia [" + (i+1) + "] = ");
            horas = consola.nextInt();
            horasTrabajadas.add(horas);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor de la hora del dia [" + (i+1) + "] = ");
            precioHora = consola.nextInt();
            valorHora.add(precioHora);
        }
        
        for (int i = 0; i < 5; i++) {
           totalDia.add(horasTrabajadas.get(i) * valorHora.get(i));
        }
        
        totalCobrar = 0;
        for (int i = 0; i < totalDia.size(); i++) {
            totalCobrar += totalDia.get(i);
        }
        System.out.println("");
        System.out.println(totalDia);
        System.out.println("Total Final: $" + totalCobrar);
        
    }
}
