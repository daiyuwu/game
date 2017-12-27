package Strategy.model;

import Strategy.trait.UserInterface;

import java.io.*;
import java.util.Scanner;

public class FileUserInterface extends BaseUserInterface implements UserInterface {

    public String input() {
        System.out.print("請輸入檔案絕對路徑：");
        String inputPath = "";
        File file = null;
        do {
            Scanner scanner = new Scanner(System.in);
            inputPath = scanner.nextLine();
            if (inputPath.equals("exit")) break;
            file = new File(inputPath);
            if (!file.exists()) {
                System.out.println("file not exists !");
                continue;
            } else {
                break;
            }
        } while (true);
        StringBuffer content = new StringBuffer();
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content.toString();
    }

    public void output(String outputData) {
        System.out.println(outputData);
    }
}
