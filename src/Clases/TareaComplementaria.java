
package Clases;

public class TareaComplementaria extends Tarea
{

    public TareaComplementaria(boolean realizada,int duracion, String nombre, String descripcion, String faseProyecto, Ingeniero ingeniero) {
        super("Tarea Complementaria", duracion, nombre, descripcion, faseProyecto, ingeniero);
        this.realizada = realizada;
    }
    
    private boolean realizada;

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    
}
