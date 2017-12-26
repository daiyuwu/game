package Strategy;

import Strategy.model.CliUserInterface;
import Strategy.model.FileUserInterface;
import Strategy.model.Magician;
import Strategy.model.Warrior;
import Strategy.trait.UserInterface;

/**
 * Created by TY on 2017/11/27.
 */
public class App {
    public static void main(String args[]){
//        Warrior mywarrior = new Warrior();
//        Magician mymagician = new Magician();

//        mywarrior.attack();
        UserInterface userInterface = new FileUserInterface();

        userInterface.showTip("輸入：");
        String inputData = userInterface.input();
        userInterface.showTip("輸入的句子為：");
        userInterface.output(inputData);
    }
}
