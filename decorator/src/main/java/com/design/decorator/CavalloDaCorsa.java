package com.design.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CavalloDaCorsa implements Cavallo{

    private final Cavallo cavalloDecorated;

    @Override
    public void corri() {
        cavalloDecorated.corri();
    }

    @Override
    public int getVelocita() {
        return cavalloDecorated.getVelocita() + 10;
    }

    @Override
    public void fineCorsa() {
        cavalloDecorated.fineCorsa();
    }
}
