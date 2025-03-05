package com.prototype.models;

import java.util.ArrayList;
import java.util.List;

import com.prototype.utils.IPrototype;

/**
 * Clase que representa una lista de precios que implementa la interfaz
 * IPrototype.
 * Esta clase permite clonar una lista de precios de forma superficial (shallow
 * copy)
 * o profunda (deep copy), utilizando el patrón de diseño Prototype.
 */
public class PriceList implements IPrototype {

    // Nombre de la lista de precios
    private String name;

    // Lista de productos que forman parte de la lista de precios
    private List<Product> products = new ArrayList<>();

    /**
     * Constructor de la clase PriceList.
     * 
     * @param name El nombre de la lista de precios.
     */
    public PriceList(String name) {
        this.name = name;
    }

    // Métodos getter y setter para 'name'

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos getter y setter para 'products'

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Método para realizar un clon superficial de la lista de precios.
     * En un clon superficial, los objetos dentro de la lista de productos no se
     * duplican,
     * sino que se copian las referencias.
     */
    @Override
    public IPrototype clone() {
        // Crear un nuevo objeto PriceList con el mismo nombre
        PriceList priceList = new PriceList(name);

        // Copiar la lista de productos (solo referencias, no productos duplicados)
        priceList.setProducts(products);

        // Devolver el clon superficial
        return priceList;
    }

    /**
     * Método para realizar un clon profundo de la lista de precios.
     * En un clon profundo, se crean nuevos objetos para cada elemento en la lista
     * de productos,
     * garantizando que los objetos internos sean copiados de forma independiente.
     * 
     */
    @Override
    public IPrototype deepClone() {
        // Crear un nuevo objeto PriceList con el mismo nombre
        PriceList priceList = new PriceList(name);

        // Crear una nueva lista para almacenar los productos clonados
        List<Product> cloneProduct = new ArrayList<>();

        // Recorrer cada producto en la lista original y clonarlo
        for (Product p : products) {
            // Clonar cada producto individualmente
            Product product = (Product) p.clone();

            // Agregar el producto clonado a la nueva lista
            cloneProduct.add(product);
        }

        // Establecer la nueva lista de productos clonados en el objeto PriceList
        priceList.setProducts(cloneProduct);

        // Devolver el clon profundo
        return priceList;
    }

    /**
     * Método para representar el objeto PriceList como una cadena de texto.
     */
    @Override
    public String toString() {
        // Retornar una representación del objeto con su dirección en memoria (hash
        // code)
        // junto con los atributos clave de la lista de precios
        return Integer.toHexString(System.identityHashCode(this)) + " - PriceList [name=" + name + ", products="
                + products + "]";
    }

}
