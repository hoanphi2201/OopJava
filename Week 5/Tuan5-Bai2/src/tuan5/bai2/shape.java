/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5.bai2;

/**
 *
 * @author phixuanhoan
 */
/**
 * Kiểm tra quan hệ ISA tức là xem thứ này có là thứ kia hay không
 * đặt câu hỏi theo dạng "nếu phát biểu 1 cách tổng quát rằng loại X là 1 dạng/thứ/kiểu của
 *  Y thì có hợp lý hay không".  Nếu trả lời là có thì X có thể là con của Y
 *  Ví dụ: tam giác là 1 hình                   => đúng
 *         Mèo là 1 động vật họ mèo             => đúng
 *         Xe tải là 1 phương tiện giao thông   => đúng
 *         Phòng bếp là 1 cái nhà               => sai (quan hệ chứa)
 * Bài làm: Trong sơ đồ có 3 quan hệ thừa kế
 *          Khi ta nói hình tròn là 1 hình thì ta được phát biểu đúng theo quan hệ isa
 *          còn khi nói hình tròn là 1 hình vuông thì sai
 * 
 * final : nếu class có final thì không thể ghi đè
 * 1 thuộc tính final sẽ ko bị thay đổi
 * => Pi phải chứ final
 * 
 */
public abstract class shape {
    // color: maù của hình
    protected String color;
    // filled : kiểm tra đã đầy hay chưa
    protected boolean filled;

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public shape(){
        color = "red";
        filled = true;
    }
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String toString(){
        return "shape";
    }
    
}
