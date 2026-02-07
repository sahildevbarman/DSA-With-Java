class L {
    public static void main(String[] args) {
        // Find the second smallest element in the given array without sorting

        int arr[] = {10, 5, 20, 8, 15};

        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Second Min = " + secondMin);
    }
}
