package Class_Examples;

public class Dog {
    public String name;
    public String bread;
    public int age;

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Bread " + bread);
        System.out.println("Age in calender years " + age);
        System.out.println("Age in human years " + getAgeInHumanYear());
        System.out.println();
    }

    public int getAgeInHumanYear() {
        int humanAge = 0;
        if (age <= 2) {
            humanAge = age * 11;
        } else {
            humanAge = 22 + ((age - 2) * 5);
        }
        return humanAge;
    }
}

