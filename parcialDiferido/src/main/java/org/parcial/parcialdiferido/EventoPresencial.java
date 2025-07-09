package org.parcial.parcialdiferido;

import java.time.LocalDate;

public class EventoPresencial {
    private int eventoID;
    private String nombre;
    private String descripcion;
    private LocalDate fechaEvento;
    private String estado;
    private String lugar;
    private String tipoLugar;

    public EventoPresencial() {
    }

    public EventoPresencial(int eventoID,
                            String nombre,
                            String descripcion,
                            LocalDate fechaEvento,
                            String estado,
                            String lugar,
                            String tipoLugar) {
        this.eventoID = eventoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEvento = fechaEvento;
        this.estado = estado;
        this.lugar = lugar;
        this.tipoLugar = tipoLugar;
    }

    public int getEventoID() {
        return eventoID;
    }

    public void setEventoID(int eventoID) {
        this.eventoID = eventoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }
}
