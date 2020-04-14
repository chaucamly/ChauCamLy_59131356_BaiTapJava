/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;



/**
 *
 * @author Cam Ly
 */
public class NhanVien 
{
    public String Ten;
    public int  Tuoi;
    public String  Diachi;
    public double Tienluong;
    public int Tongsogiolam;
    public NhanVien()
    {
        Ten="";
        Tuoi=0;
        Diachi="  ";
        Tienluong=0;
        Tongsogiolam=0;
    }
    
    public NhanVien(String Ten, int Tuoi, String Diachi, double Tienluong, int Tongsogiolam)
    {
        this.Ten= Ten;
        this.Tuoi= Tuoi;
        this.Diachi= Diachi;
        this.Tienluong= Tienluong;
        this.Tongsogiolam= Tongsogiolam;
    }
    public String getThongTin() 
    {
        return "Ten: " + Ten + ", tuoi: " + Tuoi + ", diachi: " + Diachi+ ", tien luong: "+ Tienluong + ", tong gio lam: " + Tongsogiolam + ",thuong:  "+tinhThuong ();
    }
    public double tinhThuong()
    {
        double thuong;
        if(Tongsogiolam>=200)
            thuong=Tienluong*0.2;
        else if(Tongsogiolam>100 && Tongsogiolam<200)
            thuong=Tienluong*0.1;
        else
            thuong=0;
        return thuong;
    }
        
}
    
    
    
    
    
    
    

