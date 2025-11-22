import java.util.Scanner;
class Data{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the length");
        int length=sc.nextInt();

        System.out.println("Enter the value of the breadth");
        int breadth=sc.nextInt();

        int area=length*breadth;
        System.out.println("Area :"+area);
    }
}