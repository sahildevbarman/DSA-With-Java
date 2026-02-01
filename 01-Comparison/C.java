import java.util.Scanner;
class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter zero number: ");
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("Yes number is 0");
        } else {
            System.out.println(n+" is not a zero");
        }
    }
}