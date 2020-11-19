package models;

import commons.FuncFileCsv;

public class Villa extends Services implements Comparable<Villa> {
    private String standardRoom;
    private String convenientOther;
    private String areaPool;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String nameServices, String area, String rate, String maxCapacity, String rentType, String id, String standardRoom, String convenientOther, String areaPool, String numberOfFloors) {
        super(nameServices, area, rate, maxCapacity, rentType, id);
        this.standardRoom = standardRoom;
        this.convenientOther = convenientOther;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenientOther() {
        return convenientOther;
    }

    public void setConvenientOther(String convenientOther) {
        this.convenientOther = convenientOther;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return "Service name: " + super.getNameServices()
                + ", Area: " + super.getArea()
                + ", Rate: " + super.getArea()
                + ", Max Capacity: " + super.getMaxCapacity()
                + ", Rent Type: " + super.getRentType()
                + ", Id: " + super.getId()
                + ", Standard Room: " + this.getStandardRoom()
                + ", Convenient Other" + this.getConvenientOther()
                + ", Area Pool: " + this.getAreaPool()
                + ", Number Of Floors: " + this.getNumberOfFloors();
    }

    @Override
    public int compareTo(Villa villa) {
        return this.getNameServices().compareTo(villa.getNameServices());
    }
}
