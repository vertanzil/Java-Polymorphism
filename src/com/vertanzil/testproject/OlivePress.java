package com.vertanzil.testproject;
import com.vertanzil.testproject.utils.Olive;
import com.vertanzil.testproject.utils.Press;
import java.util.List;
public class OlivePress implements Press {
private int currentOil;
    public int getOIL(List<Olive> olives){
        int totalOil = currentOil;
        for (Olive o : olives){
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }
    @Override
    public void setOil(int oil) {
        currentOil = oil;
    }
}
