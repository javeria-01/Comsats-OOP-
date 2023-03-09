package Class_Examples;

public class Studenttt extends Person {
    private int graduationyear = 2018;

    public static void main(String[] args) {
        Studenttt myobj = new Studenttt();
        System.out.println("Name: " + myobj.name);
        System.out.println("Email: " + myobj.email);
        System.out.println("age: " + myobj.age);
        System.out.println("Graduation year is: "+myobj.graduationyear);
    }
}
