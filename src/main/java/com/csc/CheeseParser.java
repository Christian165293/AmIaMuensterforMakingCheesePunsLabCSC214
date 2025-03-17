package com.csc;

public class CheeseParser {
    public Cheese parse(String s) {
        String[] parts = s.split(",");

        // Skip the header row or rows with insufficient data
        if (parts.length < 9 || parts[0].equals("CheeseId")) {
            return null; // Skip this row
        }

        String id = parts[0];

        // Normalize MilkTreatmentTypeEn (trim and convert to lowercase)
        String milkTreatmentTypeEn = parts[8].trim().toLowerCase();
        System.out.println("MilkTreatmentTypeEn: " + milkTreatmentTypeEn); // Debug statement

        int organic = 0; // Default value if parsing fails
        try {
            organic = Integer.parseInt(parts[6].trim());
        } catch (NumberFormatException e) {
            // Handle invalid or missing organic value
        }

        double moisturePercent = 0.0; // Default value if parsing fails
        try {
            moisturePercent = parts[3].isEmpty() ? 0.0 : Double.parseDouble(parts[3].trim());
        } catch (NumberFormatException e) {
            // Handle invalid or missing moisture percentage
        }

        String milkTypeEn = parts[7].trim();

        return new Cheese(id, milkTreatmentTypeEn, organic, moisturePercent, milkTypeEn);
    }
}
