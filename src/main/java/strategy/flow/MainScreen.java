package strategy.flow;

import strategy.model.CliUserInterface;
import strategy.trait.UserInterface;

public class MainScreen {
    public static void helloWorld() {
        UserInterface userInterface = new CliUserInterface();
        userInterface.showTip("歡迎來到這個虛擬世界。");
        userInterface.showTip("按下 ENTER 開始/下一步 ! 或 ESC 離開這個世界。");
        String inputData = "";
        do {
            inputData = userInterface.input().toUpperCase();
            if (CliUserInterface.isCommonCommand(inputData)) break;
        } while (true);
    }
}
