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
public class CabinRental {
    private Integer cabina;
    public Double tarifa;

    public CabinRental(Integer cabina) {
        this.cabina = cabina;
        setTarifa(cabina);
    }

    public void setTarifa(Integer cabina) {
        if((cabina>=1)&&(cabina<=3)){
            this.tarifa=950.00;
        }else{
            this.tarifa=1100.00;
        }
    }
    
    public Integer getCabina() {
        return cabina;
    }

    public Double getTarifa() {
        return tarifa;
    }
    @Override
    public String toString(){
        return String.format("La cabina numero "+this.getCabina()+" tiene un precio de "+this.getTarifa());
    }
}
