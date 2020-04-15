/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Cam Ly
 */
public abstract class SinhVienPoly 
{
    public String hoTen;
    public String nganh;
    public SinhVienPoly (String hoTen, String nganh)
    {
        this.hoTen=hoTen;
        this.nganh=nganh;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
        double diem=this.getDiem();
        if(diem<5) 
            return "Yếu";
        if (diem<6.5)
            return "Trung Bình";
        if(diem<7.5)
            return "Khá";
        if(diem<9)
            return"Giỏi";
        else return "Xuất Sắc";
    }
    public void xuat()
    {
        System.out.println("Họ Tên: " + hoTen+ " Ngành học: "+nganh);
    }
}
