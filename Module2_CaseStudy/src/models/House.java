package models;

public class House extends Services implements Comparable<House> {
    private String standardRoom;
    private String convenientOther;
    private String numberOfFloors;

    public House() {
    }

    public House(String nameServices, String area, String rate, String maxCapacity, String rentType, String id, String standardRoom, String convenientOther, String numberOfFloors) {
        super(nameServices, area, rate, maxCapacity, rentType, id);
        this.standardRoom = standardRoom;
        this.convenientOther = convenientOther;
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
                + ", Convenient Other: " + this.getConvenientOther()
                + ", Number Of Floors: " + this.getNumberOfFloors();
    }

    @Override
    public int compareTo(House house) {
        return this.getNameServices().compareTo(house.getNameServices());
    }
}
