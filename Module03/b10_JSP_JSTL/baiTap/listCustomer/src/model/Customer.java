package model;

public class Customer {
    private String Ten;
    private String NgaySinh;
    private String DiaChi;
    private String image; //cais nay la de chua duong dan dung k a ?


    public Customer(){
    }

    public Customer(String ten, String ngaySinh, String diaChi, String image) {
        Ten = ten;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

}
