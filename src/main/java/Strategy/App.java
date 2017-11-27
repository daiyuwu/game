package Strategy;

import Strategy.model.Magician;
import Strategy.model.Warrior;

/**
 * Created by TY on 2017/11/27.
 */
public class App {
    public static void main(String args[]){
        Warrior mywarrior = new Warrior();
        Magician mymagician = new Magician();

        mywarrior.attack();
    }
}
