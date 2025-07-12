package org.example;


public class CheeseAnalyzer {
  public static void main(String[] args) {
    //read cheese data from a CSV file and convert info into Cheese objects
    CheeseReader cheeseReader = new CheeseReader("cheese_data.csv");
    CheeseWriter writer = new CheeseWriter("output.txt");
    writer.clearData();
    CheeseList cheeseList = cheeseReader.readCheeses();

    //do relevant analysis and calculations on the cheese data
    String output = Integer.toString(cheeseList.numberOfCheeses());
    String output2 = Integer.toString((int) cheeseList.numberOfCheesesWithMoistureOverAndOrganic(40.1));
    String output3 = Integer.toString(cheeseList.numberOfCheesesWithMilkTreatmentType("pasteurized"));
    String output4 = Integer.toString(cheeseList.numberOfCheesesWithMilkTreatmentType("raw milk"));
    String output5 = Integer.toString(cheeseList.numberOfCheesesWithMilkType(cheeseList.getMostOfOneMilkType()));
    
    //write output to a file
    writer.writeData("Number of cheeses: " + output);
    writer.writeData("Number of cheeses that are organic and over 40.1% moisture: " + output2);
    writer.writeData("Number of pasteurized cheeses: " + output3);
    writer.writeData("Number of raw cheeses: " + output4);
    writer.writeData("Animal that most cheeses are made from: " + 
                       cheeseList.getMostOfOneMilkType() + " at " + output5 + " cheeses");
    
  }
}
