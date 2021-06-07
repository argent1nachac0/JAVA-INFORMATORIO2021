
package ManejoDeArchivos;

import java.io.*;
import static java.lang.Double.parseDouble;
import java.lang.reflect.Array;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Metodos {
    List <Empleado> empleados = new ArrayList();
    
    public List manejarLinea(FileReader archivo) throws FileNotFoundException, IOException {

        String linea;
        BufferedReader lectorB = new BufferedReader(archivo);
        List <String> dato = new ArrayList();
        linea = lectorB.readLine();
        while(linea != null){
            dato.add(linea);
            linea = lectorB.readLine();
        }
        return dato;    
    }
    
    public List<Empleado> manejarLista(List<String> lista){
        List<String> aux = null; 
        Empleado emp;
        for (String empleado : lista){
            aux = Arrays.asList(empleado.split(","));
            emp = new Empleado(
                    aux.get(0),
                    aux.get(1), 
                    Metodos.manejarFecha(aux.get(2)),
                    parseDouble(aux.get(3))
            );
            empleados.add(emp);
        }
        return empleados;
    }
        
    public static LocalDate manejarFecha(String fecha){
        LocalDate localDate;
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        localDate = LocalDate.parse(fecha.trim(), formateo);
        return localDate;
    }
    
    public void recorrerEmpleadosPorNombre(List<Empleado> empleados){
        List<Empleado> recorrerEmpleadosNombre;
        Comparator<Empleado> comparador = Comparator
                                        .comparing(Empleado::getNombre)
                                        .thenComparing(Empleado::getApellido);
        
        recorrerEmpleadosNombre =    empleados.stream()
                                            .sorted(comparador)
                                            .collect(Collectors.toList());
        
        recorrerEmpleadosNombre.forEach(e -> System.out.println(e.toString()));
    }
    
    public void devolverLetraDadaApellido(List<Empleado> empleados, char letra){
        List<Empleado> conLetraBuscada;
        conLetraBuscada = empleados.stream()
                .filter(x -> x
                .getApellido()
                .charAt(0) == letra)
                .collect(Collectors.toList());
        
        System.out.println(conLetraBuscada);
    }
    
    public void obtenerEmpleadoMayorEdad(List<Empleado> empleados){
        Comparator<Empleado> comparador = Comparator.comparing(Empleado::getFechaNacimiento);
        Empleado mayorEdad = (empleados
                            .stream()
                            .sorted(comparador)
                          )
                            .findFirst()
                            .get();
        System.out.println("El empleado mayor de edad es = " + mayorEdad);
    }
    
    public void obtenerEmpleadoMenorEdad(List<Empleado> empleados){
        Comparator<Empleado> comparador = Comparator.comparing(Empleado::getFechaNacimiento);
        Empleado menorEdad = (empleados
                            .stream()
                            .sorted(comparador.reversed() )
                         )
                            .findFirst()
                            .get();
        System.out.println("El empleado menor de edad es = " + menorEdad);
    }
    
    public void obtenerEmpleadoMayorPago(List<Empleado> empleados){
        Comparator<Empleado> comparador = Comparator.comparing(Empleado::getSueldo);
        Empleado mayorSueldo = (empleados
                            .stream()
                            .sorted(comparador)
                         )
                            .findFirst()
                            .get();
        System.out.println("El empleado con mayor sueldo es = " + mayorSueldo);
    }
    
    public void obtenerEmpleadoMenorPago(List<Empleado> empleados){
        Comparator<Empleado> comparador = Comparator.comparing(Empleado::getSueldo);
         Empleado menorSueldo = (empleados
                            .stream()
                            .sorted(comparador.reversed() )
                         )
                            .findFirst()
                            .get();
        System.out.println("El empleado con menor sueldo es = " + menorSueldo);
    }
}
    
    

    
    

