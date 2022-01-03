package com.design.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Slf4j
public class Main implements Runnable{

    private final Regno regno = new Regno();

    public static void main(String[] args) {
        var app = new Main();
        app.run();
    }

    @Override
    public void run() {
        log.info("regno dei elfi");
        creaRegno(Regno.FactoryMaker.TipoRegno.ELFI);
        stampa();
        log.info("regno dei orchi");
        creaRegno(Regno.FactoryMaker.TipoRegno.ORCHI);
        stampa();
        log.info("regno dei umani");
        creaRegno(Regno.FactoryMaker.TipoRegno.UMANI);
        stampa();
    }

    public void stampa(){
        log.info(regno.getCastello().getDescription());
        log.info(regno.getEsercito().getDescription());
        log.info(regno.getRe().getDescription());
    }


    public void creaRegno(final Regno.FactoryMaker.TipoRegno tipoRegno){
        final RegnoFactory regnoFactory = Regno.FactoryMaker.makeFactory(tipoRegno);
        regno.setCastello(regnoFactory.creaCastello());
        regno.setEsercito(regnoFactory.creaEsercito());
        regno.setRe(regnoFactory.creaRe());
    }
}
