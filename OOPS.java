// class and object creation


// public class OOPS {
//     public static void main(String args[]) {
        
//         Pen p1 = new Pen() ;   //object creation (constructor)
//         p1.setColor("Blue");
//         p1.color = "yellow";
//         System.out.println(p1.color);
//         p1.setTip(5);
//         System.out.println(p1.tip);
//         }
//     }

// class Pen {
//     //attributes(properties)
//     String color;
//     int tip;

//     //functions
//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }



//Getters and setters (better format of writing code for objects and classes)

// public class OOPS {
//     public static void main(String args[]) {
//         Pen p1 = new Pen();

//         p1.setColor("yellow");
//         p1.setTip(5);

//         System.out.println(p1.getColor());
//         System.out.println(p1.getTip());
//         System.out.println(p1.getCompany());
//     }
// }

// class Pen {
//     String color;
//     int tip;
//     private String company;

//     String getColor() {    //getters
//         return this.color;
//     }

//     int getTip() {   //getters
//         return this.tip;
//     }

//     String getCompany() {  //getters (but it will return null as it is private)
//         return this.company;
//     }


//     void setColor(String color) {  //setters 1
//         this.color = color;
//     }

//     void setTip(int tip) {   //setters 2
//         this.tip = tip;
//     }

//     void setCompany(String company) {    //setters 3
//         this.company = company;
//     }
// }



//constructor (their types)

// public class OOPS {
//     public static void main(String args[]) {
//         Student s1 = new Student();  //it automatically make a constructor in class even it is not created.// Non Paramaterized constructor

//         Student s2 = new Student("ravi");     //Parameterized constructor  
//         System.out.println(s2.name);

//         Student s3 = new Student(123);    //Parameterized constructor
//         System.out.println(s3.roll);

//     }
// }

// class Student {
//     String name;
//     int roll;

//     Student () {
//         System.out.println("constructor is called");    //constructor 1
//     }

//     Student (String name) {     //constructor 2
//         this.name = name;
//     }

//     Student (int roll) {     //constructor 3
//         this.roll = roll;
//     }
// }




//constructor (copy constructor)

// public class OOPS {
//     public static void main(String args[]) {

//         Student s1 = new Student();  //constructor or object creation
//         s1.name = "ravi";
//         s1.roll = 13;
//         s1.marks[0] = 90;
//         s1.marks[1] = 95;
//         s1.marks[2] = 94;


//         // Student s2 = new Student(s1);   //shallow call
//         // s2.password = "xyz";
//         // s1.marks[2] = 100;   

//         // for(int i = 0; i < 3; i++) {
//         //     System.out.println(s2.marks[i] + " ");
//         // }


//         Student s2 = new Student(s1);   //deep call
//         s2.password = "xyz";
//         s1.marks[2] = 100;    

//         for(int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }

//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     Student() {
//         marks = new int[3];
//         System.out.println("constructor is called");
//     }

//     //shallow copy constructor
    
//     // Student(Student s1) {
//     //     marks = new int[3];
//     //     this.name = s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }

    
//     //deep copy constructor

//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i = 0; i < marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }
// }




//Inheritance  (single level inheritance)

// public class OOPS {
//     public static void main(String args[]) {
//         Fish shark = new Fish();
//         shark.eat();   //proof
//     }
// }

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("brathes");
//     }
// }

// //Derived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }



//multi level inheritance

// public class OOPS {
//     public static void main(String args[]) {
//         Dog oscar = new Dog();
//         oscar.eat();   //proof

//         oscar.legs = 4;
//         System.out.println(oscar.legs);
//     }
// }

// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("brathes");
//     }
// }

// //Derived class
// class Mammals extends Animal {
//     int legs;
// }

// class Dog extends Mammals {
//     String breed;
// }



//Hierarchial Inheritance

// public class OOPS {
//     public static void main(String args[]) {
//         Fish fish = new Fish();
//         fish.breathe();
//         fish.color = "grey";
//         System.out.println(fish.color);

//         Mammals lion = new Mammals();
//         lion.breathe();
//         lion.legs = 4;
//         System.out.println(lion.legs);
//     }
// }
// class Animals {
//     String color;
//     int legs;

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Fish extends Animals {
//     void swim() {
//         System.out.println("swims");
//     }
// }

// class Mammals extends Animals{
//     void walk() {
//         System.out.println("walks");
//     }
// }



//function overloading(Static or run time polymorphism)

// public class OOPS {
//     public static void main(String args[]) {
//         Calculator calc = new Calculator();

//         System.out.println(calc.sum(4, 9));
//         System.out.println(calc.sum((float)1.9, (float)7.2));
//         System.out.println(calc.sum(4, 5, 6));
//     }
// }

// class Calculator {
//     int sum(int a, int b) {
//         return a+b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }



//function overriding (function overriding or dynamic)

// public class OOPS {
//     public static void main(String args[]) {
//         Deer d = new Deer();
//         d.eat();
//     }
// }

// class Animals {
//     void eat() {
//         System.out.println("eats");
//     }
// }

// class Deer extends Animals {
//     void eat() {
//         System.out.println("eats grass");
//     }
// }




//abstract class

// public class OOPS {
//     public static void main(String args[]) {
//         Horse h = new Horse();
//         h.eat();
//         h.walk();

//         Chicken c = new Chicken();
//         c.eat();
//         c.walk();
//         System.out.println(c.color);
//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {     //can have a constructor
//         color = "brown";
//     }

//     void eat() {   //non abstract method    
//         System.out.println("animal eats");
//     }
  
//     abstract void walk();   //abstract method (just idea not implementation)
// }

// class Horse extends Animal {
//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     void walk() {
//         System.out.println("walks on 2 leg");
//     }
// }



//interface

// public class OOPS {
//     public static void main(String args[]) {
//         Queen q = new Queen();
//         q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal (in all direction)");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//    public void moves() {
//         System.out.println("up, down, left, right, diagonal - (diagonal by one step)");
//     }
// }



//multiple inheritance

// public class OOPS {
//     public static void main(String[] args) {
//         // Creating a Bear object
//         Bear bear = new Bear();
        
//         // Bear acting as a herbivore
//         bear.eatPlants();
        
//         // Bear acting as a carnivore
//         bear.eatMeat();
//     }
// }

// // Interface for Herbivore
// interface Herbivore {
//     // Method specific to herbivores
//     void eatPlants();
// }

// // Interface for Carnivore
// interface Carnivore {
//     // Method specific to carnivores
//     void eatMeat();
// }

// // Bear class implementing both interfaces
// class Bear implements Herbivore, Carnivore {

//     // Implementing the method from Herbivore
//     public void eatPlants() {
//         System.out.println("Bear is eating plants and berries.");
//     }

//     // Implementing the method from Carnivore
//     public void eatMeat() {
//         System.out.println("Bear is eating fish and small animals.");
//     }
// }


