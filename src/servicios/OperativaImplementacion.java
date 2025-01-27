package servicios;

import DTOs.ElementoDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * OperativaImplementacion - implementa a OperativaInterfaz
 * @author jgarlla
 * 270125
 */
public class OperativaImplementacion implements OperativaInterfaz
{
    List<ElementoDTO> elementos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    @Override
    public void altaElemento() {
        String nombre, descricion;
        int cantidad;

        System.out.println("Introduce el nombre del nuevo elemento:");
        nombre = sc.nextLine();

        System.out.println("Introduce la descripción:");
        descricion = sc.nextLine();

        System.out.println("Introduce la cantidad:");
        cantidad = sc.nextInt();
        sc.nextLine();

        elementos.add(new ElementoDTO(nombre, descricion, cantidad));
    }


    @Override
    public void bajaElemento()
    {
        System.out.println("Elementos actuales:");
        mostrarElementos();

        System.out.println("Introduce el código del elemento deseado:");
        ElementoDTO elementoSeleccionado = buscarElemento(sc.next());
        if(elementoSeleccionado != null)
        {
            elementoSeleccionado.setFchBaja();
        }
        else
        {
            System.out.println("No se ha encontrado el elemento");
        }
    }


    /**
     * buscarElemento - devuelve el primer ElementoDTO de la lista cuyo codigoElemento coincida con el introducido por el usuario
     * @author jgarlla
     * @return ElementoDTO elementoADevolver
     * 270125
     */
    private ElementoDTO buscarElemento(String codigoABuscar)
    {
        ElementoDTO elementoADevolver = null;
        for (ElementoDTO elemento : elementos)
        {
            if(elemento.getCodigoElemento().equals(codigoABuscar))
            {
                elementoADevolver = elemento;
            }
        }
        return elementoADevolver;
    }

    @Override
    public void actualizarCantidadElemento()
    {
        System.out.println("Elementos actuales:");
        mostrarElementos();

        System.out.println("Introduce el código del elemento seleccionado:");
        ElementoDTO elementoSeleccionado = buscarElemento(sc.next());
        if(elementoSeleccionado != null)
        {
            int nuevaCantidad;
            System.out.println("Introduce la nueva cantidad:");
            nuevaCantidad = sc.nextInt();
            elementoSeleccionado.setCantidadElemento(nuevaCantidad);
        }
        else
        {
            System.out.println("No se ha encontrado el elemento");
        }
    }

    @Override
    public void mostrarElementos()
    {
        for (ElementoDTO elemento : elementos)
        {
            if(elemento.getFchBaja() == LocalDateTime.MAX)
            {
                System.out.println(elemento);
            }
        }
    }

    @Override
    public void mostrarElementosOther()
    {
        for (ElementoDTO elemento : elementos)
        {
            if(elemento.getFchBaja() == LocalDateTime.MAX)
            {
                System.out.println(elemento.toStringOther());
            }
        }
    }
}
