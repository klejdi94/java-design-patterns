package com.design.builder;

public class Eroe {

    private final Professione professione;



    private final String nome;
    private Capelli capelli;
    private ColoreCapelli coloreCapelli;
    private Armatura armatura;
    private Arma arma;

    public Eroe(Builder builder) {
        this.professione = builder.professione;
        this.nome = builder.nome;
        this.capelli = builder.capelli;
        this.coloreCapelli = builder.coloreCapelli;
        this.armatura = builder.armatura;
        this.arma = builder.arma;
    }

    public Professione getProfessione() {
        return professione;
    }

    public String getNome() {
        return nome;
    }

    public Capelli getCapelli() {
        return capelli;
    }

    public ColoreCapelli getColoreCapelli() {
        return coloreCapelli;
    }

    public Armatura getArmatura() {
        return armatura;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return "Eroe{" +
                "professione=" + professione +
                ", nome='" + nome + '\'' +
                ", capelli=" + capelli +
                ", coloreCapelli=" + coloreCapelli +
                ", armatura=" + armatura +
                ", arma=" + arma +
                '}';
    }


    public static  class Builder{
        private final Professione professione;
        private final String nome;
        private Capelli capelli;
        private ColoreCapelli coloreCapelli;
        private Armatura armatura;
        private Arma arma;

        public Builder(Professione professione, String nome) {
            this.professione = professione;
            this.nome = nome;
        }

        public Builder conCapelli(Capelli capelli){
            this.capelli = capelli;
            return this;
        }
        public Builder conColoreCapelli(ColoreCapelli coloreCapelli){
            this.coloreCapelli = coloreCapelli;
            return this;
        }
        public Builder conArmatura(Armatura armatura){
            this.armatura = armatura;
            return this;
        }
        public Builder conArma(Arma arma){
            this.arma = arma;
            return this;
        }

        public Eroe build(){
            return new Eroe(this);
        }
    }


}
