package strategy.model;

/**
 * Created by TY on 2017/11/27.
 */
public class Magician extends Character {

    public Magician() {
        System.out.println("magician !");
    }

    @Override
    public void attack() {
        System.out.println("Magic Attack !!");
    }

    @Override
    public void defend() {
        System.out.println("Magic Defend !!");
    }
}
