package com.design.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pacifico implements Stato {

    private final Unicorno unicorno;

    public Pacifico(Unicorno unicorno) {
        this.unicorno = unicorno;
    }


    @Override
    public void observe() {
        log.info("{} è calmo e pacifico.", unicorno);
    }

    @Override
    public void onEnterStato() {
        log.info("{} si sta calmando.", unicorno);
    }
}
