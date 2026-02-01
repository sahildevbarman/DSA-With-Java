class G {
    public static void main(String[] args) {
        //Reverse print
        int arr[] = {10, 25, 7, 40, 15};
        System.out.print("Before:");
        for(int x:arr) {
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.print("After:");

        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}