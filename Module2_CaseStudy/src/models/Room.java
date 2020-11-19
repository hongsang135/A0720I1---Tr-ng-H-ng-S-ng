package models;

public class Room extends Services implements Comparable<Room> {
    public Room() {
    }

    private String serviceFree;

    public Room(String nameServices, String area, String rate, String maxCapacity, String rentType, String id, String serviceFree) {
        super(nameServices, area, rate, maxCapacity, rentType, id);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String showInfor() {
        return "Service name: " + super.getNameServices()
                + ", Area: " + super.getArea()
                + ", Rate: " + super.getArea()
                + ", Max Capacity: " + super.getMaxCapacity()
                + ", Rent Type: " + super.getRentType()
                + ", Id: " + super.getId()
                + ", Service free: " + this.getServiceFree();
    }

    @Override
    public int compareTo(Room room) {
        return this.getNameServices().compareTo(room.getNameServices());
    }
}
