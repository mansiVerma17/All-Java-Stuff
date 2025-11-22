import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the side");
        double side=sc.nextInt();

        double area=(Math.sqrt(3)/(4))*(side*side);
        System.out.println("area of equilateral triangle is "+area);
    }
}