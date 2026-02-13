class C {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,11};
        int target = 9;

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