package com.design.abstractfactory.elfi;

import com.design.abstractfactory.common.Esercito;

public class EsercitoElfi implements Esercito {

    static final String DESCRIPTION = "Questo è un esercito di elfi";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
