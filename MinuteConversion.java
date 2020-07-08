/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minuteconversion;
import java.util.Scanner;

/**
 *
 * @author sakthi
 */
public class MinuteConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double minutesInYear=365*24*60;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  minutes:");
        int minute = sc.nextInt();
        long year =(long)(minute/minutesInYear);
        int day = (int)(minute/60/24) % 365;
        System.out.println(minute + "minutes is" + year + "years and " + day + "days");
        
    }
    
}
