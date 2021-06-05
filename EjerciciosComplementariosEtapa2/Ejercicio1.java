
package EjerciciosComplementariosEtapa2;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        
        ciudades.add("Buenos Aires");
        ciudades.add("Cordoba");
        ciudades.add("Usuahia");
        ciudades.add("Bariloche");
        ciudades.add("Iguazu");
        
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + (i+1) + " - " + ciudades.get(i));
        }
    }
}
