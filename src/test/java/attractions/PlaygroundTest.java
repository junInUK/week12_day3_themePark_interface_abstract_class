package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor sam,lily,john,alex,bob;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        sam = new Visitor(-1,0.1,0);
        lily = new Visitor(0,0.2,0);
        john = new Visitor(1,0.3, 10);
        alex = new Visitor(15, 1.7,50);
        bob = new Visitor(16,1.75,60);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void vistorAgeLessThanZeroNotAllow(){
        assertEquals(false, playground.isAllowedTo(sam));
    }

    @Test
    public void vistorAgeZeroNotAllow(){
        assertEquals(false,playground.isAllowedTo(lily));
    }

    @Test
    public void vistorAge1Allow(){
        assertEquals(true, playground.isAllowedTo(john));
    }

    @Test
    public void vistorAge15Allow(){
        assertEquals(true, playground.isAllowedTo(alex));
    }

    @Test
    public void vistorAge16NotAllow(){
        assertEquals(false,playground.isAllowedTo(bob));
    }
}
