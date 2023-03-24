package com.vertanzil.testproject;

import com.vertanzil.testproject.utils.*;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive01());
        olives.add(new Olive02());
        olives.add(new Olive03());

        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOIL(olives);
        System.out.println("Total Oil: " + totalOil + " Units of Oil");
    }
}
