import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            System.out.println("Enter the "+(row+1)+" row element");
            arr[][]=sc.nextInt();
        }
        for(int j=0;j<col;j++){
            System.out.println("Enter the "+(col+1)+" col element");
            arr[][]=sc.nextInt();
        }
    System.out.println("Array : "+arr[row][col]);
    }
}