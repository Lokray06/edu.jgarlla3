package servicios;

import java.util.Scanner;
import controladores.Inicio;

/**
 * MenuImplementacion - implementa a MenuInterfaz
 * @author jgarlla
 * 270125
 */
public class MenuImplementacion implements MenuInterfaz
{
    OperativaInterfaz operativa = new OperativaImplementacion();

    Scanner sc = new Scanner(System.in);
    private byte opcion = 0;

    @Override
    public void mostrarMenu()
    {
        System.out.println("--------STOCKAJE VAJILLA--------");
        System.out.println("1. Dar de alta un nuevo elemento");
        System.out.println("2. Dar de baja nuevo elemento");
        System.out.println("3. Modificar cantidad de un elemento");
        System.out.println("4. Salir");
        System.out.println("--------------------------------");
    }

    @Override
    public void obtenerOpcion()
    {
        boolean valido = false;
        byte opcion = 0;
        while (!valido)
        {
            System.out.println("Seleccione una opción (1-4):");
            opcion = sc.nextByte();
            if(opcion >= 1 || opcion <= 4)
            {
                valido = true;
            }
        }
        this.opcion = opcion;
    }

    @Override
    public void llamarOpcionSeleccionada()
    {
        switch (this.opcion)
        {
            case 1:
                operativa.altaElemento();
                break;
            case 2:
                operativa.bajaElemento();
                break;
            case 3:
                operativa.actualizarCantidadElemento();
                break;
            case 4:
                Inicio.cerrarSolicitado = true;
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        operativa.mostrarElementosOther();
    }
}
