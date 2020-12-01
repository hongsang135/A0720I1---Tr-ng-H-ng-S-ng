package model;

public abstract class SoTietKiem {
    private String maSo;
    private String maKH;
    private String ngayMoSo;
    private String thoiGianBatDauGui;
    private String soTienGui;
    private String laiSuat;

    public SoTietKiem() {
    }

    public SoTietKiem(String maSo, String maKH, String ngayMoSo, String thoiGianBatDauGui, String soTienGui, String laiSuat) {
        this.maSo = maSo;
        this.maKH = maKH;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public String getMaSo() {
        return maSo;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public String getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public String getSoTienGui() {
        return soTienGui;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public void setThoiGianBatDauGui(String thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }

    public void setSoTienGui(String soTienGui) {
        this.soTienGui = soTienGui;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "maSo='" + maSo + '\'' +
                ", maKH='" + maKH + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTienGui='" + soTienGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
