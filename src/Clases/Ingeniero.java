
package Clases;

import java.io.Serializable;

public class Ingeniero extends Persona 
{
    private int aniosExperiencia;
    private String especialidad;

    public Ingeniero(int aniosExperiencia, String especialidad, String cedula, String nombres, String apellidos, String edad) {
        super(cedula, nombres, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
    }

    public Ingeniero() {
        
    }
    

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Ingeniero{" + "aniosExperiencia=" + aniosExperiencia + ", especialidad=" + especialidad + '}';
    }

 
    
}
