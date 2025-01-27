package DTOs;

import controladores.Inicio;

import java.time.LocalDateTime;

/**
 * ElementoDTO - DTO para la abstraccion de una pieza de vajilla
 * @author jgarlla
 * 270125
 */
public class ElementoDTO
{
    long idElemento;
    String codigoElemento = "aaaaa";
    String nombreelemento = "aaaaa";
    String descripcionDeElemento = "aaaaa";
    int cantidadElemento = 0;
    LocalDateTime fchAlta = LocalDateTime.MAX;
    LocalDateTime fchBaja = LocalDateTime.MAX;

    //LocalDateTime fchAlta = LocalDateTime.parse("9999-12-31T00:00:00");
    //LocalDateTime fchBaja = LocalDateTime.parse("9999-12-31T00:00:00");

    public ElementoDTO(String nombreelemento, String descripcionDeElemento, int cantidadElemento)
    {
        this.idElemento =+ Inicio.ultimoIDGenerado;
        this.codigoElemento = nombreelemento.substring(0,3).concat(Long.toString(idElemento));
        this.nombreelemento = nombreelemento;
        this.descripcionDeElemento = descripcionDeElemento;
        this.cantidadElemento = cantidadElemento;
        this.fchAlta = LocalDateTime.now();
    }

    public String getCodigoElemento() {
        return codigoElemento;
    }

    public void setFchBaja() {
        this.fchBaja = LocalDateTime.now();
    }

    public void setCantidadElemento(int cantidadElemento) {
        this.cantidadElemento = cantidadElemento;
    }

    public LocalDateTime getFchBaja() {
        return fchBaja;
    }

    public String toStringOther()
    {
        String info = "ID: ".concat(Long.toString(idElemento)).concat(", Nombre: ").concat(nombreelemento).concat(", Cantidad: ").concat(Integer.toString(cantidadElemento));
        return info;
    }

    @Override
    public String toString()
    {
        String info = Long.toString(idElemento).concat(", ").concat(codigoElemento).concat(", ").concat(nombreelemento).concat(", ").concat(descripcionDeElemento).concat(", ").concat(Integer.toString(cantidadElemento));
        return info;
    }
}
