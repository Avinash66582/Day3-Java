import java.util.HashSet;
class Hashset1{
public static void main(String[] args){
        HashSet<String> names = new HashSet<>();
        names.add("john");
        names.add("alex");
        names.add("david");
        names.add("robert");
        names.add("david");
    System.out.println("HashSet: " +names);
    names.remove("robert");
    System.out.println("contains alex:" +names.contains("alex"));
    System.out.println("size:" +names.size());
    System.out.println("is Empty:" +names.isEmpty());
        }
    }