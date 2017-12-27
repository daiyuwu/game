package Strategy.flow;

import Strategy.model.*;
import Strategy.trait.UserInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Lodge {
    public static String createCharacterTest() {
        UserInterface ui = new CliUserInterface();
        ui.showTip("開始創建角色");

        String titleTip = "(1)職業 (2)種族";
        Set<String> options = new HashSet<>();
        options.add("1");
        options.add("2");
        options.add("BK");
        options.add("HOME");
        options.add("BYE");

        String inputData = loopPack(titleTip, options);
        if ("1".equals(inputData)) selectJob();
        else if ("2".equals(inputData)) selectRace();
        return inputData;
    }

    public static String loopPack(String titleTip, Set<String> options) {
        String inputData;
        UserInterface ui = new CliUserInterface();
        do {
            ui.showTip(titleTip);
            inputData = ui.input().toUpperCase();
        } while (!options.contains(inputData));
        return inputData;
    }

    public static void createCharacter() {
        UserInterface ui = new CliUserInterface();
        ui.showTip("開始創建角色");
        String inputData;
        do {
            ui.showTip("(1)職業 (2)種族");
            inputData = ui.input().toUpperCase();
            if ("1".equals(inputData)) selectJob();
            else if ("2".equals(inputData)) selectRace();
            if (CliUserInterface.isCommonCommand(inputData)) break;
        } while (!inputData.equals("BK"));
        if (("BK").equals(inputData)) createCharacter();
    }

    public static void selectJob() {
        UserInterface ui = new CliUserInterface();
        ui.showTip("選擇職業");
        ui.showTip("(1)戰士 (2)法師");
        String inputData;
        do {
            inputData = ui.input().toUpperCase();
            if ("1".equals(inputData)) {
                System.out.println("warrior !");
                GameLogFile.character = new Warrior();
                break;
            } else if ("2".equals(inputData)) {
                System.out.println("magician !");
                GameLogFile.character = new Magician();
                break;
            }
            if (CliUserInterface.isCommonCommand(inputData)) break;
        } while (!inputData.equals("BK"));
        if (("BK").equals(inputData)) createCharacter();
    }

    public static void action() {
        UserInterface ui = new CliUserInterface();
        ui.showTip("選擇行動");
        ui.showTip("(1)攻擊 (2)防禦");
        String inputData;
        do {
            inputData = ui.input().toUpperCase();
            if ("1".equals(inputData)) GameLogFile.character.attack();
            else if ("2".equals(inputData)) GameLogFile.character.defend();
            if (CliUserInterface.isCommonCommand(inputData)) break;
        } while (!inputData.equals("BK"));
        if (("BK").equals(inputData)) createCharacter();
    }

    public static void selectRace() {
        UserInterface ui = new CliUserInterface();
        ui.showTip("選擇種族");
        ui.showTip("(1)人類 (2)精靈");
        String inputData;
        do {
            inputData = ui.input().toUpperCase();
            if ("1".equals(inputData)) break;
            else if ("2".equals(inputData)) break;
            if (CliUserInterface.isCommonCommand(inputData)) break;
        } while (!inputData.equals("BK"));
        if (("BK").equals(inputData)) createCharacter();
    }
}
