package Strategy.model;

import Strategy.trait.UserInterface;

import java.util.Scanner;

public class CliUserInterface implements UserInterface {
    public void showTip(String tip) {
        System.out.println(tip);
    }

    public String input() {
        System.out.print("請輸入一段句子：");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void output(String outputData) {
        System.out.println(outputData);
    }
}
