package no5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class more_less {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no5/in.txt");
        Scanner scanner = new Scanner(fileReader);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        FileWriter fileWriter = new FileWriter("./no5/out.txt");
        if (a > b) fileWriter.write(">");
        if (a < b) fileWriter.write("<");
        if (a == b) fileWriter.write("=");
        fileWriter.close();

    }
}
