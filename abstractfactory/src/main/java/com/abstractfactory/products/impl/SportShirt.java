package com.abstractfactory.products.impl;

import com.abstractfactory.products.Shirt;

public class SportShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva -- Tiene mangas largas? -> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        return false;
    }
}
