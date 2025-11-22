import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius=sc.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height=sc.nextDouble();

        double surface_area=2*((22/7)*radius*height)+2*((22/7)*radius*radius);
        System.out.println("Surface area of the cylinder is:"+surface_area);
        // System.out.println(radius);
    }
}