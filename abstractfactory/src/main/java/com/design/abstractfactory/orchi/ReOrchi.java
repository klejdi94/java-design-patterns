package com.design.abstractfactory.orchi;

import com.design.abstractfactory.common.Re;

public class ReOrchi implements Re {

    static final String DESCRIPTION = "Questo è un re di orchi";


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
