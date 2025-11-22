import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        int side=sc.nextInt();
        System.out.println("Enter the length of the cuboid");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the cuboid");
        int b=sc.nextInt();
        System.out.println("Enter the height of the cuboid");
        int h=sc.nextInt();
        int cube=side*side*side;
        int cuboid=l*b*h;
        System.out.println("cube :"+cube);
        System.out.println("cuboid :"+cuboid);
        int result=cuboid/cube;
        System.out.println("Result :"+result);

    }
}