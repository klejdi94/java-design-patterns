package com.design.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        var mago = new Eroe.Builder(Professione.MAGO,"Merlino")
                .conArma(Arma.PUGNALE)
                .conColoreCapelli(ColoreCapelli.ROSSO).build();
        log.info(mago.toString());

        var guerriero = new Eroe.Builder(Professione.GUERRIERO,"MAX")
                .conArmatura(Armatura.PIASTRE)
                .conCapelli(Capelli.RICCI)
                .conColoreCapelli(ColoreCapelli.BIONDO)
                .conArma(Arma.SPADA)
                .build();
        log.info(guerriero.toString());

        var ladro = new Eroe.Builder(Professione.LADRO,"Kal")
                .conCapelli(Capelli.CALVO)
                .conArmatura(Armatura.VESTITI)
                .conArma(Arma.ARCO)
                .build();
        log.info(ladro.toString());

    }
}
