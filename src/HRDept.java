/**
 * Concrete Visitor: Human resource department of the company
 * The main purpose for HR dept is to calculate the actual working hours of employees
 */
public class HRDept implements Department{

    @Override
    public void visit(ManagerEmployee manager) {
        //manager.getTotalWorkingHours();
        System.out.println(//"Timesheet for Manager Employee"+"\n"
                "Manager: "+manager.getName()
                +", absent time: "+manager.getAbsentTime()+" hours,"
                +" total working time (in hours): "+manager.getTotalWorkingHours()+" hours." +"\n"
        );
    }

    @Override
    public void visit(GeneralEmployee general) {
        //general.getTotalWorkingHours();
        System.out.println(//"Timesheet for General Employee"+"\n"
                "General Employee: "+general.getName()
                +", absent time: "+general.getAbsentTime()+" hours,"
                +" total working time (in hours): "+general.getTotalWorkingHours()+" hours."+"\n"
        );

    }
}
