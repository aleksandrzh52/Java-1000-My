package no1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("./no1/input.txt");
        Scanner scanner = new Scanner(fileReader);
        String inScanner = scanner.nextLine();

        FileWriter fileWriter = new FileWriter("./no1/output.txt");
        fileWriter.write(inScanner);
        System.out.println(inScanner);
        fileWriter.close();



    }
}
