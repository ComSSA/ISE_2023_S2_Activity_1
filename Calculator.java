import java.util.*;

public class Calculator
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Please enter your first number: ");
        
        int value1 = myObj.nextInt();

        System.out.println("Please enter your second number: ");
        
        int value2 = myObj.nextInt();

        int result = value1 / value2;

        System.out.println("Here is the result: " + result);

        myObj.close();




    }
}