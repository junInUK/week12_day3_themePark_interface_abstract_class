package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor sam,joe,jane;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        sam = new Visitor(11,1.5,40);
        joe = new Visitor(12,1.55,30);
        jane = new Visitor(45,1.55,50);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void visitorAge11HalfFee(){
        assertEquals(2.25, dodgems.priceFor(sam),0.01);
    }

    @Test
    public void visitorAge12DefaultFee(){
        assertEquals(4.5,dodgems.priceFor(joe),0.01);
    }

    @Test
    public void visitorAge45DefaultFee(){
        assertEquals(4.5, dodgems.priceFor(jane),0.01);
    }
}
