/**
 * Define an interface for the employee of the company
 * it is Element of Visitor Pattern
 */
public interface Employee {
    /**
     * call or accept a visitor
     * in this project we have department as visitor
     */
    public void accept(Department department);
}
