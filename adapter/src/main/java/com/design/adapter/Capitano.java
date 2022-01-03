package com.design.adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public final class Capitano {

    private BarcaVeloce barcaVeloce;

    void rema(){
        barcaVeloce.rema();
        log.info("Capitano sta remando...");
    }
}
