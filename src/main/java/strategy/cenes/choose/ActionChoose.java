package strategy.cenes.choose;

import strategy.model.GameLogFile;
import strategy.model.Magician;
import strategy.model.Warrior;
import strategy.trait.Choosable;

public class ActionChoose extends BaseChoose {

    final String ATTACK = "1";
    final String DEFEND = "2";

    @Override
    public void init() {
        allowInputs.add(ATTACK);
        allowInputs.add(DEFEND);
        userInterface.showTip("選擇行動");
    }

    @Override
    public String showTipAndInput() {
        userInterface.showTip("(1)攻擊 (2)防禦");
        String inputData = userInterface.input().toUpperCase();
        choose(inputData);
        baseChoose(inputData);
        return inputData;
    }

    @Override
    public void choose(String inputData) {
        switch (inputData) {
            case ATTACK:
                GameLogFile.character.attack();
                break;
            case DEFEND:
                GameLogFile.character.defend();
                break;
        }
    }

    @Override
    public void nextScenes() {
        System.out.println("ActionChoose.nextScenes()");
        readyToChoose();
//        this.showTipAndInput();
    }

    @Override
    public void preScenes() {
//        new JobChoose().readyToChoose();
    }
}
