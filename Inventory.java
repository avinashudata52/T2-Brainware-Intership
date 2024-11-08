import java.util.*;

public class Inventory {
    private Map<String, Integer> supplies = new HashMap<>();

    public void manageInventory() {
        supplies.put("Gloves", 100);
        supplies.put("Masks", 200);
        supplies.put("Sanitizers", 150);

        System.out.println("Inventory:");
        for (Map.Entry<String, Integer> entry : supplies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
