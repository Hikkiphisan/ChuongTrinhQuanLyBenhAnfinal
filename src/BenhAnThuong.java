public class BenhAnThuong extends BenhAnCuaBenhNhan {
   private double phiNamVien;

   public BenhAnThuong(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, int ngayNhapVien, int ngayRaVien, String lyDoNhapvien, double phiNamVien) {
      super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapvien);
      this.phiNamVien = phiNamVien;
   }

   public BenhAnThuong(double phiNamVien) {
      this.phiNamVien = phiNamVien;
   }

   public double getPhiNamVien() {
      return phiNamVien;
   }

   public void setPhiNamVien(double phiNamVien) {
      this.phiNamVien = phiNamVien;
   }

   @Override
   public String toString() {
      return "BenhAnThuong{}";
   }
}
