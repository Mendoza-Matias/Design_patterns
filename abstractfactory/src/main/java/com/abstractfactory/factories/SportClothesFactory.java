package com.abstractfactory.factories;

import com.abstractfactory.ClothesFactory;
import com.abstractfactory.products.Shirt;
import com.abstractfactory.products.Shoe;
import com.abstractfactory.products.Trousers;
import com.abstractfactory.products.impl.SportShirt;
import com.abstractfactory.products.impl.SportShoe;
import com.abstractfactory.products.impl.SportTrousers;

//Fabrica de ropa deportiva (Familia de objetos)
public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoe createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Trousers creaTrousers() {
        return new SportTrousers();
    }

}
