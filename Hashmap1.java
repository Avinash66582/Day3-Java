
import java.util.HashMap;

class Hashmap1{
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "john");
        students.put(102, "alice");
        students.put(103, "david");
        students.put(104, "Robert");

        System.out.println("HashMap: " + students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "peter");

        students.remove(103);

        System.out.println("Contains key 101: " + students.containsKey(101));

        System.out.println("Contains value john: " + students.containsValue("john"));

        System.out.println("Size: " + students.size());
    }
}
