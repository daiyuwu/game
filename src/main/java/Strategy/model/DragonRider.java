package Strategy.model;

import Strategy.trait.Fly;

/**
 * Created by TY on 2017/11/27.
 */
public class DragonRider extends Character implements Fly {

    @Override
    public void fly() {
        System.out.println("Fly !!");
    }
}
