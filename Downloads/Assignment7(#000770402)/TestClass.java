/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author Aneri Parikh #000770402
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.println("Total Amount to be Paid: " + t.getAmountDue());
    }

}
