package models;

public class Customer implements Comparable<Customer> {
    private String name;
    private String birthday;
    private String sex;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Services servicesUse;

    public Customer() {
    }

    public Customer(String name, String birthday, String sex, String idCard, String phoneNumber, String email, String typeCustomer, String address, Services servicesUse) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.servicesUse = servicesUse;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServicesUse() {
        return servicesUse;
    }

    public void setServicesUse(Services servicesUse) {
        this.servicesUse = servicesUse;
    }

    public String showInfor() {
        String serviceId;
        if(this.getServicesUse() == null){
            serviceId = null;
        }else{
            serviceId = this.getServicesUse().getId();
        }
        return "Name: " + this.getName() +
                ", Birthday: " + this.getBirthday() +
                ", Sex: " + this.getSex() +
                ", ID Card: " + this.getIdCard() +
                ", Phone Number: " + this.getPhoneNumber() +
                ", Email: " + this.getEmail() +
                ", Type Customer: " + this.getTypeCustomer() +
                ", Address: " + this.getAddress() +
                ", Services Use: " + serviceId;
    }


    @Override
    public int compareTo(Customer o) {
        return this.name.charAt(0)-o.getName().charAt(0);
    }
}
