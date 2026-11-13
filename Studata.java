
import java.util.HashMap;

class Studata {
    public static void main(String[] args) {

        HashMap<Integer, String> studata = new HashMap<>();

        studata.put(101, "john");
        studata.put(102, "alice");
        studata.put(103, "david");
        studata.put(104, "Robert");
        studata.put(105, "Aaron");

        System.out.println("HashMap: " + studata);

        System.out.println("Studata 102: " + studata.get(102));

        studata.put(103, "monika");

        studata.remove(105);

        System.out.println("Contains key 101: " + studata.containsKey(101));

        System.out.println("Contains value john: " + studata.containsValue("john"));

        System.out.println("\nStudent IDs and Names:");

        for (Integer id : studata.keySet()) {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + studata.get(id));
        }

        System.out.println("Size: " + studata.size());
    }
}
