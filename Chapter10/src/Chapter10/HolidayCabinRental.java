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
public class HolidayCabinRental extends CabinRental{
    
    public HolidayCabinRental(Integer cabina) {
        super(cabina);
        tarifa=this.getTarifa()+150.00;
    }
    @Override
    public String toString(){
        return String.format("La cabina numero "+this.getCabina()+" tiene un precio de "+this.getTarifa());
    }
}
