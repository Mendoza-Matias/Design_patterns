package com.prototype;

import java.util.List;

import com.prototype.models.PriceList;
import com.prototype.models.Product;

public class Main {
    public static void main(String[] args) {
        // Creación de una lista de precios inicial con un nombre específico
        PriceList priceList = new PriceList("Lista Normal");

        // Lista de productos inicial que se agrega a la lista de precios
        List<Product> products = List.of(
                new Product("Jabon", 500), // Producto Jabon con precio 500
                new Product("Detergente", 1500.000) // Producto Detergente con precio 1500
        );

        // Asignamos los productos a la lista de precios
        priceList.setProducts(products);

        // Imprimimos el objeto priceList original
        System.out.println("Precio Original: ");
        System.out.println(priceList);

        // Realizamos una clonación superficial de la lista de precios
        // En este caso, se crea un nuevo objeto PriceList, pero los productos son los
        // mismos (referencias compartidas)
        PriceList clone = (PriceList) priceList.clone();

        // Imprimimos el clon superficial
        System.out.println("Clonación Superficial: ");
        System.out.println(clone); // El precio es el mismo, pero el objeto PriceList es diferente

        // Realizamos una clonación profunda de la lista de precios
        // En este caso, se crea un nuevo objeto PriceList y los productos se duplican
        // completamente (clonación independiente)
        PriceList cloneComplex = (PriceList) priceList.deepClone();

        // Imprimimos el clon profundo
        System.out.println("Clonación Profunda: ");
        System.out.println(cloneComplex); // Todos los objetos internos son diferentes (clonados)

        /*
         * La salida esperada es algo similar a:
         * 
         * 5ca881b5 - PriceList [name=Lista Normal, products=[24d46ca6 - Product
         * [name=Jabon, price=500.0], 3e3abc88 - Product [name=Detergente,
         * price=1500.0]]]
         * 
         * 53d8d10a - PriceList [name=Lista Normal, products=[24d46ca6 - Product
         * [name=Jabon, price=500.0], 3e3abc88 - Product [name=Detergente,
         * price=1500.0]]]
         * 
         * e9e54c2 - PriceList [name=Lista Normal, products=[65ab7765 - Product
         * [name=Jabon, price=500.0], 1b28cdfa - Product [name=Detergente,
         * price=1500.0]]]
         * 
         * La primera salida corresponde a la lista original.
         * La segunda es el clon superficial, donde los productos son los mismos (mismas
         * referencias de memoria).
         * La tercera salida corresponde al clon profundo, donde los productos son
         * nuevos objetos (distintas referencias de memoria).
         */
    }
}
