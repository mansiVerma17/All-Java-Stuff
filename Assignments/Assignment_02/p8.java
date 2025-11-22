import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the height");
        int height=sc.nextInt();

        System.out.println("enter the value of the area");
        int area=sc.nextInt();
        // 1m=100;
        //0.8*100=80;
        int b=(area*2)/height;
        System.out.println("Base of the triangle is "+b);

    }
}