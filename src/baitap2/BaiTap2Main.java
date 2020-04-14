/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
import java.util.Scanner;

/**
 *
 * @author Cam Ly
 */
public class BaiTap2Main 
{
    public static void main(String[] args)
    {
        IQuanLy QLNhanVien=new QuanLyNhanVien();
        Scanner nhap=new Scanner(System.in);
       
 
     NhanVien  Nhanvien1 = new NhanVien();
    System.out.println("Ten nhan vien: ");
    Nhanvien1.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    Nhanvien1.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    Nhanvien1.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    Nhanvien1.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam nhan vien: ");
    Nhanvien1.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Tien thuong: " + Nhanvien1.tinhThuong());
    
      NhanVien Nhanvien2=new NhanVien();
    System.out.println("Ten nhan vien: ");
    Nhanvien2.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    Nhanvien2.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    Nhanvien2.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    Nhanvien2.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam nhan vien: ");
    Nhanvien2.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Tien thuong: " + Nhanvien2.tinhThuong());
    
      NhanVien Nhanvien3=new NhanVien();
    System.out.println("Ten nhan vien: ");
    Nhanvien3.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    Nhanvien3.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    Nhanvien3.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    Nhanvien3.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam nhan vien: ");
    Nhanvien3.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Tien thuong: " + Nhanvien3.tinhThuong());
    
      NhanVien Nhanvien4=new NhanVien();
    System.out.println("Ten nhan vien: ");
    Nhanvien4.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    Nhanvien4.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    Nhanvien4.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    Nhanvien4.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam nhan vien: ");
    Nhanvien4.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Tien thuong: " + Nhanvien4.tinhThuong());
    
      NhanVien Nhanvien5=new NhanVien();
    System.out.println("Ten nhan vien: ");
    Nhanvien5.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    Nhanvien5.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    Nhanvien5.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    Nhanvien5.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam nhan vien: ");
    Nhanvien5.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Tien thuong: " + Nhanvien5.tinhThuong());
    
    QLNhanVien.them(Nhanvien1);
    QLNhanVien.them(Nhanvien2);
    QLNhanVien.them(Nhanvien3);
    QLNhanVien.them(Nhanvien4);
    QLNhanVien.them(Nhanvien5);
    QLNhanVien.inDS();
    }       
}
