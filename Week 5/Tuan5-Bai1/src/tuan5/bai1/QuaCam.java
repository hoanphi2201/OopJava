/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5.bai1;

/**
 *
 * @author phixuanhoan
 */
public class QuaCam extends HoaQua{
    protected int soMui;          //số múi
    protected String loaiVo;      // loại vỏ sần hay nhẵn
    /**
     * @return the soMui
     */
    public int getSoMui() {
        return soMui;
    }

    /**
     * @param soMui the soMui to set
     */
    public void setSoMui(int soMui) {
        this.soMui = soMui;
    }

    /**
     * @return the loaiVo
     */
    public String getLoaiVo() {
        return loaiVo;
    }

    /**
     * @param loaiVo the loaiVo to set
     */
    public void setLoaiVo(String loaiVo) {
        this.loaiVo = loaiVo;
    }
    
     public String toString(){
        return "qua cam";
    }
    
    
}
