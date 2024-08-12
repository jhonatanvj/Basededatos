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
public class DirectorioSub {

    private ArrayList<Subcategoria> DirectorioSub;

    public DirectorioSub() {
        DirectorioSub = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        // Ya que ahora las subcategorías están ligadas a las categorías, este método puede estar vacío
    }

    public void agregarDato(String tipo, String producto) {
        Subcategoria nuevaSubcategoria = new Subcategoria(tipo, producto);
        DirectorioSub.add(nuevaSubcategoria);
    }

    public ArrayList<Subcategoria> getDirectorioSub() {
        return DirectorioSub;
    }

    public void setDirectorioSub(ArrayList<Subcategoria> DirectorioSub) {
        this.DirectorioSub = DirectorioSub;
    }
}