/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.DirectorioCa;
import Modelo.DirectorioCli;
import Modelo.DirectorioSub;
import Modelo.Subcategoria;
import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class AplMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        DirectorioCa ca = new DirectorioCa();
        DirectorioCli directorioClientes = new DirectorioCli();
        int opcion;

        System.out.println("Bienvenido a la tienda");
        System.out.println("Elija una opción");
        System.out.println("1. Comprar productos");
        System.out.println("2. Agregar categoría");
        System.out.println("3. Agregar subcategoría");
        System.out.println("4. Ver categorías");
        System.out.println("5. Agregar cliente");
        System.out.println("6. Ver clientes y sus compras");
        System.out.println("7. Salir");

        do {
            opcion = Integer.parseInt(leer.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Clientes disponibles:");
                    for (Cliente cliente : directorioClientes.getDirectorioCli()) {
                        System.out.println("- " + cliente.getNombre());
                    }
                    System.out.println("Elige un cliente:");
                    String clienteElegido = leer.nextLine();

                    Cliente clienteSeleccionado = directorioClientes.buscarClientePorNombre(clienteElegido);
                    if (clienteSeleccionado == null) {
                        System.out.println("Cliente no encontrado.");
                        break;
                    }

                    System.out.println("Categorías disponibles:");
                    for (Categoria categoria : ca.getDirectorioCa()) {
                        System.out.println("- " + categoria.getTipo());
                    }
                    System.out.println("Elige una categoría:");
                    String categoriaElegida = leer.nextLine();

                    Categoria categoriaSeleccionada = null;
                    for (Categoria categoria : ca.getDirectorioCa()) {
                        if (categoria.getTipo().equalsIgnoreCase(categoriaElegida)) {
                            categoriaSeleccionada = categoria;
                            break;
                        }
                    }

                    if (categoriaSeleccionada != null) {
                        System.out.println("Subcategorías disponibles:");
                        for (Subcategoria subcategoria : categoriaSeleccionada.getSubcategorias()) {
                            System.out.println("- " + subcategoria.getTipo());
                        }
                        System.out.println("Elige una subcategoría:");
                        String subcategoriaElegida = leer.nextLine();

                        Subcategoria subcategoriaSeleccionada = null;
                        for (Subcategoria subcategoria : categoriaSeleccionada.getSubcategorias()) {
                            if (subcategoria.getTipo().equalsIgnoreCase(subcategoriaElegida)) {
                                subcategoriaSeleccionada = subcategoria;
                                break;
                            }
                        }

                        if (subcategoriaSeleccionada != null) {
                            System.out.println("Productos disponibles en la subcategoría " + subcategoriaElegida + ":");
                            for (String producto : subcategoriaSeleccionada.getProductos()) {
                                System.out.println("- " + producto);
                            }
                            System.out.println("Elige un producto para comprar:");
                            String productoElegido = leer.nextLine();

                            if (subcategoriaSeleccionada.getProductos().contains(productoElegido)) {
                                System.out.println("Has comprado: " + productoElegido);
                                clienteSeleccionado.agregarProductoComprado(productoElegido);
                                System.out.println("Producto agregado a la lista de compras de " + clienteSeleccionado.getNombre());
                            } else {
                                System.out.println("Producto no encontrado.");
                            }
                        } else {
                            System.out.println("Subcategoría no encontrada.");
                        }
                    } else {
                        System.out.println("Categoría no encontrada.");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la nueva categoría:");
                    String nuevaCategoria = leer.nextLine();
                    ca.agregarDato(nuevaCategoria);
                    System.out.println("Categoría " + nuevaCategoria + " agregada con éxito.");
                    break;

                case 3:
                    System.out.println("Ingrese el nombre de la nueva subcategoría:");
                    String subcategoriaNueva = leer.nextLine();
                    System.out.println("Ingrese la categoría a la que pertenece:");
                    String categoriaPadre = leer.nextLine();
                    System.out.println("Ingrese un producto asociado a la subcategoría:");
                    String productoAsociado = leer.nextLine();

                    Subcategoria nuevaSub = new Subcategoria(subcategoriaNueva, productoAsociado);
                    ca.agregarSubcategoria(categoriaPadre, nuevaSub);

                    System.out.println("Subcategoría " + subcategoriaNueva + " agregada bajo la categoría " + categoriaPadre);
                    break;

                case 4:
                    System.out.println("Categorías disponibles:");
                    for (Categoria categoria : ca.getDirectorioCa()) {
                        System.out.println("- " + categoria.getTipo());
                    }
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del nuevo cliente:");
                    String nuevoCliente = leer.nextLine();
                    System.out.println("Ingrese el celular del nuevo cliente:");
                    String celular = leer.nextLine();
                    directorioClientes.agregarDato(nuevoCliente, celular);
                    System.out.println("Cliente " + nuevoCliente + " agregado con éxito.");
                    break;

                case 6:
                    System.out.println("Clientes y sus productos comprados:");
                    for (Cliente cliente : directorioClientes.getDirectorioCli()) {
                        System.out.println("Cliente: " + cliente.getNombre());
                        System.out.println("Productos comprados:");
                        for (String producto : cliente.getProductosComprados()) {
                            System.out.println("- " + producto);
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor elija una opción del menú.");
                    break;
            }
        } while (opcion != 7);
    }
}