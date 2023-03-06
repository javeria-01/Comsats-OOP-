package Class_Examples;
    class B{
        A4 obj;
        B(A4 x){
            this.obj=x;
            System.out.println("Adreess of x "+x);
        }
        void display(){
            System.out.println(obj.data);
        }
    }
    class A4{
        int data = 10;
        A4(){
            B b = new B(this);
            System.out.println("Adress of b " +b);
            b.display();
        }
    }
public class Pass_an_argument_in_constructor_call {
    public static void main(String[] args) {
        A4 a = new A4();
    }
}
//This is the example of copy constructor.