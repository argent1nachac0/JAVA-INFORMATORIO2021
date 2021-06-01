package EjerciciosComplementariosEtapa1;

//Ejercicio 8
public class Persona {
    
    public String nomYape;
    public int edad;
    public String direccion;
    public String ciudad;
    
    public Persona(String nomYape, int edad, String direccion, String ciudad){
        this.nomYape = nomYape;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNomYape() {
        return nomYape;
    }

    public void setNomYape(String nomYape) {
        this.nomYape = nomYape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("").append(ciudad);
        sb.append(" - ").append(direccion);
        sb.append(" - ").append(edad);
        sb.append(" - ").append(nomYape);
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona("Matias Garcia", 26 , "Av. Sarmiento 2400" , "Resistencia");
        System.out.println(persona);
    }
}
