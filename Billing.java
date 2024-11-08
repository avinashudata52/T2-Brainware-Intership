import java.util.*;

public class Billing {
    static Scanner sc = new Scanner(System.in);

    public void generateBill() {
        System.out.print("Enter patient name: ");
        String patientName = sc.next();
        System.out.print("Enter treatment cost: ");
        double cost = sc.nextDouble();
        System.out.print("Enter any additional charges: ");
        double additionalCharges = sc.nextDouble();

        double total = cost + additionalCharges;
        System.out.println("Total bill for " + patientName + " is: INR" + total);
    }
}
