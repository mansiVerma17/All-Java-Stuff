import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the path");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the path");
        int b=sc.nextInt();
        System.out.println("Enter the length of the brick");
        int l1=sc.nextInt();
        System.out.println("Enter the breadth of the brick");
        int b1=sc.nextInt();
        int path=l*b;
        int brick=l1*b1;
        System.out.println("Path :"+path);
        System.out.println("Brick :"+brick);  
        int result  =path/brick;
        System.out.println("Result :"+result);
    }
}