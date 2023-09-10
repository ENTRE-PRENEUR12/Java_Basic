import java.util.*;

public class Java_4_Conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age : ");
        int age = sc.nextInt();
        if (age <= 11) {
            System.out.println("Your are Child");

        } else if (age >= 12 && age <= 18) {
            System.out.println("You are Teenager ");
        } else {
            System.out.println("Ypu are Adult and eligible for Drive and Vote");
        }

        // Larest of 3 number
        System.out.println("Enter 3 number for Find Largest");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if (a1 > a2) {
            if (a1 > a3) {
                System.out.println("a1 = " + a1 + " is largest number");
            }

        } else {
            if (a2 > a3) {
                System.out.println("a2 = " + a2 + " is largest number");
            } else {
                System.out.println("a3 = " + a3 + " is largest number");
            }
        }

        // Even or Odd
        System.out.println("Enter number for find Even or Oddd");
        int b1 = sc.nextInt();
        if (b1 % 2 == 0) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");
        }

        // Tax Calculator
        System.out.println("Enter your Income in Lakhs ");
        int income = sc.nextInt();
        float tax;
        if (income < 5) {
            tax = 0 * 100000;
            System.out.println("Tax is 0% " + tax);
            System.out.println("Salary after tax = " + (income * 100000 - tax));

        } else if (income >= 5 && income < 10) {
            tax = (float) (income * (0.1)) * 100000;
            System.out.println("Tax is 10% : " + tax);
            System.out.println("Income after tax = " + (income * 100000 - tax));
        } else {
            tax = (float) (income * (0.3) * 100000);
            System.out.println("Tax is 30% : " + tax);
            System.out.println("Income after tax = " + (income * 100000 - tax));
        }

        // Ternary Operator
        int larger = (5 > 3) ? 5 : 3;
        System.out.println("Larger no. is : " + larger);

        int num = 33;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : " + type);

        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        String result = (marks > 33) ? "Pass" : "Fail";
        System.out.println("Your Result is : " + result);

        // Switch Statement
        System.out.println("Enter the order name : (Menu - samosa, burger, drink, momos, noodles)");
        String order = sc.next();
        switch (order) {
            case "samosa":
                System.out.println("Samosa is ready");
                break;
            case "burger":
                System.out.println("burger is ready");
                break;
            case "drink":
                System.out.println("drink is ready");
                break;
            case "momos":
                System.out.println("momos is ready");
                break;
            case "noodles":
                System.out.println("noodles is ready");
                break;

            default:
                System.out.println("Cold water is ready");

        }

        // Calculator using switch statement
        System.out.print("Enter the number for calculating : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char sign = sc.next().charAt(0);
        switch (sign) {
            case '+':
                System.out.println("Addition of " + num1 + " " + sign + " " + num2 + " is " + (num1 + num2));

                break;
            case '-':
                System.out.println("Addition of " + num1 + " " + sign + " " + num2 + " is " + (num1 - num2));

                break;
            case '*':
                System.out.println("Addition of " + num1 + " " + sign + " " + num2 + " is " + (num1 * num2));

                break;
            case '/':
                System.out.println("Addition of " + num1 + " " + sign + " " + num2 + " is " + (num1 / num2));

                break;
            case '%':
                System.out.println("Addition of " + num1 + " " + sign + " " + num2 + " is " + (num1 % num2));

                break;

            default:
                System.out.println("You choose wrong operator ");
                break;
        }

    }
}