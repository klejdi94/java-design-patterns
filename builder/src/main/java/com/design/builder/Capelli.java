package com.design.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Capelli {
    CALVO("calvo"),
    CORTI("corti"),
    RICCI("ricci"),
    LUNGHI_DRITTI("lunghi dritti"),
    LUNGHI_RICCI("lunghi ricci");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
