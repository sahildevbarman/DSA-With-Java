class I {
    public static void main(String[] args) {
        // Check whether the given array is sorted in ascending order
        int arr[] = {1,2,3,4,5};
        // int arr[] = {1,2,0,4,5};

        boolean isSorted = true;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}