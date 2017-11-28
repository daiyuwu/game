package Strategy.model;

import Strategy.trait.IBase;

/**
 * Created by TY on 2017/11/27.
 */
public class Character implements IBase {

    @Override
    public void attack() {
        System.out.println("Attack !!");
    }

    @Override
    public void defend() {
        System.out.println("Defend !!");
    }
}
