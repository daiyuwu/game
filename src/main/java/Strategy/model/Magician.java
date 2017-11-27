package Strategy.model;

/**
 * Created by TY on 2017/11/27.
 */
public class Magician extends Character {
    @Override
    public void attack() {
        System.out.println("Attack of magic !!");
    }

    @Override
    public void defend() {
        System.out.println("Defend of magic !!");
    }
}
