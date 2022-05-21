package test;

import com.company.model.Address;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    Address addrTest;
    final String city = "city";
    final String street = "street";
    final int building = 1;
    final int flat = 1;
    @Before
    public void setUp() throws Exception {
        addrTest = new Address(city, street, building, flat);
    }

    @After
    public void tearDown() throws Exception {
        addrTest = null;
    }

    @Test
    public void getCity() {
        assertEquals("city setup error", city, addrTest.getCity());
    }

    @Test
    public void setCity() {
        addrTest.setCity(city);
        assertEquals("city get error", addrTest.getCity(), city);
    }

    @Test
    public void getStreet() {
        assertEquals("street setup error", street, addrTest.getStreet());
    }

    @Test
    public void setStreet() {
        addrTest.setStreet(street);
        assertEquals("street get error", addrTest.getStreet(), street);
    }

    @Test
    public void getBuilding() {
        assertEquals("building setup error", building, addrTest.getBuilding());
    }

    @Test
    public void setBuilding() {
    }

    @Test
    public void getFlat() {
    }

    @Test
    public void setFlat() {
    }

    @Test
    public void testToString() {
    }
}