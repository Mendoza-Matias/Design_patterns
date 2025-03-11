package com.abstractfactory.products.impl;

import com.abstractfactory.products.Trousers;

public class SportTrousers implements Trousers {

    @Override
    public boolean hasPockets() {
        return false;
    }

    @Override
    public String getClousureType() {
        return "Ninguno";
    }

}
