import java.util.*;
public class Java_5_Loops{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        // While Loop
        int count =0;
        while (count <10){
            System.out.println("Hello World - "+count);
            count ++;
        }

        System.out.println("Enter the range of number");
        int count1 =1;
        int range = sc.nextInt();
        while (count1< range){
            System.out.print(count1+" ");
            count1++;
            if(count1 == 4){
                continue;
            }
        }

        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Shivam "+i);
            if(i == 3){
                break;
            }
        }

        // Square Pattern
        for (int i=1;i<=4;i++){
            System.out.println("****");
        }

        System.out.println("Pattern through while loop");
        int line = 1;
        while(line<=4){
            System.out.println("****");
            line++;
        }

        // Sum of first n natural number
        int sum =0;
        for(int i=1;i<10;i++){
            sum = sum+i;
            System.out.println("Sum of "+i+ " natural number is : "+sum);
            
        }
        System.out.println("Total sum is : "+sum);

        // Do while loop
        System.out.println("Do while loop");
        int count2 = 1;
        do{
            System.out.println(count2);
            count2++;
        }while(count2 <=10);

        // Reverse a Number
        int num = 2345543;
        int rev =0;
        while(num>0) {
            int ld = num % 10;
            rev = rev*10 +ld;
            // System.out.print("reverse of "+ num +" is "+ld);
            num = num/10;
        }
        System.out.println("reverse of number is "+rev);

        do{
            System.out.print("Enter your Number : ");
            int x4 = sc.nextInt();
            if(x4%5 ==0){
                break;
            }
            System.out.println();

        }while (true);
    }
}