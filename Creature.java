package pl.michal.Dziedziczenie2;

public class Creature {


    double height;
    double walkSpeed;
    boolean isHomeCat;

    public Creature(){

    }

    public double getHeight(){
        return height;
    }
    public double getWalkSpeed(){
        return walkSpeed;
    }
    public boolean isHomeCat(){
        return isHomeCat;
    }

    public Creature(double hight, double walkSpeed, boolean isHomeCat){

        this.height = height;
        this.walkSpeed = walkSpeed;
        this.isHomeCat = isHomeCat;
    }
}
