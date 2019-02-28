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
public class LabCourse extends CollegeCourse{
    private Integer tarifan;
    public LabCourse(Clase clase,Integer numero, Integer creditos) {
        super(clase, numero, creditos);
        
        switch(clase){
            case BIO:
                this.tarifan=this.getTarifa()+50;
                break;
            case CHM:
                this.tarifan=this.getTarifa()+50;
                break;
            case CIS:
                this.tarifan=this.getTarifa()+50;
                break;
            case PHY:
                this.tarifan=this.getTarifa()+50;
                break;
            case OTRO:
                this.tarifan=this.getTarifa();
        }
        
        
    }

    public Integer getTarifan() {
        return tarifan;
    }
    @Override
    public String imprimir(){
        if(this.getClase()!=Clase.OTRO){
           return String.format("\nSERA EN LABORATORIO\nEl curso del dapartamento N° "+this.getClase()+
                " con numero "+this.getNumero()+" ,con una tarifa de "+this.getTarifan()); 
        }else{
            return String.format("El curso del dapartamento "+this.getClase().name()+" con numero "+this.getNumero()+" ,con una tarifa de "+this.getTarifa());
        }
    }
    
}
