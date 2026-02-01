class H {
    public static void main(String[] args){
        //Count Occurrences
        int arr[] = {10, 25, 7, 40, 15, 7, 7};
        int target = 7;
        int count = 0;

        System.out.print("Value = ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Target = "+target);;

        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                count++;
            }
        }
        System.out.println("Count = "+count);

    }
}