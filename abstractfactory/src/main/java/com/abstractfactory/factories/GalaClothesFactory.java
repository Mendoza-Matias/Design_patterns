package com.abstractfactory.factories;

import com.abstractfactory.ClothesFactory;
import com.abstractfactory.products.Shirt;
import com.abstractfactory.products.Shoe;
import com.abstractfactory.products.Trousers;
import com.abstractfactory.products.impl.GalaShirt;
import com.abstractfactory.products.impl.GalaShoe;
import com.abstractfactory.products.impl.GalaTrousers;

public class GalaClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new GalaShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Trousers creaTrousers() {
        return new GalaTrousers();
    }

}
