class D {
    public static void main(String[] args) {
        //Count even or odd
        int[] arr = {10, 11, 12, 13, 14, 15, 50};

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) 
                System.out.println(arr[i]+" is a even");
             else 
                System.out.println(arr[i]+" is a odd");            
        }
    }
}