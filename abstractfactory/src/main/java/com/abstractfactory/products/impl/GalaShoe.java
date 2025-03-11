package com.abstractfactory.products.impl;

import com.abstractfactory.products.Shoe;

public class GalaShoe implements Shoe {
    @Override
    public boolean isElegantShoes() {
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        return false;
    }

}
