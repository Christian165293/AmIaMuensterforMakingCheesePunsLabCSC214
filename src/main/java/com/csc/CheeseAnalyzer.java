package com.csc;

public class CheeseAnalyzer {
    public static void main(String[] args){
CheeseReader reader = new CheeseReader("cheese_data.csv");
CheeseList list = reader.read_cheeses();
String output = Integer.toString(list.numberOfCheeses());

CheeseWriter writer = new CheeseWriter("output.txt");
writer.write_data(output);
    }
}
