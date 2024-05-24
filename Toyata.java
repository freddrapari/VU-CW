


package com.vu.toyata;

/**
 *
 * @author hp
 */
public class Toyata {
 //Fields
   String color;
   double speed;
   String model ;
   
   //Methods
   void accelerate(){
       speed+=30;  //speed = speed+30
   }
   void brake(){
       speed -=15; // speed = speed -15
   }
   
   public static void main(String [] args){
       //creaating an object Ipsum for the class toyota.
      toyota ipsum = new toyota();
       ipsum.speed = 45;
       ipsum.color = "blue";
       ipsum.model="TxI2020";
       ipsum.accelerate();
       
      // ipsum.brake();
       
       System.out.println("My Ipsum model " +ipsum.model + "and of color "+ipsum.color +" accelerates at "+ipsum.speed);
             
       
       //creaating an object v8 for the class toyota.
       
       Toyota v8 = new Toyota();
       v8.speed = 60;
       v8.color = "black";
       v8.model = "land21";
       v8.brake();
       System.out.println("My V8 of model " + v8.model + " and of color " + v8.color + " brakes at " +  v8.speed);
       
   }
    
}

    
    

