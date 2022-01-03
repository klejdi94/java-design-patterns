package com.design.builder;

public enum ColoreCapelli {
    BIANCO,
    BIONDO,
    ROSSO,
    MARRONE,
    NERO;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
