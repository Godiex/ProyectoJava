
package Clases;

public class TareaComplementaria extends Tarea
{

    public TareaComplementaria(int duracion, String nombre, String descripcion, String faseProyecto, Ingeniero ingeniero) {
        super("Tarea Complementaria", duracion, nombre, descripcion, faseProyecto, ingeniero);
    }
    
    private boolean realizada;

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    
}
