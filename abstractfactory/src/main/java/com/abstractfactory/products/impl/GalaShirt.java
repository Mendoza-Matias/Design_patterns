package com.abstractfactory.products.impl;

import com.abstractfactory.products.Shirt;

public class GalaShirt implements Shirt {
    @Override
    public boolean hasLongSleeves() {
        return true;
    }

    @Override
    public boolean hasButtons() {
        return true;
    }
}
