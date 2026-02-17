class D {
    public static void main(String[] args) {
        /*Given a string s, check whether it is a palindrome.
        Return true if palindrome, otherwise false.*/
        
        String s = "madam";

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println(false);
                return;
            }

            left++;
            right--;
        }

        System.out.println(true);
    }
}        