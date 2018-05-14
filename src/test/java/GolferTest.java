import models.Golfer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GolferTest {

    Golfer golfer1;
    Golfer golfer2;

    @Before
    public void before(){
        golfer1 = new Golfer("Jack", "Nicklaus", 80);
        golfer2 = new Golfer("Tiger", "Woods", 45);
    }

    @Test
    public void canGetFirstName(){
        assertEquals("Jack", golfer1.getFirstName());
    }

    @Test
    public void canGetSurname(){
        assertEquals("Woods", golfer2.getLastName());
    }

    @Test
    public void canGetAge(){
        assertEquals(80, golfer1.getAge());
    }
}
