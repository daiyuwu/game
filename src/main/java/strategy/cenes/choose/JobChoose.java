package strategy.cenes.choose;

import strategy.model.GameLogFile;
import strategy.model.Magician;
import strategy.model.Warrior;
import strategy.trait.Choosable;

public class JobChoose extends BaseChoose implements Choosable {

    final String WARRIOR = "1";
    final String MAGICIAN = "2";

    @Override
    public void init() {
        allowInputs.add(WARRIOR);
        allowInputs.add(MAGICIAN);
        userInterface.showTip("選擇職業");
    }

    @Override
    public String choose() {
        userInterface.showTip("(1)戰士 (2)法師");
        String inputData = userInterface.input().toUpperCase();
        baseChoose(inputData);
        switch (inputData) {
            case WARRIOR:
                GameLogFile.character = new Warrior();
                break;
            case MAGICIAN:
                GameLogFile.character = new Magician();
                break;
        }
        return inputData;
    }

    @Override
    public void nextScenes() {
        new ActionChoose().readyToChoose();
    }

    @Override
    public void preScenes() {
        new CreateCharacterChoose().readyToChoose();
    }
}
