package DOSW.com;

public class Ticket {
    private String descripcion;
    private Nivel nivel;
    private Prioridad prioridad;
    private String resueltoPor = "Pendiente";

    public Ticket(String descripcion, Nivel nivel, Prioridad prioridad) {
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.prioridad = prioridad;
    }

    public Nivel getNivel() { return nivel; }
    public Prioridad getPrioridad() { return prioridad; }
    public void setResueltoPor(String tecnico) { resueltoPor = tecnico; }

    public String toString() {
        return descripcion + " | " + nivel + " | " + prioridad + " | " + resueltoPor;
    }
}
