package strategy.cenes.choose;

import strategy.model.GameLogFile;
import strategy.model.Magician;
import strategy.model.Warrior;
import strategy.trait.Choosable;

public class JobChoose extends BaseChoose {

    final String WARRIOR = "1";
    final String MAGICIAN = "2";

    @Override
    public void init() {
        allowInputs.add(WARRIOR);
        allowInputs.add(MAGICIAN);
        userInterface.showTip("選擇職業");
    }

    @Override
    public String showTipAndInput() {
        userInterface.showTip("(1)戰士 (2)法師");
        String inputData = userInterface.input().toUpperCase();
        choose(inputData);
        baseChoose(inputData);
        return inputData;
    }

    @Override
    public void choose(String inputData) {
        switch (inputData) {
            case WARRIOR:
                GameLogFile.character = new Warrior();
                break;
            case MAGICIAN:
                GameLogFile.character = new Magician();
                break;
        }
    }

    @Override
    public void nextScenes() {
        System.out.println("JobChoose.nextScenes()");
        new ActionChoose().readyToChoose();
    }

    @Override
    public void preScenes() {
//        new CreateCharacterChoose().readyToChoose();
    }
}
