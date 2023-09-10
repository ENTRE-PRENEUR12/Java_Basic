import java.util.*;
public class Java_12_Bit{


    public static void oddEven(int n){
        int bitMask = 1;
        if((n & bitMask) ==0){
            System.out.println(n+" is Even number");
        }else{
            System.out.println(n +" is Odd Number");
        }
    }

    // Operation
    public static void getbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            System.out.println(i+"th bit is 0");
        }
        else{
            System.out.println(i+"th bit is 1");
        }
    }

    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return (n|bitMask);
        // System.out.println("Set "+i+"th bit is : "+ (n|bitMask));
    }

    public static int clearBit(int n,int i){
        int bitMask = ~(1<<i);
        return (n&bitMask);
        // System.out.println("Clear "+i+"th bit is : "+ (n&bitMask));

    }
    public static int Update(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }

        n = clearBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    // Clear ith Bitg
    public static int clearIBit(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    // Clear Range of ith bits
    public static int clearRanges(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n& bitMask;
    }

    // is power of 2
    public static boolean isPower2(int n){
        return (n&(n-1)) ==0;
    }

    // Count set Bits in a Number
    public static int countBit(int n){
        int count =0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;

        }
        return count;
    }

    // Fast Exponentiation 
    public static int fastExpo(int a,int n){
        int ans =1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Bit-Wise Operators
        // Binary AND &
        System.out.println("5 & 6 -->>   "+(5&6));
        // Binary OR |
        System.out.println("5 | 6 -->>   "+(5|6));
        // Binary XOR ^
        System.out.println("5 ^ 6 -->>   "+(5^6));
        // Binary one's Complement ~
        System.out.println("~5 -->>   "+(~5));
        // Binary left Shift <<  --->>>  a<<b = a*(2)^b;
        System.out.println("5 << 2 -->>   "+(5<<2));
        // Binary Right Shift >>  -->>>   a>>b = a/(2)^b;
        System.out.println("5 >> 2 -->>   "+(5>>2));

        // Number is ODD or EVEN
        System.out.println("// Number is ODD or EVEN");
        int n=12;
        oddEven(n);

        // /Operations - Get ith bit, set ith bit, clear ith bit
        getbit(n, 2);
        getbit(15, 2);
        getbit(10, 2);
        System.out.println("Set Bit is "+setBit(10, 2));
        System.out.println("Clear Bit is "+clearBit(10, 1));

        // Update ith bit
        System.out.println("Update ith bit");
        System.out.println("Update bit is "+Update(11, 2, 1));

        System.out.println("Clear bit from ith : "+clearIBit(15, 2));

        // Clear Range of ith bits
        System.out.println("Clear in Range : "+clearRanges(15, 2, 4));

        // is power of 2
        System.out.println("is power of 2 : "+isPower2(16));

        // Count set Bits in a Number
        System.out.println("Count set Bits in a Number : "+countBit(16));

        // Fast Expontiation
        System.out.println("Fast Expontiation : "+fastExpo(3, 5));
    }
}