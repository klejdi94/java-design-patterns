package com.design.adapter;

public class BarcaDaPescaAdapter implements BarcaVeloce{
    private final BarcaDaPesca barcaDaPesca = new BarcaDaPesca();

    @Override
    public void rema() {
        barcaDaPesca.vela();
    }
}
