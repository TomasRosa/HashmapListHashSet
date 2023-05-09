import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese que ejercicio desea ver: ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                Colegio cole = new Colegio();

                cole.addAlumno("Portuguesa","Ronaldo");
                cole.addAlumno("Argentina","Martinez");
                cole.addAlumno("Portuguesa","Felix");
                cole.addAlumno("Brasilera","Jairzinho");
                cole.addAlumno("Peruana","Advincula");
                cole.addAlumno("Argentina","Romero");

                cole.showAll();

                System.out.println("Ingresa la nacionalidad de la que desea saber cuantos alumnos hay: ");
                scan.nextLine();
                String nacionalidad = scan.nextLine();

                cole.showNacionalidadMasApellidos(nacionalidad);

                cole.cuantos();

                System.out.println("HashMap antes de borrar elementos: ");
                cole.showAll();
                System.out.println("Borrando elementos de HashMap...");
                cole.borra();
                System.out.println("HashMap luego de borrar elementos: ");
                cole.showAll();
            }
            case 2:
            {
                Semana semana = new Semana();
                ///1,2.
                semana.agregaDiasALaSemana();
                System.out.println("Dias de la semana agregados: ");
                semana.mostrarConIterador();
                ///3.
                ArrayList<String> lista2 = new ArrayList<String>();
                lista2 = semana.copiarAOtraLista(lista2);
                System.out.println("Lista copiada: ");
                mostrarListaDos(lista2);
                ///4.
                System.out.println("Posicion 3 y 4 de dias de la semana. ");
                semana.mostrar3y4ListaOriginal();
                ///5.
                System.out.println("Primera y ultima posicion de los dias de la semana. ");
                semana.mostrarPrimerYUltimoElementoListaOriginal();
                ///6y7 Es mostrar con iterator.
                /*
                System.out.println("Elimina con for each??");
                semana.eliminarJuernesVerSiEliminaONoConForEach();
                */
                System.out.println("Elimina con iterator?? ");
                semana.eliminarJuernesVerSiEliminaONoConIterator();
                System.out.println("Lista luego de eliminar juernes: ");
                semana.mostrarConIterador();
                ///8
                if (semana.buscarSiExisteElementoLunesConIterador())
                {
                    System.out.println("Si existe.");
                }
                else
                {
                    System.out.println("No existe.");
                }
                ///9
                semana.ordenarLista();
                System.out.println("Lista ordenada: ");
                semana.mostrarConIterador();
                ///10
                System.out.println("Eliminar lista: ");
                semana.borrarTodosLosElementosDeLaLista();
                System.out.println("Lista luego de ser eliminada: ");
                semana.mostrarConIterador();
                break;
            }
            case 3:
            {
                ///1
                Velez jugadores = new Velez();
                jugadores.agregarJugadoresDeVelez();

                ///2
                if(jugadores.existeNeymar())
                {
                    System.out.println("Si se encuentra neymar en el equipo. ");
                }
                else
                {
                    System.out.println("No se encuentra neymar en el equipo. ");
                }
                ///3

                jugadores.agregarJugadoresDeVelez2();

                System.out.println("Jugadores equipo 1:");
                jugadores.mostrarJugadoresVelezEquipo1();

                System.out.println("Jugadores equipo 2:");
                jugadores.mostrarJugadoresVelezEquipo2();
                System.out.println("punto a verificar: ");
                ///4
                ///PREGUNTAR XQ ME DEVUELVE TRUE.
                if(jugadores.consultarSiLosElementosDeJugadores2ExistenEnJugadores1() == true)
                {
                    System.out.println("Todos los jugadores del equipo 2 existen en el equipo 1.");
                }
                else
                {
                    System.out.println("No todos los jugadores del equipo 2 existen en el equipo 1.");
                }

                ///5
                System.out.println("Jugadores equipo 1 antes de unir: ");
                jugadores.mostrarJugadoresVelezEquipo1();
                System.out.printf("Jugadores equipo 2 antes de unir: ");
                jugadores.mostrarJugadoresVelezEquipo2();
                System.out.println("Uniendo jugadores...");
                jugadores.unirJugadores1ConJugadores2();
                ///6
                System.out.println("Eliminando jugadores 2...");
                int cantidad = jugadores.eliminarJugadores2();
                System.out.println("Quedan " + cantidad + " jugadores");
                jugadores.mostrarJugadoresVelezEquipo2();
            }
        }
    }
    public static void mostrarListaDos (ArrayList<String> lista2)
    {
        for(String dias: lista2)
        {
            System.out.println(dias);
        }
    }
}