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
public class DoublesTennisGame extends TennisGame{
    private String name1;
    private String name2;

    public DoublesTennisGame(String name1, String name2,String jug1, String jug2, Integer p1, Integer p2) {
        this.name1 = name1;
        this.name2 = name2;
        setJugadores(jug1, jug2);
        setPuntos(p1, p2);
    }
    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
    public String imprimir(){
        return String.format(this.getJugador1()+" con su compañero "+this.getName1()+" Puntaje: "+this.getScore1()
        +"\n"+this.getJugador2()+" con su compañero "+this.getName2()+" Puntaje: "+this.getScore2());
    }
}
