package Strategy.flow;

import Strategy.model.CliUserInterface;
import Strategy.model.FileUserInterface;
import Strategy.model.GameLogFile;
import Strategy.model.GraphUserInterface;
import Strategy.trait.UserInterface;

public class MainScreen {
    public static void start() {
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
