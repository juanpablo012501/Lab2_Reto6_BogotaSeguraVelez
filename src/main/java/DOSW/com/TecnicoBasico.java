package DOSW.com;

public class TecnicoBasico extends Tecnico{
    @Override
    protected boolean puedeResolver(Ticket ticket) {
        return ticket.getNivel() == Nivel.BASICO;
    }
}
