package com.design.strategy.strategie;

import com.design.strategy.StrategiaDrago;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Spada implements StrategiaDrago {

    @Override
    public void esegui() {
        log.info("Con la tua spada stai attaccando il drago");
    }
}
