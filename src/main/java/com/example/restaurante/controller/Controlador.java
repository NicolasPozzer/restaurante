
package com.example.restaurante.controller;

import com.example.restaurante.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controlador {
    
    /*
    ======================================================
    ===========CREA LISTA Y BUSCA OBJETOS POR ID==========
    ======================================================
    */
    
    @GetMapping("/platos/{num_plato}")
    @ResponseBody
    public Plato traerPlatos(@PathVariable int num_plato){
        
    List<Plato> listaPlatos = new ArrayList<Plato>();
    
    //Simulamos la db logica agregando elementos a la lista
    //Si ya tuviera una base de datos tendria que borrar los .add de abajo y solo llamar a la lista de la db
    listaPlatos.add (new Plato(1,"Milanesa",420.50,"Milas de pollo con pure"));
    listaPlatos.add (new Plato(2, "Ravioles",899.00,"Ravioles con salsa Blanca sin TAC"));
    listaPlatos.add (new Plato(3, "Arroz con pollo",350.00,"Arroz blanco simple con pollo light"));
    listaPlatos.add (new Plato(4, "Fideos",700.00,"Fideos con tuco y Albondigas"));
    listaPlatos.add(new Plato(5,"Locro",1200.00,"Locro Recien cocinado multiingredientes"));
    
        //Buscamos en la lista de platos a ver si hay uno con esa id
        for(Plato plat : listaPlatos){
            if(plat.getId() == num_plato){
                //Si encontro devuelve el plato completo
                return plat;
            }
        }
        
       //Si no encontro nada, devuelve null
       return null;
                 
            
    }
    
}
