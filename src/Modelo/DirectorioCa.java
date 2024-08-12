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
public class DirectorioCa {
    
    private ArrayList<Categoria> DirectorioCa;

    public DirectorioCa() {
        DirectorioCa = new ArrayList<>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {
        Categoria categoriaAseo = new Categoria("Aseo");
        
        // Crear una subcategoría con productos "quemados"
        Subcategoria subCocina = new Subcategoria("Cocina", "Jabón de cocina");
        subCocina.agregarProducto("Esponja");
        subCocina.agregarProducto("Detergente");

        // Agregar la subcategoría a la categoría
        categoriaAseo.agregarSubcategoria(subCocina);
        
        // Agregar la categoría al directorio
        DirectorioCa.add(categoriaAseo);
    }

    public void agregarDato(String dato) {
        Categoria nuevaCategoria = new Categoria(dato);
        DirectorioCa.add(nuevaCategoria);
    }

    public void agregarSubcategoria(String tipoCategoria, Subcategoria subcategoria) {
        for (Categoria categoria : DirectorioCa) {
            if (categoria.getTipo().equalsIgnoreCase(tipoCategoria)) {
                categoria.agregarSubcategoria(subcategoria);
                return;
            }
        }
        System.out.println("Categoría no encontrada: " + tipoCategoria);
    }

    public ArrayList<Categoria> getDirectorioCa() {
        return DirectorioCa;
    }

    public void setDirectorioCa(ArrayList<Categoria> DirectorioCa) {
        this.DirectorioCa = DirectorioCa;
    }
}