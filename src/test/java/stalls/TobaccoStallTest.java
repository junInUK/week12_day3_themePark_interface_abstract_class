package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor sam,joe,jane;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1,3);
        sam = new Visitor(17,1.8,50);
        joe = new Visitor(18,1.85,40);
        jane = new Visitor(46,1.65,100);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void vistorAge17NotAllow(){
        assertEquals(false,tobaccoStall.isAllowedTo(sam));
    }

    @Test
    public void vistorAge18Allow(){
        assertEquals(true,tobaccoStall.isAllowedTo(joe));
    }

    @Test
    public void vistorAge46Allow(){
        assertEquals(true, tobaccoStall.isAllowedTo(jane));
    }
}
