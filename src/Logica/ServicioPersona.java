
package Logica;

import Clases.ListaPersona;
import Clases.Respuesta;
import Clases.Persona;
import Datos.ArchivoPersona;

public class ServicioPersona {
    private final ArchivoPersona archivoPersona;

    public ServicioPersona() 
    {
        archivoPersona = new ArchivoPersona();
    }
    public String GuardarPersona (Persona Persona)
    {
        try
        {
            Persona PersonaAux = archivoPersona.Buscar(Persona.getCedula());
            if (PersonaAux == null) {
                String mensaje = archivoPersona.GuardarPersona(Persona);
                return mensaje;
            }
            return "el Persona ya se encuentra registrado";
        }
        catch (Exception e)
        {
            return "error al guardar : " +e.getMessage();
        }
    }
    public Respuesta<ListaPersona> ConsultaPersona  ()
    {
       return archivoPersona.ObtenerListaPersona();
    }
    public String Eliminar (String cedula)
    {
        try 
        {
            Persona PersonaAux = archivoPersona.Buscar(cedula);
            if (PersonaAux != null) {
               archivoPersona.Eliminar(cedula);
                return "Persona borrado con exito";
            }
            return "el Persona no se encuentra registrado";
        }
        catch(Exception e)
        {
            return "error al eliminar : " +e.getMessage();
        }
    }
    
    public String Actualizar (Persona Persona)
    {
       try  
       {
            Persona PersonaAux = archivoPersona.Buscar(Persona.getCedula());
            if (PersonaAux != null) {
                archivoPersona.Actualizar(Persona);
                return "Persona actualizado con exito";
            }
            return "el Persona ya se encuentra registrada";
       }
       catch (Exception e)
       {
           return "error al actualizar : " +e.getMessage();
       }
    }

    public Respuesta<Persona> Buscar (String cedula)
    {
        try
        {
           Persona Persona = archivoPersona.Buscar(cedula);
            if (Persona != null) {
                return new Respuesta(Persona);
            }
            else    
            {
                return new Respuesta("El Persona no se encuntra registrado");
            }
        }
        catch(Exception e)
        {
            return new Respuesta(e);
        } 
    }
    
    
}
