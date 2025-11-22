class Data{
    public static void main(String args[]){
        int arr[][]={
            {1,2,3,4},
            {3,1,2,6},
            {8,9,0,1}
        };
        int sum=0;
        int a=arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3];
        System.out.println("A : "+a);
        int b=arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3];
        System.out.println("B : "+b);

        int c=arr[2][0]+arr[2][1]+arr[2][2]+arr[2][3];
        System.out.println("C : "+c);
        if(a>b && a>c){
            System.out.println("First row : "+a);
        }
        else if(b>a&& b>c){
            System.out.println("Second row : "+b);
        }
        else{
            System.out.println("Third row : "+c);
        }

        

    }
}