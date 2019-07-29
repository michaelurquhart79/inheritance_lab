package staff;

public abstract class Employee {
    private String name;
    private String natInsNumber;
    private double salary;

    public Employee(String name, String natInsNumber, double salary) {
        this.name = name;
        this.natInsNumber = natInsNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNatInsNumber() {
        return natInsNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise) {
        this.salary = this.salary * (1 + raise);
        return this.salary;
    }

    public double payBonus() {
        return (0.01 * this.salary);
    }
}
