import java.util.Scanner;
class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = sc.nextInt();
        if(n%2==0 && n%5==0) {
            System.out.println("Yes number is divisible by both 2 & 5");
        } else {
            System.out.println("No number is not divisible by both 2 & 5");
        }
        
    }
}