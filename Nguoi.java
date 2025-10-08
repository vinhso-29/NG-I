package Nguoi;

import java.util.Scanner;

public class Nguoi {

    private String Hovaten;
    private String Ngaysinh;
    private String Gioitinh;
    private int Cmnd;

    //Constructor mặc định
    public Nguoi() {
    }

    //Constructor tham số
    public Nguoi(String Hovaten, String Ngaysinh, String Gioitinh, int Cmnd) {
        this.Hovaten = Hovaten;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.Cmnd = Cmnd;
    }

    //Getter Setter
    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public int getCmnd() {
        return Cmnd;
    }

    public void setCmnd(int Cmnd) {
        this.Cmnd = Cmnd;
    }

    //Nhập
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        Hovaten = scanner.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyyy): ");
        Ngaysinh = scanner.nextLine();
        System.out.print("Gioi tinh: ");
        Gioitinh = scanner.nextLine();
        System.out.print("CMND: ");
        Cmnd = Integer.parseInt(scanner.nextLine());
    }

    //Xuất
    public void xuat() {
        System.out.print("Hovaten=" + Hovaten + ", Ngaysinh=" + Ngaysinh + ", Gioitinh=" + Gioitinh + ", Cmnd=" + Cmnd);
    }
}
