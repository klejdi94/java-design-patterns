package com.design.strategy;

public class Drago {

    private StrategiaDrago strategiaDrago;

    public Drago(StrategiaDrago strategiaDrago){
        this.strategiaDrago = strategiaDrago;
    }

    public void cambiaStrategia(StrategiaDrago strategiaDrago){
        this.strategiaDrago = strategiaDrago;
    }

    public void combatti(){
        strategiaDrago.esegui();
    }
}
