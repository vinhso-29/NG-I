package Nguoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachNguoi ds = new DanhSachNguoi();

        int Tieptuc;
        do {
            System.out.println("\n      MENU        ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Them giao vien");
            System.out.println("3. Xuat danh sach");
            System.out.println("4. Tim kiem theo CMND");
            System.out.println("5. Xoa theo CMND");
            System.out.println("6. Sua theo CMND");
            System.out.println("0, Thoat");
            System.out.print("Chon: ");
            Tieptuc = scanner.nextInt();
            scanner.nextLine();
            switch (Tieptuc) {
                case 1 -> {
                    SinhVien sinhvien = new SinhVien();
                    ds.Themdanhsach(sinhvien);
                }
                case 2 -> {
                    GiaoVien giaovien = new GiaoVien();
                    ds.Themdanhsach(giaovien);
                }
                case 3 ->
                    ds.Xuatdanhsach();
                case 4 -> {
                    System.out.print("Nhap CMND can tim:");
                    int CMNDtim = scanner.nextInt();
                    Nguoi kq = ds.Timtheocmnd(CMNDtim);
                    if (kq != null) {
                        System.out.print("Tim thay: ");
                        kq.xuat();
                        System.out.println();
                    } else {
                        System.out.println("Khong tim thay");
                    }
                }
                case 5 -> {
                    System.out.print("Nhap CMND can xoa:");
                    int CMNDxoa = scanner.nextInt();
                    if (ds.xoa(CMNDxoa)) {
                        System.out.println("Da xoa thanh cong");
                    } else {
                        System.out.println("Khong tim thay de xoa");
                    }
                }
                case 6 -> {
                    System.out.print("Nhap cmnd can sua:");
                    int CMNDsua = scanner.nextInt();
                    if (ds.Sua(CMNDsua)) {
                        System.out.println("Da cap nhat thong tin");
                    } else {
                        System.out.println("Khong tim thay de sua");
                    }
                }
                case 0 ->
                    System.out.println("Thoat chuong trinh");
                default ->
                    System.out.println("Lua chon khong hop le");
            }
        } while (Tieptuc != 0);
    }
}
