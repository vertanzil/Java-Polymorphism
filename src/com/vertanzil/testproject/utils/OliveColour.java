package com.vertanzil.testproject.utils;
public enum OliveColour {
    PURPLE("Purple", 0x2E0854),BLACK("BLACK", 0x000000), GREEN("GREEN", 0X00FF00);
    String name;
    long color;
    OliveColour(String name, long color){
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString() {
        return name;
    }
}
