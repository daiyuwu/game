package Strategy.model;

import Strategy.trait.UserInterface;

import java.io.*;
import java.util.Scanner;

public class FileUserInterface implements UserInterface {
    public void showTip(String tip) {
        System.out.println(tip);
    }

    public String input() {
        System.out.print("請輸入檔案絕對路徑：");
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        if (!file.exists()) {
            System.out.println("file not exists !");
            return "";
        }
        StringBuffer content = new StringBuffer();
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                // convert to char and display it
//                System.out.print((char) content);
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
