package strategy.cenes.choose;

public class CreateCharacterChoose extends BaseChoose {

    final String JOB = "1";
    final String RACE = "2";

    @Override
    public void init() {
        allowInputs.add(JOB);
        allowInputs.add(RACE);
        userInterface.showTip("開始創建角色");
    }

    @Override
    public void showTip() {
        userInterface.showTip("(1)職業 (2)種族");
    }

    @Override
    public void options(String inputData) {
        switch (inputData) {
            case JOB:
                new JobChoose().readyToChoose();
                break;
            case RACE:
                System.exit(1);
                break;
        }
    }

    @Override
    public void nextScenes() {
        System.out.println("CreateCharaterChoose.nextScenes()");
        new ActionChoose().readyToChoose();
    }

    @Override
    public void preScenes() {
//        new MainChoose().readyToChoose();
    }
}
