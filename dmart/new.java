import java.util.Scanner;
class Data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name...");
        String name=sc.next();
        System.out.println("Enter your gender");
        String gender=sc.next();
        String gender1=(gender =="f" || gender=="F")? "Cadeberry":"Ladger Wallet";
       
           
        System.out.println("You want to need of carry bag (Y/N)...");
        String bag=sc.next();
        double a1=10;
        double b1=0;
      
        double bag1=(bag=="y" || bag=="Y")?a:b;

        System.out.println("Enter the item");
        String item1=sc.next();
        System.out.println("Enter the item");
        String item2=sc.next();
        System.out.println("Enter the item");
        String item3=sc.next();
        System.out.println("Enter the item");
        String item4=sc.next();
        System.out.println("Enter the item");
        String item5=sc.next();
        System.out.println("Enter the item");
        String item6=sc.next();
        System.out.println("Enter the item");
        String item7=sc.next();
        System.out.println("Enter the item");
        String item8=sc.next();
        System.out.println("Enter the item");
        String item9=sc.next();
        System.out.println("Enter the item");
        String item10=sc.next();
    

    System.out.println("Enter the quantity...");
        int quan1=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan2=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan3=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan4=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan5=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan6=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan7=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan8=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan9=sc.nextInt();
        System.out.println("Enter the quantity...");
        int quan10=sc.nextInt();

       

        System.out.println("Enter the price...");
        int price1=sc.nextInt();
        System.out.println("Enter the price...");
        int price2=sc.nextInt();
        System.out.println("Enter the price...");
        int price3=sc.nextInt();
        System.out.println("Enter the price...");
        int price4=sc.nextInt();
        System.out.println("Enter the price...");
        int price5=sc.nextInt();
        System.out.println("Enter the price...");
        int price6=sc.nextInt();
        System.out.println("Enter the price...");
        int price7=sc.nextInt();
        System.out.println("Enter the price...");
        int price8=sc.nextInt();
        System.out.println("Enter the price...");
        int price9=sc.nextInt();
        System.out.println("Enter the price...");
        int price10=sc.nextInt();

        int total1=quan1*price1;
        int total2=quan2*price2;
        int total3=quan3*price3;
        int total4=quan4*price4;
        int total5=quan5*price5;
        int total6=quan6*price6;
        int total7=quan7*price7;
        int total8=quan8*price8;
        int total9=quan9*price9;
        int total10=quan10*price10;

        double discount5=(total5*10)/100;
        double amount5=total5-discount5;
        // System.out.println("Amount 5 : "+amount5);

         double discount10=(total10*15)/100;
         double amount10=total10-discount10;
        //  System.out.println("Amount 10 : "+amount10);

        

        double total_bill=total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;
        double after_discount=total1+total2+total3+total4+amount5+total6+total7+total8+total9+amount10;
        double gst=(total_bill*10)/100;
        double grand_total=total_bill+gst;

        System.out.println("\t\t\tD-Mart");
        System.out.println(name+"\t\t\t\t\t Date : 22/07/25");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Item Name \t  Quantitiy \t Price \t Total \t After-Discount");
        System.out.println(item1+"\t\t\t"+quan1+"\t\t\t"+price1+"\t\t\t"+total1+"\t\t\t"+total1);
        System.out.println(item2+"\t\t\t"+quan2+"\t\t\t"+price2+"\t\t\t"+total2+"\t\t\t"+total2);
        System.out.println(item3+"\t\t\t"+quan3+"\t\t\t"+price3+"\t\t\t"+total3+"\t\t\t"+total3);
        System.out.println(item4+"\t\t\t"+quan4+"\t\t\t"+price4+"\t\t\t"+total4+"\t\t\t"+total4);
        System.out.println(item5+"\t\t\t"+quan5+"\t\t\t"+price5+"\t\t\t"+total5+"\t\t\t"+amount5);
        System.out.println(item6+"\t\t\t"+quan6+"\t\t\t"+price6+"\t\t\t"+total6+"\t\t\t"+total6);
        System.out.println(item7+"\t\t\t"+quan7+"\t\t\t"+price7+"\t\t\t"+total7+"\t\t\t"+total7);
        System.out.println(item8+"\t\t\t"+quan8+"\t\t\t"+price8+"\t\t\t"+total8+"\t\t\t"+total8);
        System.out.println(item9+"\t\t\t"+quan9+"\t\t\t"+price9+"\t\t\t"+total9+"\t\t\t"+total9);
        System.out.println(item10+"\t\t\t"+quan10+"\t\t\t"+price10+"\t\t\t"+total10+"\t\t\t"+amount10);

        System.out.println("-------------------------------------------------------------------");

        System.out.println("\t\t\t A.P.\t\t D.P.");
        System.out.println("\t\t\t"+total_bill+"\t\t"+after_discount);
        System.out.println("Gift  :- "+gender1+"\t 0.00 \t\t 0.00");
        System.out.println("Carry bag :-"+bag+"\t\t"+bag1+"\t\t"+bag1);
        System.out.println("GST (10%) \t\t"+gst+"\t\t"+gst);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\t\t\t"+grand_total+"\t\t"+grand_total+"RS");
        System.out.println("\t\t\t Thank You");
        System.out.println("\t\t\t To Visit us");
        System.out.println("\t\t\t Dmart");
        System.out.println("--------------------------------------------------------------------");

    }
}