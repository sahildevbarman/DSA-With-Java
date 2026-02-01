import java.util.Scanner;
class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        int row = sc.nextInt();
        System.out.print("Enter no of col: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println(" ");
        }
    }
}

// A B C D E
// A B C D E
// A B C D E