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
public class Inher1 {
    public static void main(String[] args){
        C c1 = new C();
        c1.m1();
        c1.m2();
    }
}
