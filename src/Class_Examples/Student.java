package Class_Examples;
class Students{
    String Name;
    int Age;
    String RegNo;
}

public class Student {
    public static void main(String[] args) {
        Students std = new Students();
        std.Name = "Java";
        std.Age = 50;
        std.RegNo = "fa22bcs001";
        System.out.println(std.Name);
        System.out.println(std.Age);
        System.out.println(std.RegNo);
    }

}
