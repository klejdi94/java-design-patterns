package com.design.chainofresponsibility.request;

import java.util.Objects;

public class Request {

    /**
     *
     */
    private final RequestType tipoRichiesta;

    /**
     *
     */
    private final String descrizioneRichiesta;

    /**
     *
     */
    private boolean gestito = false;

    /**
     *
     * @param tipoRichiesta
     * @param descrizioneRichiesta
     */
    public Request(final RequestType tipoRichiesta,final String descrizioneRichiesta) {
        this.tipoRichiesta = Objects.requireNonNull(tipoRichiesta);
        this.descrizioneRichiesta = Objects.requireNonNull(descrizioneRichiesta);
    }

    public RequestType getTipoRichiesta() {
        return tipoRichiesta;
    }

    public String getDescrizioneRichiesta() {
        return descrizioneRichiesta;
    }

    public void segnaGestito(){
        this.gestito = true;
    }



    @Override
    public String toString(){
        return getDescrizioneRichiesta();
    }

}
