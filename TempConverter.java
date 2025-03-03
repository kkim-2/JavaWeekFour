
import java.util.*;
public class TempConverter {
    public static void main(String[]args){
        double fahrenheit;
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temp in fahrenheit: ");
        fahrenheit = input.nextDouble();  
        celsius = 5.0/9.0*(fahrenheit - 32.0);  
        System.out.println("The temperature in celsius is: " + celsius);
    }    
}
