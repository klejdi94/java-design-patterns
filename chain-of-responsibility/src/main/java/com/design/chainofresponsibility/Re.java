package com.design.chainofresponsibility;

import com.design.chainofresponsibility.request.Request;
import com.design.chainofresponsibility.request.RequestHandler;

public class Re {

    private RequestHandler catena;

    public Re(){
        creaCatena();
    }

    public void creaCatena(){
        catena = new Comandante(new Ufficiale(new Soldato(null)));
    }
     public void richiedi(Request request){
        catena.handleRequest(request);
     }
}
