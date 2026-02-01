import java.util.Scanner;
class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of no: ");
        int row = sc.nextInt();
        System.out.print("Enter colums of no: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

// * * * * * *
// * * * * * *
// * * * * * *