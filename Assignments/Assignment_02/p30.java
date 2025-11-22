import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the tile");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the tile");
        int b=sc.nextInt();
        System.out.println("Enter the length of the room");
        int l1=sc.nextInt();
        System.out.println("Enter the breadth of the room");

        int b1=sc.nextInt();
        int tile=l*b;
        int room=l1*b1;

        System.out.println("Tiles :"+tile);
        System.out.println("Room :"+room);

        int result=room/tile;
        System.out.println("Result :"+result);
        
    }
}