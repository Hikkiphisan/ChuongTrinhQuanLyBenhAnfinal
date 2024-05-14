import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyBenhAn quanLyBenhAn = new QuanLyBenhAn();

        while (true) {
            System.out.println("--CHUONG TRINH QUAN LY BENH AN--");
            System.out.println("Chon chuc nang theo so de tiep tuc: ");
            System.out.println("Nhan 1 de them moi ");
            System.out.println("Nhan 2 de xoa ");
            System.out.println("Nhan 3 de xem danh sach benh an ");
            System.out.println("Nhan 4 de thoat khoi chuong trinh");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    quanLyBenhAn.docFileCSVtuBenhAnThuong();
                    quanLyBenhAn.docFileCSVtuBenhAnVip();
                    System.out.println("Nhập tên benh an cua benh nhan muon them vao: ");
                    String nhapTenBenhNhanMoi = scanner.nextLine();;
                    quanLyBenhAn.vietVaoFileCSV(nhapTenBenhNhanMoi);
                    break;
                }
                case "2": {
                    System.out.println("Nhap ten benh nhan muon xoa: ");
                    String nhaptenBenhNhanMuonxoa = scanner.nextLine();
                    quanLyBenhAn.xoaBenhNhanraKhoiBenhAn(nhaptenBenhNhanMuonxoa);
                    break;
                }
                case "3": {
                    quanLyBenhAn.hienThiDanhSachBenhAn();
                }
                case "4": {
                    System.out.println("Thoat Chuong trinh.");
                    scanner.close();
                    return;
                }

                default: {
                    System.out.println("Lua chon khong hop lẹ");
                    break;
                }
            }

        }
    }
}