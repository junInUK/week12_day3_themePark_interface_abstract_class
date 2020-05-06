package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor people) {
        if(people.getHeight() > 1.45 && people.getAge() > 12){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.4;
    }

    @Override
    public double priceFor(Visitor people) {
        if(people.getHeight() > 2.0){
            return defaultPrice()*2;
        }else {
            return defaultPrice();
        }
    }
}
