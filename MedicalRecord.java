import java.util.*;

public class MedicalRecord {
    private Map<String, String> records = new HashMap<>();

    public void viewRecords() {
        if (records.isEmpty()) {
            System.out.println("No medical records found.");
        } else {
            for (Map.Entry<String, String> entry : records.entrySet()) {
                System.out.println("Patient: " + entry.getKey() + " - Record: " + entry.getValue());
            }
        }
    }

    public void addRecord(String patientName, String record) {
        records.put(patientName, record);
        System.out.println("Medical record added for " + patientName);
    }
}
