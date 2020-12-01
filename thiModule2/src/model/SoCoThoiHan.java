package model;

public class SoCoThoiHan extends SoNganHan {
    private String kyHan;

    public SoCoThoiHan(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat) {
        super(maSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
    }

    public SoCoThoiHan(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat, String kyHan) {
        super(maSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "SoCoThoiHan{" +
                "kyHan='" + kyHan + '\'' +
                '}';
    }
}
