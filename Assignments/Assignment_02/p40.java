import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius=sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height=sc.nextDouble();

        double volume=((22/7)*radius*radius*height);
        System.out.println("Volume of the cylinder is :"+volume);
    }
}