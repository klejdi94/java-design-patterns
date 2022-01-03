package com.design.abstractfactory.umani;

import com.design.abstractfactory.common.Castello;

public class CastelloUmani implements Castello {

    static final String DESCRIPTION = "Questo è un castello di umani";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
