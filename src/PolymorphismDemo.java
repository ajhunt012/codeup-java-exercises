class PolymorphismDemo {
    public static void doWork(Employee e) {
        System.out.println(e.work());
    }

    public static void main(String[] args) {
        Employee one = new Employee();
        Employee two = new Manager();

        doWork(one); // "Filling out TPS reports"
        doWork(two); // "Managing employees"
    }

}