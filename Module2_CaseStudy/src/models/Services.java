package models;

public abstract class Services {
    private String nameServices;
    private String area;
    private String rate;
    private String maxCapacity;
    private String rentType;
    private String id;

    public Services() {
    }

    public Services(String nameServices, String area, String rate, String maxCapacity, String rentType, String id) {
        this.nameServices = nameServices;
        this.area = area;
        this.rate = rate;
        this.maxCapacity = maxCapacity;
        this.rentType = rentType;
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String showInfor();
}
