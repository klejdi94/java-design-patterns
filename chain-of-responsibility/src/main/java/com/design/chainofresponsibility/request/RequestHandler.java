package com.design.chainofresponsibility.request;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class RequestHandler {

    private final RequestHandler prossimoOrdine;

    public void handleRequest(Request request){
        if(prossimoOrdine != null){
            prossimoOrdine.handleRequest(request);
        }
    }

    protected void  log(Request request){
        log.info("{} gestendo richiesta \"{}\"", this, request);
    }
}
