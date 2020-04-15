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
public class BaiTap3Main 
{
    public static void main(String[] args)
    {
        SinhVienPoly poly = new SinhVienIT("Nguyen Nga", "CNTT", 9, 9, 9);
        SinhVienIT it = new SinhVienIT("Chau Cam Ly", "CNTT", 10, 10, 10);
        SinhVienBiz biz = new SinhVienBiz("Do Chau Thanh Duy", "Biz", 8, 8);
        
        poly.xuat();
        System.out.println("Điểm: " + poly.getDiem());
        System.out.println("Học lực: " + poly.getHocLuc());
        
        it.xuat();
        System.out.println("Điểm: " + it.getDiem());
        System.out.println("Học lực: " + it.getHocLuc());
        
        biz.xuat();
        System.out.println("Điểm: " + biz.getDiem());
        System.out.println("Học lực: " + biz.getHocLuc());
        
    }
    
    
}
