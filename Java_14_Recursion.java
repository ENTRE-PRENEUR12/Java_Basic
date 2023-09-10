import java.util.*;

public class Java_14_Recursion {
    // Decrease order
    public static void Dec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        Dec(n-1);
    }
    // Increase order
    public static void Inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        Inc(n-1);
        System.out.print(n+" ");
    }
    // Factorial 
    public static int fact (int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    // Sum of n Natural number
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }

    // Fibonacci series
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fibbo(n-1);
        int fnm2 = fibbo(n-2);
        int fn = fnm1 +fnm2;
        return fn;
    }

    // Sorted Array
    public static boolean sorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if((arr[i] > arr[i+1])){
            return false;
        }
        return sorted(arr, i+1);
    }

    // First Occurance
    public static int occurance(int arr[],int key,int i){
        if(i == arr.length -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return occurance(arr, key, i+1);
    }

    // Lasst Occurance
    public static int lastOccurance(int arr2[],int key,int i){
        int len = arr2.length;
        if(i == len){
            return -1;
        }
        int isfound = lastOccurance(arr2,key,i+1);
        if(isfound == -1 && arr2[i] == key){
            return i;
        }
        return isfound;
    }

    // Print x^n
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        int pxnm1 = pow(x, n-1);
        int pxn = x* pxnm1;
        return pxn;
    }
    // M-2 O(log n)
    public static int optimizedPow(int a, int n){
        if(n==0){
            return 1;
        }
        // int halfPow = optimizedPow(a,n/2) * optimizedPow(a,n/2);
        int halfPow = optimizedPow(a,n/2);
        int halfPowSq = halfPow*halfPow;
        // odd n
        if(n%2 !=0){
            halfPowSq = a * halfPowSq;
        }
        return halfPowSq;
    }

    // Tiling Problem
    public static int tiling(int n){ //2xn floor size
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tiling(n-1);
        // horizontal choice
        int fnm2 = tiling(n-2);

        int totalWays = fnm1 +fnm2;
        return totalWays;
    }

    // Remove Duplicate String
    public static void removeDup(String str,int idx, StringBuilder newStr, boolean map[]){
        if(idx ==str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam 
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDup(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] =true;
            removeDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    // Friends Pairing Problems
    public static int pairingFrnd(int n){
        if(n==1 || n==2){
            return n;
        }
        // Single choice
        int fnm1 = pairingFrnd(n-1);
        // Pairing Friends
        int fnm2 = pairingFrnd(n-2) *(n-1);
        int totalWays = fnm1 + fnm2;
        return totalWays;

    }

    // Print Binary String
    public static void binaryString(int n,int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        // Kaam
        // if(lastPlace ==0){
        //     // sit 0 on chair n
        //     binaryString(n-1, 0, str.append("0"));
        //     binaryString(n-1, 1, str.append("1"));
        // }else{
        //     binaryString(n-1, 0, str.append("0"));
        // }
            // M-2
        binaryString(n-1, 0, str+"0");
        if(lastPlace ==0){
            binaryString(n-1, 1, str+"1");
        }
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Decrease order
        System.out.println("Decrease order");
        int n=10;
        Dec(n);
        Inc(n);
        // Factorial
        System.out.println("\nFactorial of "+n+" is "+fact(n));
        // Sum of n Natural number
        System.out.println("Sum of "+n+" Natural number is "+sum(n));
        // Fibonacci series
        System.out.println("// Fibonacci series of 25 is "+fibbo(25));
        
        // Sorted Array
        System.out.println("// Sorted Array");
        int arr[] = {1,2,3,4,5};
        System.out.println(sorted(arr, 0));

        // First Occurance
        System.out.println("// First Occurance");
        int arr2[] = {8,3,6,9,5,10,2,5,3};
         System.out.println(occurance(arr2, 5, 0));

        // LAst Occurance
        System.out.println("LAst Occurance");
        System.out.println(lastOccurance(arr2, 5, 0));

        // Print x^n
        System.out.println("// Print x^n :-  "+pow(2, 10));
        System.out.println("// Print x^n M-2 :-  "+ optimizedPow(2,10));

        // Tiling Problem
        System.out.println("// Tiling Problem :- "+tiling(4));

        // Remove Duplicate String
        System.out.println("Remove Duplicate String");
        String str = "appnnacollege";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);

        // Friends Pairing Problems
        System.out.println("// Friends Pairing Problems");
        System.out.println(pairingFrnd(3));

        // Print Binary String
        System.out.println("Print Binary String");
        binaryString(3, 0, "");

    }
}
