/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantes
 */
public class Categoria {
    
    private String tipo;
    private List<Subcategoria> subcategorias;

    public Categoria(String tipo) {
        this.tipo = tipo;
        this.subcategorias = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void agregarSubcategoria(Subcategoria subcategoria) {
        this.subcategorias.add(subcategoria);
    }
}