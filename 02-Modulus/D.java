import java.util.Scanner;
class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = sc.nextInt();
        if(n%9==0) {
            System.out.println("Yes no. is multiple 9");
        } else {
            System.out.println("No the no. is not multiple 9");
        }
    }
}