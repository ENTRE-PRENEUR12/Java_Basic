import java.util.*;
public class Java_11_Strings{
    public static void printletter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    // Palindrome in String
    public static boolean palindrome(String str4){
        int n = str4.length();
        for (int i = 0; i < n/2; i++) {
            if(str4.charAt(i) != str4.charAt(n -i-1)){
                return false;
                // System.out.print("Not palindrome");
            }
        }
        return true;
        // System.out.println(str4+" is Palindrome");
    }

    // shortest path in direction
    public static void shortestPath(String path){
        int x=0, y=0;
        int n=path.length();
        for(int i=0;i<n;i++){
            char dir = path.charAt(i);
            if(dir == 'w'){
                x--;
            }
            else if(dir == 'e'){
                x++;
            }
            else if(dir == 'n'){
                y++;
            }
            else{
                y--;
            }

        }
        int x2 = (x*x);
        int y2 = y*y;
        System.out.println("Shortest dist. are - "+ (float)Math.sqrt(x2 + y2));
    }

    // SubString
    public static String SubString(String str6, int si, int ei){
        String substr = "";
        for(int i=si;i< ei;i++){
            substr += str6.charAt(i);
        }
        return substr;
    }

    // first letter of each word in UpperCase
    public static String toupperCase(String line){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(line.charAt(0));
        sb.append(ch);
        for(int i=1;i<line.length();i++){
            if(line.charAt(i) ==' ' && i<line.length()-1){
                sb.append(line.charAt(i));
                i++;
                sb.append(Character.toUpperCase(line.charAt(i)));
            }else{
                sb.append(line.charAt(i));
            }
        }
        return sb.toString();
    }

    // String Compression
    public static String Compression(String com){
        String newstr = "";
        for(int i=0;i<com.length();i++){
            Integer count =1;
            while(i < com.length()-1 && com.charAt(i) == com.charAt(i+1)){
                count++;
                i++;
            }
            newstr += com.charAt(i);
            if(count >1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are immutable
        System.out.print("Enter Name ");
        String name = sc.next();
        System.out.println("Name - "+name);
        String name2 = sc.nextLine();
        System.out.println("Full Name - "+name2+", Length -"+name2.length());

        // Concatination
        String name3 = "Shivam";
        String last2 = "Kumar";
        String FullName = name3+" "+last2;
        System.out.println("Concation of name - "+ FullName);
        System.out.println("finding letter of name - "+ name.charAt(2));

        System.out.println("PrintLetter ");
        printletter(str);
        printletter(str2);
        printletter(FullName);

        // Palindrome in String
        System.out.println("// Palindrome in String");
        String str4 = "noon"; // racecar
        System.out.println(palindrome(str4));
        String str5 = "shivam";
        System.out.println(palindrome(str5));

        // shortest path in direction
        System.out.println("// shortest path in direction");
        String path = "wneenesennn";
        shortestPath(path);

        // String equality
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String ("tony");

        if(s1 ==s2){
            System.out.println("String are equal s1 == s2 ");
        }else{
            System.out.println("String not equal ");
        }
        if(s1 ==s3){
            System.out.println("String are equal s1 == s3 ");
        }else{
            System.out.println("String not equal s1 != s3");
        }
        if(s1.equals(s3)){
            System.out.println("String are equal s1.equal s3");
        }else{
            System.out.println("String not equal ");
        }

        // SubString
        System.out.println("SubString");
        String str6 = "HelloWorld";
        // inbuilt substring function 
        System.out.println(str6.substring(0,5));
        System.out.println(SubString(str6,1, 6));

        // print largest string using lexico method
        System.out.println("print largest string using lexico method");
        // 1. comparetoIgnoreCase - A == a
        // 2. compareTo - A!=a
        String fruits[] = {"apple","mango","banana"};

        String larg = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(larg.compareToIgnoreCase(fruits[i]) < 0){
                larg = fruits[i];
            }
        }
        System.out.println(larg);

        // String Builder
        System.out.println("StringBuilder ");

        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println("StringBuilder "+sb);
        System.out.println("StringBuilder length "+sb.length());


        // first letter of each word in UpperCase
        System.out.println("// first letter of each word in UpperCase");        
        String line = "hi, i am shivam kumar";
        System.out.println("to uppercase :- "+toupperCase(line));

        // String Compression
        System.out.println("String Compression");
        String com = "aaabbcccdd";
        System.out.println(Compression(com));
    }
}  