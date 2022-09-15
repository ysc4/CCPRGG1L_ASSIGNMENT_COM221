import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        myOrder();
        scan.close();
    }

    static void myOrder() {
        System.out.println("My Orders");
        System.out.print("Enter first order: ");
        String firstOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double x = scan.nextDouble();

        scan.nextLine();
        
        System.out.print("Enter second order: ");
        String secondOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double y = scan.nextDouble();

        scan.nextLine();
        
        System.out.print("Enter third order: ");
        String thirdOrder = scan.nextLine();
        System.out.print("Enter the price: ");
        double z = scan.nextDouble();

        double sum = x + y + z;
        
        System.out.println("My Orders: " + "\n" + "Order 1: " + firstOrder + "\n" + "Order 2: " + secondOrder + "\n" + "Order 3: " + thirdOrder);
        System.out.println("Total Amount: " + sum);
    }

}




 
