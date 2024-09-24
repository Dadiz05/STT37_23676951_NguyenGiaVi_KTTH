package stt37_23676951_NguyenGiaVi_KTTH;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
    protected String maGD;
    protected LocalDate ngayGD; 
    protected double donGia;
    protected double dienTich;

    public GiaoDich() {}

    public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        setDonGia(donGia);
        setDienTich(dienTich);
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public LocalDate getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(LocalDate ngayGD) {
        if (ngayGD.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Ngày giao dịch không được sau ngày hiện tại.");
        }
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia < 0) {
            throw new IllegalArgumentException("Đơn giá không được âm");
        }
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        if (dienTich < 0) {
            throw new IllegalArgumentException("Diện tích không được âm");
        }
        this.dienTich = dienTich;
    }

    public abstract double getThanhTien(); 

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-10s %-15s %-10.2f %-10.2f", 
            maGD, ngayGD.format(df), donGia, dienTich);
    }
}
