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
public class SinhVienIT extends SinhVienPoly
{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    /**
     *
     * @param hoTen
     * @param nganh
     * @param diemJava
     * @param diemCss
     * @param diemHtml
     */
    public SinhVienIT(String hoTen, String nganh,double diemJava, double diemCss, double diemHtml)
    {
        super(hoTen, nganh);
        this.diemJava=diemJava;
        this.diemCss=diemCss;
        this.diemHtml=diemHtml;
    }

    /**
     *
     * @return
     */
    @Override
    public double getDiem() 
    { 
        return(2*diemJava + diemCss + diemHtml);
       
    }
    
}
