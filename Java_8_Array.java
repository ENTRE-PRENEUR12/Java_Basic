import java.util.*;
public class Java_8_Array{

    public static void update(int marks2[]){
        for(int i=0;i<marks2.length;i++){
            marks2[i]++;
        }
    }

    // Linear Search
    public static int LinearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    // LArgest Number
    public static void largest(int lar[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<lar.length;i++){
            if(lar[i]>largest){
                largest = lar[i];
            }
        }
        System.out.println("Largest Number is "+largest);
    }
    // Smallest Number
    public static void smallest(int lar[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<lar.length;i++){
            if(smallest > lar[i]){
                smallest = lar[i];
            }
        }
        System.out.println("Smallest number is "+smallest);

    }

    // Binary Search
    public static int binarySearch(int number[],int key){
        int start = 0;
        int end = number.length - 1;
        for(int i=start;i<=end;i++){
            int mid = (start + end)/2;
            
            if(number[mid]==key){ // found
                return mid;
            }
            if(number[mid] > key){  // left
                end = mid - 1;
            }
            else{ // right
                start = mid + 1;
            }
        }
        return -1;
    }

    // Reverse an Array
    public static void ReverseArray(int number[]){
        int first = 0, last = number.length -1;
        while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }

    // Pairs in an Array
    public static void pairs(int number[]){
        int tp =0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+") ");
                tp++;

            }
            System.out.println();
            
        }
        System.out.println(" --> total pair = "+tp);
        }

        // Subarrays
        public static void subarray(int number[]){
            int ts =0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i+1;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ts);
    }

    // MAximum Subarray Sum
    public static void subarraySum(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){  // Sum of Subarray
                    currSum += number[k]; 
                }
                System.out.print(currSum+", ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("\nMax sum = "+maxSum);
    }

    // Max Subarray Sum (Prefix Sum Method)
    public static void prefixSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                // if(start ==0){
                //     currSum = prefix[end];
                // }
                currSum = start ==0? prefix[end]: prefix[end] - prefix[start -1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = "+currSum);
    }

    // Max Subarray Sum (Kadane's)
    public static void kadanes(int arr2[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr2.length;i++){
            currSum = currSum + arr2[i];
            if(currSum<0){
                currSum =0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our Max sum is : "+maxSum);
    }

    // Trapping Rainwater
    public static void trapping(int height[]){
        int n= height.length;
        // left Max Boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        // Right Max Boundary
        int rightMax[] = new int [n];
        rightMax[n - 1] = height[n-1];
        for(int i= n - 2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);

        }
        // loop - water level
        int trappedwater = 0;
        for(int i=0;i<n;i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedwater += waterlevel - height[i];
        }
        System.out.println("Trapper water = "+trappedwater);
    }

    // Buy or Sell Stock
    public static void stock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit  = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = price[i];
            }
        }
        System.out.println("Max profit is "+maxProfit);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        int no[] = {1,2,3};

        System.out.print("Enter your Physcis marks : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter your Chemistry marks : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter your Maths marks : ");
        marks[2] = sc.nextInt();

        System.out.println("Phy "+marks[0]);
        System.out.println("Chem "+marks[1]);
        System.out.println("Maths "+marks[2]);

        // update math marks;
        marks[2] = marks[2]+1;
        System.out.println("Update Maths marks "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage = "+percentage + "%");
        System.out.println("Length of marks array : "+marks.length);

        // Update marks and print array
        int marks2[] ={96,97,98}; 
        update(marks2);
        System.out.println("Updated Marks ");
        for(int i=0;i<marks2.length;i++){
            System.out.print(marks2[i]+" ");
        }
        System.out.println();

        // Linear Search
        System.out.println("Linear Search");
        int number[] = {1,2,4,6,8,10,13,12,14,16};
        int key=10;
        int index = LinearSearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
        System.out.println("Key is at index "+index);
        }


        // Largest Number
        System.out.println("Largest & Smallest Number");
        int lar[] = {1,2,6,3,20,5,9};
        largest(lar);
        smallest(lar);

        // Binary Search
        System.out.println("Binary Search");
        System.out.println("Index of key "+binarySearch(number, key));
        System.out.println("Index of key "+binarySearch(number, 56));

        // Reverse an Array
        System.out.println("Reverse an Array");
        ReverseArray(number);

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

        // Pairs in Array 
        System.out.println("Pairs in an Array");
        pairs(number);
        pairs(lar);

        // subarray
        System.out.println("Subarrays");
        subarray(number);

        // MAximum Subarray Sum
        System.out.println("MAximum Subarray Sum");
        int arr[] = {1,-2,6,-1,3}; 
        subarraySum(number);
        subarraySum(arr);

        // Max Subarray Sum (Prefix Sum Method)
        System.out.println("Max Subarray Sum (Prefix Sum Method)");
        prefixSum(arr);

        // Max Subarray Sum (Kadanes Sum Method)
        System.out.println("// Max Subarray Sum (kadanes Sum Method)");
        int arr2[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr2);

        // Trapping Rainwater
        System.out.println("Trapping Rainwater");
        int height[] = {4,2,0,6,3,2,5};
        trapping(height);

        // Buy or Sell Stock
        System.out.println("Buy or Sell Stock");
        int price[] = {7,1,5,3,6,4};
        stock(price);



    }
}