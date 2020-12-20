
package Clases;

import java.io.Serializable;

public class Usuario implements Serializable
{
    private String  contraseña;
    private String tipo ;
    private String nombreUsuario;
    private Persona persona;

    public Usuario(String tipo,String contraseña, String nombreUsuario, Persona persona) {
        this.tipo = tipo;
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Usuario{" + "contrase\u00f1a=" + contraseña + ", nombreUsuario=" + nombreUsuario + ", persona=" + persona + '}';
    }
    
    

  

    
}
