import java.util.Scanner;
class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A no: ");
        int n = sc.nextInt();
        if(n%10==0) {
            System.out.println("Yes...no. is divisible by 10");
        } else {
             System.out.println("No...no. is not divisible by 10");
        }
    }
}