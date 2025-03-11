package com.abstractfactory.products.impl;

import com.abstractfactory.products.Trousers;

public class GalaTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        return true; // Tiene bolsillos
    }

    @Override
    public String getClousureType() {
        return "Cierre";
    }

}
