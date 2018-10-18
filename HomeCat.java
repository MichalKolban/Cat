package pl.michal.Dziedziczenie2;

public class HomeCat extends Creature{

    double height;
    double walkSpeed;
    boolean isHomeCat;

    public HomeCat(){

    }

    public HomeCat(double height, double walkSpeed, boolean isHomeCat){

        this.height = height;
        this.walkSpeed = walkSpeed;
        this.isHomeCat = isHomeCat;
    }
}
