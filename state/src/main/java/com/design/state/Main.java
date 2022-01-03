package com.design.state;

public class Main {
    public static void main(String[] args) {
        var unicorno = new Unicorno();
        unicorno.observe();
        unicorno.timePasses();
        unicorno.observe();
        unicorno.timePasses();
        unicorno.observe();
    }
}
