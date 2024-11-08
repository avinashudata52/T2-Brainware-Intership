import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Patient patient = new Patient();
        Appointment appointment = new Appointment();
        MedicalRecord record = new MedicalRecord();
        Billing billing = new Billing();
        Inventory inventory = new Inventory();
        Staff staff = new Staff();

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. View Medical Records");
            System.out.println("4. Generate Bill");
            System.out.println("5. Manage Inventory");
            System.out.println("6. Manage Staff");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    patient.registerPatient();
                    break;
                case 2:
                    appointment.scheduleAppointment();
                    break;
                case 3:
                    record.viewRecords();
                    break;
                case 4:
                    billing.generateBill();
                    break;
                case 5:
                    inventory.manageInventory();
                    break;
                case 6:
                    staff.manageStaff();
                    break;
                case 7:
                    System.out.println("Exiting system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
