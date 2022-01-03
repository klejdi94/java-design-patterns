package com.design.abstractfactory.elfi;

import com.design.abstractfactory.common.Re;

public class ReElfi implements Re {

    static final String DESCRIPTION = "Questo è un re di elfi";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
