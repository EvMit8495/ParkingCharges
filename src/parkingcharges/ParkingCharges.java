/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkingcharges;

import java.util.Scanner;

/**
 *
 * @author EvMit8495, 
 * This program will calculate Parking Charges for customers.
 */
public class ParkingCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many hours parked: ");
        int a = input.nextInt();
        double fee = .5;
        double mini = 2;
        double max = 10;
        
        /**
         * Here, ill create a math method that will translate the number entered
         * into the fee and add the minimum 2$
         */
        //System.out.println( a + fee + );
        System.out.println("Your parking fee is");
        
        
        /*
        * I will here input code to save the data and display it when a new entry
        * is entered.
        */
        
    
   
    }
    
}
