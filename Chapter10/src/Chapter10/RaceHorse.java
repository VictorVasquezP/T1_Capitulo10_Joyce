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
public class RaceHorse extends Horse{
    private Integer carreras;
    public RaceHorse(String name,String color,Integer anioNa,Integer carreras){
        setName(name);
        setColor(color);
        setAnioNa(anioNa);
        this.carreras=carreras;
    }
    public Integer getCarreras() {
        return carreras;
    }

    public void setCarreras(Integer carreras) {
        this.carreras = carreras;
    }
    @Override
    public String toString(){
        return String.format(this.getName()+" de"+this.getColor()+" año de nacimiento: "+this.getAnioNa()+" total de carreras: "+this.getCarreras());
    }
}
