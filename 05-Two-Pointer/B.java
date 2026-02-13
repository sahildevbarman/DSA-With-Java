class B {
    public static void main(String[] args) {
        int arr[] = {1,2,3,9};
        int target = 8;

        boolean flag = false;

        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                flag = true;
                break;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(flag);
    }
}