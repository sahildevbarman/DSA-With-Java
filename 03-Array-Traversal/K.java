class K {
    public static void main(String[] args) {
        // DSA Level-1: Find second largest element without sorting

        int arr[] = {10, 5, 20, 8, 15};
        int max = arr[0];
        int secondMax = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Second Max = " + secondMax);
    }
}