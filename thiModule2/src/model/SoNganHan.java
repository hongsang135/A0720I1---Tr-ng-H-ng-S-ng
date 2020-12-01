package model;

public class SoNganHan extends SoTietKiem {
    public SoNganHan() {
    }

    public SoNganHan(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat) {
        super(maSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
    }

    @Override
    public String toString() {
        return "SoNganHan{}";
    }
}
