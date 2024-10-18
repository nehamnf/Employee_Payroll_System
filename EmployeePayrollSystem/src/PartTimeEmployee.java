public class PartTimeEmployee extends Employee{
    private int  hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, int hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate);
    }
}
