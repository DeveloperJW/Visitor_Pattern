import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        System.out.println("*******************Noogle Company***************"+"\n");
        List<Employee> employeeList=new ArrayList<Employee>();
        Employee manager1,manager2,employee1,employee2,employee3;
        //initiate managers
        manager1=new ManagerEmployee("Justin Wang",8,17000,5);
        manager2=new ManagerEmployee("Renee Xu",8,17000,6);
        //initiate general employees
        employee1=new GeneralEmployee("Justin Timberlake",8,8000,10);
        employee2=new GeneralEmployee("Taylor Swift",8,7000,8);
        employee3=new GeneralEmployee("Jessica J.",8,7000,2);

        //added employees to list
        employeeList.add(manager1);
        employeeList.add(manager2);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //
        AccountingDept accountingDept=new AccountingDept();
        for (Employee employee:employeeList){
            employee.accept(accountingDept);
        }

        //
        HRDept hrDept=new HRDept();
        for (Employee employee:employeeList){
            employee.accept(hrDept);
        }

    }
}