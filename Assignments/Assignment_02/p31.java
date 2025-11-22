import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of the square");
        int perimeter=sc.nextInt();
        int side=perimeter/4;
        System.out.println("Perimeter of square side is :"+side);

        int area=side*side;
        System.out.println("Area of square is :"+area);
    }
}