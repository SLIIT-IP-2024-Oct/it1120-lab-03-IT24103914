import java.util.Scanner;

public class IT24103914Lab3Q3 {
    public static void main(String[] args) {
 
        // Declare the variables
        int notes, amount;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Rupee amount:");
        amount = input.nextInt();

        int notes5000 = amount / 5000;
        amount = amount - notes5000 * 5000;
        int notes1000 = amount / 1000;
        amount = amount - notes1000 * 1000;
        int notes500 = amount / 500;
        amount = amount - notes500 * 500;
        int notes200 = amount / 200;
        amount = amount - notes200 * 200;
        int notes100 = amount / 100;
        amount = amount - notes100 * 100;
        int notes50 = amount / 50;
        amount = amount - notes50 * 50;
        int notes20 = amount / 20;
        amount = amount - notes20 * 20;
        int notes10 = amount / 10;
        amount = amount - notes10 * 10;
        int notes05 = amount / 05;
        amount = amount - notes05 * 05;
        int notes02 = amount / 02;
        amount = amount - notes02 * 02;
        int notes01 = amount / 01;
        amount = amount - notes01 * 01; 
    
        System.out.println("5000 Notes:" + notes5000);
        System.out.println("1000 Notes:" + notes1000);
        System.out.println("500 Notes:" + notes500);
        System.out.println("200 Notes:" + notes200);
        System.out.println("100 Notes:" + notes100);
        System.out.println("50 Notes:" + notes50);
        System.out.println("20 Notes:" + notes20);
        System.out.println("10 Notes:" + notes10);
        System.out.println("05 Notes:" + notes05);
        System.out.println("02 Notes:" + notes02);
        System.out.println("01 Notes:" + notes01);
    }
}
    
