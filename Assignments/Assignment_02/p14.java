import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the length");
        int length=sc.nextInt();

        System.out.println("Enter the value of the vertices1");
        int vertices1=sc.nextInt();

        System.out.println("Enter the value of the vertices2");
        int vertices2=sc.nextInt();

        double area=0.5*(length*(vertices1+vertices2));
        System.out.println("Area of the quadrilateral is :"+area);
    }
}