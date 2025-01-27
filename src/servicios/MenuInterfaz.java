package servicios;

/**
 * MenuInterfaz - Interfaz que gestiona lo relacionado con los menús
 * @author jgarlla
 * 270125
 */
public interface MenuInterfaz
{
    /**
     * mostrarMenu - imprimePorConsola las opciones del menu
     * @author jgarlla
     * 270125
     */
    public void mostrarMenu();

    /**
     * obtenerOpcion - guarda en una variable a nivel de clase la opción que intruduce el usuario
     * @author jgarlla
     * 270125
     */
    public void obtenerOpcion();

    /**
     * llamarOpcionSeleccionada - llama al metodo correspondiente de OperativaImplementacion en funcion de la opcion seleccionada
     * @author jgarlla
     * 270125
     */
    public void llamarOpcionSeleccionada();
}
