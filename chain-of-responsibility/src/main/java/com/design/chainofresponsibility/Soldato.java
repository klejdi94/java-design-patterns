package com.design.chainofresponsibility;

import com.design.chainofresponsibility.request.Request;
import com.design.chainofresponsibility.request.RequestHandler;
import com.design.chainofresponsibility.request.RequestType;

public class Soldato extends RequestHandler {

    public Soldato(RequestHandler prossimoOrdine) {
        super(prossimoOrdine);
    }

    @Override
    public void handleRequest(Request request) {
        if(RequestType.RECUPERA_TASSE == request.getTipoRichiesta()){
            log(request);
            request.segnaGestito();
        }else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "Soldato";
    }
}
