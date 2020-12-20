
package Clases;


public class Respuesta <G>
{
    private G objeto;
    private String mensaje;
    private boolean error;

    public Respuesta(G objeto) {
        this.objeto = objeto;
        this.error = false;
        this.mensaje = "Operacion Realizada Con exito";
    }

    public Respuesta(Exception e) {
        this.error = true;
        this.mensaje = "error : " + e.getMessage();
    }
    public Respuesta(String mensaje) {
        this.error = true;
        this.mensaje = mensaje;
    }

    public G getObjeto() {
        return objeto;
    }

    public void setObjeto(G objeto) {
        this.objeto = objeto;
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
