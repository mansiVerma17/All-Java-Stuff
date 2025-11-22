class Data{
    public static void main(String args[]){
        int arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int sum=0;
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr.length;c++){
                if(arr[r][c]%2==0){
                    System.out.println("Even number: "+arr[r][c]);
                    sum=sum+arr[r][c];

                }

                else{
                    System.out.println("Odd number: "+arr[r][c]);

                }
            }

        }
                    System.out.println("Sum of the even number is : "+sum);

    }
}