import java.util.Scanner;

public class IT24103914Lab3Q1B {
    public static void main(String[] args) {
        
        //Declare the variables
        double priceof1kg, noOfkg, totalCost, discount, finalAmount;

        //Create a Sanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of 1kg of rice:");
        priceof1kg = input.nextDouble();
        System.out.println("Enter the number of kilograms:");
        noOfkg = input.nextDouble();

        //Calculate the total cost
        totalCost = priceof1kg * noOfkg;
        
        //Apply a 10% discount
        discount = totalCost * 0.10;
        finalAmount = totalCost - discount;

        System.out.println("The total amount with 10% discount is:" + finalAmount);
    }
}  