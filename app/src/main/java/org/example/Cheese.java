package org.example;

import java.util.ArrayList;

public class Cheese {
    private String MilkTypeEn;
    private String MilkTreatmentTypeEn;
    private int Organic;
    private double MoisturePercent;

    public Cheese(ArrayList<String> characteristics) {
        if (characteristics.get(3) == null || characteristics.get(3).trim().isEmpty()) {
            MoisturePercent = 0.0;
        }
        else {
            MoisturePercent = Double.parseDouble(characteristics.get(3));
        }
        if (characteristics.get(6) == null || characteristics.get(6).trim().isEmpty()) {
            Organic = 0;
        }
        else {
           Organic = Integer.parseInt(characteristics.get(6));
        }
       MilkTypeEn = characteristics.get(8);
       MilkTreatmentTypeEn = characteristics.get(9);
    }

    public String getMilkTypeEn() {
        return MilkTypeEn;
    }

    public String getMilkTreatmentTypeEn() {
        return MilkTreatmentTypeEn;
    }

    public int getOrganic() {
        return Organic;
    }

    public double getMoisturePercent() {
        return MoisturePercent;
    }


}
