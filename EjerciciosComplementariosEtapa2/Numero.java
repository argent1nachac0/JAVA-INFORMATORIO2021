package EjerciciosComplementariosEtapa2;

import java.util.ArrayList;

public class Numero {
    ArrayList arreglo = new ArrayList();
    String fizz = "Fizz"; 
    String buzz = "Buzz";
    String fizzBuzz = "FizzBuzz";

    public void fizzBuzzFunction(int num1, int num2){

        for(int i=num1; i<num2; i++){

            if(i%2 == 0 && i%3 == 0){
                arreglo.add(fizzBuzz);
            }
            else if(i%3 == 0){
                arreglo.add(buzz);
            }
            else if(i%2==0){
                arreglo.add(fizz);
            }
            else{
                arreglo.add(i);
            }
        }
    }

    public void mostrarResultados(){

        for (Object obj : arreglo) {
            System.out.print(" "+obj);
        }
    }
}
