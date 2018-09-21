/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phixuanhoan
 */
public class Button {
    private String Text;
    private String Color;
    private String type;

    /**
     * @return the Text
     */
    public String getText() {
        return Text;
    }

    /**
     * @param Text the Text to set
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    //Hàm xử lý sự kiện press
    public void dePress(){
        
    }
    //Hàm xử lý sự kiện bỏ press
    public void unDePress(){
        
    }
}
