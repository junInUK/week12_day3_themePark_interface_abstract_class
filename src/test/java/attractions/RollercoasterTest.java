package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor sam,lily,joe,alex,bob,george,lucy;

    @Before
    public void setUp() {
        sam = new Visitor(13,1.50,50);
        lily = new Visitor(15,1.45,40);
        joe = new Visitor(16,1.44, 20);
        alex = new Visitor(12, 1.50, 30);
        bob = new Visitor(9,1.40,30);
        george = new Visitor(25,2.1,50);
        lucy = new Visitor(30,2.0,60);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitor150AND13Allow(){
        assertEquals(true, rollerCoaster.isAllowedTo(sam));
    }

    @Test
    public void visitor145NotAllow(){
        assertEquals(false,rollerCoaster.isAllowedTo(lily));
    }

    @Test
    public void visitor144NotAllow(){
        assertEquals(false,rollerCoaster.isAllowedTo(joe));
    }

    @Test
    public void visitorAge12NotAllow(){
        assertEquals(false,rollerCoaster.isAllowedTo(alex));
    }

    @Test
    public void visitorAge9NotAllow(){
        assertEquals(false,rollerCoaster.isAllowedTo(bob));
    }

    @Test
    public void visitorOver2MDoubleFee(){
        assertEquals(16.8,rollerCoaster.priceFor(george),0.01);
    }

    @Test
    public void visitor2MDefaultFee(){
        assertEquals(8.4, rollerCoaster.priceFor(lucy),0.01);
    }

    @Test
    public void visitor144DefaultFee(){
        assertEquals(8.4, rollerCoaster.priceFor(joe),0.01);
    }
}
