package strategy.cenes.choose;

import strategy.model.GameLogFile;
import strategy.model.Magician;
import strategy.model.Warrior;

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
    public void showTip() {
        userInterface.showTip("(1)戰士 (2)法師");
    }

    @Override
    public void options(String inputData) {
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
    public void gotoNextScenes() {
        setNextScenes(new ActionChoose());
    }

    @Override
    public void gotoPreScenes() {
        setNextScenes(new CreateCharacterChoose());
    }
}
