/**
 * Define class for the departments of the company
 * it is visitor of the visitor pattern
 */
public interface Department {
    /**
     *
     * @param manager
     */
    void visit(ManagerEmployee manager);

    /**
     *
     * @param general
     */
    void visit(GeneralEmployee general);

}
