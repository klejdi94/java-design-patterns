package com.design.abstractfactory.orchi;

import com.design.abstractfactory.common.Esercito;

public class EsercitoOrchi implements Esercito {

    static final String DESCRIPTION = "Questo è un esercito di orchi";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
