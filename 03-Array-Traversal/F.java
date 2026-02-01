class F{
    public static void main(String[] args) {
        //Find target number in given array
        int arr[] = {10, 25, 7, 40, 15};
        int target = 40;

        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                System.out.println("Element found at index "+i);
                break;
            }
        }

    } 
}