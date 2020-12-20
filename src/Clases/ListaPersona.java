
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaPersona  implements Serializable
{
    ArrayList<Persona> personas ;

    public ListaPersona() {
        personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void Guardar(Persona persona)
    {
        personas.add(persona);
    }
    public Persona BuscarPersona(String cedula)
    {
        for (Persona persona : personas) {
            if (persona.getCedula().equals(cedula) ) {
                return persona;
            }
        }
        return null;
    }

    public int ObtenerPosicionDePersona(String cedula)
    {
        int posicion = 0;
        for (Persona persona : personas)
        {
            if (persona.getCedula().equals(cedula))
            {
                return posicion;
            }
            posicion = posicion + 1;
        }
        return posicion;
    }
    public void Borrar(String cedula)
    {
        int posicion = ObtenerPosicionDePersona(cedula);
        personas.remove(posicion);
    } 
    public void Actualizar(Persona persona)
    {
        int posicion = ObtenerPosicionDePersona(persona.getCedula());
        personas.set(posicion, persona);
    }
}
