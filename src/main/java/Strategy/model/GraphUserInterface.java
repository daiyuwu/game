package Strategy.model;

import Strategy.trait.UserInterface;

import javax.swing.*;

public class GraphUserInterface extends BaseUserInterface implements UserInterface {

    public String input() {
        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300,250);
        guiFrame.setLocationRelativeTo(null);

        guiFrame.setVisible(true);

        return "";
    }

    public void output(String outputData) {
        System.out.println(outputData);
    }
}
