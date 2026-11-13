
class Scan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        System.out.println(num);
        System.out.println("enter a number");
        double d=sc.nextDouble();
        System.out.println(d);
        sc.nextLine();
        System.out.println("enter a str");
        String s=sc.nextLine();
        System.out.println(s);
    }
}