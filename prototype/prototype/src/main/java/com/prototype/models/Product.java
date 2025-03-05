package com.prototype.models;

import com.prototype.utils.IPrototype;

/**
 * Clase que representa un Producto dentro del sistema. Implementa la interfaz IPrototype,
 * lo que permite clonar objetos de tipo Product utilizando el patrón de diseño Prototype.
 */
public class Product implements IPrototype {
    
    // Nombre del producto
    private String name;
    
    // Precio del producto
    private double price;

    /**
     * Constructor de la clase Product.
     * @param name El nombre del producto.
     * @param price El precio del producto.
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Métodos getter y setter para 'name'

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Métodos getter y setter para 'price'

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Método para realizar un clon superficial del producto.
     * Este método crea un nuevo objeto Product con los mismos valores para 'name' y 'price'.
     */
    @Override
    public IPrototype clone() {
        // Crear un nuevo objeto Product con el mismo nombre y precio
        Product product = new Product(name, price);
        
        // Devolver el clon superficial
        return product;
    }

    /**
     * Método para realizar un clon profundo del producto.
     * En este caso, la clonación profunda es igual a la clonación superficial,
     * ya que los atributos 'name' y 'price' son tipos primitivos o cadenas inmutables,
     * por lo que no es necesario hacer una clonación más profunda.
     */
    @Override
    public IPrototype deepClone() {
        // No es necesario implementar una lógica diferente para la clonación profunda
        // dado que los campos no son objetos mutables
        return clone();
    }

    /**
     * Método para representar el objeto Product como una cadena de texto.
     */
    @Override
    public String toString() {
        // Retorna una representación del objeto Product, incluyendo su dirección en memoria (hash code)
        return Integer.toHexString(System.identityHashCode(this)) + " - Product [name=" + name + ", price=" + price
                + "]";
    }
}
