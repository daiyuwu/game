package strategy.model;

/**
 * Created by TY on 2017/11/27.
 */
public class Warrior extends Character {

    public Warrior() {
        System.out.println("warrior !");
    }

    @Override
    public void attack() {
        System.out.println("Strong Attack !!");
    }

    @Override
    public void defend() {
        System.out.println("Strong Defend !!");
    }
}
