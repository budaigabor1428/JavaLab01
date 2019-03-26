import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before() {
        busStop = new BusStop("Leith");
        person = new Person();
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueCount());
    }
}
