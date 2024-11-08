import java.util.*;

public class Staff {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String position;

    public void manageStaff() {
        System.out.print("Enter staff name: ");
        name = sc.next();
        System.out.print("Enter position: ");
        position = sc.next();

        System.out.println("Staff added: " + name + ", Position: " + position);
    }
}
