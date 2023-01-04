public class Employee {
    //public String final work() { /// prohibits all inheritance
    public String work() {
        return "Filling out TPS reports";
    }
}

//class Employee extends Person {
//    private double salary;
//    public void doWork() {
//        System.out.println("Work, work...");
//    }
//    // method overriding
//    public void sayHello() {
//        System.out.println("How can I help you?");
//    }
//
//    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
//
//        person.sayHello();   // "Hello, World!"
//        employee.sayHello(); // "How can I help you?"
//    }
//
//}

//class Employee extends Person {
//
//    public String getName() {
//        return this.name;
//    }
//
//    public int getAge() {
//        // ERROR!
//        return this.age;
//    }
//
//}

//    private double salary;
//    public void doWork() {
//        System.out.println("Work, work...");
//    }
//
//    public void sayHello() {
//        System.out.println("How can I help you?");
//    }
//
//    public static void main(String[] args) {
//        Person person1 = new Person();
//        Employee employee1 = new Employee();
//
//        person1.sayHello(); // prints "Hello, World!"
//        employee1.sayHello(); // "How can I help you?"
//        employee1.doWork(); // prints "Work, work..."
//    }
//}

//class Employee extends Person {
//    public Employee(String employeeName){
//        super(employeeName);
//    }
//
//    public static void main(String[] args) {
//        Employee john = new Employee("Paul");
//        john.sayHello();
//        System.out.println(john.name);
//    }
//}