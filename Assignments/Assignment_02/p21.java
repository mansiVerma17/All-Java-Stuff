import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        System.out.println("Enterr the height");
        int h=sc.nextInt();
        //1m=100cm
        //15*100=1500
        System.out.println("Enter the length of the wall");
        int l1=sc.nextInt();
        System.out.println("Enter the brreadth of the wall");
        int b1=sc.nextInt();
        System.out.println("Enter the height of the wall");
        int h1=sc.nextInt();
        int brick=l*b*h;
        int wall=l1*b1*h1;
        System.out.println("Brick "+brick);
        System.out.println("Wall "+wall);
        int result=wall/brick;
        System.out.println("Result "+result);
    }
}