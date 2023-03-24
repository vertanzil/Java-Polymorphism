package com.vertanzil.testproject.utils;
public enum OliveName {
    OLIVE01("Olive 1"), OLIVE02("Olive 2"), OLIVE03("Olive 3");
    private String name;
    OliveName(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
