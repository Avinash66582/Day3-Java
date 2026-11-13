
import java.util.TreeSet;

class Treeset1{
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("john");
        names.add("alex");
        names.add("david");
        names.add("robert");
    System.out.println("TreeSet: " + names);

        names.remove("david");
    System.out.println("Updated TreeSet: " + names);
     System.out.println("Size: " + names.size());
    }
}
