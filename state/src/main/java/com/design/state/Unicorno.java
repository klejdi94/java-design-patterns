package com.design.state;


public class Unicorno {

    private Stato stato;

    public Unicorno(){
        stato = new Pacifico(this);
    }


    public void timePasses() {
        if (stato.getClass().equals(Pacifico.class)) {
            changeStateTo(new Aggressivo(this));
        } else {
            changeStateTo(new Pacifico(this));
        }
    }

    private void changeStateTo(Stato newState) {
        this.stato = newState;
        this.stato.onEnterStato();
    }

    @Override
    public String toString() {
        return "Unicorno ";
    }

    public void observe() {
        this.stato.observe();
    }



}
