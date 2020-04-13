/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.Scanner;

/**
 *
 * @author Cam Ly
 */
public class BaiTap1Main 
{
    public static void main(String[] args)
 {
    Scanner nhap=new Scanner(System.in);
    NhanVien nhanvien1=new NhanVien();
    System.out.println("Ten nhan vien: ");
    nhanvien1.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nhanvien1.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nhanvien1.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    nhanvien1.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam: ");
    nhanvien1.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    
    NhanVien nhanvien2=new NhanVien();
    System.out.println("Ten nhan vien: ");
    nhanvien2.Ten=nhap.nextLine();
    System.out.println("Tuoi nhan vien: ");
    nhanvien2.Tuoi=nhap.nextInt();
    nhap.nextLine();
    System.out.println("Dia chi nhan vien: ");
    nhanvien2.Diachi=nhap.nextLine();
    System.out.println("Tien luong nhan vien: ");
    nhanvien2.Tienluong=nhap.nextDouble();
    System.out.println("Tong so gio lam: ");
    nhanvien2.Tongsogiolam=nhap.nextInt();
    nhap.nextLine();
    
    System.out.println(nhanvien1.getThongTin());
    System.out.println("Tien thuong: " + nhanvien1.tinhThuong());
  
    System.out.println(nhanvien2.getThongTin());
    System.out.println("Tien thuong: " + nhanvien2.tinhThuong());
    
 }
}
    


    
    
    
            
            
 
    

