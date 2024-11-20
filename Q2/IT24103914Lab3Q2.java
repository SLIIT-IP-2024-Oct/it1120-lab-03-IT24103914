import java.util.Scanner;
  
public class IT24103914Lab3Q2 {
    public static void main(String[] args) {

         // Declare the variables
         double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary;

         // Create a Scanner object
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the monthly salary:");
         monthlySalary = input.nextDouble();
         System.out.print("Enter the number of OT hours:");
         otHours = input.nextDouble();
         System.out.print("Enter the OT hourly rate:");
         otHourlyRate = input.nextDouble();

         //Calculate OT amount
         otAmount = otHours * otHourlyRate;

         //Calculate total salary
         totalSalary = monthlySalary + otAmount;

         System.out.println("The total salary including OT is:" + totalSalary);
    }
} 