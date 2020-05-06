import attractions.Attraction;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;
import stalls.Stall;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewedProducts = new ArrayList<IReviewed>();
        for(IReviewed attraction : this.attractions){
            reviewedProducts.add(attraction);
        }
        for(IReviewed stall : this.stalls){
            reviewedProducts.add(stall);
        }
        return reviewedProducts;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount() + 1);
        visitor.visitAttraction(attraction);
    }

    public HashMap<String,Integer> getAllReviews(){
        ArrayList<IReviewed> allReviewedProducts = new ArrayList<IReviewed>();
        for(Attraction attraction : this.attractions){
            allReviewedProducts.add(attraction);
        }
        for(Stall stall : this.stalls){
            allReviewedProducts.add(stall);
        }
        HashMap<String,Integer> hProducts = new HashMap<String, Integer>();
        for(IReviewed reviewedProduct: allReviewedProducts){
            hProducts.put(reviewedProduct.getName(),reviewedProduct.getRating());
        }
        return hProducts;
    }

//    public ArrayList<ISecurity> getAllAllowedProducts(Visitor people){
//        ArrayList<ISecurity> allAllowedProducts = new ArrayList<ISecurity>();
//        for(Attraction attraction : this.attractions){
//            if(attraction.)
//        }
//    }
}
