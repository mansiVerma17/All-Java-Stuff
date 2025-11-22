import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of the side ");
        double side=sc.nextInt();
       
        double area=0.5*(side*side);
        System.out.println("Area of is "+area);
    }
}