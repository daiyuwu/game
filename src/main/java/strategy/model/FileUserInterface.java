package strategy.model;

import strategy.trait.UserInterface;
import strategy.util.FileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUserInterface extends BaseUserInterface implements UserInterface {

    public String input() {
        System.out.print("請輸入檔案絕對路徑：");
        String inputPath;
        File file = null;
        do {
            Scanner scanner = new Scanner(System.in);
            inputPath = scanner.nextLine();
            if (inputPath.equals("exit")) break;
            file = FileUtil.loadFile(inputPath);

            if (file == null) {
                System.out.println("file not exists !");
                continue;
            } else {
                break;
            }
        } while (true);
        return FileUtil.readFile(file, false);
    }

    public void output(String outputData) {
        System.out.println(outputData);
    }
}
