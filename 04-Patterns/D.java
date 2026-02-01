import java.util.Scanner;
class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row: ");
        int row = sc.nextInt();
        System.out.print("Enter a col: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=col; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}

// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5