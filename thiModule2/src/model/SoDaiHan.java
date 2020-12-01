package model;

public class SoDaiHan extends SoTietKiem {
    private String kyHan;
    private String uuDai;

    public SoDaiHan() {
    }

    public SoDaiHan(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat) {
        super(maSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
    }

    public SoDaiHan(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat, String kyHan, String uuDai) {
        super(maSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    public String getKyHan() {
        return kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    @Override
    public String toString() {
        return "SoDaiHan{" +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}

