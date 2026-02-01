import java.util.Scanner;
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Check  if a no. is odd
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        if(n%2 != 0) {
             System.out.println(n+" is a odd number");
        } else {
            System.out.println(n+" is not a odd number");
        }
    }
}