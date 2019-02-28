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
public class ScentedCandle extends Candle{
    private String olor;

    public ScentedCandle(String color, Integer altura,String olor) {
        this.olor = olor;
        this.color=color;
        this.altura=altura;
    }
    
    
    @Override
    public void setAltura(Integer altura){
        this.altura = altura;
        this.precio=(altura*3);
    }
    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }
    public String imprimir(){
        return String.format("Color: %s\nAltura: %d\nPrecio: %d\nOlor: %s",this.getColor(),this.getAltura(),this.getPrecio(),this.getOlor());
    }
}
