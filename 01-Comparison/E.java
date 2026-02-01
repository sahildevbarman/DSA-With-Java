import java.util.Scanner;
class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A no. less than -50: ");
        int n = sc.nextInt();
        if(n<-50) {
            System.out.println("Yes "+n+" is less than -50");
        } else {
            System.out.println("No "+n+" is not less than -50");
        }
    }
}