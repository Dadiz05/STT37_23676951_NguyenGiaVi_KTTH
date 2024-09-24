package stt37_23676951_NguyenGiaVi_KTTH;


public class QuanLyGiaoDich {
    private GiaoDich[] dsgd;

    public QuanLyGiaoDich(int size) {
        dsgd = new GiaoDich[size];
    }

    public void addGiaoDich(int index, GiaoDich gd) {
        if (index >= 0 && index < dsgd.length) {
            dsgd[index] = gd;
        }
    }

    public int countGiaoDichDat() {
        int count = 0;
        for (GiaoDich gd : dsgd) {
            if (gd instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public double getThanhTienDat() {
        double tong = 0;
        for (GiaoDich gd : dsgd) {
            if (gd instanceof GiaoDichDat) {
                tong += gd.getThanhTien();
            }
        }
        return tong;
    }

    public void getDS9_2013() {
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-20s %-10s\n", 
                          "MaGD", "NgayGD", "DonGia", "DienTich", "Loai", "DiaChi", "ThanhTien");
        for (GiaoDich gd : dsgd) {
            if (gd != null && gd.getNgayGD().getYear() == 2013 && gd.getNgayGD().getMonthValue() == 9) {
                System.out.println(gd);
            }
        }
    }
}
