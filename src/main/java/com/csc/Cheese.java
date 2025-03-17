package com.csc;

public class Cheese {
    private final String milkTreatmentTypeEn;
    private final int organic;
    private final double moisturePercent;
    private final String milkTypeEn;

    public Cheese(String id, String milkTreatmentTypeEn, int organic, double moisturePercent, String milkTypeEn) {
        this.milkTreatmentTypeEn = milkTreatmentTypeEn;
        this.organic = organic;
        this.moisturePercent = moisturePercent;
        this.milkTypeEn = milkTypeEn;
    }

    public String getMilkTreatmentTypeEn() {
        return milkTreatmentTypeEn;
    }

    public int getOrganic() {
        return organic;
    }

    public double getMoisturePercent() {
        return moisturePercent;
    }

    public String getMilkTypeEn() {
        return milkTypeEn;
    }
}
