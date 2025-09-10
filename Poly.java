class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Square");
    }
    @Override
    void erase(){
        System.out.println("Erasing Square");
    }
}
class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Triangle");
    }
    @Override
    void erase(){
        System.out.println("Erasing Triangle");
    }
}
public class Poly {
    public static void main(String[]args){
        Shape s = new Circle();
        s.draw();
        s.erase();

        Shape s1 = new Square();
        s1.draw();  
        s1.erase();

        Shape s2 = new Triangle();
        s2.draw();
        s2.erase();
    }
}
