import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the wall");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the wall");
        int b=sc.nextInt();
        System.out.println("Enter the height of the wall");
        int h=sc.nextInt();
        System.out.println("Enter the length of the brick");
        int l1=sc.nextInt();
        System.out.println("Enter the breadth of the brick");
        int b1=sc.next           Int();
        System.out.println("Enter the height of the brick");

        double h1=sc.nextInt();
        int wall=l*b*h;
       double brick=l1*b1*h1;
        System.out.println("Wall "+wall);
        System.out.println("Brick "+brick);

        double result=wall/brick;
        System.out.println("Result :"+result);

        //cost of 1 brick is 900/1000=0.9
       double oneBrick=(900/1000)*result;

        System.out.println("Cost of the Brick "+oneBrick);

    }
}