/**
 * Concrete visitor: accounting department of the company
 * the main job of accounting department is to calculate the actual wage of employees
 */

public class AccountingDept implements Department{
    /**
     * access the actual wage of ManagerEmployee
     * @param manager
     */
    @Override
    public void visit(ManagerEmployee manager) {
        double totalWage=manager.getTotalWage();
        System.out.println(//"Paystub for Manager Employee"+"\n"
        "Manager: "+manager.getName()+ ", monthly wage: $"+manager.getWage()+", "
        +" absent time: "+manager.getAbsentTime()+" hours,"
        +" actual wage: "+manager.getTotalWage()+"\n"
        );

    }

    @Override
    public void visit(GeneralEmployee general) {
        double totalWage=general.getTotalWage();
        System.out.println(//"Paystub for General Employee"+"\n"
                "General Employee: "+general.getName()+ ", monthly wage: $"+general.getWage()+", "
                +" absent time: "+general.getAbsentTime()+" hours,"
                +" actual wage: "+general.getTotalWage()+"\n"
        );

    }
}
