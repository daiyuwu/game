package strategy.cenes.choose;

import strategy.trait.Choosable;

public class CreateCharacterChoose extends BaseChoose implements Choosable {

    final String JOB = "1";
    final String RACE = "2";

    @Override
    public void init() {
        allowInputs.add(JOB);
        allowInputs.add(RACE);
        userInterface.showTip("開始創建角色");
    }

    @Override
    public String choose() {
        userInterface.showTip("(1)職業 (2)種族");
        String inputData = userInterface.input().toUpperCase();
        baseChoose(inputData);
        switch (inputData) {
            case JOB:
                new JobChoose().readyToChoose();
                break;
            case RACE:
                System.exit(1);
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
        new MainChoose().readyToChoose();
    }
}
