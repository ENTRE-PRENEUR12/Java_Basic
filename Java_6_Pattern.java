import java.util.*;

public class Java_6_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Solid Rectangle
        System.out.println("Solid Rectangle :- ");
        // Outer Loop
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow Rectangle
        System.out.println("hollow Rectangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        // Half Pyramid
        System.out.println("Half Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid");
        for (int i = 1; i <= n; i++) { // or i = n to 1
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted Half Pyramid (rotated by 180)
        System.out.println("Inverted Half Pyramid (rotated by 180)");

        for (int i = 1; i <= n; i++) {
            // inner loop - space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop - star print
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Half Pyramid with Number
        System.out.println("Half Pyramid with Number");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // inverted Half Pyramid with Number
        System.out.println("inverted Half Pyramid with Number");
        for (int i = m; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Inverted Half Pyramid with number (inverted by 180)
        System.out.println("Inverted Half Pyramid with number (inverted by 180)");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        // Floyd's Triangle
        System.out.println("Floyd's Triangle");
        int val = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }

        // 0/1 Triangle
        System.out.println("0/1 Triangle");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // Character Pattern
        System.out.println("Character Pattern");
        char ch = 'A';
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        // Butterfly Pattern
        System.out.println("Butterfly Pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Solid Rhombus
        System.out.println("Solid Rhombus");
        for (int i = 1; i <= m; i++) {
            for (int j = m - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow Rhombus
        System.out.println("Hollow Rhombus");
        for (int i = 1; i <= m; i++) {
            for (int j = m - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                if ((j == 1) || j == m || i == 1 || i == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        // Diamond Pattern
        System.out.println("Diamond Pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Number Pyramid
        System.out.println("Number Pyramid");
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // Palindromic Pattern
        System.out.println("Palindromic Pattern");
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
}