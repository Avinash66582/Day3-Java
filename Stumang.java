
import java.util.TreeSet;

class Stumang{
    public static void main(String[] args) {
        TreeSet<String> marks = new TreeSet<>();
        marks.add("75");
        marks.add("90");
        marks.add("65");
        marks.add("85"); 
        marks.add("95");     
        marks.add("75");
        marks.add("80");
    System.out.println("TreeSet: " + marks);
        marks.remove("65");
    System.out.println("Lowest marks: " + marks.first());
    System.out.println("Highest marks: " + marks.last());
    System.out.println("Updated TreeSet: " + marks);
    System.out.println("Size: " + marks.size());
    }
}
