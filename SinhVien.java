package Nguoi;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String Masinhvien;

    //Constructor mặc định
    public SinhVien() {
    }

    //Constructor tham số
    public SinhVien(String Hovaten, String Ngaysinh, String Gioitinh, int Cmnd, String Masinhvien) {
        super(Hovaten, Ngaysinh, Gioitinh, Cmnd);
        this.Masinhvien = Masinhvien;
    }

    //Getter Setter
    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String Masinhvien) {
        this.Masinhvien = Masinhvien;
    }

    @Override
    //Nhập
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masinhvien: ");
        Masinhvien = scanner.nextLine();
    }

    @Override
    //Xuất
    public void xuat() {
        super.xuat();
        System.out.println(", Masinhvien=" + Masinhvien);
    }

    //Đánh giá rèn luyện
    public void Danhsachrenluyen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sach ren luyen (1-Tot, 2-Kha, 3-TB, 4-Yeu): ");
        int chon = scanner.nextInt();
        switch (chon) {
            case 1 ->
                System.out.println("Xep loat Tot");
            case 2 ->
                System.out.println("Xep loat Kha");
            case 3 ->
                System.out.println("Xep loat Trung Binh");
            case 4 ->
                System.out.println("Xep loat Yeu");
            default ->
                System.out.println("Khong hop le");
        }
    }
}
