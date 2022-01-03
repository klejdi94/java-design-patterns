package com.design.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aggressivo implements Stato {

    private final Unicorno unicorno;

    public Aggressivo(Unicorno unicorno) {
        this.unicorno = unicorno;
    }


    @Override
    public void observe() {
        log.info("{} è molto arrabbiato....", unicorno);
    }

    @Override
    public void onEnterStato() {
        log.info("{} si sta arrabbiando!!!", unicorno);
    }
}
