package com.design.builder;

public enum Professione {

    GUERRIERO, LADRO, MAGO, SACERDOTE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
