/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Chapter10.CabinRental;
import Chapter10.Car;
import Chapter10.CarRental;
import Chapter10.Clase;
import Chapter10.CollegeCourse;
import Chapter10.Die10;
import Chapter10.DoublesTennisGame;
import Chapter10.HolidayCabinRental;
import Chapter10.InsuredPackage;
import Chapter10.Jupiterian;
import Chapter10.LabCourse;
import Chapter10.RaceHorse;
import Chapter10.ScentedCandle;
import Chapter10.Year;
import Chapter10.LeapYear;
import Chapter10.LoadedDie;
import Chapter10.LuxuryCarRental;
import Chapter10.Martian;
import Chapter10.MediosEnvio;
import Chapter10.MotorCycle;
import Chapter10.Package;
import Chapter10.TamanoAuto;
/**
 *
 * @author Victor
 */
public class Principal {
    public static void main(String [] args){
        
        System.out.println("\t\tHorce & RaceHorse");
        RaceHorse caballito = new RaceHorse("Caballito de palo","Blanco",12,10);
        System.out.println(caballito);
        //
        System.out.println("\n\t\tCandle & ScentedCandle");
        ScentedCandle scent = new ScentedCandle("Gris",12,"Limon");
        System.out.println(scent.imprimir());
        
        System.out.println("\n\t\tTennisGame & DoublesTennisGame");
        DoublesTennisGame doub = new DoublesTennisGame("Juan","Oscar","Jesus","Fernando",5,3);
        DoublesTennisGame doub2 = new DoublesTennisGame("Juan","Oscar","Jesus","Fernando",4,3);
        System.out.println(doub.imprimir());
        System.out.println(doub2.imprimir());
        
        System.out.println("\n\t\t Year & LeapYear");
        Year anio=new Year();
        System.out.println(anio.getDias());
        LeapYear anio2 = new LeapYear(); 
        System.out.println(anio2.getDias());
        System.out.println(anio.daysElapsed("marzo",2));
        System.out.println(anio2.daysElapsed("marzo",2));
        
        System.out.println("\n\t\tCabinRental && HolidayCabinRental");
        CabinRental cabin = new CabinRental(3);
        System.out.println(cabin);
        HolidayCabinRental hcabin = new HolidayCabinRental(2);
        System.out.println(hcabin);
        
        System.out.println("\n\t\tPackage && InsuredPackage");
        Package pack=new Package(20, MediosEnvio.A);
        Package pack2=new Package(10, MediosEnvio.T);
        InsuredPackage inpack = new InsuredPackage(23, MediosEnvio.M);
        InsuredPackage inpack2 = new InsuredPackage(5, MediosEnvio.A);
        System.out.println(pack.display());
        System.out.println(pack2.display());
        System.out.println(inpack.display());
        System.out.println(inpack2.display());
        
        System.out.println("\n\t\tCarRental && LuxuryCarRental");
        CarRental cr = new CarRental("Victor",71240,TamanoAuto.economico,3);
        CarRental cr2 = new CarRental("Poblete",71240,TamanoAuto.completo,2);
        LuxuryCarRental lc = new LuxuryCarRental("Poblete",71240,TamanoAuto.completo,2,true);
        LuxuryCarRental lc2 = new LuxuryCarRental("Vasquez",71240,TamanoAuto.economico,3,false);
        System.out.println(cr.display());
        System.out.println(cr2.display());
        System.out.println(lc.display());
        System.out.println(lc2.display());
        
        System.out.println("\n\t\tCollegeCourse & LabCourse");
        CollegeCourse coc = new CollegeCourse(Clase.BIO,101,3);
        LabCourse lab = new LabCourse(Clase.BIO,101,3);
        System.out.println(coc.imprimir());
        System.out.println(lab.imprimir());
        
        System.out.println("\n\t\tVehicle, Car & MotorCycle");
        Car car = new Car(3,1200);
        System.out.println(car);
        MotorCycle moto = new  MotorCycle(5,100);
        System.out.println(moto);
        
        
        System.out.println("\n\t\tGameZone");
        System.out.println("\n\t\tAlien, Marciano & Jupiteriano");
        Martian marciano=new Martian();
        System.out.println(marciano);
        Jupiterian jupiter = new Jupiterian();
        System.out.println(jupiter);
        System.out.println("\n\t\tDie, LoadedDie");
        Integer a=0,b=0,c=0;
        while(a<1000){
            Die10 dado1=new Die10();
            Die10 dado2 = new Die10();
            if(dado1.getNumber()>dado2.getNumber()){
                b++;
            }
            a++;
        }
        a=0;
        while(a<1000){
            LoadedDie load = new LoadedDie();
            Die10 dado1=new Die10();
            if(dado1.getNumber()>load.getNumber()){
                c++;
            }
            a++;
        }
        System.out.println("De los dos dados tipo Die, el primero le gana al segundo por: "+b);
        System.out.println("De los dos dados uno tipo Die y el otro tipo LoadesDie, el Die le gana al loadedDie por: "+c);
        
    }
}
