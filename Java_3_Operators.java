import java.util.*;
public class Java_3_Operators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Binary Operators
        System.out.println("Input A & B : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("a + b : "+ (a+b));
        System.out.println("a - b : "+ (a-b));
        System.out.println("a * b : "+ (a*b));
        System.out.println("a / b : "+ (a/b));
        System.out.println("a % b : "+ (a%b));

        // Unary Operators
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 (++a) "+ a1);
        System.out.println("b1 :"+b1);

        // Post Increment
        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 (a++) "+ a2);
        System.out.println("b2 :"+b2);

        // Post Decrement
        int a3 = 10;
        int b3 = a3--;
        System.out.println("a3 (a--) "+ a3);
        System.out.println("b3 :"+b3);
        // Pre Decrement
        int a4 = 10;
        int b4 = --a4;
        System.out.println("a4 (--a) "+ a4);
        System.out.println("b4 :"+b4);

        // Relational Operation
        System.out.print("Enter r1 & r2 : ");

        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("r1 == r2 : "+ (r1==r2));
        System.out.println("r1 != r2 : "+ (r1!=r2));
        System.out.println("r1 > r2 : "+ (r1>r2));
        System.out.println("r1 < r2 : "+ (r1<r2));
        System.out.println("r1 <= r2 : "+ (r1<=r2));

        // Assignment operator
        int a6 = 10;
        System.out.println("a6 += "+ (a6 += 10));
        System.out.println("a6 -= "+ (a6 -= 10)); // a6 is updated
        System.out.println("a6 *= "+ (a6 *= 10));
        System.out.println("a6 /= "+ (a6 /= 10));

        // Logical Operators
        System.out.println("Enter l1 & l2 for Logical operator : ");
        boolean l1 = sc.nextBoolean();
        boolean l2 = sc.nextBoolean();
        System.out.println("l1 || l2 : "+ (l1 || l2));
        System.out.println("l1 && l2 : "+ (l1 && l2));
        System.out.println("l1 ! l2 : "+ !(l1));
    }
}