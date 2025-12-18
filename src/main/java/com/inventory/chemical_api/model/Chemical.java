package com.inventory.chemical_api.model;

import java.time.LocalDate;

public class Chemical {

    private int id;
    private String name;
    private String formula;
    private int quantity;
    private String unit;
    private String hazardLevel;
    private LocalDate expiryDate;

    // constructor
    public Chemical(int id, String name, String formula,
                    int quantity, String unit,
                    String hazardLevel, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.formula = formula;
        this.quantity = quantity;
        this.unit = unit;
        this.hazardLevel = hazardLevel;
        this.expiryDate = expiryDate;
    }

    // getters (VERY IMPORTANT for JSON)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getHazardLevel() {
        return hazardLevel;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
