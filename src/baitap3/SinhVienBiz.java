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
public class SinhVienBiz extends SinhVienPoly
{
    public double diemMaketing;
    public double diemSales;
    public SinhVienBiz(String hoTen, String nganh, double diemMaketing, double diemSales)
    {
        super(hoTen ,nganh);
        this.diemMaketing=diemMaketing;
        this.diemSales=diemSales;
    }

    /**
     *
     * @return
     */
    @Override
    public double getDiem()
    {
      return(2*diemMaketing + diemSales)/3;
    };
}
