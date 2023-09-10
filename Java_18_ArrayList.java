import java.util.*;
public class Java_18_ArrayList {

    // Swap of 2 Number
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // Contain most water Store -  O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int curWater = ht*width;
                maxWater = Math.max(maxWater, curWater);
            }
        }
        return maxWater;
    }

    // Contain most water Store - 2 Pointer Approach -O(n)
    public static int storeWater2(ArrayList<Integer> height){
        int maxWater =0;
        int lp=0; int rp=height.size()-1;
        while(lp<rp){
            // calculate water area
            int ht= Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            // update pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }

        }return maxWater;
    }

    // PAir Sum -1
    public static boolean pairSum(ArrayList<Integer> num, int target){
        for(int i=0;i<num.size();i++){
            for(int j=i+1;j<num.size();j++){
                if(target == ((num.get(i))+num.get(j))){
                    return true;
                }
            }
        }return false;
    }

    // Pair Sum Method-2
    public static boolean pairSum2(ArrayList<Integer> num, int target){
        
        int lp=0;int rp=num.size()-1;
        while(lp !=rp){
        if(num.get(lp)+num.get(rp) == target){
            return true;
        }else if(num.get(lp)+num.get(rp) < target){
            lp++;
        }else{
            rp--;
        }
    }
        return false;
    }

    // Pair Sum (Pivoted or Rotated) -2
    public static boolean pairSum3(ArrayList<Integer> num2,int target2){
        int bp=-1;
        int n=num2.size();
        for(int i=0;i<n;i++){
            if(num2.get(i) > num2.get(i+1)){ // breaking point
                bp = i;
                break;
            }
        }
        int lp=bp+1; int rp=bp;
        while(lp != rp){
            if(num2.get(lp)+num2.get(rp)==target2){
                return true;
            }else if(num2.get(lp)+num2.get(rp) < target2){
                lp = (lp+1)%(n);
            }else{
                rp = (n+ rp-1)%(n);
            }
        }
        return false;
    }

    public static void main(String args[]){
        // Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add an Element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3,23); // O(n)
        System.out.println(list);

        // Get an element - O(1)
        int elem = list.get(2);
        System.out.println(elem);

        // Delete or Remove -O(n)
        list.remove(1);
        System.out.println(list);

        // Set Element at index - O(n)
        list.set(1,10);
        System.out.println(list);

        // Contains Element - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(8));

        // Size of ArrayList
        System.out.println(list.size());
        // Print ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Arraylist in Reverse Order
        System.out.println("Arraylist in Reverse Order");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Find Maximum No. in arrayList - O(n)
        System.out.println("Find Maximum No. in arrayList");
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            int curr = list.get(i);
            // max = Math.max(max,curr);
            if(max < curr){
                max = curr;
            }
        }
        System.out.println("Max element are :- "+max);

        // Swap of 2 Number
        int idx1 = 1, idx2=3;
        int temp = idx1;
        idx1=idx2;
        idx2=temp;
        System.out.println("Elements swap  at "+idx1+" is "+list.get(idx1)+" and at "+idx2+" is "+list.get(idx2));
        System.out.println(list);

        // Swap of 2 Number
        System.out.println("Swap of 2 Number using function");
        swap(list, idx1,idx2);
        System.out.println(list);

        // Sorting an ArrayList
        System.out.println("Sorting an ArrayList");
        Collections.sort(list); // Ascending
        System.out.println(list);
        // Descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        // Multi Dimentional Arraylist - 2D
        System.out.println("Multi Dimentional Arraylist - 2D");
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> listn = new ArrayList<>();
        listn.add(1); listn.add(2);
        mainList.add(listn);

        ArrayList<Integer> listn2 = new ArrayList<>();
        listn2.add(3);listn2.add(4);
        mainList.add(listn2);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            } 
            System.out.println();
        }
        System.out.println(mainList);

        // 3 list in main list
        System.out.println("3 list in main list");
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list12 = new ArrayList<>();
        ArrayList<Integer> list13 = new ArrayList<>();
        for(int i=1;i<=5;i++){
            list11.add(i*1);
            list12.add(i*2);
            list13.add(i*3);
        }
        mainList.add(list11);
        mainList.add(list12);
        mainList.add(list13);
        System.out.println(mainList);
        // nested Loop
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0; j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);

        // Contain most water Store - O(n^2)
        System.out.println("Contain most water Store");
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);  height.add(8);
         height.add(6);  height.add(2);
          height.add(5); height.add(4); height.add(8);
           height.add(3);  height.add(7);
        System.out.println("Max. water store - "+storeWater(height));

        // Contain most water Store - 2 Pointer Approach -O(n)
        System.out.println("Max. Water Store (2) - "+storeWater2(height));

        // Pair Sum -1
        System.out.println("Pair Sum -1");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1); num.add(2); num.add(3); num.add(4); 
        num.add(5); num.add(6); 
        int target = 5;
        System.out.println(pairSum(num, target));

        System.out.println("PAir Sum m-2 - "+pairSum2(num, target));

        // [Pair Sum Rotated -2]
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(11); num2.add(15); num2.add(6); num2.add(8); 
        num2.add(9); num2.add(10); 
        int target2 = 16;

        System.out.println("PAir Sum rotated and pivoted - "+pairSum3(num2, target2));
        



    }
    
}
