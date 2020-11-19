package models;

public class AccompaniedService {
    private String name;
    private double rate;
    private String unit;

    public AccompaniedService(String name, double rate, String unit) {
        this.name = name;
        this.rate = rate;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
