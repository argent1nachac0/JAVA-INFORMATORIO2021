package EjerciciosComplementariosEtapa2;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        numeros.add(3);
        System.out.println("El tamaño de la lista antes de agregar los numeros es = " + numeros.size());
        
        for (int i = 0; i < numeros.size(); i++) {           
            System.out.println("Numero " + numeros.get(i) + " en la posicion " + i + " de la lista");
        }
        
        numeros.add(0,11);
        numeros.add(numeros.size(), 15);
        System.out.println("El tamaño de la lista despues de agregar los numeros es = " + numeros.size());
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero " + numeros.get(i) + " en la posicion " + i + " de la lista");
            
        }
    }
}
