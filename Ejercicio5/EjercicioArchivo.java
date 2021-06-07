package ManejoDeArchivos;

import ManejoDeArchivos.Metodos.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class EjercicioArchivo {
        
  public static void main(String[] args) throws FileNotFoundException, IOException {
        Metodos obj = new Metodos();
        List<Empleado> ella;
        FileReader archivo = new FileReader("C:\\Users\\matu_\\Desktop\\personas.txt");
        ella = obj.manejarLista(obj.manejarLinea(archivo));
        
        System.out.println(" ");
        obj.devolverLetraDadaApellido(ella, 'A');
        System.out.println(" ");
        obj.obtenerEmpleadoMayorEdad(ella);
        System.out.println(" ");
        obj.obtenerEmpleadoMenorEdad(ella);
        System.out.println(" ");
        obj.obtenerEmpleadoMayorPago(ella);
        System.out.println(" ");
        obj.obtenerEmpleadoMenorPago(ella);
        System.out.println(" ");
        obj.recorrerEmpleadosPorNombre(ella);
    }
}
