import java.util.Scanner;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number is greater 1000: ");
        int n = sc.nextInt();
        if(n>1000) {
            System.out.println("Yes "+n+" is greater than 1000");
        } else {
            System.out.println("No "+n+" is not greater than 1000");
        }
    }
}