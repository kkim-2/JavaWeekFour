//Kailyn Kim  2/25/25 Digits.java Prints the digits of the number

import java.util.*;

public class Digits{
    public static void main(String[]args) {
        int number;
        int hundreds;
        int tens;
        int ones;
        int thousands;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        number = input.nextInt();
        ones = number % 10;
        tens = (number/10) %10;
        hundreds = (number/10) / 10 %10;
        thousands = (number / 10) /10 /10 % 10; 
        System.out.println("The thousands place digit is: "+ thousands); 
        System.out.println("The hundreds place digit is: " + hundreds);
        System.out.println("The tens place digit is: "+ tens); 
        System.out.println("The ones place digit is: "+ ones);   
    }
}
