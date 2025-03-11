package com.abstractfactory.products.impl;

import com.abstractfactory.products.Shoe;

public class SportShoe implements Shoe {

    @Override
    public boolean isElegantShoes() {
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        return true;
    }

}
