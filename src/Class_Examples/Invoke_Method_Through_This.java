package Class_Examples;

class A{
        void m(){
            System.out.println("Hello m");
        }
        void n(){
            System.out.println("Hello n");
            this.m();
        }
    }
public class Invoke_Method_Through_This {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
