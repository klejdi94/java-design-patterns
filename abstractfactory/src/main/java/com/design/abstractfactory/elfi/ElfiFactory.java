package com.design.abstractfactory.elfi;

import com.design.abstractfactory.RegnoFactory;
import com.design.abstractfactory.common.Castello;
import com.design.abstractfactory.common.Esercito;
import com.design.abstractfactory.common.Re;

public class ElfiFactory implements RegnoFactory {
    @Override
    public Castello creaCastello() {
        return new CastelloElfi();
    }

    @Override
    public Re creaRe() {
        return new ReElfi();
    }

    @Override
    public Esercito creaEsercito() {
        return new EsercitoElfi();
    }
}
