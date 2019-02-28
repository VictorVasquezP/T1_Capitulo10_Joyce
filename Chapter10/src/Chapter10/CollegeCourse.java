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
public class CollegeCourse {
    private Clase clase;
    private Integer numero;
    private Integer creditos;
    private Integer tarifa;

    public CollegeCourse(Clase clase, Integer numero, Integer creditos) {
        this.clase = clase;
        this.numero = numero;
        this.creditos = creditos;
        setTarifa(creditos);
    }
    public void setTarifa(Integer cred){
        this.tarifa=120*creditos;
    }

    public Clase getClase() {
        return clase;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public Integer getTarifa() {
        return tarifa;
    }
    public String imprimir(){
        return String.format("El curso del dapartamento "+this.getClase().name()+" con numero "+this.getNumero()+" ,con una tarifa de "+this.getTarifa());
    }
    
}
