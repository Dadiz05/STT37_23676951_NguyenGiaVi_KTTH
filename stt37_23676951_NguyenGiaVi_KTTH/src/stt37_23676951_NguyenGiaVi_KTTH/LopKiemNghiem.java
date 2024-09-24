package stt37_23676951_NguyenGiaVi_KTTH;

import java.time.LocalDate;

public class LopKiemNghiem {
    public static void main(String[] args) {
        QuanLyGiaoDich gd = new QuanLyGiaoDich(6);

        gd.addGiaoDich(0, new GiaoDichDat("GDD1", LocalDate.of(2013, 9, 15), 100000, LoaiDat.A, 100));
        gd.addGiaoDich(1, new GiaoDichDat("GDD2", LocalDate.of(2013, 9, 20), 50000, LoaiDat.B, 200));
        gd.addGiaoDich(2, new GiaoDichDat("GDD3", LocalDate.of(2013, 10, 1), 30000, LoaiDat.C, 150));
        gd.addGiaoDich(3, new GiaoDichNha("GDN1", LocalDate.of(2013, 9, 18), 200000, LoaiNha.CAO_CAP, "713 Le Duc Tho", 120));
        gd.addGiaoDich(4, new GiaoDichNha("GDN2", LocalDate.of(2013, 9, 25), 150000, LoaiNha.THUONG, "456 Thong Nhat", 80));
        gd.addGiaoDich(5, new GiaoDichNha("GDN3", LocalDate.of(2013, 10, 10), 180000, LoaiNha.THUONG, "550 Duong so 8", 100));

        int soGiaoDichDat = gd.countGiaoDichDat();
        double tongThanhTienDat = gd.getThanhTienDat();
        double trungBinhThanhTienDat = tongThanhTienDat/soGiaoDichDat;

        System.out.println("Tong so giao dich dat: " + soGiaoDichDat);
        System.out.println("Tong so giao dich nha: " + (6 - soGiaoDichDat));
        System.out.printf("Trung binh thanh tien giao dich dat: %.2f\n", trungBinhThanhTienDat);

        System.out.println("Cac giao dich trong 9 nam 2013:");
        gd.getDS9_2013();
    }
}
