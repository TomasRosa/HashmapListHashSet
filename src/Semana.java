import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Semana
{
    private ArrayList<String> diasDelaSemana;

    public Semana ()
    {
        this.diasDelaSemana = new ArrayList<String>();
    }
    public void agregaDiasALaSemana ()
    {
        this.diasDelaSemana.add("Lunes");
        this.diasDelaSemana.add("Martes");
        this.diasDelaSemana.add("Miercoles");
        this.diasDelaSemana.add("Juernes");
        this.diasDelaSemana.add("Sabado");
        this.diasDelaSemana.add("Domingo");
    }
    public ArrayList<String> copiarAOtraLista (ArrayList<String> listaDos)
    {
        for(String dia: this.diasDelaSemana)
        {
            listaDos.add(dia);
        }
        return listaDos;
    }
    public void mostrar3y4ListaOriginal ()
    {
        System.out.println(this.diasDelaSemana.get(3));
        System.out.println(this.diasDelaSemana.get(4));
    }
    public void mostrarPrimerYUltimoElementoListaOriginal()
    {
        int ultimo = this.diasDelaSemana.size() - 1;

        System.out.printf(this.diasDelaSemana.get(0));
        System.out.printf(this.diasDelaSemana.get(ultimo));
    }
    public void eliminarJuernesVerSiEliminaONoConForEach ()
    {
        for(String dia: this.diasDelaSemana)
        {
            if(dia.equalsIgnoreCase("Juernes"))
            {
                this.diasDelaSemana.remove(dia);
            }
        }
    }
    public void eliminarJuernesVerSiEliminaONoConIterator ()
    {
        Iterator<String> it = this.diasDelaSemana.iterator();
        int i = 0;
        ///Preguntar por que solo me eliminaria el primer Juernes que encuentre.
        while (it.hasNext())
        {
            String verificar = it.next();
            {
                if (verificar.equalsIgnoreCase("Juernes"))
                {
                    it.remove();
                }
            }
        }
    }
    public void mostrarConIterador ()
    {
        Iterator<String> it = this.diasDelaSemana.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    public boolean buscarSiExisteElementoLunesConIterador ()
    {
        Iterator<String> it = this.diasDelaSemana.iterator();
        Boolean retornar = false;

        while(it.hasNext())
        {
            String verificar = it.next();
            if(verificar.equalsIgnoreCase("Lunes"))
            {
                retornar = true;
            }
        }
        return retornar;
    }
    ///Preguntar.
    public void ordenarLista()
    {
        Collections.sort(this.diasDelaSemana);
    }
    public void borrarTodosLosElementosDeLaLista ()
    {
        this.diasDelaSemana.clear();
    }
}
