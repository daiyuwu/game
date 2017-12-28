package strategy.cenes.choose;

import strategy.model.CliUserInterface;
import strategy.trait.Choosable;
import strategy.trait.UserInterface;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseChoose implements Choosable {
    public UserInterface userInterface = new CliUserInterface();
    public Set<String> allowInputs = new HashSet<>();

    final String ENTER = "";
    final String BYE = "BYE";
    final String BACK = "BK";

    public void readyToChoose() {
        allowInputs.add(ENTER);
        allowInputs.add(BYE);
        init();
        String inputData = choose();
        if (!allowInputs.contains(inputData)) choose();
        nextScenes();
    }

    public void baseChoose(String inputData) {
        switch (inputData) {
            case ENTER:
                nextScenes();
                break;
            case BACK:
                preScenes();
                break;
            case BYE:
                System.exit(1);
                break;
        }
    }
}
