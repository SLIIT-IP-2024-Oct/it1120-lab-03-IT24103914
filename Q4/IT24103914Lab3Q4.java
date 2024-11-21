import java.util.Scanner;

public class IT24103914Lab3Q4 {
    public static void main(String[] args) { 
        
       // Declare variables
       int number, digit1, digit2, digit3, digit4, digit5;

       // Create a Scanner object to read input
       Scanner input = new Scanner(System.in);
       
       //Prompt the user to enter a five-digit number
       System.out.print("Enter a five-digit number:");
       number = input.nextInt();

       // Extract the highest place value digit (ten thousand)
       digit1 = number / 10000;
       number = number % 10000;
 
       // Extract the highest place value digit (thousand)
       digit2 = number / 1000;
       number = number % 1000;

       // Extract the highest place value digit (hundred)
       digit3 = number / 100;
       number = number % 100;

       // Extract the highest place value digit (ten)
       digit4 = number / 10;
       number = number % 10;

       // The last digit (unit)
       digit5 = number;

                // Print each digit separated by space
                System.out.print(digit1 + " ");
                System.out.print(digit2 + " ");
                System.out.print(digit3 + " ");
                System.out.print(digit4 + " ");
                System.out.print(digit5 + " "); 
    }
}
        
