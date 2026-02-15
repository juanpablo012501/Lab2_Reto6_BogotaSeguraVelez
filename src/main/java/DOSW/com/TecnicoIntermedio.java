package DOSW.com;

public class TecnicoIntermedio extends Tecnico{
    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivel() == Nivel.INTERMEDIO;
    }
}
