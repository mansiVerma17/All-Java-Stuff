import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the length");
        int l=sc.nextInt();

        System.out.println("Enter the value of the breadth");
        int b=sc.nextInt();

        int area=l*b;
        System.out.println(area);

        System.out.println("Enter the value of the side");
        int side=sc.nextInt();
        int side2=side*side;
        System.out.println(side2);

       int result=side2-area;
        System.out.println(result);

    }
}