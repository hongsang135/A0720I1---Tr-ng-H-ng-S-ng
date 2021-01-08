package model;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String srcImg;

    public Customer(String name, String birthday, String address, String srcImg) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.srcImg = srcImg;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSrcImg() {
        return srcImg;
    }

    public void setSrcImg(String srcImg) {
        this.srcImg = srcImg;
    }
}
