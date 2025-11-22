import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the rectangle");
        int side=sc.nextInt();
        System.out.println("Enter the length of the rectangle");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");

        int b=sc.nextInt();
        int area=side*side;
        int area1=l*b;
        System.out.println("Area of square is :"+area);
        System.out.println("Area of rectangle is :"+area1);
        int result=area1/area;
        System.out.println("Number of square tiles :"+result);
    }
}