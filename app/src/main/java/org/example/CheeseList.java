package org.example;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public int numberOfCheesesWithMilkTreatmentType(String milkTreatmentType) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getMilkTreatmentTypeEn().equalsIgnoreCase(milkTreatmentType)) {
                count++;
            }
        }
        return count;
    }

    public int numberOfOrganicCheeses() {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getOrganic() == 1) {
                count++;
            }
        }
        return count;
    }

    public int numberOfCheesesWithMoistureOver(double moisturePercent) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getMoisturePercent() > moisturePercent) {
                count++;
            }
        }
        return count;
    }

    public int numberOfCheesesWithMoistureOverAndOrganic(double moisturePercent) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if ((cheese.getMoisturePercent() > moisturePercent) && (cheese.getOrganic() == 1)) {
                count++;
            }
        }
        return count;
    }

    public int numberOfCheesesWithMilkType(String milkType) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getMilkTypeEn().equalsIgnoreCase(milkType)) {
                count++;
            }
        }
        return count;
    }

    public String getMostOfOneMilkType() {
        String mostCommonMilkType = "";
        int cowMilk = numberOfCheesesWithMilkType("cow");
        int goatMilk = numberOfCheesesWithMilkType("goat");
        int eweMilk = numberOfCheesesWithMilkType("ewe");
        int buffaloMilk = numberOfCheesesWithMilkType("buffalo");        
        if (cowMilk >= goatMilk && cowMilk >= eweMilk && cowMilk >= buffaloMilk) {
            mostCommonMilkType = "cow";
        } else if (goatMilk >= cowMilk && goatMilk >= eweMilk && goatMilk >= buffaloMilk) {
            mostCommonMilkType = "goat";
        } else if (eweMilk >= cowMilk && eweMilk >= goatMilk && eweMilk >= buffaloMilk) {
            mostCommonMilkType = "ewe";
        } else if (buffaloMilk >= cowMilk && buffaloMilk >= goatMilk && buffaloMilk >= eweMilk) {
            mostCommonMilkType = "buffalo";
        }
        return mostCommonMilkType;
    }

}
