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

    public void readyToChoose() {
        allowInputs.add(ENTER);
        allowInputs.add(BYE);
        allowInputs.add(BACK);
        init();
        String inputData = showTipAndInput();
//        System.out.println("inputData: " + inputData);
//        System.out.print("allowInputs: ");
////        System.out.println(ReflectionToStringBuilder.toString(allowInputs));
//        printCollection(allowInputs);
//        userInterface.input();
        if (!allowInputs.contains(inputData)) showTipAndInput();
        nextScenes();
    }

    private <T> void printCollection(Collection<T> collection) {
        for (T s : collection) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void baseChoose(String inputData) {
        switch (inputData) {
//            case ENTER:
//                nextScenes();
//                break;
            case BACK:
                preScenes();
                break;
            case BYE:
                System.exit(1);
                break;
        }
    }
}
