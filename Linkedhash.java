
import java.util.LinkedHashSet;

class Linkedhash{
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("john");
        names.add("alex");
        names.add("david");
        names.add("robert");
    System.out.println("LinkedHashSet: " + names);
    names.remove("david");
    System.out.println("Updated LinkedHashSet: " + names);
    System.out.println("Size: " + names.size());
    }
}