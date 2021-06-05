package EjerciciosComplementariosEtapa2;

public class Empleado {
    
    public String nomApe;
    public int dni;
    public int horasTrabajadas;
    public int valorHora;
    
    public Empleado(String nomApe, int dni, int horasTrabajadas, int valorHora){
        this.nomApe = nomApe;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public String getNomApe() {
        return nomApe;
    }

    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    
}
