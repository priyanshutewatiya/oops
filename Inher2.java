class P{
    public void m1(){
        System.out.println("Parent");
    }
}
class C extends P{
    public void m2(){
        System.out.println("Child");
    }
}
public class Inher2 {
    public static void main(String[] args){
        P p = new C();
        p.m1();
        // p.m2();
    }
}

