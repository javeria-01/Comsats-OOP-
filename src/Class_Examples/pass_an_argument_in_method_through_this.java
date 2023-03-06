package Class_Examples;
    class Student2{
        void hello_function(Student2 obj){
            System.out.println("aDRESS OF OBJ IS "+obj);
//            System.out.println("The method is invoked");
        }
        void Hi_function(){
            hello_function(this);
        }
    }
public class pass_an_argument_in_method_through_this {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.Hi_function();
        System.out.println("Adress of s1 "+s1);
    }
}
