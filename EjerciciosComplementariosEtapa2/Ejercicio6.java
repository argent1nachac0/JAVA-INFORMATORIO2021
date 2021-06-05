package EjerciciosComplementariosEtapa2;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Map<Integer, Integer> empleadoSueldo = new HashMap<Integer,Integer>();
        Set<Empleado> empleados = new HashSet<Empleado>();
        
        Empleado empleado1 = new Empleado("Matias Garcia", 37469039, 40 ,2000);
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado("Martin Garcia", 37469040, 35 ,1500);
        empleados.add(empleado2);
        Empleado empleado3 = new Empleado("Belen Benitez", 38386416, 40 ,3000);
        empleados.add(empleado3);
        Empleado empleado4 = new Empleado("Tereza Perez",  17782341, 50 ,4000);
        empleados.add(empleado4);
        Empleado empleado5 = new Empleado("Marcos Retamozo", 23312239, 45 ,2500);
        empleados.add(empleado5);
        
        for(Empleado i: empleados){
            empleadoSueldo.put(i.getDni(),(i.getHorasTrabajadas() * i.getValorHora()));
        }
        
        empleadoSueldo.forEach((key, value) -> System.out.println(key + " : " + value));

    }
   
}
