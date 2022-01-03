package com.design.chainofresponsibility;

import com.design.chainofresponsibility.request.Request;
import com.design.chainofresponsibility.request.RequestType;

public class Main {
    public static void main(String[] args) {
        var re = new Re();
        re.richiedi(new Request(RequestType.DIFENDERE,"Attacco in corso, difendere il castello"));
        re.richiedi(new Request(RequestType.ARRESTARE,"Arrestare gli nemici"));
        re.richiedi(new Request(RequestType.RECUPERA_TASSE,"Raccogliere le tasse"));
    }
}
