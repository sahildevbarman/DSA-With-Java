import java.util.Scanner;
class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = sc.nextInt();
        if(n%4==0) {
            System.out.println("Yes no. is divisible by 4");
        } else {
            System.out.println("No that's not divisible by 4");
        }

    }
}