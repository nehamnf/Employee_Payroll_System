public class Main {
    public static void main(String[] args) {

        PayRollSystem py= new PayRollSystem();

        FullTimeEmployee f1=new FullTimeEmployee("Neha",100000);
        FullTimeEmployee f2= new FullTimeEmployee("Safi", 200000);
        PartTimeEmployee p1=new PartTimeEmployee("Zoya",5,1000);
        PartTimeEmployee p2=new PartTimeEmployee("Zyan",10,2000);

        System.out.println("-----Display details before Adding the Employee------");
        py.displayEmployees();
        System.out.println("NOTE: nothing is printed as there are no employees added");


        System.out.println("\n-----Display details After Adding the Employee------\n");
        py.addEmployee(f1);
        py.addEmployee(f2);
        py.addEmployee(p1);
        py.addEmployee(p2);
        py.displayEmployees();

        System.out.println("\n-----Display details After Removing the Employee------\n");
        py.removeEmployee(101);
        py.removeEmployee(103);
        py.displayEmployees();

    }
}