
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaProyecto implements Serializable
{
    ArrayList<Proyecto> proyectos ;

    public ListaProyecto() {
        proyectos = new ArrayList<>();
    }

    public ArrayList<Proyecto> getproyectos() {
        return proyectos;
    }
    
    public Proyecto BuscarProyecto(String nombre)
    {
        for (Proyecto Proyecto : proyectos) {
            if (Proyecto.getNombre().equals(nombre)) {
                return Proyecto;
            }
        }
        return null;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

   
    public void Guardar(Proyecto Proyecto)
    {
        proyectos.add(Proyecto);
    }
}
