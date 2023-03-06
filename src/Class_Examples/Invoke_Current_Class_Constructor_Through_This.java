package Class_Examples;
    class Hello{
        Hello(){
//            this();      //Constructor m parameter use kre ge to he axecute hoga constructor.
            System.out.println("Hello Default");
        }
        Hello(int x){
            this();
            System.out.println(x);
//            this();
        }
    }
public class Invoke_Current_Class_Constructor_Through_This {
    public static void main(String[] args) {
        Hello a = new Hello();
    }
}
