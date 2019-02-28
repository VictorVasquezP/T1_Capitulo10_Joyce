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
public class Package {
    private Integer peso;
    private MediosEnvio envio;
    private Double costo;

    public Package(Integer peso, MediosEnvio envio) {
        this.peso = peso;
        this.envio = envio;
        setcalculaCost(envio, peso);
    }
    public void setcalculaCost(MediosEnvio envio,Integer peso){
        switch(envio){
            case A:
                if((peso>=1)&&(peso<=8)){
                    this.costo=2.00;
                }else{
                    if((peso>=9)&&(peso<=16)){
                        this.costo=3.00;
                    }else{
                        if(peso>16){
                            this.costo=4.50;
                        }
                    }
                }
                break;
            case M:
                if((peso>=1)&&(peso<=8)){
                    this.costo=0.50;
                }else{
                    if((peso>=9)&&(peso<=16)){
                        this.costo=1.50;
                    }else{
                        if(peso>16){
                            this.costo=2.15;
                        }
                    }
                }
                break;
            case T:
                if((peso>=1)&&(peso<=8)){
                    this.costo=1.50;
                }else{
                    if((peso>=9)&&(peso<=16)){
                        this.costo=2.35;
                    }else{
                       if(peso>16){
                            this.costo=3.25;
                        } 
                    }
                }
                break;
        }
    }

    public Integer getPeso() {
        return peso;
    }

    public MediosEnvio getEnvio() {
        return envio;
    }

    public Double getCosto() {
        return costo;
    }
    
    public String display(){
        return String.format("El envio pesa "+this.getPeso()+" enviado por "+this.getEnvio().name()+" con un costo de "+this.getCosto());
    }
}
