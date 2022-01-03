package com.design.strategy;

import com.design.strategy.strategie.Incantesimo;
import com.design.strategy.strategie.Proietile;
import com.design.strategy.strategie.Spada;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Viene avvistato un drago, decidi di attaccarlo");
        var drago = new Drago(new Spada());
        drago.combatti();
        log.info("Cambio strategia");
        drago = new Drago(new Incantesimo());
        drago.combatti();
        log.info("Cambio strategia");
        drago = new Drago(new Proietile());
        drago.combatti();
        log.info("Drago KO");

    }

}
