public class Java_13_OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen(); // Create pen object p1
        p1.setColor("Blue");
        System.out.println("Set color :- "+(p1.getColor()));
        p1.setTip(5);
        System.out.println("Set tip :- "+(p1.getTip()));

        // M-2
        // Pen p1 = new Pen(); // Create pen object p1
        // p1.setColor("Blue");
        // System.out.println("Set color :- "+(p1.color));
        // p1.setTip(5);
        // System.out.println("Set tip :- "+(p1.tip));

        // BankAccount
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shivam Kumar";
        myAcc.setPassword("asdfghjkl");
        System.out.println(myAcc.username);
        // System.out.println(myAcc.setPassword());
    

    // Encapsulation
    // Constructors
    System.out.println("// Constructors");
    Student s1 = new Student();
    Student s2 = new Student("Shivam");
    Student s3 = new Student(87678);
    // Student s4 = new Student(87678,"Shivam");  -- cann't run because of this type of construction not formed 
    // System.out.println(s1.name);

    // Copy Constructor
    System.out.println("Copy constructor ");
    s1.name = "Shubham";
    s1.roll = 798;
    s1.password = "lkjh";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=85;

    Student s4 = new Student(s1);
    s4.password = "xyz";
    s1.marks[1]=95;
    for(int i=0;i<3;i++){
        System.out.println(s4.marks[i]);
    }

    // Inheritance
    System.out.println("Inheritance");
    Fish shark = new Fish();
    shark.eat();

    // Multi level
    System.out.println("// Multi level");
    Dog dobby = new Dog();
    dobby.eat();
    dobby.legs = 4;
    System.out.println("dobby.legs "+dobby.legs );

    // Hierarchial Inheritance
    System.out.println("// Hierarchial Inheritance");
    Birds parrot = new Birds();
    parrot.fly();

    Mammals cow = new Mammals();
    cow.walks();
    cow.eat();

    Fish whale = new Fish();
    whale.swims();

    // Hybrid Inheritance
    System.out.println("Hybrid Inheritance");
    Human shivam = new Human();
    shivam.sound();

    Cat pussy = new Cat();
    pussy.sound();

    Dog tomy = new Dog();
    tomy.sound();

    Peacock mor = new Peacock();
    mor.sound();
    
    Tune tu = new Tune();
    tu.sound();

    Shark sha = new Shark();
    sha.sound();

    // Polymorphism
    // Calculator using function overloading
    System.out.println("Calculator using function overloading");
    Calculator cal = new Calculator();
    System.out.println(cal.sum(5, 4));
    System.out.println(cal.sum((float)5.5, (float)4.5));
    System.out.println(cal.sum(5, 4, 9));

// Abstraction
System.out.println("Abstraction");
    Horse h = new Horse();
    h.eat();
    h.walk();

    Cock c = new Cock();
    c.eat();
    c.walk();

    // Animals a = new Animals(); --> can not create object of Abstract class
    System.out.println(h.color); //--> Brown 

    Mustang myh = new Mustang();
    // Animal -> Horse -> Mustang

    // Interface
    System.out.println("// Interface");
    Queen q = new Queen();
    q.moves();

    King k = new King();
    k.moves();

    Rook r = new Rook();
    r.moves();

    Pawn p = new Pawn();
    p.moves();

    // Multiple Inheritance
    System.out.println("Multiple Inheritance");
    Bear be = new Bear();
    be.food();

    // Static Keyword
    System.out.println("// Static Keyword");
    Student2 st1 = new Student2();
    st1.schoolName = "BVP";
    Student2 st2 = new Student2();
    System.out.println(st2.schoolName);

    Student2 st3 = new Student2();
    st3.schoolName = "DAV";
    System.out.println("Updates all name"+st2.schoolName);



    
} 
}

    // Constructors
    class Student{
        String name;
        int roll;
        String password;
        int marks[];

        // Non-Parameterised Constructor
        Student(){
            marks = new int[3];
            System.out.println("Constructor is called....");
        }
        // Parameterised Constructor
        Student(int roll){
            marks = new int[3];
            this.roll = roll;
        }
        Student(String name){
            marks = new int[3];
            this.name = name;
        }

        // Shallow Copy Constructor
        // Student(Student s1){
            // marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;
        // }

        // Deep Copy Constructor
            Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0;i<marks.length;i++){
                this.marks[i] = s1.marks[i]; 
            }
        }

    }

    // Inheritance
    // Single Level Inheritance :- Base --> Derived Class
    // Multi Level Inheritance :- Base --> Derived --> Derived Class
    // Hierarchial Inheritance :- Base --> Derived - Derived - Derived
    // Hybrid Inheritance :- Animal --> Fish - Bird - Mammel (Fish --> tune - Shark), (Mammel --> Dog - Cat - Human), (Bird --> Peacock)
    // Base Class
    class Animal{
        String color;
        void eat(){
            System.out.println("Eats");
        }
        void breath(){
            System.out.println("Breathes");
        }
    }

    // Hierarchial Inheritance - Animal --> mammals - fish -- birds

    class Birds extends Animal{
        void fly(){
            System.out.println("Fly");
        }
    }
    class Peacock extends Birds{
        void sound(){
            System.out.println("pe pe");
        }
    }

    // Derived for multi level
    class Mammals extends Animal{
        int legs;
        void walks(){
            System.out.println("Walks");
        }
    }
    class Dog extends Mammals{
        String breed;
        void sound(){
            System.out.println(" bho bho");
        }
    }
    class Cat extends Mammals{
        void sound(){
            System.out.println("meau meau");
        }
    }
    class Human extends Mammals{
        void sound(){
            System.out.println("talk");
        }
    }

    // derived Class
    class Fish extends Animal{
        int fins;
        void swims(){
            System.out.println("Swims");
        }
    }
    class Tune{
        void sound(){
            System.out.println("tu tu tu");
        }
    }
    class Shark{
        void sound(){
            System.out.println("woooo woooo");
        }
    }


class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;   
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }

    // M-2
    // String color;
    // int tip;
    // void setColor(String newColor){
    //     color = newColor;
    // }
    // void setTip(int newTip){
    //     tip = newTip;
    // }
}
// PolyMorphism
// Calculator using --> function overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }


}

// Abstraction
abstract class Animals{
    String color;
    Animals(){
        color = "Brown";
        System.out.println("Animals Constructor called");
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}
class Horse extends Animals{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changecolor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Animal Walks on 4 Legs");
    }
}
class Mustang extends Horse{
    Mustang (){
        System.out.println("Mustang Constructor called ");
    }
}

class Cock extends Animals{
    void changecolor(){
        color = "White";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

// Interfaces
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal (in all dir. )");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal (by 1 steps)");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up, diagonal (by 1 steps)");
    }
}


// Multiple Inheritance
interface Herbivore{
    void food();
}
interface Carnivore{
    void food();
}
class Bear implements Herbivore, Carnivore{
    public void food(){
        System.out.println("Eats Both Grass and Animals");
    }
    // String food2(){
    //     System.out.println("Eats Animals");
    // }
}

// Static Keyword
class Student2{
    static int percentage(int m, int c, int p){
        return (m+c+p)/3;
    }
    String name2;
    int roll2;
    static String schoolName;
    void setName2(String name){
        this.name2 = name2;
    }
    String getName2(){
        return this.name2;
    }


}
