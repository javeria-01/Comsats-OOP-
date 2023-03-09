package Class_Examples;

class Studentt {
    public String name;
    private double Cgpa;
    public void display(String Std_name, double std_Cgpa) {
        name = Std_name;
        Cgpa = std_Cgpa;
        System.out.println("Name is " + name);
        System.out.println("Cgpa is " + Cgpa);
    }
    public static void main(String[] args) {
        Studentt obj = new Studentt();
        obj.display("Ali", 3.5);
        obj.name = "imran";
        System.out.println("Second name is"+ obj.name);
    }
}