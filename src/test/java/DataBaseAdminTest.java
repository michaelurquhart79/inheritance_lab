import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {
    DataBaseAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DataBaseAdmin("Gee Atherton", "GB123", 24000.00);

    }

    @Test
    public void dbAdminHasName() {
        assertEquals("Gee Atherton", dbAdmin.getName());
    }

    @Test
    public void dbAdminHasNINumber() {
        assertEquals("GB123", dbAdmin.getNatInsNumber());
    }

    @Test
    public void abAdminHasSalary() {
        assertEquals(24000.00, dbAdmin.getSalary(), 0.1);
    }

    @Test
    public void dbAdminCanGetRaise() {
        assertEquals(26400.00, dbAdmin.raiseSalary(0.1), 0.1);
    }

    @Test
    public void dbAdminCanGetBonus() {
        assertEquals(240.0, dbAdmin.payBonus(), 0.1);
    }
}
