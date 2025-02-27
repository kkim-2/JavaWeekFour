
import java.util.*;
public class TempConverter {
    public static void main(String[]args){
        int fahrenheit;
        int celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temp in fahrenheit: ");
        celsius = 5/9*(fahrenheit - 32);  
        System.out.println("The temperature in celsius is: " + celsius);
    }    
}
