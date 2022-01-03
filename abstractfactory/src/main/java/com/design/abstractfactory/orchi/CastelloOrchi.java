package com.design.abstractfactory.orchi;

import com.design.abstractfactory.common.Castello;

public class CastelloOrchi implements Castello {

    static final String DESCRIPTION = "Questo è un castello di orchi";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
