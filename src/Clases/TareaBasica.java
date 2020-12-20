
package Clases;

import java.util.Calendar;

public class TareaBasica extends Tarea
{
    private String  respuestaEntrega;
    private boolean EntregadaATiempo;
    private float porcentajeTareaRealizadas;

    public TareaBasica( int duracion, String nombre, String descripcion, String faseProyecto, Ingeniero ingeniero) {
        super("Tarea Basica", duracion, nombre, descripcion, faseProyecto, ingeniero);
    }

    public String getRespuestaEntrega() {
        return respuestaEntrega;
    }

    public void setRespuestaEntrega(String respuestaEntrega) {
        this.respuestaEntrega = respuestaEntrega;
    }

    public boolean isEntregadaATiempo() {
        return EntregadaATiempo;
    }

    public void setEntregadaATiempo(boolean EntregadaATiempo) {
        this.EntregadaATiempo = EntregadaATiempo;
    }

    public float getPorcentajeTareaRealizadas() {
        return porcentajeTareaRealizadas;
    }

    public void setPorcentajeTareaRealizadas(float porcentajeTareaRealizadas) {
        this.porcentajeTareaRealizadas = porcentajeTareaRealizadas;
    }
    
    
    
    
}
