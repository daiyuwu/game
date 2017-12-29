package strategy.cenes.choose;

import strategy.model.GameLogFile;

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
    public void showTip() {
        userInterface.showTip("(1)攻擊 (2)防禦");
    }

    @Override
    public void options(String inputData) {
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
        readyToChoose();
//        this.choose();
    }

    @Override
    public void preScenes() {
//        new JobChoose().readyToChoose();
    }
}
