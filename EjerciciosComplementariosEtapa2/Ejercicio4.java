package EjerciciosComplementariosEtapa2;

import java.util.*;
public class Ejercicio4 {
    
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<String>();
        Scanner consola = new Scanner(System.in);
        String opcion;
        
        estudiantes.add("Matias");
        estudiantes.add("Martin");
        estudiantes.add("Fernanda");
        estudiantes.add("Carolina");
        estudiantes.add("Luciano");
        estudiantes.add("Lautaro");
        estudiantes.add("Daniel");
        estudiantes.add("Rogelio");
        estudiantes.add("Tereza");
        estudiantes.add("Elvira");
        estudiantes.add("Belen");
        estudiantes.add("Analia");
        
        List curso1 = estudiantes.subList(0, 4);
        List curso2 = estudiantes.subList(4, 8);
        List curso3 = estudiantes.subList(8, 12);
        
        System.out.println("Introduzca que curso quiere imprimir: ");
        System.out.println("1: Imprimir Curso N°1 ");
        System.out.println("2: Imprimir Curso N°2 ");
        System.out.println("3: Imprimir Curso N°3 ");
        System.out.print("Opcion = ");
        opcion = consola.nextLine();
        
        switch (opcion){
            case "1": Ejercicio4.imprimirCurso1(curso1); 
                        break;
            case "2": Ejercicio4.imprimirCurso2(curso2);
                        break;
            case "3": Ejercicio4.imprimirCurso3(curso3);
                        break;
        }
    }
    
    public static void imprimirCurso1(List curso1) {
        for (int i = 0; i < curso1.size(); i++) {
            System.out.println("Estudiantes del Curso N°1 son = " + curso1.get(i));
        }
    }
    public static void imprimirCurso2(List curso2) {
        for (int i = 0; i < curso2.size(); i++) {
            System.out.println("Estudiantes del Curso N°2 son = " + curso2.get(i));
        }
    }
    public static void imprimirCurso3(List curso3) {
        for (int i = 0; i < curso3.size(); i++) {
            System.out.println("Estudiantes del Curso N°3 son = " + curso3.get(i));
        }
    }
}
