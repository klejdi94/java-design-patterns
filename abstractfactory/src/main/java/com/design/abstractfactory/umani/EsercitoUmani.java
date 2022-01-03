package com.design.abstractfactory.umani;

import com.design.abstractfactory.common.Esercito;

public class EsercitoUmani implements Esercito {

    static final String DESCRIPTION = "Questo è un esercito di umani";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
