package com.design.abstractfactory.elfi;

import com.design.abstractfactory.common.Castello;

public class CastelloElfi implements Castello {

    static final String DESCRIPTION = "Questo è un castello di elfie";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
