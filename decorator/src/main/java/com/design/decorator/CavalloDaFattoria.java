package com.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CavalloDaFattoria implements Cavallo{

    @Override
    public void corri() {
        log.info("Il cavallo sta partendo");
    }

    @Override
    public int getVelocita() {
        return 10;
    }

    @Override
    public void fineCorsa() {
        log.info("Il cavallo si è fermato");
    }
}
