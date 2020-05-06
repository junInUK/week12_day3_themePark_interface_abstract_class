package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 4.5;
    }

    @Override
    public double priceFor(Visitor people) {
        if(people.getAge() < 12){
            return defaultPrice()/2;
        }else{
            return defaultPrice();
        }
    }
}
