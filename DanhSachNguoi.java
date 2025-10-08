package Nguoi;

import java.util.ArrayList;

public class DanhSachNguoi {

    private ArrayList<Nguoi> Danhsach;

    public DanhSachNguoi() {
        Danhsach = new ArrayList<>();
    }

    public void Themdanhsach(Nguoi nguoi) {
        nguoi.nhap();
        Danhsach.add(nguoi);
    }

    public void Xuatdanhsach() {
        if (Danhsach.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("DANH SACH NGUOI");
        for (Nguoi n : Danhsach) {
            n.xuat();
            System.out.println();
        }
    }

    //Tìm theo CMND
    public Nguoi Timtheocmnd(int Cmnd) {
        for (Nguoi n : Danhsach) {
            if (n.getCmnd() == Cmnd) {
                return n;
            }
        }
        return null;
    }

    //Xóa theo CMND
    public boolean xoa(int Cmnd) {
        Nguoi n = Timtheocmnd(Cmnd);
        if (n != null) {
            Danhsach.remove(n);
            return true;
        }
        return false;
    }

    //Sửa thông tin theo CMND
    public boolean Sua(int Cmnd) {
        Nguoi n = Timtheocmnd(Cmnd);
        if (n != null) {
            System.out.println("Nhap lai thong tin cho nguoi co CMND: " + Cmnd);
            n.nhap();
            return true;
        }
        return false;
    }
}
