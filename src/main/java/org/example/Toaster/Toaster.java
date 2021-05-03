package org.example.Toaster;

import java.util.HashMap;
import java.util.Map;

public class Toaster {
    private int ID;
    private String Brand;
    private long wattage;

    public Toaster() {
    }

    public Toaster(String brand, long wattage) {
        Brand = brand;
        this.wattage = wattage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public long getWattage() {
        return wattage;
    }

    public void setWattage(long wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Toaster{" +
                "ID=" + ID +
                ", Brand='" + Brand + '\'' +
                ", wattage=" + wattage +
                '}';
    }
}

