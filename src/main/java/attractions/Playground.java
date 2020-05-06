package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor people) {
        if(people.getAge() <= 15 && people.getAge() > 0){
            return true;
        }else{
            return false;
        }
    }
}
