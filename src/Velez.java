import java.util.HashSet;
import java.util.Iterator;
public class Velez
{
    private HashSet<String> jugadores;
    private HashSet<String> jugadores2;

    public Velez ()
    {
        this.jugadores = new HashSet<String>();
        this.jugadores2 = new HashSet<String>();
    }
    public void agregarJugadoresDeVelez ()
    {
        this.jugadores.add("Pellerano");
        this.jugadores.add("Godin");
        this.jugadores.add("Thiago Almada");
        this.jugadores.add("Ustari");
        this.jugadores.add("Cabrera");
        this.jugadores.add("Pinola");
    }
    public void agregarJugadoresDeVelez2 ()
    {
        this.jugadores2.add("Pique");
        this.jugadores2.add("Busquets");
    }
    ///Preguntar como modularizar.
    public void mostrarJugadoresVelezEquipo1 ()
    {
        Iterator<String> it = this.jugadores.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public void mostrarJugadoresVelezEquipo2 ()
    {
        Iterator<String> it = this.jugadores2.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public Boolean existeNeymar ()
    {
        Iterator<String> it = this.jugadores.iterator();
        Boolean retornar = false;
        while(it.hasNext())
        {
            String verificar = it.next();
            if(verificar.equalsIgnoreCase("Neymar"))
            {
                retornar = true;
            }
        }
        return retornar;
    }
    public boolean consultarSiLosElementosDeJugadores2ExistenEnJugadores1 ()
    {
        boolean resultado = false;
        ///Chequea si en jugadores esta lo que hay en jugadores 2.
        resultado = this.jugadores.containsAll(this.jugadores2);
        return resultado;
    }
    public void unirJugadores1ConJugadores2 ()
    {
        this.jugadores.addAll(this.jugadores2);
        System.out.println("Jugadores 1 unido con jugadores 2: ");
        System.out.println(this.jugadores);
    }
    public int eliminarJugadores2 ()
    {
        this.jugadores2.clear();
        int numeroDeJugadores2 = this.jugadores2.size();
        return numeroDeJugadores2;
    }
}
