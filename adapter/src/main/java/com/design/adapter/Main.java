package com.design.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("I pirati stanno arrivando , abbiamo bisogno di una barca veloce ma abbiamo solo una da pesca");
        var capitano = new Capitano(new BarcaDaPescaAdapter());
        log.info("Il capitano si accontenta con una da pesca");
        capitano.rema();
    }
}
