package controladores;

import servicios.MenuImplementacion;

/**
 * Inicio - Clase principal
 * @author jgarlla
 * 270125
 */
public class Inicio
{
    public static boolean cerrarSolicitado = false;
    public static long ultimoIDGenerado = 0;

    /**
     * main - metodo de entrada a la aplicacion
     * @author jgarlla
     * 270125
     */
    public static void main(String[] args)
    {
        MenuImplementacion menu = new MenuImplementacion();
        while (!cerrarSolicitado)
        {
            menu.mostrarMenu();
            menu.obtenerOpcion();
            menu.llamarOpcionSeleccionada();
        }
        System.out.println("Saliendo de la aplicación...");
    }
}