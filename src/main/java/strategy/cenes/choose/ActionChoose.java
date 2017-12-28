package strategy.cenes.choose;

import strategy.model.GameLogFile;
import strategy.trait.Choosable;

public class ActionChoose extends BaseChoose implements Choosable {

    final String ATTACK = "1";
    final String DEFEND = "2";

    @Override
    public void init() {
        allowInputs.add(ATTACK);
        allowInputs.add(DEFEND);
        userInterface.showTip("選擇行動");
    }

    @Override
    public String choose() {
        userInterface.showTip("(1)攻擊 (2)防禦");
        String inputData = userInterface.input().toUpperCase();
        baseChoose(inputData);
        switch (inputData) {
            case ATTACK:
                GameLogFile.character.attack();
                break;
            case DEFEND:
                GameLogFile.character.defend();
                break;
        }
        return inputData;
    }

    @Override
    public void nextScenes() {
        choose();
    }

    @Override
    public void preScenes() {
        new JobChoose().readyToChoose();
    }
}
