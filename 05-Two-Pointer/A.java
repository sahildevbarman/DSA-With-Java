class A {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,10};
        int target = 10;

        int left = 0;
        int right = arr.length-1;

        boolean flag = false;

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