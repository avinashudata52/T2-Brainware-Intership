import java.util.*;

public class Appointment {
    static Scanner sc = new Scanner(System.in);
    private String patientName;
    private String date;
    private String time;

    public void scheduleAppointment() {
        System.out.print("Enter patient name: ");
        patientName = sc.next();
        System.out.print("Enter appointment date (DD-MM-YYYY): ");
        date = sc.next();
        System.out.print("Enter appointment time (HH:MM): ");
        time = sc.next();

        System.out.println("Appointment scheduled for " + patientName + " on " + date + " at " + time);
    }
}
