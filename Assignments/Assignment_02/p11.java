import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of the triangle");
        double height=sc.nextInt();

        System.out.println("Enter the value of the base ");
        double base=sc.nextInt();

        System.out.println("Enter the area of the triangle");
       double area=sc.nextInt();

        double triangle=0.5*(height*base);
        double result=area/triangle;

        System.out.println(result);
        double square=Math.sqrt(result);
        System.out.println(square);
        double h1=height*square;
        double b1=base*square;
        System.out.println(h1);
        System.out.println(b1);


    }
}