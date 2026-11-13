
import java.util.HashSet;

class Shop1 {
    public static void main(String[] args) {

        HashSet<String> Shop = new HashSet<>();

        Shop.add("Laptop");
        Shop.add("Mobile");
        Shop.add("Headphones");
        Shop.add("Smartwatch");

        System.out.println("HashSet: " + Shop);

        Shop.remove("Headphones");
        Shop.add("Tablet pc");

        System.out.println("Contains mobile: " + Shop.contains("Mobile"));
        System.out.println("Size: " + Shop.size());
        System.out.println("Is Empty: " + Shop.isEmpty());
        System.out.println("HashSet: " + Shop);
    }
}
