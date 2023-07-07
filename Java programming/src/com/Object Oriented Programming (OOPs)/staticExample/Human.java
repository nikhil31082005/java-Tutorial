package staticExample;

public class Human {
    int age;
    int salary;
    boolean married;
    String name;
    static int population;  // static because it does not depend on the person to person

    public Human(int age,int salary,boolean married,String name){
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.name = name;
        Human.population += 1;
    }

}
