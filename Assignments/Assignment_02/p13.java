import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the area");
        int area=sc.nextInt();

        System.out.println("Enter the value of the side1");
        int side1=sc.nextInt();
        
        int side2=((area*2)/side1);
        System.out.println(side2);
    }
}