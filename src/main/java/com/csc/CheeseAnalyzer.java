package com.csc;

public class CheeseAnalyzer {
    public static void main(String[] args){
        CheeseReader reader = new CheeseReader("cheese_data.csv");
        CheeseList list = reader.read_cheeses();

        int pasteurizedCount = 0;
        int rawMilkCount = 0;
        int organicHighMoistureCount = 0;
        int cowCount = 0;
        int goatCount = 0;
        int eweCount = 0;
        int buffaloCount = 0;

        for (Cheese cheese : list.getCheeses()) {
            // Count pasteurized and raw milk cheeses
            String milkTreatment = cheese.getMilkTreatmentTypeEn().toLowerCase(); // Normalize for comparison
            if (milkTreatment.equals("pasteurized")) {
                pasteurizedCount++;
            } else if (milkTreatment.equals("raw milk")) {
                rawMilkCount++;
            }

            // Count organic cheeses with moisture > 41.0%
            if (cheese.getOrganic() == 1 && cheese.getMoisturePercent() > 41.0) {
                organicHighMoistureCount++;
            }

            // Count milk types
            switch (cheese.getMilkTypeEn()) {
                case "Cow":
                    cowCount++;
                    break;
                case "Goat":
                    goatCount++;
                    break;
                case "Ewe":
                    eweCount++;
                    break;
                case "Buffalo":
                    buffaloCount++;
                    break;
            }
        }

        // Determine the most common milk type
        String mostCommonMilkType = "Cow";
        int maxCount = cowCount;
        if (goatCount > maxCount) {
            mostCommonMilkType = "Goat";
            maxCount = goatCount;
        }
        if (eweCount > maxCount) {
            mostCommonMilkType = "Ewe";
            maxCount = eweCount;
        }
        if (buffaloCount > maxCount) {
            mostCommonMilkType = "Buffalo";
        }

        // Prepare the output
        String output = "Number of cheeses using pasteurized milk: " + pasteurizedCount + "\n" +
                "Number of cheeses using raw milk: " + rawMilkCount + "\n" +
                "Number of organic cheeses with moisture > 41.0%: " + organicHighMoistureCount + "\n" +
                "Most common milk type: " + mostCommonMilkType;

        // Write the output to a file
        CheeseWriter writer = new CheeseWriter("output.txt");
        writer.write_data(output);
    }
}
