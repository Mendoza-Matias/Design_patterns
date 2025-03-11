package com.abstractfactory;

import com.abstractfactory.factories.GalaClothesFactory;
import com.abstractfactory.factories.SportClothesFactory;
import com.abstractfactory.products.Shirt;
import com.abstractfactory.products.impl.GalaShirt;
import com.abstractfactory.products.impl.SportShirt;
import com.abstractfactory.products.impl.SportShoe;
import com.abstractfactory.products.impl.SportTrousers;

public class Main {
    public static void main(String[] args) {
        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory(); // Solo crea ropa deportiva

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.creaTrousers();

        System.out.println(sportShirt.hasButtons()); // Tiene botones ?

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();
        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
    }
}