package strategy.model;

import strategy.trait.Base;

/**
 * Created by TY on 2017/11/27.
 */
public class Character implements Base {

    @Override
    public void attack() {
        System.out.println("Attack !!");
    }

    @Override
    public void defend() {
        System.out.println("Defend !!");
    }
}
