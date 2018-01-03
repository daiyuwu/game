package strategy.cenes.choose;

import strategy.cenes.BaseCenes;
import strategy.trait.Choosable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public abstract class BaseChoose extends BaseCenes implements Choosable {
    public Set<String> allowInputs = new HashSet<>();

    final String ENTER = "";
    final String BYE = "BYE";
    final String BACK = "BK";

//    @Override
//    public void run() {
//        allowInputs.add(ENTER);
//        allowInputs.add(BYE);
//        allowInputs.add(BACK);
//        init();
//        String inputData = choose();
//        if (!allowInputs.contains(inputData)) choose();
//        nextScenes();
//    }

    public void readyToChoose() {
        allowInputs.add(ENTER);
        allowInputs.add(BYE);
        allowInputs.add(BACK);
        init();
        String inputData = choose();
        if (!allowInputs.contains(inputData)) choose();
        nextScenes();
    }

    @Override
    public String choose() {
        showTip();
        String inputData = userInterface.input().toUpperCase();
        options(inputData);
        baseOptions(inputData);
        return inputData;
    }

    private <T> void printCollection(Collection<T> collection) {
        for (T s : collection) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void baseOptions(String inputData) {
        switch (inputData) {
            case BACK:
                preScenes();
                break;
            case BYE:
                System.exit(1);
                break;
        }
    }
}
