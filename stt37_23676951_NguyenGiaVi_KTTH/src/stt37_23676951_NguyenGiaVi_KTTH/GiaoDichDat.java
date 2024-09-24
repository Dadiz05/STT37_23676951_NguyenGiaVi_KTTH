package stt37_23676951_NguyenGiaVi_KTTH;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDichDat extends GiaoDich {
    private LoaiDat loaiDat;

    public GiaoDichDat(String maGD, LocalDate ngayGD, double donGia, LoaiDat loaiDat, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double getThanhTien() {
        if (loaiDat == LoaiDat.A) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-10s %-15s %-10.2f %-10.2f %-30s  %-10.2f", 
            maGD, ngayGD.format(df), donGia, dienTich, loaiDat, getThanhTien());
    }
}
