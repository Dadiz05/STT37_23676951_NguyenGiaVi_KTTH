package stt37_23676951_NguyenGiaVi_KTTH;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDichNha extends GiaoDich {
    private LoaiNha loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGD, LocalDate ngayGD, double donGia, LoaiNha loaiNha, String diaChi, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double getThanhTien() {
        if (loaiNha == LoaiNha.CAO_CAP) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-10s %-15s %-10.2f %-10.2f %-10s %-20s %-10.2f", 
            maGD, ngayGD.format(df), donGia, dienTich, loaiNha, diaChi, getThanhTien());
    }
}
