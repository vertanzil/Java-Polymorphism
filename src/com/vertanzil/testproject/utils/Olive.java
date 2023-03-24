package com.vertanzil.testproject.utils;


public abstract class Olive {


    private OliveName name = OliveName.OLIVE01;
    private OliveColour colour = OliveColour.BLACK;
    private int oil = 3;

    public Olive(){}

    public Olive(OliveName name, OliveColour colour, int oil){
        this.name = name;
        this.colour = colour;
        this.oil = oil;

    }


    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColour getColour() {
        return colour;
    }

    public void setColour(OliveColour colour) {
        this.colour = colour;
    }

    public int crush() {
        String msg = name + " From " + getOrigin()
                + ": " + oil + " units ";
        System.out.print(msg);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public abstract String getOrigin();



    @Override
    public String toString(){
        return name.toString();
    }
}
