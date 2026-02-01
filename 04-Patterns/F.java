import java.util.Scanner;
class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        int row = sc.nextInt();
        System.out.print("Enter no of col: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println(" ");
        }
    }
}

// a b c d e
// a b c d e
// a b c d e