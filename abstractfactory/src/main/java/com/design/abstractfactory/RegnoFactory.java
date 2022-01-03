package com.design.abstractfactory;

import com.design.abstractfactory.common.Castello;
import com.design.abstractfactory.common.Esercito;
import com.design.abstractfactory.common.Re;

public interface RegnoFactory {

    /**
     *
     */
    Castello creaCastello();

    /**
     *
     */
    Re creaRe();

    /**
     *
     */
    Esercito creaEsercito();
}
