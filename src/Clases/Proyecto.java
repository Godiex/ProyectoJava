
package Clases;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
public class Proyecto implements Serializable
{
    private String nombre;
    private int duracion;
    private Calendar fechaInicio;
    private Calendar fechaEntrega;
    private Calendar fechaLimite;
    private String estado;
    private ArrayList<Tarea> tareas;
    private ArrayList<Ingeniero> ingenieros;
    private float porcentajeTareaRealizadas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.porcentajeTareaRealizadas = 0;
        this.fechaInicio = Calendar.getInstance();
        this.tareas = new ArrayList<>();
        this.ingenieros = new ArrayList<>();
        this.estado = "En Desarrollo"; 
        this.CalcularFechaFinal();
    }                  

    public ArrayList<Ingeniero> getIngenieros() {
        return ingenieros;
    }
    public void AddIngeniero(Ingeniero ingeniero)
    {
        Ingeniero ingenieroBuscado = BuscarIngeniero(ingeniero);
        if(ingenieroBuscado == null)
        {
            this.ingenieros.add(ingeniero);
        }
    }
    public Ingeniero BuscarIngeniero(Ingeniero ingeniero)
    {
        for (Ingeniero Ingeniero : ingenieros) {
            if(Ingeniero.getCedula() == ingeniero.getCedula())
            {
                return ingeniero;
            }
        }
        return null;
    }
    public void setIngenieros(ArrayList<Ingeniero> ingenieros) {
        this.ingenieros = ingenieros;
    }
    public String CerrarProyecto ()
    {    
        if(LasTareasEstanTerminadas())
        {
            if(EstaRetrasado())
            {
                this.estado = "Finalizado Con Retraso";
            }
            else
            {
                this.estado = "Finalizado";
                return "proyecto "+ this.estado;
            }
        }
        return "Error no se ha podido cerrar el proyecto por que aun hay tareas sin finalizar";
    }
    public void addTarea (Tarea tarea)
    {
        int IdTarea =  tareas.size() + 1;
        tarea.setIdTarea(IdTarea);
        this.tareas.add(tarea);
    }
    public boolean EstaRetrasado ()
    {    
        Calendar fechaActual = Calendar.getInstance();
        return fechaActual.compareTo(fechaLimite) > 0;
    }
    public Tarea BuscarTarea(int idTarea)
    {
        for (Tarea tarea : tareas) {
            if(tarea.getIdTarea() == idTarea)
            {
                return tarea;
            }
        }
        return null;
    }
    public void Actualizar(Tarea tarea)
    {
        int posicion = ObtenerPosicionDeTarea(tarea.getIdTarea());
        tareas.set(posicion, tarea);
    }
    public int ObtenerPosicionDeTarea(int idTarea)
    {
        int posicion = 0;
        for (Tarea tarea : tareas)
        {
            if(tarea.getIdTarea() == idTarea)
            {
                return posicion;
            }
            posicion = posicion + 1;
        }
        return posicion;
    }
    public ArrayList<Tarea> ObtenerTareasDeIngeniero (String cedula)
    {
        ArrayList<Tarea> tareasIngeniero = new ArrayList<>();
        tareas.stream().filter((tarea) -> (tarea.getIngeniero().getCedula().equals(cedula))).forEachOrdered((tarea) -> {
            tareasIngeniero.add(tarea);
        });
        return tareasIngeniero;
    }
    public boolean LasTareasEstanTerminadas ()
    { 
        int cantidadTareas = tareas.size();
        int tareasRealizadas = 0;
        for (Tarea tarea : tareas) {
            if(tarea.getTipoTarea().equals(""))
            {
                if(tarea.getEstado().equals("Finalizado") || tarea.getEstado().equals("Finalizado Con Retraso"))
                {
                    tareasRealizadas = tareasRealizadas + 1;
                }
            }
        }
        return tareasRealizadas == cantidadTareas;
    }
    public float ObtenerPorcentajeTareaRealizadas()
    {
        int catidadTareas = tareas.size();
        int catidadTareasRealizadas = 0;
        for (Tarea tarea : tareas) {
            if (tarea.getEstado().equals("Finalizado") || tarea.getEstado().equals("Finalizado Con Retraso")) {
                catidadTareasRealizadas = catidadTareasRealizadas + 1; 
            }
        }
        return catidadTareasRealizadas * 100 / catidadTareas;  
    }
    public String ObtenerFecharCorta (Calendar fecha)
    {
        SimpleDateFormat formato  =  new SimpleDateFormat("dd/MM/yyyy");
        String fechaCadena = formato.format(fecha.getTime());
        return fechaCadena;
    }
    protected void AgregarDiasAFecha (Calendar fecha)
    {
        Date dt = new Date();
        fecha = Calendar.getInstance();
        fecha.setTime(dt);
        fecha.add(Calendar.DATE, this.duracion);
    }
    public void EstablecerFechaEntrega ()
    {
        this.fechaEntrega = Calendar.getInstance();
    }
    public void CalcularFechaFinal ()
    {
        int contadorDeDias = 0;
        for (Tarea tarea : tareas) {
            contadorDeDias = contadorDeDias + tarea.getDuracion();
        }
        this.duracion = contadorDeDias;
        Date dt = new Date();
        this.fechaLimite = Calendar.getInstance();
        this.fechaLimite.setTime(dt);
        this.fechaLimite.add(Calendar.DAY_OF_YEAR, this.duracion);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Calendar fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Calendar getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Calendar fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }

    public float getPorcentajeTareaRealizadas() {
        return porcentajeTareaRealizadas;
    }

    public void setPorcentajeTareaRealizadas(float porcentajeTareaRealizadas) {
        this.porcentajeTareaRealizadas = porcentajeTareaRealizadas;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "nombre :" + nombre + ", duracion: " + duracion + ", fechaInicio: " + ObtenerFecharCorta(fechaInicio) + ", fechaLimite: " + ObtenerFecharCorta(fechaLimite) + ", estado=" + estado + '}';
    }
    
    public int EncontrarIngeniero(String cedula) {
        int contador = 0;
        for (Tarea tarea: this.tareas) {
            if (tarea.getIngeniero().getCedula().equals(cedula)) contador += 1;
        }
        if (contador > 0) return 1;
        return 0;
    }
    
}
