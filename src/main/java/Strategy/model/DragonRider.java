package Strategy.model;

import Strategy.trait.IFly;

/**
 * Created by TY on 2017/11/27.
 */
public class DragonRider extends Character implements IFly {

    @Override
    public void fly() {
        System.out.println("Fly !!");
    }
}
