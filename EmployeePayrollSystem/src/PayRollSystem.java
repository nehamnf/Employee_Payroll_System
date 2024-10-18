import java.util.ArrayList;
import java.util.List;

public class PayRollSystem {
    private List<Employee> employeeList;

    public PayRollSystem(){
        this.employeeList= new ArrayList<>();
    }

    public  void addEmployee(Employee e){
        employeeList.add(e);
    }

    public  void removeEmployee(int id){

        Employee temp=null;
        //employeeList.removeIf(e -> e.getId() == id);
        for(Employee e:employeeList){
            if (e.getId() == id){
                temp=e;
            }
        }
        if(temp != null){
            employeeList.remove(temp);
        }
    }

    public void displayEmployees(){
        for(Employee e:employeeList){
            System.out.println(e);
        }
    }
}
