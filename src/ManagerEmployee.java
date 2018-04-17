/**
 * Employee: Manager such as coder, front-end developers, architect and etc.
 * it is ConcreteElement of visitor pattern
 */
public class ManagerEmployee implements Employee{
    private String name;
    private int workingHours;
    //the wage here is monthly wage
    private double wage;
    //absentTime means the hours the employee being late for work or on vocate
    private int absentTime;

    public ManagerEmployee(String name, int workingHours, double wage, int absentTime){
        this.name=name;
        this.workingHours=workingHours;
        this.wage=wage;
        this.absentTime=absentTime;
    }

    @Override
    public void accept(Department department) {
        department.visit(this);
    }

    /**
     * method calculate the actual working time of the month
     * assume 30 days in a month, 30-2*4=22
     * thus, the working days is 22 days
     */
    public int getTotalWorkingHours(){
        return workingHours*22-absentTime;
    }

    /**
     * return the expected wage based on information of wage and absent time
     * define Rule: if manager employee is absent from work, he will lose 5 dollars per hour
     */
    public double getTotalWage(){
        return wage-absentTime*5;
    }

    /**
     * the followings are getter and setter methods
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getAbsentTime() {
        return absentTime;
    }

    public void setAbsentTime(int absentTime) {
        this.absentTime = absentTime;
    }
}
