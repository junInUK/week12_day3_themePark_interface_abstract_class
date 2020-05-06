import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    private ThemePark themePark;
    private Attraction dodgems;
    private Stall iceCreamStall;
    private Visitor sam;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4,5);
        sam = new Visitor(25,1.75,50);
        themePark.addAttraction(dodgems);
        themePark.addStall(iceCreamStall);
    }

    @Test
    public void themeParkCanGetAttractionsAndStalls(){
        assertEquals(1,themePark.getAttractions().size());
        assertEquals(1,themePark.getStalls().size());
    }

    @Test
    public void themeParkCanGetReviewed(){
        assertEquals(2,themePark.getAllReviewed().size());
    }

    @Test
    public void visitorCanVisitAttraction(){
        themePark.visit(sam,dodgems);
        assertEquals(1,sam.getVisitedAttractions().size());
        assertEquals(1,dodgems.getVisitCount());
    }

    @Test
    public void themeParkCanCheckAllReviews(){
        HashMap<String,Integer> hProducts = themePark.getAllReviews();
        assertEquals(5,hProducts.get("Bumper Cars").intValue());
        assertEquals(5,hProducts.get("Dream Cones").intValue());
    }
}
