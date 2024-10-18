public abstract class Employee {
    private String name;
    private  int id=100;
    private static int idCounter = 100;

    public Employee(String name){
        this.name=name;
        this.id=idCounter++;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return  this.id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee[name= " + name + ", id= " + id + ", salary= " + calculateSalary() + "]";
    }
}
