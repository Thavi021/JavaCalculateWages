/*
2015 Practical Test
Haeun Oh
Calculating weekly pay
and how to round up to the ______ decimal place
 */

//A local lets you print the answers the way it is printed in your local area
package pkg2015testpaper;
import java.util.Scanner;
import java.text.DecimalFormat;        //<Decimal Format is usually used for money>

public class Main {


    public static void main(String[] args) {   //According to instructions of questio the name shoud be saved as weeklypay

         Scanner sc = new Scanner(System.in);
        
        //String strPattern = "####.##";     //Display only numbers that need to be displayed else donesn't show in the answer
        String strPattern = "####.00";       //This is to show that all decimal places must be shown otherwise it will show 0. 
        DecimalFormat df = new DecimalFormat(strPattern);
        double dblRate, dblHrs;
        
        System.out.print("Please ener Hourly Rate: R");
        dblRate = sc.nextDouble();
        
        System.out.print("Please enter hours worked: ");
        dblHrs = sc.nextDouble();
        
        double dblPay = CalcPay(dblHrs, dblRate);
  
        
        String strOutput;
        //strOutput = df.format(dblPay);   (Just formatting the pay)
        
        strOutput = "The pay is: " + df.format(dblPay);
        
        System.out.println("An employ that works: " + dblHrs + " hrs," + "and gets paid: R" + dblRate + "per hr," + " Your weekly pay is: R" + dblPay);
        
        System.out.println(strOutput); 
        
    }
    
    public static double CalcPay(double Hrs, double Rate){
        return Hrs * Rate;
    }
}








/*
Without using classes
        
        Scanner sc = new Scanner(System.in);
        
        //String strPattern = "####.##";     //Display only numbers that need to be displayed else donesn't show in the answer
        String strPattern = "####.00";       //This is to show that all decimal places must be shown otherwise it will show 0. 
        DecimalFormat df = new DecimalFormat(strPattern);
        double dblRate, dblHrs, dblPay;
        
        System.out.print("Please ener Hourly Rate: R");
        dblRate = sc.nextDouble();
        
        System.out.print("Please enter hours worked: ");
        dblHrs = sc.nextDouble();
        
        dblPay = dblRate * dblHrs;
        
        String strOutput;
        //strOutput = df.format(dblPay);   (Just formatting the pay)
        
        strOutput = "The pay is: " + df.format(dblPay);
        
        System.out.println("An employ that works: " + dblHrs + " hrs," + "and gets paid: R" + dblRate + "per hr," + " Your weekly pay is: R" + dblPay);
        
        System.out.println(strOutput);
        
*/
 
