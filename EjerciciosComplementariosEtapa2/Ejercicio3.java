package EjerciciosComplementariosEtapa2;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        List<Integer> barajaFrancesa = new ArrayList<>();
        barajaFrancesa.clear();
        Scanner consola = new Scanner(System.in);
        String opcion;
        
        for (int i = 1; i < 53; i++) {
            barajaFrancesa.add(i);
        }

        System.out.println("Introduzca la opcion de como usted quiere imprimir: ");
        System.out.println("1: Imprimir Orden Normal ");
        System.out.println("2: Imprimir Orden Inverso ");
        System.out.println("3: Imprimir Orden Desordenado ");
        System.out.print("Opcion = ");
        opcion = consola.nextLine();
        switch (opcion){
            case "1": Ejercicio3.imprimirOrdenNormal(barajaFrancesa); 
                        break;
            case "2": Ejercicio3.imprimirOrdenInverso(barajaFrancesa);
                        break;
            case "3": Ejercicio3.imprimirOrdenDesordenado(barajaFrancesa);
                        break;
        }
        
    }
    
    public static void  imprimirOrdenNormal(List barajaFrancesa){
        for (int i = 0; i < barajaFrancesa.size(); i++) {
            System.out.println("Baraja N° = " + barajaFrancesa.get(i));
        }
    }
//   for (int i = barajaFrancesa.size()-1; i >= 0; i--)
    public static void imprimirOrdenInverso(List barajaFrancesa){
        Collections.reverse(barajaFrancesa);
        for (int i = 0; i < barajaFrancesa.size(); i++) {
            System.out.println("Baraja N° = " + barajaFrancesa.get(i));
        }
    }
    
    public static void imprimirOrdenDesordenado(List barajaFrancesa){
        Collections.shuffle(barajaFrancesa);
        for (int i = 0; i < barajaFrancesa.size(); i++) {
            System.out.println("Baraja N° = " + barajaFrancesa.get(i));
        }
    }
}
