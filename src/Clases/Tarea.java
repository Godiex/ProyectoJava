
package Clases;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public abstract class Tarea implements Serializable
{
    private int IdTarea;
    private String tipoTarea;
    private int duracion;
    private String nombre;
    private String descripcion; 
    private Calendar fechaInicio;
    private Calendar fechaEntrega;
    private Calendar fechaLimite;
    private String estado;
    private String faseProyecto;
    private Ingeniero ingeniero;
    private String justificacion;

    public Tarea(String tipoTarea, int duracion, String nombre, String descripcion,String faseProyecto, Ingeniero ingeniero) {
        this.tipoTarea = tipoTarea;
        this.duracion = duracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = Calendar.getInstance();
        this.faseProyecto = faseProyecto;
        this.ingeniero = ingeniero;
        estado = "En Desarrollo";
        this.CalcularFechaFinal();
    }
    public void CerrarTarea ()
    {    
        if(EstaRetrasado())
        {
            this.estado = "Finalizado Con Retraso";
        }
        else
        {
            this.estado = "Finalizado";
        }
    }
    public void ActualizarEstadoTarea ()
    {    
        if(EstaRetrasado())
        {
            this.estado = "En Desarrollo Con restraso";
        }
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public Calendar getFechaLimite() {
        return fechaLimite;
    }
    
    public boolean EstaRetrasado ()
    {    
        Calendar fechaActual = Calendar.getInstance();
        return fechaActual.compareTo(fechaLimite) > 0;
    }
    public String ObtenerFecharCorta (Calendar fecha)
    {
        SimpleDateFormat formato  =  new SimpleDateFormat("dd/MM/yyyy");
        String fechaCadena = formato.format(fecha.getTime());
        return fechaCadena;
    }
    public void AgregarDiasAFecha (Calendar fecha)
    {
        fecha = Calendar.getInstance();
        fecha.add(Calendar.DAY_OF_YEAR, this.duracion);
    }
    public void EstablecerFechaEntrega ()
    {
        this.fechaEntrega = Calendar.getInstance();
    }
    public void CalcularFechaFinal ()
    {
        Date dt = new Date();
        this.fechaLimite = Calendar.getInstance();
        this.fechaLimite.setTime(dt);
        this.fechaLimite.add(Calendar.DAY_OF_YEAR, this.duracion);
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    
    public int getIdTarea() {
        return IdTarea;
    }

    public void setIdTarea(int IdTarea) {
        this.IdTarea = IdTarea;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFaseProyecto() {
        return faseProyecto;
    }

    public void setFaseProyecto(String faseProyecto) {
        this.faseProyecto = faseProyecto;
    }

    public Ingeniero getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(Ingeniero ingeniero) {
        this.ingeniero = ingeniero;
    }

    @Override
    public String toString() {
        return "Tarea{" + "IdTarea=" + IdTarea + ", tipoTarea=" + tipoTarea + ", duracion=" + duracion + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + ", faseProyecto=" + faseProyecto + '}';
    }

    
    
}
