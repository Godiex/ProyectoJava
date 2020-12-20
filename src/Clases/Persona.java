
package Clases;

import java.io.Serializable;

public class Persona implements Serializable
{
    private String cedula;
    private String  nombres;
    private String  apellidos;
    private String  edad;

    public Persona(String cedula, String nombres, String apellidos, String edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }
    
}
