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
public class LeapYear extends Year{

    public LeapYear() {
        this.dias=366;
    }
    @Override
    public String converter(String mes){
        return mes.toUpperCase();
    }
    @Override
    public String daysElapsed (String mes, Integer dia){
        String mes1=converter(mes);
        Integer diaT=0;
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
                diaT=59+dia+1;
                break;
            case "ABRIL":
                diaT=89+dia+1;
                break;
            case "MAYO":
                diaT=120+dia+1;
                break;
            case "JUNIO":
                diaT=150+dia+1;
                break;
            case "JULIO":
                diaT=181+dia+1;
                break;
            case "AGOSTO":
                diaT=212+dia+1;
                break;
            case "SEPTIEMBRE":
                diaT=242+dia+1;
                break;
            case "OCTUBRE":
                diaT=273+dia+1;
                break;
            case "NOVIEMBRE":
                diaT=303+dia+1;
                break;
            case "DICIEMBRE":
                diaT=334+dia+1;
                break;
        }
        return String.format(dia+" de "+mes+ " han transcurrido: "+diaT+ " dias");
    }
}
