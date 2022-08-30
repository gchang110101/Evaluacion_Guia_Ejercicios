package gabrielchangguiaej1;

public class Trabajador {
    //encapsulamiento
    private int codigoTrabajador;
    private int salarioMensualTrabajador;
    private String nombreTrabajador;
    private String apellidoTrabajador;

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public int getSalarioMensualTrabajador() {
        return salarioMensualTrabajador;
    }

    public void setSalarioMensualTrabajador(int salarioMensualTrabajador) {
        this.salarioMensualTrabajador = salarioMensualTrabajador;
    }
    
    public int getSalarioDiarioTrabajador(int salarioMensualTrabajador) {
        return (salarioMensualTrabajador/30);
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getApellidoTrabajador() {
        return apellidoTrabajador;
    }

    public void setApellidoTrabajador(String apellidoTrabajador) {
        this.apellidoTrabajador = apellidoTrabajador;
    }

    //constructor vacio
    public Trabajador() {
    }

    //constructor para asignar valores al crear el objeto
    public Trabajador(int codigoTrabajador, int salarioMensualTrabajador, 
            String nombreTrabajador, String apellidoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
        this.salarioMensualTrabajador = salarioMensualTrabajador;
        this.nombreTrabajador = nombreTrabajador;
        this.apellidoTrabajador = apellidoTrabajador;
    }
}
