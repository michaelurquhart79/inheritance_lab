import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director dir;

    @Before
    public void before() {
        dir = new Director("Jim", "NI1", 50000.0, "Interior", 250000.00);
    }

    @Test
    public void dirHasName() {
        assertEquals("Jim", dir.getName());
    }

    @Test
    public void dirHasNINumber() {
        assertEquals("NI1", dir.getNatInsNumber());
    }

    @Test
    public void dirHasSalary() {
        assertEquals(50000.00, dir.getSalary(), 0.1);
    }

    @Test
    public void dirHasDept() {
        assertEquals("Interior", dir.getDeptName());
    }

    @Test
    public void dirHasBudget() {
        assertEquals(250000.0, dir.getBudget(), 0.1);
    }

    @Test
    public void dirCanGetRaise() {
        assertEquals(55000.00, dir.raiseSalary(0.1), 0.1);
    }

    @Test
    public void dirCanGetBonus() {
        assertEquals(500.00, dir.payBonus(), 0.1);
    }
}
