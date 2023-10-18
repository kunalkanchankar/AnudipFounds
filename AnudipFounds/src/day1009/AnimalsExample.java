package day1009;

class Animal {
 public void info() {
     System.out.println("This is an animal.");
 }
}

class Mammal extends Animal {
 public void mammalInfo() {
     System.out.println("This is a mammal.");
 }
}

class Reptile extends Animal {
 public void reptileInfo() {
     System.out.println("This is a reptile.");
 }
}

class Dog extends Mammal {
 public void dogInfo() {
     System.out.println("This is a dog.");
 }
}

public class AnimalsExample {
 public static void main(String[] args) {
     Reptile reptile = new Reptile();
     Dog dog = new Dog();

     dog.info();       
     dog.mammalInfo(); 
     reptile.reptileInfo();
     dog.dogInfo();       
 }
}
