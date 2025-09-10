abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}
class MathOp{
    int add(int a , int b){
        return a+b;
    }
    double add(double a , double b){
        return a+b;
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal a1 = new Cat();
        a1.sound();

        MathOp m = new MathOp();
        System.out.println(m.add(5.5,10.5));
        System.out.println(m.add(5,10));
    }
}
