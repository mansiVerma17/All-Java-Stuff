import java.util.Scanner;
class Data{
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the base");
        int b=sc.nextInt();

        System.out.println("Enter the value of the area ");
        int area=sc.nextInt();

        int h=(2*area)/b;
        System.out.println("Height of the triangle is "+h);
        
    }
}