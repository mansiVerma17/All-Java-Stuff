import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        System.out.println("Enter the height");
        int h=sc.nextInt();
        int cubic =l*b*h;
        System.out.println("Cubic : "+cubic);
    }
}