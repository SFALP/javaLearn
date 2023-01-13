package Proje_.LaptopStore_221115;

import java.util.ArrayList;

public class PriceOneForLaptop {
    public int getPrice(int laptopID){

        Data pcPrice=new Data();
ArrayList<String> pc= pcPrice.AllData(laptopID);
        int totalAmount=Calculation.getSize(pc)+Calculation.getColor(pc)+Calculation.getCPU(pc)+Calculation.getRam(pc);

        return totalAmount;
    }
}
