package DOSW.com;

public abstract class Tecnico {
    protected Tecnico siguiente;

    public void setSiguiente(Tecnico siguiente) {
        this.siguiente = siguiente;
    }

    public void procesar(Ticket ticket) {
        if (puedeResolver(ticket)) {
            ticket.setResueltoPor(this.getClass().getSimpleName());
        } else if (siguiente != null) {
            siguiente.procesar(ticket);
        }
    }

    protected abstract boolean puedeResolver(Ticket ticket);
}
