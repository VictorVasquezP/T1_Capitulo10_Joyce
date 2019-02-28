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
public class CarRental {
    private String name;
    private Integer codigoP;
    private TamanoAuto tam;
    private Double tarifa;
    private Integer duracion;
    private Double total;

    public CarRental(String name, Integer codigoP, TamanoAuto tam, Integer duracion) {
        this.name = name;
        this.codigoP = codigoP;
        this.tam = tam;
        this.duracion = duracion;
        setTarifa(tam, duracion);
    }
    public void setTarifa(TamanoAuto tam, Integer duracion){
        switch(tam){
            case economico:
                this.tarifa=29.99;
                this.total=29.99*duracion;
                break;
            case mediano:
                this.tarifa=38.99;
                this.total=38.99*duracion;
                break;
            case completo:
                this.tarifa=43.50;
                this.total=43.50*duracion;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getCodigoP() {
        return codigoP;
    }

    public TamanoAuto getTam() {
        return tam;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Double getTotal() {
        return total;
    }
    
    public String display(){
        return String.format("El auto de tamaño "+this.getTam().name()+" con tarifa de "+this.getTarifa()+
                            " a nombre de "+this.getName()+ " con codigo postal de "+this.getCodigoP()+" duro "+
                            this.getDuracion()+" dias, tiene un total de "+this.getTotal()
                );
    }
    
}
