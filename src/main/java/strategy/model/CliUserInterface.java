package strategy.model;

import strategy.flow.MainScreen;
import strategy.trait.UserInterface;

import java.util.Scanner;

public class CliUserInterface extends BaseUserInterface implements UserInterface {

    public static boolean isCommonCommand(String inputData) {
        if ("".equals(inputData)) return true;
        else if ("HOME".equals(inputData)) MainScreen.helloWorld();
        else if ("ESC".equals(inputData)) System.exit(1);
        return false;
    }

    public String input() {
        System.out.print("\\>：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void output(String outputData) {
        System.out.println(outputData);
    }
}
