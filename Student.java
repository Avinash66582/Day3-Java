import java.util.Scanner;
class Student{
public static void main(String[] args){
    Scanner stu=new Scanner(System.in);
    String name;
    int age;
    int Class;
    String place;
    System.out.println("enter stu name:");
    name=stu.nextLine();
    System.out.println("enter stu age:");
    age=stu.nextInt();
    System.out.println("enter stu class:");
    Class=stu.nextInt();
    System.out.println("enter stu place:");
    stu.nextLine();
    place=stu.nextLine();
    }
}