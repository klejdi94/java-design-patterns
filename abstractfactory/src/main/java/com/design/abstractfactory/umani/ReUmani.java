package com.design.abstractfactory.umani;

import com.design.abstractfactory.common.Re;

public class ReUmani implements Re {
    static final String DESCRIPTION = "Questo è un esercito di umani";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
