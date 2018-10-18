package pl.michal.Dziedziczenie2;

public class Main {

    public static void main(String[] args) {


        Creature creature = new Creature(10,10,true);

        HomeCat homeCat = new HomeCat(25,60,true);

        Cheetah cheetah = new Cheetah(100,100,true);


        System.out.println(creature.isHomeCat);

        System.out.println(homeCat.isHomeCat);

        System.out.println(cheetah.isHomeCat);
    }
}
