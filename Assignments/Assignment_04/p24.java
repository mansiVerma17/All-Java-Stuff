/*4	16	36	64	….. 1 2 3 4 5 6 7 8*/

import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i=2;
        while(i<=num){
            if(i%2==0){
                System.out.println(i);
                int square=i*i;
                System.out.println("\t"+square);

            }
            i++;
        }

    }
}