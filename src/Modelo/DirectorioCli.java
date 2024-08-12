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
public class DirectorioCli {

    private ArrayList<Cliente> DirectorioCli;

    public DirectorioCli() {
        DirectorioCli = new ArrayList<Cliente>();
        cargarDatosIniciales();
    }

    public void cargarDatosIniciales() {
        Cliente x = new Cliente("Samuel", "3209023117");
        DirectorioCli.add(x);
    }

    public void agregarDato(String nombre, String celular) {
        Cliente x = new Cliente(nombre, celular);
        DirectorioCli.add(x);
    }

    public ArrayList<Cliente> getDirectorioCli() {
        return DirectorioCli;
    }

    public Cliente buscarClientePorNombre(String nombre) {
        for (Cliente cliente : DirectorioCli) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null; // Retorna null si no encuentra el cliente
    }
}
