package com.design.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        var cavalloDaFattoria = new CavalloDaFattoria();
        cavalloDaFattoria.corri();
        cavalloDaFattoria.fineCorsa();
        log.info("Velocità cavallo da fattoria : {}.\n", cavalloDaFattoria.getVelocita());

        log.info("Decoriamo il cavallo da fattoria, può diventare uno da corsa");
        var cavalloDaCorsa = new CavalloDaCorsa(cavalloDaFattoria);
        cavalloDaCorsa.corri();
        cavalloDaCorsa.fineCorsa();
        log.info("Velocità cavallo da corsa: {}.\n", cavalloDaCorsa.getVelocita());
    }
}
