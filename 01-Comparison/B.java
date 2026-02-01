import java.util.Scanner;
class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = sc.nextInt();

        if(n>0) {
            System.out.println(n+" is a positive no.");
        } else {
            System.out.println(n+" is a negative no.");
        }
    }
}

