public class BenhAnCuaBenhNhan {
    private int soThuTuBenhAn;
    private String maBenhAn;
    private String tenBenhNhan;
    private int ngayNhapVien;
    private int ngayRaVien;
    private String lyDoNhapvien;

    public BenhAnCuaBenhNhan(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapvien) {
        this.soThuTuBenhAn = soThuTuBenhAn;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapvien = getLyDoNhapVien();
    }

    public BenhAnCuaBenhNhan() {
    }

    public int getSoThuTuBenhAn() {
        return soThuTuBenhAn;
    }

    public void setSoThuTuBenhAn(int soThuTuBenhAn) {
        this.soThuTuBenhAn = soThuTuBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public int getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(int ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public int getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(int ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapvien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapvien = lyDoNhapvien;
    }
}
