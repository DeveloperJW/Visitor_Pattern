
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testActualWage1() {
        AccountingDept accountingDept=new AccountingDept();
        ManagerEmployee manager1=new ManagerEmployee("Justin Wang",8,17000,5);
        manager1.accept(accountingDept);
        assertEquals(manager1.getAbsentTime(),5);
        assertEquals(manager1.getTotalWage(),16975);

    }

    @org.junit.jupiter.api.Test
    void testActualWage2() {
        AccountingDept accountingDept=new AccountingDept();
        ManagerEmployee manager2=new ManagerEmployee("Renee Xu",8,17000,6);
        manager2.accept(accountingDept);
        assertEquals(manager2.getAbsentTime(),6);
        assertEquals(manager2.getTotalWage(),16970);
    }
}