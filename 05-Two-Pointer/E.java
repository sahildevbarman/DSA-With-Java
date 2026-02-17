class E {
    public static void main(String[] args) {
        // Given a string s, check palindrome but spaces ignore karo.
        String s = "nurses run";

        int left = 0;
        int right = s.length()-1;

        while(left < right) {

            if(s.charAt(left) == ' ') {
                left++;
            }
            else if(s.charAt(right) == ' ') {
                right--;
            }
            else {
                if(s.charAt(left) != s.charAt(right)) {
                    System.out.println(false);
                    return;
                }

                left++;
                right--;
            }
        }

        System.out.println(true);
    }
}