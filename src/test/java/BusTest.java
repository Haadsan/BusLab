import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){

        bus = new Bus("Glasgow", 50);
        person = new Person();

    }

    @Test

    public void busStartsEmpty(){

        assertEquals(0, bus.passengerCount());
    }
    @Test

    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test

    public void canRemovePassenger(){
        bus.addPassenger(person);
        Person result = bus.removePassenger();
        assertNotNull(result);
    }








}
