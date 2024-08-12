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
public class Subcategoria {
    
    private String tipo; // Nombre de la subcategoría
    private List<String> productos; // Lista de productos asociados a la subcategoría

    public Subcategoria(String tipo, String productoInicial) {
        this.tipo = tipo;
        this.productos = new ArrayList<>();
        this.productos.add(productoInicial); // Agregar el producto inicial al crear la subcategoría
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void agregarProducto(String producto) {
        this.productos.add(producto);
    }
}