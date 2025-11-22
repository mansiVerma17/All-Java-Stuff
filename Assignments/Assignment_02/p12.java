import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the hypotenus");
        int h=sc.nextInt();

        System.out.println("Enter the value of the other side");
        int side1=sc.nextInt();

        int side2=((h*h)-(side1*side1));
        System.out.println(side2);
        double square=Math.sqrt(side2);
        System.out.println(square);

        double area=0.5*(side1*square);
        System.out.println("area"+area);

    }
}