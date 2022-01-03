package com.design.abstractfactory.orchi;

import com.design.abstractfactory.RegnoFactory;
import com.design.abstractfactory.common.Castello;
import com.design.abstractfactory.common.Esercito;
import com.design.abstractfactory.common.Re;

public class OrchiFactory implements RegnoFactory {

    @Override
    public Castello creaCastello() {
        return new CastelloOrchi();
    }

    @Override
    public Re creaRe() {
        return new ReOrchi();
    }

    @Override
    public Esercito creaEsercito() {
        return new EsercitoOrchi();
    }
}
