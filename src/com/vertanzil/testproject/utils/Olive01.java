package com.vertanzil.testproject.utils;

public class Olive01 extends Olive {
    public Olive01(){
        super(OliveName.OLIVE01, OliveColour.BLACK, 2);
    }
    @Override
    public String getOrigin() {
        return "France";
    }
}
