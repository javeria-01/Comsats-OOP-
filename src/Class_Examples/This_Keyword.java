package Class_Examples;

public class This_Keyword {
    int x = 10;
    public This_Keyword(){
        int x =15;
//       this.x = x;              If you remove this x so anwer will be zero
        System.out.println("Value of x is " +this.x);
    }

    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword();
//        System.out.println("Value of x is " +x);
    }
}
//This is a concept of shaddow.