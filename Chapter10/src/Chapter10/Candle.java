/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author Victor
 */
public class Candle {
    public String color;
    public Integer altura;
    public Integer precio;

    public String getColor() {
        return color;
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
        this.precio=(altura*2);
    }
    
}
