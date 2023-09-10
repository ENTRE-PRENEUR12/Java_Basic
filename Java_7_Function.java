import java.util.*;
public class Java_7_Function{
    public static void hello(){
        // Scanner sc = new Scanner(System.in);
        System.out.println("Hello Shivam");
        return;
    }

    // Sum of two number
    public static void Sum(int a,int b){
        int sum1 = a+b;
        System.out.println("Sum of int a & b is "+sum1);   
    }
    // Sum of three number -- 
    // Function Overloading due to change of parameter Data type and no. of parameter (use same function name)
    public static void Sum(int a,int b,int c){
        int sum1 = a+b+c;
        System.out.println("Sum of a & b & c is "+sum1);   
    }
    // // Sum of two number
    public static void Sum(float a,float b){
        float sum1 = a+b;
        System.out.println("Sum of float a & b is "+sum1);   
    }

    // Swapping
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a+" & b = "+b);
    }

    // Product
    public static int product(int a, int b){
        int prdt = a*b;
        return prdt;
    }

    // Factorial
    public static int Factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;

        }
        return f;
    }

    // Binomial Coefficient
    public static int Binomial(int n, int r){
        int nf = Factorial(n);
        int rf = Factorial(r);
        int nrf = Factorial((n-r));
        int ncr = (nf / ((rf * nrf)));
        return ncr;
    }

    // check Prime no.
    public static boolean Prime(int num){
        if(num == 2){
            return true;
        }
        // boolean isprime = true;
        for(int i=2;i<= (Math.sqrt(num));i++){
            if(num % i ==0){
                // isprime = false;
                // break;
                return false;
            }
        }
        return true;  //return isprime;
    }

    // Print all Prime in range
    public static void primeRange(int num){
        for(int i=2;i<=num;i++){
            if (Prime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    // Convert Binary to Decimal
    public static void binary2decimal(int bin){
        int mybin = bin;
        int dec =0;
        int pow =0;
        while(bin>0){
        int ld = bin%10;
        
        dec = dec+ ld*(int)(Math.pow(2, pow));
        pow++;
        bin = bin/10;
        }
        System.out.println("Decimal of "+mybin+" = "+dec);
    }

    // Decimal to Binary
    public static void dec2bin(int dec2){
        int mydec = dec2;
        int bin2 = 0;
        int pow =  0;
        while(dec2>0){
            int ld2 = dec2 % 2;

            bin2 = bin2 + ld2*(int)(Math.pow(10,pow));
            ld2 = ld2 / 2;
            pow++;
        }
        System.out.println("Binary of "+mydec+" = "+bin2);
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        hello();
        hello();

        // Sum
        System.out.println("Enter a & b & c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Sum(a, b);
        Sum(3.3f, 4.4f);
        Sum(a, b, c);

        // Swapping
        System.out.println("Swapping of a & b : ");
        swap(a, b);
        swap(7, 9);

        // Product
        System.out.print("Product od a & b ");
        int mul = product(a, b);
        System.out.println(mul);

        // Factorial
        System.out.println("Enter n & r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Factorial of n ");
        int fact = Factorial(a);
        System.out.println(fact);
        System.out.println(Factorial(9));

        // Binomial Coefficient
        System.out.println("Binomial Coefficient ");
        System.out.println("nCr = "+Binomial(n, r));

        // Prime no.
        System.out.println("Prime no. ");
        System.out.println("Enter num for checking prime");
        int num = sc.nextInt();
        System.out.println(Prime(num));

        
        primeRange(num);

        // Convert Binary to Decimal
        System.out.println("Convert Binary to Decimal");
        int bin = 10100011;
        binary2decimal(bin);
        binary2decimal(101);

        // Decimal to Binary
        System.out.println(" Decimal to Binary");
        int dec2 = 8;
        dec2bin(dec2);
        dec2bin(5);

    }
}