
package com.example.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(int id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
    
}
