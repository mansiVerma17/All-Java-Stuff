import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of the cone");
        double height=sc.nextDouble();
        
        System.out.println("Enter the slant height of the cone");
        double slant_height=sc.nextDouble();

        double radius=Math.sqrt((slant_height*slant_height)-(height*height));
        System.out.println("Radius of the coone is :"+radius);

        double area=(22/7)*radius*radius;
        System.out.println("Area of the cone is :"+area);

        double cost=area*10;
        System.out.println("Cost of the polishing the base of the cone :"+cost);
         


    }
}