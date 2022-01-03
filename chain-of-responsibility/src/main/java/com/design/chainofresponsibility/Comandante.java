package com.design.chainofresponsibility;

import com.design.chainofresponsibility.request.Request;
import com.design.chainofresponsibility.request.RequestHandler;
import com.design.chainofresponsibility.request.RequestType;

public class Comandante extends RequestHandler {
    public Comandante(RequestHandler prossimoOrdine) {
        super(prossimoOrdine);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.DIFENDERE == request.getTipoRichiesta()){
            log(request);
            request.segnaGestito();
        }else{
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Comandante";
    }
}
