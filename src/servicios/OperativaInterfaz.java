package servicios;

/**
 * OperativaInterfaz - la logica de negocio de la aplicación
 * @author jgarlla
 * 270125
 */
public interface OperativaInterfaz
{
    /**
     * altaElemento - añade a una lista en la implementacion un nuevo elemento con los datos proporcionados por el usuario
     * @author jgarlla
     * 270125
     */
    void altaElemento();

    /**
     * bajaElemento - establece fchBaja de el elemento seleccionado a la fecha actual (del tiempo en que se ejecutó)
     * @author jgarlla
     * 270125
     */
    void bajaElemento();

    /**
     * actualizarCantidadElemento - establece cantidadElemendo de el elemento seleccionado a la cantidad introducida por el usuario
     * @author jgarlla
     * 270125
     */
    void actualizarCantidadElemento();

    /**
     * mostrarElementos - lista todos los elementos que no esten dados de baja
     * FORMATO: id, codigoElemento, nombreElemento, descripcionElemento, cantidadElemento
     * @author jgarlla
     * 270125
     */
    void mostrarElementos();

    /**
     * mostrarElementosOther - lista todos los elementos que no esten dados de baja
     * FORMATO: ID: id, Nombre: nombre elemento, Cantidad: cantidadElemento
     * @author jgarlla
     * 270125
     */
    void mostrarElementosOther();
}
