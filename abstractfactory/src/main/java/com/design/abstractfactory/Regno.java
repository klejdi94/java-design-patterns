package com.design.abstractfactory;

import com.design.abstractfactory.common.Castello;
import com.design.abstractfactory.common.Esercito;
import com.design.abstractfactory.common.Re;
import com.design.abstractfactory.elfi.ElfiFactory;
import com.design.abstractfactory.orchi.OrchiFactory;
import com.design.abstractfactory.umani.UmaniFactory;
import lombok.Data;

@Data
public class Regno {

    /**
     *
     */
    private Re re;
    /**
     *
     */
    private Castello castello;
    /**
     *
     */
    private Esercito esercito;

    public static class FactoryMaker {

        public enum TipoRegno {
            ELFI,ORCHI,UMANI
        }

        public static RegnoFactory makeFactory(TipoRegno tipo){
            switch (tipo){
                case ELFI:
                    return new ElfiFactory();
                case ORCHI:
                    return new OrchiFactory();
                case UMANI:
                    return new UmaniFactory();
                default:
                    throw new IllegalArgumentException("Tipo regno non supportato");
            }
        }


    }


}
