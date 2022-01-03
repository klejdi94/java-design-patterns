package com.design.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Armatura {
    VESTITI("vestiti"),
    PELLE("pelle"),
    COTTA_DI_MAGLIA("cotta di maglia"),
    PIASTRE("PIASTRE");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
