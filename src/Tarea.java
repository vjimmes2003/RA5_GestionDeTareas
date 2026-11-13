import java.sql.SQLOutput;



/*
* Toda la documentación debe aparecer aquí.
* */
public class Tarea {
    // Atributos: Datos de cada tarea.
    // esto es un comentario
    private String nombre;
    private String asignatura;
    private boolean completada;

    // Constructor para crear un objeto TAREA
    public Tarea(String nombre, String asignatura){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.completada = false;
    }
    // Metodo para marcar como completada una tarea
    public void completarTarea(){
        completada = true;
    }
    // Metodo para mostrar los datos de la tarea
    public void mostrarTarea(){
        System.out.printf("%nNombre: %s%nAsignatura: %s",nombre,asignatura);
    }
}