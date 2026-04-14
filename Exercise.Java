// TODO: Create a class called Employee
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }
}

public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee obj1 = new Employee("Alice", 50000.0);
        Employee obj2 = new Manager("Bob", 80000.0, "IT");

        // TODO: Print their details using getDetails()
        System.out.println(obj1.getDetails());
        System.out.println(obj2.getDetails());
    }
}