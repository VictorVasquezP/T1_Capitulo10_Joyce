/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author luisl
 */
public class Vehicle {
    private Integer ruedas;
    private Integer millas;

    public Vehicle(Integer ruedas, Integer millas) {
        this.ruedas = ruedas;
        this.millas = millas;
    }
    
    @Override
    public String toString(){
        return String.format("Numero de ruedas: %d,  Millas por galon: %d",this.getRuedas(),this.getMillas());
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public Integer getMillas() {
        return millas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public void setMillas(Integer millas) {
        this.millas = millas;
    }

   
    
}
