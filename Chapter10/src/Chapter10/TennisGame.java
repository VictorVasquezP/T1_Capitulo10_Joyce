/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */
public class TennisGame {
    private String jugador1;
    private String jugador2;
    private Integer puntos1;
    private Integer puntos2;
    private String score1;
    private String score2;
    
    public void setJugadores(String jugador1, String jugado2){
        this.jugador1=jugador1;
        this.jugador2=jugado2;
    }
    
    public void setPuntos(Integer p1, Integer p2){
        if((p1>4)||(p1<0)||(p2>4)||(p2<0)||((p1+p2)==8)){
            this.puntos1=0;
            this.puntos2=0;
            this.score1="Error";
            this.score2="Error";
        }else{
            switch(p1){
                case 0:
                    this.score1="Love";
                    break;
                case 1:
                    this.score1="15";
                    break;
                case 2:
                    this.score1="30";
                    break;
                case 3:
                    this.score1="40";
                    break;
                case 4:
                    this.score1="Game";
                    break;
            }
            switch(p2){
                case 0:
                    this.score2="Love";
                    break;
                case 1:
                    this.score2="15";
                    break;
                case 2:
                    this.score2="30";
                    break;
                case 3:
                    this.score2="40";
                    break;
                case 4:
                    this.score2="Game";
                    break;
            }
        }
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public Integer getPuntos1() {
        return puntos1;
    }

    public Integer getPuntos2() {
        return puntos2;
    }

    public String getScore1() {
        return score1;
    }

    public String getScore2() {
        return score2;
    }
    
}
