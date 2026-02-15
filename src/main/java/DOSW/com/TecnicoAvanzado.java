package DOSW.com;

public class TecnicoAvanzado extends Tecnico {
    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivel() == Nivel.AVANZADO;
    }
}
