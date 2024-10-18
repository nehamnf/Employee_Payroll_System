public class FullTimeEmployee extends Employee{

    private int monthlySalary;

    public FullTimeEmployee(String name,int monthlySalary){
        super(name);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
