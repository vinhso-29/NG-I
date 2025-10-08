package Nguoi;

import java.util.Scanner;

public class GiaoVien extends Nguoi {

    private String Magiaovien;

    //Constructo mặc định
    public GiaoVien() {
    }

    //Constructor tham số 
    public GiaoVien(String Hovaten, String Ngaysinh, String Gioitinh, int Cmnd, String Masinhvien, String Magiaovien) {
        super(Hovaten, Ngaysinh, Gioitinh, Cmnd);
        this.Magiaovien = Magiaovien;
    }

    // Getter Setter
    public String getMagiaovien() {
        return Magiaovien;
    }

    public void setMagiaovien(String Magiaovien) {
        this.Magiaovien = Magiaovien;
    }

    @Override
    //Nhập
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma giao vien: ");
        Magiaovien = scanner.nextLine();
    }

    @Override
    //Xuất
    public void xuat() {
        super.xuat();
        System.out.println(", Magiaovien=" + Magiaovien);
    }

    //Xếp loại thi đua
    public void Xeploaithidua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chon xep loai thi dua (1-Loai A, 2-Loai B, 3-Loai C");
        int chon = scanner.nextInt();
        switch (chon) {
            case 1 ->
                System.out.println("Thi dua loai A");
            case 2 ->
                System.out.println("Thi dua loai B");
            case 3 ->
                System.out.println("Thi dua loai C");
            default ->
                System.out.println("Khong hop le");
        }
    }
}
