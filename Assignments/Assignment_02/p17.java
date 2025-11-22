import java.util.Scanner;
class Data{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the length");
        int length=sc.nextInt();

        System.out.println("Enter the value of the breadth");
        int breadth=sc.nextInt();

        int perimeter=2*(length+breadth);
        System.out.println("Length of the ribbon :"+perimeter);
    }
}