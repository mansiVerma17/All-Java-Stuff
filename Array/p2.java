class Data{
    public static void main(String args[]){
        // int arr[][]=new int[3][3];
      int  arr[][]={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr.length;c++){
                if(r==c){
                    System.out.println(arr[r][c]);
                }
            }
        }
    }
}