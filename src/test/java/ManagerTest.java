import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Big Dave", "AB288955D", 35000.00, "Cheese Sandwich");
    }

    @Test
    public void managerHasAName() {
        assertEquals("Big Dave", manager.getName());
    }

    @Test
    public void managerHasAnNINumber() {
        assertEquals("AB288955D", manager.getNatInsNumber());
    }

    @Test
    public void managerHasASalary() {
        assertEquals(35000.00, manager.getSalary(),0.1);
    }

    @Test
    public void managerHasADeptName() {
        assertEquals("Cheese Sandwich", manager.getDeptName());
    }

    @Test
    public void managerCanGetRaise() {
        assertEquals(35700.0, manager.raiseSalary(0.02), 0.01);
    }

    @Test
    public void managerCanGetBonus() {
        assertEquals(350.0, manager.payBonus(), 0.01);
    }

    @Test
    public void managerCannotGetNegativeRaise() {
        assertEquals(35000.00, manager.raiseSalary(-0.1), 0.1);
    }

    @Test
    public void canChangeNameOfManager() {
        manager.setName("Sam");
        assertEquals("Sam", manager.getName());
    }

    @Test
    public void cannotChangeNameOfManagerToNull() {
        manager.setName(null);
        assertEquals("Big Dave", manager.getName());
    }

}
