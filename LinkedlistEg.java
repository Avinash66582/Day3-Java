
import java.util.LinkedList;

class LinkedListEg{
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("john");
        names.add("alex");
        names.add("david");
        names.add("robert");
    System.out.println("LinkedList: " + names);
    System.out.println("First element: " + names.get(0));
        names.set(1, "peter");
        names.remove("david");
        names.addFirst("sam");
        names.addLast("tom");
    System.out.println("Updated LinkedList: " + names);
     System.out.println("Size: " + names.size());
    }
}
