package common;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCsv {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String FILE_HEADER_DAI_HAN = "ma so so, ma khach hang, ngay mo so, thoi gian bat dau gui, so tien gui, lai suat, ky han, uu ai";
    public static final String FILE_NAME_DAI_HAN = "src/data/longTerm.csv";
    public static final String FILE_HEADER_NGAN_HAN = "ma so so, ma khach hang, ngay mo so, thoi gian bat dau gui, so tien gui, lai suat, ky han,";
    public static final String FILE_NAME_NGAN_HAN = "src/data/shortTerm.csv";
    public static final String FILE_NAME_KHACH_HANG = "src/data/customer.csv";

    public static void ghiFileSoDaiHan(ArrayList<SoDaiHan> soDaiHanArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_DAI_HAN);
            fileWriter.append(FILE_HEADER_DAI_HAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoDaiHan soDaiHan : soDaiHanArrayList) {
                fileWriter.append(soDaiHan.getMaSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getMaKH());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getThoiGianBatDauGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getLaiSuat());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getKyHan());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soDaiHan.getUuDai());
                fileWriter.append(NEW_LINE_SEPARATOR);

            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void ghiFileSoVoThoiHan(ArrayList<SoVoThoiHan> soNganHanArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_NGAN_HAN);
            fileWriter.append(FILE_HEADER_NGAN_HAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoVoThoiHan soNganHan : soNganHanArrayList) {
                fileWriter.append(soNganHan.getMaSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getMaKH());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getThoiGianBatDauGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getLaiSuat());
                fileWriter.append(COMMA_DELIMITER);
            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void ghiFileSoCoThoiHan(ArrayList<SoCoThoiHan> soNganHanArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_NAME_NGAN_HAN);
            fileWriter.append(FILE_HEADER_NGAN_HAN);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (SoCoThoiHan soNganHan : soNganHanArrayList) {
                fileWriter.append(soNganHan.getMaSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getMaKH());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getNgayMoSo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getThoiGianBatDauGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getSoTienGui());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getLaiSuat());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(soNganHan.getKyHan());
                fileWriter.append(COMMA_DELIMITER);
            }
        } catch (Exception ex) {
            System.out.println("Error in Csv file write !!!");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception ex) {
                System.out.println("Error when flush or close");
            }
        }
    }

    public static ArrayList<SoDaiHan> getFileSoDaiHan() {
        BufferedReader br = null;
        ArrayList<SoDaiHan> soDaiHanArrayList = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_DAI_HAN));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ma so so")) {
                    continue;
                }
                SoDaiHan soDaiHan = new SoDaiHan();
                soDaiHan.setMaSo(splitData[0]);
                soDaiHan.setMaKH(splitData[1]);
                soDaiHan.setNgayMoSo(splitData[2]);
                soDaiHan.setThoiGianBatDauGui(splitData[3]);
                soDaiHan.setSoTienGui(splitData[4]);
                soDaiHan.setLaiSuat(splitData[5]);
                soDaiHan.setKyHan(splitData[6]);
                soDaiHan.setUuDai(splitData[7]);
                soDaiHanArrayList.add(soDaiHan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return soDaiHanArrayList;
    }

    public static ArrayList<SoNganHan> getFileSoNganHan() {
        BufferedReader br = null;
        ArrayList<SoNganHan> soNganHanArrayList = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_NGAN_HAN));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ma so so")) {
                    continue;
                }
                SoNganHan soNganHan = new SoNganHan();
                soNganHan.setMaSo(splitData[0]);
                soNganHan.setMaKH(splitData[1]);
                soNganHan.setNgayMoSo(splitData[2]);
                soNganHan.setThoiGianBatDauGui(splitData[3]);
                soNganHan.setSoTienGui(splitData[4]);
                soNganHan.setLaiSuat(splitData[5]);
                //soNganHan.setKyHan(splitData[6]);
                soNganHanArrayList.add(soNganHan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return soNganHanArrayList;
    }

    public static ArrayList<KhachHang> getFileKhachHang() {
        BufferedReader br = null;
        ArrayList<KhachHang> khachHangs = new ArrayList<>();

        try {
            String line;
            br = new BufferedReader(new FileReader(FILE_NAME_KHACH_HANG));

            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("ma so so")) {
                    continue;
                }
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKH(splitData[0]);
                khachHang.setTenKH(splitData[1]);
                khachHang.setNgaySinh(splitData[2]);
                khachHang.setGioiTinh(splitData[3]);
                khachHang.setSoDienThoai(splitData[4]);
                khachHang.setDiaChi(splitData[5]);
                khachHangs.add(khachHang);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return khachHangs;
    }
}
