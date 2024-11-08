import java.util.*;

public class Patient {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private int age;
    private String gender;
    private String contact;

    public void registerPatient() {
        System.out.print("Enter patient name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter gender: ");
        gender = sc.next();
        System.out.print("Enter contact number: ");
        contact = sc.next();

        System.out.println("Patient registered successfully!");
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Contact: " + contact);
    }
}
