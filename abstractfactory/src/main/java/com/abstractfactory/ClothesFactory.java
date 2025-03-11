package com.abstractfactory;

import com.abstractfactory.products.Shirt;
import com.abstractfactory.products.Shoe;
import com.abstractfactory.products.Trousers;

//Fabrica de ropa (General)
public interface ClothesFactory {

    Shoe createShoes(); // Devuelve una instancia de la interfaz

    Shirt createShirt();

    Trousers creaTrousers();
}
