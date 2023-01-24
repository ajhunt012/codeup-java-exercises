class person {
    private final String name;

    public person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class employee extends person {
    private final String department;

    public employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
class CompanyApp {
    public static void main(String[] args) {
        employee emp = new employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + " works in " + emp.getDepartment());
    }
}