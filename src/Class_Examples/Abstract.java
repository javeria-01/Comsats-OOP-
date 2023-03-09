package Class_Examples;
abstract class Perrson {
    public String name = "Kim taeyung";

    public abstract void Study();         //Ese likhe ge to error aye ga bcz function ki body ni h.
//    But yhi function extend k bd likhe ge to error ni aye ga or ise function override kehte.
}
class Std extends Perrson{
    public void Study(){
        System.out.println("Bts Army Member");
    }

    public static void main(String[] args) {
        Std obj1 = new Std();
//        Perrson obj2 = new Perrson();  Abstract calss ka object ni bnta or final ko extends ni kr skte.
        System.out.println("Abstract class Extends! ");
        System.out.println("Bts Member name is: "+obj1.name);

//Agr class abstact ni h to method abstract ni hoga or abstract hm sirf class or method k sath lga skte
//agr class abstract h to mrzi h methos abstract krna ya ni.
    }
}