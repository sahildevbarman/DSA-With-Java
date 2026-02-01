class B {
    public static void main(String[] args) {
        //Sum of elements
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int x : arr) {
            sum+=x;
        }
        System.out.println(sum);
    }
}