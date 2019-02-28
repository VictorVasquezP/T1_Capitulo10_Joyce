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
public class Year {
    public Integer dias;

    public Year() {
        this.dias = 365;
    }
    public Integer getDias() {
        return dias;
    }
    public String converter(String mes){
        return mes.toUpperCase();
    }
    public String daysElapsed (String mes, Integer dia){
        Integer diaT=0;
        String mes1=converter(mes);
        switch(mes1){
            case "ENERO":
                if(dia==1){
                    diaT=0;
                }else{
                    diaT=dia;
                }
                break;
            case "FEBRERO":
                diaT=31+dia;
                break;
            case "MARZO":
                diaT=59+dia;
                break;
            case "ABRIL":
                diaT=89+dia;
                break;
            case "MAYO":
                diaT=120+dia;
                break;
            case "JUNIO":
                diaT=150+dia;
                break;
            case "JULIO":
                diaT=181+dia;
                break;
            case "AGOSTO":
                diaT=212+dia;
                break;
            case "SEPTIEMBRE":
                diaT=242+dia;
                break;
            case "OCTUBRE":
                diaT=273+dia;
                break;
            case "NOVIEMBRE":
                diaT=303+dia;
                break;
            case "DICIEMBRE":
                diaT=334+dia;
                break;
        }
        return String.format(dia+" de "+mes+ " han transcurrido: "+diaT+ " dias");
    }
    
}
