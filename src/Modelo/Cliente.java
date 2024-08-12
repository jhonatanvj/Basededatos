/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class Cliente {

    private String nombre;
    private String celular;
    private ArrayList<String> productosComprados;

    public Cliente(String nombre, String celular) {
        this.nombre = nombre;
        this.celular = celular;
        this.productosComprados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ArrayList<String> getProductosComprados() {
        return productosComprados;
    }

    public void agregarProductoComprado(String producto) {
        this.productosComprados.add(producto);
    }
}
