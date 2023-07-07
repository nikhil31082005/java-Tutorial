package staticExample;

public class Main {
    public static void main(String[] args) {
        // Human kunal = new Human(23,10000,true,"Kunal");
        // Human rohit = new Human(34,15000,false,"Rohit");
        // Human arpit = new Human(45,20000,true,"Arpit");

        // System.out.println(Human.population);  // It is recommonded that to use this instead of using next three.
        // System.out.println(kunal.population);
        // System.out.println(rohit.population);
        // System.out.println(arpit.population);

        // greeting();   // Cannot make a static reference to the non-static method greeting() from the type MainJava(603979977)



    }

    // void fun(){
    //     namaste();  // we can use a static method inside non-static method
    //     greeting();
    // }

    void greeting(){
        System.out.println("It is awesome");
    }
 
    static void namaste(){
        
        // greeting();  we can't use

        Main obj = new Main();
        obj.greeting();

    }
}
