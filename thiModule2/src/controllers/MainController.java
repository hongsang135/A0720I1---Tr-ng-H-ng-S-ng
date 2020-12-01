package controllers;

import common.FuncFileCsv;
import common.Regex;
import model.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MainController {
    public static ArrayList<SoDaiHan> daiHanArraylist = new ArrayList<>();
    public static ArrayList nganHanArraylist = new ArrayList<>();
    public static ArrayList<KhachHang> khachHangs = new ArrayList<>();

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SỔ TIẾT KIỆM:\n" +
                "Chọn chức năng theo số để tiếp tục:\n" +
                "1.thêm mới sổ tiết kiệm\n" +
                "2.xóa sổ tiết kiệm\n" +
                "3.Xem danh sách sổ tiết kiệm\n" +
                "4.Xem thông tin khách hàng\n" +
                "5.tìm kiếm sổ tiết kiệm\n" +
                "6.thoát\n");
        System.out.print("Chọn chức năng: ");
        String option = scanner.nextLine();
        switch (option) {
            case "1": {
                themMoiSoTietKiem();
                break;
            }
            case "2": {
                xoaSoTietkiem();
                break;
            }
            case "3": {
                //xemDanhSach();
                break;
            }
            case "4": {
                thongTinKhachHang();
                break;
            }
            case "5": {
                //addNewBooking();
                break;
            }
            case "6": {
                System.out.println("Goodbye");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                displayMainMenu();
            }
        }
    }

    public static void themMoiSoTietKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn thêm:\n" +
                "1.sổ dài hạn\n" +
                "2.so ngắn hạn\n");
        System.out.print("Chọn chức năng: ");
        String option = scanner.nextLine();
        switch (option) {
            case "1": {
                themSoDaiHan();
                break;
            }
            case "2": {
                System.out.println("Bạn muốn thêm:\n" +
                        "1.sổ vô thời hạn\n" +
                        "2.so có thời hạn\n");
                System.out.print("Chọn chức năng: ");
                String chonChucNang = scanner.nextLine();
                switch (chonChucNang) {
                    case "1": {
                        themSoVoThoiHan();
                        break;
                    }
                    case "2": {
                        themSoCoThoiHan();
                        break;
                    }
                    default: {
                        System.out.println("fail!!  Press Enter to continue......");
                        scanner.nextLine();
                        displayMainMenu();
                    }
                }
                break;
            }
            default: {
                System.out.println("fail!!  Press Enter to continue......");
                scanner.nextLine();
                displayMainMenu();
            }
        }
    }

    public static void themSoDaiHan() {
        daiHanArraylist = FuncFileCsv.getFileSoDaiHan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm So Ngan Han:\n ");
        String maSoSo;
        do {
            System.out.print("Nhập Mã Số sổ: ");
            maSoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String maKH;
        do {
            System.out.print("Nhập Mã KH: ");
            maKH = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String ngayMoSo;
        do {
            System.out.print("nhập ngày mở sổ: ");
            ngayMoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String thoiGianBatDauGui;
        do {
            System.out.print("nhập thời gian bắt đàu gửi: ");
            thoiGianBatDauGui = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String soTienGui;
        do {
            System.out.print("nhập so tiền gửi: ");
            soTienGui = scanner.nextLine();
        } while (!Regex.checkSoTienGui(soTienGui));

        String laiSuat;
        do {
            System.out.print("nhập lãi suất: ");
            laiSuat = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String kyHan;
        do {
            System.out.print("nhập kỳ hạn: ");
            kyHan = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String uuDai;
        do {
            System.out.print("nhập ưu đãi: ");
            uuDai = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));
        SoDaiHan soDaiHan = new SoDaiHan(maSoSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat, kyHan, uuDai);
        daiHanArraylist.add(soDaiHan);
        FuncFileCsv.ghiFileSoDaiHan(daiHanArraylist);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void themSoVoThoiHan() {
        nganHanArraylist = FuncFileCsv.getFileSoNganHan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm So Vô Thời Hạn:\n ");
        String maSoSo;
        do {
            System.out.print("Nhập Mã Số sổ: ");
            maSoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String maKH;
        do {
            System.out.print("Nhập Mã KH: ");
            maKH = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String ngayMoSo;
        do {
            System.out.print("nhập ngày mở sổ: ");
            ngayMoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String thoiGianBatDauGui;
        do {
            System.out.print("nhập thời gian bắt đàu gửi: ");
            thoiGianBatDauGui = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String soTienGui;
        do {
            System.out.print("nhập so tiền gửi: ");
            soTienGui = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String laiSuat;
        do {
            System.out.print("nhập lãi suất: ");
            laiSuat = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        SoVoThoiHan soVoThoiHan = new SoVoThoiHan(maSoSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat);
        nganHanArraylist.add(soVoThoiHan);
        FuncFileCsv.ghiFileSoVoThoiHan(nganHanArraylist);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void themSoCoThoiHan() {
        nganHanArraylist = FuncFileCsv.getFileSoNganHan();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm So Vô Thời Hạn:\n ");
        String maSoSo;
        do {
            System.out.print("Nhập Mã Số sổ: ");
            maSoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String maKH;
        do {
            System.out.print("Nhập Mã KH: ");
            maKH = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String ngayMoSo;
        do {
            System.out.print("nhập ngày mở sổ: ");
            ngayMoSo = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String thoiGianBatDauGui;
        do {
            System.out.print("nhập thời gian bắt đàu gửi: ");
            thoiGianBatDauGui = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String soTienGui;
        do {
            System.out.print("nhập so tiền gửi: ");
            soTienGui = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String laiSuat;
        do {
            System.out.print("nhập lãi suất: ");
            laiSuat = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        String kyHan;
        do {
            System.out.print("nhập ky hạn: ");
            kyHan = scanner.nextLine();
        } while (!Regex.checkMaSoSo(maSoSo));

        SoCoThoiHan soCoThoiHan = new SoCoThoiHan(maSoSo, maKH, ngayMoSo, thoiGianBatDauGui, soTienGui, laiSuat, kyHan);
        nganHanArraylist.add(soCoThoiHan);
        FuncFileCsv.ghiFileSoCoThoiHan(nganHanArraylist);
        System.out.println("\nAdd complete!!! Press Enter to continue......\n");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void xoaSoTietkiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số sổ bạn muốn xóa: ");
        String maSo = scanner.nextLine();
        daiHanArraylist = FuncFileCsv.getFileSoDaiHan();
        nganHanArraylist = FuncFileCsv.getFileSoNganHan();
        for (SoDaiHan daihan : daiHanArraylist) {
            if (daihan.getMaSo().equals(maSo)) {
                daiHanArraylist.remove(daihan);
                FuncFileCsv.ghiFileSoDaiHan(daiHanArraylist);
            }
        }
        /*for(SoNganHan nganHan: nganHanArraylist){
            if(nganHan.getMaSo().equals(maSo)){
                daiHanArraylist.remove(nganHan);
            }*/
    }

    public static void thongTinKhachHang() {
        khachHangs = FuncFileCsv.getFileKhachHang();
        for (KhachHang khachHang : khachHangs) {
            System.out.println(khachHang.toString());
        }
        displayMainMenu();
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
