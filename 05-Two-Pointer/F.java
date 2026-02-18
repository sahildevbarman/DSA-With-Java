class F {
    public static void main(String[] args) {
        /*Given a string s, check palindrome
        BUT uppercase/lowercase ignore*/
        String s = "Madam";

        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

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