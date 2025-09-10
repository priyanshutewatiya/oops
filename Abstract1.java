abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}

class Abstract1{
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        a.sound();

        Animal b= new Cat();
        b.eat();    
        b.sound();
    }
}