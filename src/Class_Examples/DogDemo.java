package Class_Examples;

public class DogDemo {
    public static void main(String[] args) {
        Dog balto = new Dog();
        balto.name = "Balto";
        balto.bread = "Siberian Husky";
        balto.writeOutput();
        Dog scooby = new Dog();
        scooby.name = "scooby";
        scooby.age = 42;
        scooby.bread = "Great Dane";
        System.out.println(scooby.name+"is a "+scooby.bread+".");
        System.out.println("He is "+scooby.age+"years old,or");
        int humanYears = scooby.getAgeInHumanYear();
        System.out.println();
    }
}

