public class introduction {
    public static void main(String[] args) {
        // Student kunal = new Student(15,"kunal",67.8f);  // constructor
        // Student rahul = new Student(23,"rahul",87.5f);
        // kunal.roll = 23;
        // kunal.name = "Kunal Kushwah";
        // kunal.marks = 88.5f;

        // kunal.changename("shoe lover");
        // kunal.greeting();

        // System.out.println(kunal.roll);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);
        // System.out.println();
        // System.out.println(rahul.roll);
        // System.out.println(rahul.name);
        // System.out.println(rahul.marks);

        // Student random = new Student();
        // System.out.println(random.roll);
        // System.out.println(random.name);
        // System.out.println(random.marks);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        System.out.println(two.name);
        System.out.println(one.name);

        one.name = "Something something";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}

class Student{
    int roll;  // default value of int is 0
    String name;  // default value for String is null
    // float marks;
    float marks = 90;  // default value for float is 0.0 and for boolean is false

    // we need a way to add the value of the above properties object by object
    //we need one word to access every object
    
    // Student(){
    //     this.roll = 36;
    //     this.name = "Kunal Kushwah";
    //     this.marks = 88.5f;
    // }

    // void greeting(){
    //     System.out.println("Hello! My name is " + this.name); // output is same
    //     System.out.println("Hello! My name is " + name);
    // }

    // void changename(String newname){
    //     name = newname;
    // }

    // Student (Student other){
    //     this.roll = other.roll;
    //     this.name = other.name;
    //     this.marks = other.marks;
    // }

    Student () {
        this (13,"default name",87.6f);
    }

    Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
