package com.design.builder;

public enum Arma {
    PUGNALE, SPADA, ASCIA, MARTELLO, ARCO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
