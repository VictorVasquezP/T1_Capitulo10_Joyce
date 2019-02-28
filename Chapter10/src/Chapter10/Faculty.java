/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author luisl
 */
public class Faculty extends CollegeEmployee{
    private Boolean tenured;

    public Faculty(Boolean tenured, Integer sNumber, Double salary, String dName, String fName, String lName, String sAdress, Integer zCode, Integer phone) {
        super(sNumber, salary, dName, fName, lName, sAdress, zCode, phone);
        this.tenured = tenured;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Turno: "+this.tenured);
    }
}
