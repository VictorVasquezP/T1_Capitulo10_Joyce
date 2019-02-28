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
public class InsuredPackage extends Package{
    private Double seguro;
    public InsuredPackage(Integer peso, MediosEnvio envio) {
        super(peso, envio);
        setSeguro();
    }
    public void setSeguro(){
        if(this.getCosto()<=1){
            this.seguro=this.getCosto()+2.45;
        }else{
            if(this.getCosto()<=3){
                this.seguro=this.getCosto()+3.95;
            }else{
                this.seguro=this.getCosto()+5.55;
            }
        }
    }

    public Double getSeguro() {
        return seguro;
    }
    
    @Override
     public String display(){
        return String.format("El envio pesa "+this.getPeso()+" enviado por "+this.getEnvio().name()+" con un costo de "+this.getSeguro());
    }
}
