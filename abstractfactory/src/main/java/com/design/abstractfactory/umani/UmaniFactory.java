package com.design.abstractfactory.umani;

import com.design.abstractfactory.RegnoFactory;
import com.design.abstractfactory.common.Castello;
import com.design.abstractfactory.common.Esercito;
import com.design.abstractfactory.common.Re;

public class UmaniFactory implements RegnoFactory {

    @Override
    public Castello creaCastello() {
        return new CastelloUmani();
    }

    @Override
    public Re creaRe() {
        return new ReUmani();
    }

    @Override
    public Esercito creaEsercito() {
        return new EsercitoUmani();
    }
}
