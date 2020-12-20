
package Clases;

import java.util.ArrayList;

public class RespuestaConsulta <G>{
    private ArrayList<G> objetos;
    private String mensaje;
    private boolean error;

    public RespuestaConsulta(ArrayList<G> objetos) {
        this.objetos = objetos;
        this.error = false;
        this.mensaje = "Operacion Realizada Con exito";
    }

    public RespuestaConsulta(String mensaje, Exception e) {
        this.mensaje = mensaje;
        this.error = true;
        this.mensaje = "error : " + e.getMessage();
    }

    public ArrayList<G> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<G> objetos) {
        this.objetos = objetos;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    
}
