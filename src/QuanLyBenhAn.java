import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyBenhAn {
    ArrayList<BenhAnVip> benhAnVips;
    ArrayList<BenhAnThuong> benhAnThuongs;

    public QuanLyBenhAn() {
        this.benhAnVips = new ArrayList<>();
        this.benhAnThuongs = new ArrayList<>();
    }

    public void docFileCSVtuBenhAnThuong() {
        benhAnThuongs.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("src/medical_records.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int soThutuBenhAn = Integer.parseInt(data[0]);
                String maBenhAn = data[1];
                String tenBenNhan = data[2];
                int ngayNhapVien = Integer.parseInt(data[3]);
                int ngayRaVien = Integer.parseInt(data[4]);
                String lyDoNhapvien = data[5];
                Double phiNamVien = Double.valueOf(data[6]);
                benhAnThuongs.add(new BenhAnThuong(soThutuBenhAn,maBenhAn,tenBenNhan,ngayNhapVien,ngayRaVien,lyDoNhapvien,phiNamVien));;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void docFileCSVtuBenhAnVip() {
        benhAnVips.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("src/medical_records.csv"))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int soThutuBenhAn = Integer.parseInt(data[0]);
                String maBenhAn = data[1];
                String tenBenNhan = data[2];
                int ngayNhapVien = Integer.parseInt(data[3]);
                int ngayRaVien = Integer.parseInt(data[4]);
                String lyDoNhapvien = data[5];
                String VIP = data[6];
                benhAnVips.add(new BenhAnVip(soThutuBenhAn,maBenhAn,tenBenNhan,ngayNhapVien,ngayRaVien,lyDoNhapvien,VIP));;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void vietVaoFileCSV(String nhapTenBenhNhanMoi) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("medical_records.csv"))) {
            for (BenhAnThuong thuong : benhAnThuongs) {
                if (thuong.equals(nhapTenBenhNhanMoi)) {
                    bw.write(thuong.getSoThuTuBenhAn() + "," + thuong.getMaBenhAn() + "," + thuong.getTenBenhNhan() + "," + thuong.getTenBenhNhan() + "," + thuong.getNgayNhapVien() + "," + thuong.getNgayRaVien() + "," + thuong.getLyDoNhapVien());
                }
            }
            for (BenhAnVip vip : benhAnVips) {
                if (vip.equals(nhapTenBenhNhanMoi)) {
                    bw.write(vip.getSoThuTuBenhAn() + "," + vip.getMaBenhAn() + "," + vip.getTenBenhNhan() + "," + vip.getTenBenhNhan() + "," + vip.getNgayNhapVien() + "," + vip.getNgayRaVien() + "," + vip.getLyDoNhapVien());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void xoaBenhNhanraKhoiBenhAn(String nhaptenBenhNhanMuonXoa) {
        for (BenhAnThuong benhAnThuong : benhAnThuongs) {
            if (benhAnThuong.getTenBenhNhan().equalsIgnoreCase(nhaptenBenhNhanMuonXoa)) {
                benhAnThuongs.remove(benhAnThuong);
            }
        }
        for (BenhAnVip benhAnVip : benhAnVips) {
            if (benhAnVip.getTenBenhNhan().equalsIgnoreCase(nhaptenBenhNhanMuonXoa)) {
                benhAnVips.remove(benhAnVip);
            }
        }
    }

    public void hienThiDanhSachBenhAn() {
        System.out.println("Danh sach Benh An Thuong:");
        for (BenhAnThuong benhAnThuong : benhAnThuongs) {
            System.out.println("So Thu Tu: " + benhAnThuong.getSoThuTuBenhAn() + ", Ma Benh An: " + benhAnThuong.getMaBenhAn() +
                    ", Ten Benh Nhan: " + benhAnThuong.getTenBenhNhan() + ", Ngay Nhap Vien: " + benhAnThuong.getNgayNhapVien() +
                    ", Ngay Ra Vien: " + benhAnThuong.getNgayRaVien() + ", Ly Do Nhap Vien: " + benhAnThuong.getLyDoNhapVien() +
                    ", Phi Nam Vien: " + benhAnThuong.getPhiNamVien());
        }

        System.out.println("Danh sach Benh An VIP:");
        for (BenhAnVip benhAnVip : benhAnVips) {
            System.out.println("So Thu Tu: " + benhAnVip.getSoThuTuBenhAn() + ", Ma Benh An: " + benhAnVip.getMaBenhAn() +
                    ", Ten Benh Nhan: " + benhAnVip.getTenBenhNhan() + ", Ngay Nhap Vien: " + benhAnVip.getNgayNhapVien() +
                    ", Ngay Ra Vien: " + benhAnVip.getNgayRaVien() + ", Ly Do Nhap Vien: " + benhAnVip.getLyDoNhapVien() +
                    ", Loai VIP: " + benhAnVip.getVIP());
        }
    }

}
