import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Colegio
{
    HashMap<String,String> hashmapColegio;

    public Colegio ()
    {
        this.hashmapColegio = new HashMap<>();
    }
    public void addAlumno (String nacionalidad, String apellido)
    {
        ///apellido key, nacionalidad valor.
        this.hashmapColegio.put(apellido,nacionalidad);
    }

    public void showAll ()
    {
        ///Creo otro hashmap de nacionalidades.
        ///Nacionalidad key, value contador.
        HashMap<String,Integer> nacionalidades = new HashMap<>();
        int contador = 0;

        ///Recorro mi hashmap principal
        for(String nacionalidad: this.hashmapColegio.values())
        {
            ///Si el nuevo hashmap contiene la key(nacionalidad) que se esta iterando del hashmap principal
            ///el contador se guarda la cantidad de nacionalidades iguales que hay en el hashmap principal
            ///y se agrega la nueva que se encontro y se suma uno en el contador(value).
            if(nacionalidades.containsKey(nacionalidad))
            {
                contador = nacionalidades.get(nacionalidad);
                nacionalidades.put(nacionalidad,contador + 1); //sobreescribiendo.
            }
            else
            {
                ///Si no la contiene, se crea esa nacionalidad con el contador inicial en uno.
                ///KEY NACIONALIDAD, CONTADOR VALOR.
                nacionalidades.put(nacionalidad,1);
            }
        }
        ///Entry set para iterar sobre un hashmap
        for (Map.Entry<String, Integer> entry : nacionalidades.entrySet())
        {
            System.out.println("Nacionalidad: " + entry.getKey() + " Cantidad de alumnos de esa nacionalidad: " + entry.getValue());
        }
        ///Se agregan a otro hashmap para actualizar el valor (cantidad).
    }
    public void showNacionalidad (String nacionalidad)
    {
        int contador = 0;

        for (String pais: this.hashmapColegio.values())
        {
            if(nacionalidad.equalsIgnoreCase(pais))
            {
                contador++;
            }
        }
        System.out.println("Nacionalidad elegida: " + nacionalidad);
        System.out.println("Nº de alumnos de la nacionalidad elegida: " + contador);

    }
    public void showNacionalidadMasApellidos (String nacionalidad)
    {
        int contador = 0;
        ArrayList<String> apellidos = new ArrayList<String>();

        for (Map.Entry<String,String> entry : this.hashmapColegio.entrySet())
        {
           if(entry.getValue().equalsIgnoreCase(nacionalidad))
           {
               contador++;
               apellidos.add(entry.getKey());
           }
        }
        System.out.println("Nacionalidad elegida: " + nacionalidad);
        System.out.println("Nº de alumnos de la nacionalidad elegida: " + contador);
        System.out.println("Apellidos: ");
        System.out.println(apellidos.toString());
    }

    public void cuantos ()
    {
        HashSet<String> nacionalidadesDiferentes = new HashSet<>();

        for (String nacionalidad : this.hashmapColegio.values())
        {
            nacionalidadesDiferentes.add(nacionalidad);
        }

        int cantidadDiferentes = nacionalidadesDiferentes.size();

        System.out.println("En el colegio hay " + cantidadDiferentes + " nacionalidades diferentes.");
    }

    public void borra ()
    {
       this.hashmapColegio.clear();
    }
}
