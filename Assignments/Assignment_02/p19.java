import java.util.Scanner;
class Data{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of the length");
        int length=sc.nextInt();

        System.out.println("Enter the value of the breadth");
        int breadth=sc.nextInt();

        System.out.println("Enter the value of the height");
        int height=sc.nextInt();

        int volume=length*breadth*height;
        System.out.println("Volume of the brick is :"+volume);

        System.out.println("Enter the value of the side");
        int side=sc.nextInt();

        int cube=side*side*side;
        System.out.println("Volume of the cube is :"+cube);
    }
}