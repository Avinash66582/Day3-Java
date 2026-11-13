import java.util.HashSet;
class Empid1{
public static void main(String[] args){
        HashSet<String> emp = new HashSet<>();
        emp.add("01");
        emp.add("02");
        emp.add("103");
        emp.add("04");
        emp.add("105");
        emp.add("06");
        emp.add("07");
        emp.add("08");
        emp.add("09");
        emp.add("10");
    System.out.println("HashSet: " +emp);
    emp.remove("103");
    System.out.println("contains 105:" +emp.contains("105"));
    System.out.println("size:" +emp.size());
    System.out.println("is Empty:" +emp.isEmpty());
        }
    }