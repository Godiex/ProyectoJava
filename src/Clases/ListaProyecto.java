
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
    
    public int EncontrarIngeniero(String cedula) {
        int contador = 0;
        for (Proyecto proyecto: this.proyectos) {
            if (proyecto.EncontrarIngeniero(cedula) == 1) contador += 1;
        }
        if (contador > 0) return 1;
        return 0;
    }
    public int ObtenerPosicionDeProyecto(String nombre)
    {
        int posicion = 0;
        for (Proyecto proyecto : proyectos)
        {
            if (proyecto.getNombre().equals(nombre))
            {
                return posicion;
            }
            posicion = posicion + 1;
        }
        return posicion;
    }

    public void Actualizar(Proyecto proyecto)
    {
        int posicion = ObtenerPosicionDeProyecto(proyecto.getNombre());
        proyectos.set(posicion, proyecto);
    }
}
