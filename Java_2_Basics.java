import java.util.*;

public class Java_2_Basics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World !");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Variables
        int a=10;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        String name = "Shivam Kumar";
        System.out.println(name);

        a=b;
        System.out.println(a);
        
        // Data Types
        byte ab=65;
        System.out.println(ab);
        char ch = 'a';
        System.out.println(ch);

        boolean bo = true;
        System.out.println(bo);

        float price = (float) 10.5;
        System.out.println(price);

        int num = 45434; //long, double
        System.out.println(num);

        // Sum of a & b 
        int x1 = 54;
        int x2 = 87;
        int sum = x1+x2;
        System.out.println("sum of "+x1+" & "+x2+" is "+sum);

        // Input in java
        System.out.println("Input in Java");
        String name1 = sc.nextLine(); // Multi Word Sentence
        System.out.println(name1);

        String input = sc.next(); // Single  Word Sentence
        System.out.println(input);

        int n = sc.nextInt(); // Integer Input
        System.out.println(n);

        float fl = sc.nextFloat();
        System.out.println(fl);
        // nextByte, nextDouble, nextBoolean, nextLong, etc

        // Product of a & b
        System.out.print("Enter the value of p1 & p2 ");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int prod = p1*p2;
        System.out.println(prod);

        // Area of Circle
        System.out.print("Input the radius of circle ");
        int rad = sc.nextInt();
        float area = (float)(3.14*rad*rad);
        System.out.println("Area of Circle is "+area);


        // Type Casting
        float ax = 54.6667f;
        int bx = (int) ax;
        System.out.println(bx);

        char ch1 = 'a';
        int numc = (int) ch1;
        System.out.println("a = "+ numc);
        char ch2 = 'g';
        int numc1 = (int) ch2;
        System.out.println("g = "+ numc1);

        System.out.println(ch1 - ch2);

        int q = 5;
        float w = 45.54f;
        long e = 534;
        double r = 345353;
        System.out.println(q+w+e+r);


    }
}