class E {
    public static void main(String[] args) {
        //MAX and MIN value
        int[] arr = {10, 20, 1, 40, 105, 88, 90, 2};

        System.out.print("Values:");

        for(int x:arr) {
            System.out.print(x+" ");
        }

        System.out.println();

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
            if(min>arr[i]) {
                min = arr[i];
            } 
        }
        System.out.println("Max:"+max+"\n"+"Min:"+min);
    }
}