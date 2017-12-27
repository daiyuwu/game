package Strategy;

import Strategy.flow.Lodge;
import Strategy.flow.MainScreen;
import Strategy.model.GameLogFile;

/**
 * Created by TY on 2017/11/27.
 */
public class App {
    public static void main(String args[]){
//        Lodge lodge = new Lodge();
//        lodge.test();
        MainScreen.start();
        Lodge lodge = new Lodge();
        lodge.createCharacter();
        lodge.action();
    }
}
