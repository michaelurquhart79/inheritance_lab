import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sam Hill", "NAT15", 26000.0);
    }

    @Test
    public void developerHasName() {
        assertEquals("Sam Hill", developer.getName());
    }

    @Test
    public void developerHasNINumber() {
        assertEquals("NAT15", developer.getNatInsNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(26000.0, developer.getSalary(),0.1);
    }

    @Test
    public void developerCanGetRaise() {
        assertEquals(27300.0, developer.raiseSalary(0.05), 0.1);
    }

    @Test
    public void developerCanGetBonus() {
        assertEquals(260.0, developer.payBonus(), 0.1);
    }
}
