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
public class LuxuryCarRental extends CarRental{
    private Double tarifa;
    private Boolean chofer;
    private Double total;
    public LuxuryCarRental(String name, Integer codigoP, TamanoAuto tam, Integer duracion, Boolean c) {
        super(name, codigoP, tam, duracion);
        this.chofer=c;
        setTarifa2(c, duracion);
    }
    public void setTarifa2(Boolean chofer, Integer d){
        this.tarifa=79.99;
        if(chofer==true){
            this.total=200*d+79.99;
        }else{
            this.total=79.99;
        }
    }

    @Override
    public Double getTarifa() {
        return tarifa;
    }

    public Boolean getChofer() {
        return chofer;
    }

    @Override
    public Double getTotal() {
        return total;
    }
    
    @Override
    public String display(){
        return String.format("El auto de tamaño "+this.getTam().name()+" con tarifa de "+this.getTarifa()+
                            " a nombre de "+this.getName()+ " con codigo postal de "+this.getCodigoP()+" duro "+
                            this.getDuracion()+" dias, tiene un total de "+this.getTotal()+" incluye chofer: "+chofer
                );
    }
}
