public class BenhAnVip extends BenhAnCuaBenhNhan {
    private String VIP;

    public BenhAnVip(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapvien, String VIP) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapvien);
        this.VIP = VIP;
    }

    public BenhAnVip(String VIP) {
        this.VIP = VIP;
    }

    public String getVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "VIP='" + VIP + '\'' +
                '}';
    }
}
